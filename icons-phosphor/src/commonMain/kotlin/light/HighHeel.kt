package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HighHeel: ImageVector
    get() {
        if (_highHeel != null) return _highHeel!!
        _highHeel = phosphorLightIcon(
            name = "HighHeel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.53f, 158.14f),
                    PathNode.LineTo(179.0f, 146.53f),
                    PathNode.LineTo(68.24f, 35.76f),
                    PathNode.CurveTo(67.08242f, 34.601604f, 65.501656f, 33.9667f, 63.864407f, 34.002583f),
                    PathNode.CurveTo(62.227158f, 34.038464f, 60.67572f, 34.742004f, 59.57f, 35.95f),
                    PathNode.CurveTo(37.92f, 59.62f, 26.0f, 89.47f, 26.0f, 120.0f),
                    PathNode.LineTo(26.0f, 192.0f),
                    PathNode.CurveTo(26.0f, 199.73198f, 32.268013f, 206.0f, 40.0f, 206.0f),
                    PathNode.LineTo(72.0f, 206.0f),
                    PathNode.CurveTo(79.73199f, 206.0f, 86.0f, 199.73198f, 86.0f, 192.0f),
                    PathNode.LineTo(86.0f, 139.65f),
                    PathNode.CurveTo(109.40149f, 152.31506f, 127.68692f, 172.70326f, 137.74f, 197.34f),
                    PathNode.CurveTo(139.89273f, 202.61508f, 145.04274f, 206.04579f, 150.74f, 206.0f),
                    PathNode.LineTo(240.0f, 206.0f),
                    PathNode.CurveTo(247.73198f, 206.0f, 254.0f, 199.73198f, 254.0f, 192.0f),
                    PathNode.LineTo(254.0f, 187.27f),
                    PathNode.CurveTo(254.03139f, 173.23802f, 244.24744f, 161.09457f, 230.53f, 158.14f),
                    PathNode.Close,
                    PathNode.MoveTo(74.0f, 192.0f),
                    PathNode.CurveTo(74.0f, 193.10457f, 73.10457f, 194.0f, 72.0f, 194.0f),
                    PathNode.LineTo(40.0f, 194.0f),
                    PathNode.CurveTo(38.89543f, 194.0f, 38.0f, 193.10457f, 38.0f, 192.0f),
                    PathNode.LineTo(38.0f, 126.18f),
                    PathNode.CurveTo(50.347572f, 126.795364f, 62.50988f, 129.43729f, 74.0f, 134.0f),
                    PathNode.Close,
                    PathNode.MoveTo(242.0f, 192.0f),
                    PathNode.CurveTo(242.0f, 193.10457f, 241.10457f, 194.0f, 240.0f, 194.0f),
                    PathNode.LineTo(150.72f, 194.0f),
                    PathNode.CurveTo(149.91974f, 194.01428f, 149.18803f, 193.55008f, 148.86f, 192.82f),
                    PathNode.CurveTo(139.53638f, 169.88394f, 123.68859f, 150.18721f, 103.28f, 136.17f),
                    PathNode.CurveTo(84.05256f, 122.90165f, 61.49473f, 115.28076f, 38.16f, 114.17f),
                    PathNode.CurveTo(39.47f, 90.66f, 48.6f, 67.83f, 64.31f, 48.79f),
                    PathNode.LineTo(171.76f, 156.24f),
                    PathNode.CurveTo(172.56166f, 157.04178f, 173.5741f, 157.6f, 174.68f, 157.85f),
                    PathNode.LineTo(227.91f, 169.85f),
                    PathNode.CurveTo(236.14297f, 171.6084f, 242.02025f, 178.89136f, 242.0f, 187.31f),
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
        return _highHeel!!
    }

private var _highHeel: ImageVector? = null
