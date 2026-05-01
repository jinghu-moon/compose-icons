package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.WifiLow: ImageVector
    get() {
        if (_wifiLow != null) return _wifiLow!!
        _wifiLow = phosphorBoldIcon(
            name = "WifiLow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(144.0f, 204.0f),
                    PathNode.CurveTo(144.0f, 212.83656f, 136.83656f, 220.0f, 128.0f, 220.0f),
                    PathNode.CurveTo(119.163445f, 220.0f, 112.0f, 212.83656f, 112.0f, 204.0f),
                    PathNode.CurveTo(112.0f, 195.16344f, 119.163445f, 188.0f, 128.0f, 188.0f),
                    PathNode.CurveTo(136.83656f, 188.0f, 144.0f, 195.16344f, 144.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(175.06f, 155.3f),
                    PathNode.CurveTo(147.00531f, 134.89244f, 108.99468f, 134.89244f, 80.94f, 155.3f),
                    PathNode.CurveTo(75.58284f, 159.20189f, 74.40311f, 166.70784f, 78.305f, 172.065f),
                    PathNode.CurveTo(82.206894f, 177.42216f, 89.71284f, 178.6019f, 95.07f, 174.7f),
                    PathNode.CurveTo(114.70322f, 160.42635f, 141.29678f, 160.42635f, 160.93f, 174.7f),
                    PathNode.CurveTo(166.28716f, 178.6019f, 173.7931f, 177.42216f, 177.695f, 172.065f),
                    PathNode.CurveTo(181.5969f, 166.70784f, 180.41718f, 159.20189f, 175.06f, 155.3f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _wifiLow!!
    }

private var _wifiLow: ImageVector? = null
