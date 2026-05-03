package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Bluetooth: ImageVector
    get() {
        if (_bluetooth != null) return _bluetooth!!
        _bluetooth = phosphorLightIcon(
            name = "Bluetooth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(195.6f, 171.2f),
                    PathNode.LineTo(138.0f, 128.0f),
                    PathNode.LineTo(195.6f, 84.8f),
                    PathNode.CurveTo(197.11082f, 83.66687f, 198.0f, 81.88854f, 198.0f, 80.0f),
                    PathNode.CurveTo(198.0f, 78.11146f, 197.11082f, 76.33313f, 195.6f, 75.2f),
                    PathNode.LineTo(131.6f, 27.2f),
                    PathNode.CurveTo(129.78189f, 25.83642f, 127.34943f, 25.617085f, 125.31672f, 26.633436f),
                    PathNode.CurveTo(123.284004f, 27.64979f, 122.0f, 29.727367f, 122.0f, 32.0f),
                    PathNode.LineTo(122.0f, 116.0f),
                    PathNode.LineTo(67.6f, 75.2f),
                    PathNode.CurveTo(64.949036f, 73.21178f, 61.188225f, 73.74903f, 59.2f, 76.4f),
                    PathNode.CurveTo(57.211777f, 79.050964f, 57.749035f, 82.811775f, 60.4f, 84.8f),
                    PathNode.LineTo(118.0f, 128.0f),
                    PathNode.LineTo(60.4f, 171.2f),
                    PathNode.CurveTo(57.749035f, 173.18823f, 57.211773f, 176.94904f, 59.2f, 179.6f),
                    PathNode.CurveTo(61.188225f, 182.25096f, 64.949036f, 182.78822f, 67.6f, 180.8f),
                    PathNode.LineTo(122.0f, 140.0f),
                    PathNode.LineTo(122.0f, 224.0f),
                    PathNode.CurveTo(122.0f, 226.27263f, 123.284004f, 228.3502f, 125.31672f, 229.36656f),
                    PathNode.CurveTo(127.34943f, 230.38292f, 129.78189f, 230.16357f, 131.6f, 228.8f),
                    PathNode.LineTo(195.6f, 180.8f),
                    PathNode.CurveTo(197.11082f, 179.66687f, 198.0f, 177.88855f, 198.0f, 176.0f),
                    PathNode.CurveTo(198.0f, 174.11145f, 197.11082f, 172.33313f, 195.6f, 171.2f),
                    PathNode.Close,
                    PathNode.MoveTo(134.0f, 44.0f),
                    PathNode.LineTo(182.0f, 80.0f),
                    PathNode.LineTo(134.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(134.0f, 212.0f),
                    PathNode.LineTo(134.0f, 140.0f),
                    PathNode.LineTo(182.0f, 176.0f),
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
        return _bluetooth!!
    }

private var _bluetooth: ImageVector? = null
