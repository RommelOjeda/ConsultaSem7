package org.legoosa.tutorial.run;

import org.legoosa.tutorial.actors.MasterActor;

import akka.actor.Actor;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

public class RunBasicActor {
    public static void main( String[] args ) {
        ActorSystem system = ActorSystem.create("Sistema-Actor-Basico");
        
        ActorRef master = system.actorOf(Props.create(MasterActor.class));
        
        master.tell("Hola, Esto es un Ejemplo de Actor", Actor.noSender());


    }
}
