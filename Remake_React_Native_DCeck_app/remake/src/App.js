import React, { Component } from 'react';
import { View, Text, Button, Image } from 'react-native';

class MainActivity extends Component {
  navigateToScreen(screenName) {
    // Implement navigation logic to screenName
  }

  render() {
    return (
      <View>
        <Text>Main Activity</Text>
        {/* <Image source={require('./yourImage.png')} /> */}

        <Button
          title="Navigate to First1"
          onPress={() => this.navigateToScreen('First1')}
        />

        <Button
          title="Navigate to Map"
          onPress={() => this.navigateToScreen('Map')}
        />

        <Button
          title="Navigate to Information"
          onPress={() => this.navigateToScreen('Information')}
        />

        <Button
          title="Navigate to Gamemain"
          onPress={() => this.navigateToScreen('Gamemain')}
        />
      </View>
    );
  }
}

export default MainActivity;
