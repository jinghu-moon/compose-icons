package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BluetoothX: ImageVector
    get() {
        if (_bluetoothX != null) return _bluetoothX!!
        _bluetoothX = phosphorLightIcon(
            name = "BluetoothX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(179.6f, 171.2f),
                    PathNode.LineTo(122.0f, 128.0f),
                    PathNode.LineTo(147.6f, 108.8f),
                    PathNode.CurveTo(150.25096f, 106.811775f, 150.78822f, 103.050964f, 148.8f, 100.4f),
                    PathNode.CurveTo(146.81177f, 97.74903f, 143.05096f, 97.21178f, 140.4f, 99.2f),
                    PathNode.LineTo(118.0f, 116.0f),
                    PathNode.LineTo(118.0f, 44.0f),
                    PathNode.LineTo(140.4f, 60.8f),
                    PathNode.CurveTo(143.05096f, 62.788227f, 146.81177f, 62.250965f, 148.8f, 59.6f),
                    PathNode.CurveTo(150.78822f, 56.94903f, 150.25096f, 53.188225f, 147.6f, 51.2f),
                    PathNode.LineTo(115.6f, 27.2f),
                    PathNode.CurveTo(113.78189f, 25.83642f, 111.34943f, 25.617085f, 109.31672f, 26.633436f),
                    PathNode.CurveTo(107.284004f, 27.64979f, 106.0f, 29.727367f, 106.0f, 32.0f),
                    PathNode.LineTo(106.0f, 116.0f),
                    PathNode.LineTo(51.6f, 75.2f),
                    PathNode.CurveTo(48.94903f, 73.21178f, 45.188225f, 73.74903f, 43.2f, 76.4f),
                    PathNode.CurveTo(41.211777f, 79.050964f, 41.749035f, 82.811775f, 44.4f, 84.8f),
                    PathNode.LineTo(102.0f, 128.0f),
                    PathNode.LineTo(44.4f, 171.2f),
                    PathNode.CurveTo(41.749035f, 173.18823f, 41.211777f, 176.94904f, 43.2f, 179.6f),
                    PathNode.CurveTo(45.188225f, 182.25096f, 48.94903f, 182.78822f, 51.6f, 180.8f),
                    PathNode.LineTo(106.0f, 140.0f),
                    PathNode.LineTo(106.0f, 224.0f),
                    PathNode.CurveTo(106.0f, 226.27263f, 107.284004f, 228.3502f, 109.31672f, 229.36656f),
                    PathNode.CurveTo(111.34943f, 230.38292f, 113.78189f, 230.16357f, 115.6f, 228.8f),
                    PathNode.LineTo(179.6f, 180.8f),
                    PathNode.CurveTo(181.11082f, 179.66687f, 182.0f, 177.88855f, 182.0f, 176.0f),
                    PathNode.CurveTo(182.0f, 174.11145f, 181.11082f, 172.33313f, 179.6f, 171.2f),
                    PathNode.Close,
                    PathNode.MoveTo(118.0f, 212.0f),
                    PathNode.LineTo(118.0f, 140.0f),
                    PathNode.LineTo(166.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.24f, 99.76f),
                    PathNode.CurveTo(237.84523f, 101.25577f, 238.506f, 103.508446f, 237.96309f, 105.6343f),
                    PathNode.CurveTo(237.42018f, 107.76018f, 235.76018f, 109.42017f, 233.63431f, 109.96308f),
                    PathNode.CurveTo(231.50844f, 110.506f, 229.25575f, 109.84522f, 227.76f, 108.24f),
                    PathNode.LineTo(208.0f, 88.49f),
                    PathNode.LineTo(188.24f, 108.24f),
                    PathNode.CurveTo(185.87592f, 110.44287f, 182.19193f, 110.37787f, 179.90703f, 108.09297f),
                    PathNode.CurveTo(177.62213f, 105.808075f, 177.55713f, 102.12408f, 179.76f, 99.76f),
                    PathNode.LineTo(199.51f, 80.0f),
                    PathNode.LineTo(179.76f, 60.24f),
                    PathNode.CurveTo(177.55713f, 57.875923f, 177.62213f, 54.19192f, 179.90703f, 51.907024f),
                    PathNode.CurveTo(182.19193f, 49.622128f, 185.87592f, 49.55713f, 188.24f, 51.76f),
                    PathNode.LineTo(208.0f, 71.51f),
                    PathNode.LineTo(227.76f, 51.76f),
                    PathNode.CurveTo(230.12408f, 49.55713f, 233.80807f, 49.622128f, 236.09297f, 51.907024f),
                    PathNode.CurveTo(238.37787f, 54.19192f, 238.44287f, 57.875923f, 236.24f, 60.24f),
                    PathNode.LineTo(216.49f, 80.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _bluetoothX!!
    }

private var _bluetoothX: ImageVector? = null
