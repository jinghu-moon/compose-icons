package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.WifiMedium: ImageVector
    get() {
        if (_wifiMedium != null) return _wifiMedium!!
        _wifiMedium = phosphorBoldIcon(
            name = "WifiMedium",
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
                    PathNode.MoveTo(207.45f, 119.64f),
                    PathNode.CurveTo(160.89482f, 82.7838f, 95.10518f, 82.7838f, 48.55f, 119.64f),
                    PathNode.CurveTo(43.490093f, 123.79321f, 42.692352f, 131.23535f, 46.757023f, 136.36665f),
                    PathNode.CurveTo(50.821693f, 141.49796f, 58.248844f, 142.4249f, 63.45f, 138.45f),
                    PathNode.CurveTo(101.274895f, 108.50763f, 154.7251f, 108.50763f, 192.55f, 138.45f),
                    PathNode.CurveTo(197.75114f, 142.4249f, 205.17831f, 141.49796f, 209.24298f, 136.36665f),
                    PathNode.CurveTo(213.30765f, 131.23535f, 212.5099f, 123.79321f, 207.45f, 119.64f),
                    PathNode.Close,
                    PathNode.MoveTo(175.07f, 155.3f),
                    PathNode.CurveTo(147.00597f, 134.89851f, 108.994026f, 134.89851f, 80.93f, 155.3f),
                    PathNode.CurveTo(75.57284f, 159.20465f, 74.39535f, 166.71284f, 78.3f, 172.07f),
                    PathNode.CurveTo(82.20465f, 177.42715f, 89.71284f, 178.60466f, 95.07f, 174.7f),
                    PathNode.CurveTo(114.70322f, 160.42635f, 141.29678f, 160.42635f, 160.93f, 174.7f),
                    PathNode.CurveTo(166.28716f, 178.60466f, 173.79535f, 177.42717f, 177.7f, 172.07f),
                    PathNode.CurveTo(181.60466f, 166.71284f, 180.42717f, 159.20465f, 175.07f, 155.3f),
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
        return _wifiMedium!!
    }

private var _wifiMedium: ImageVector? = null
