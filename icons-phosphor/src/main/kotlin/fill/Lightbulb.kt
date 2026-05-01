package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Lightbulb: ImageVector
    get() {
        if (_lightbulb != null) return _lightbulb!!
        _lightbulb = phosphorFillIcon(
            name = "Lightbulb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 232.0f),
                    PathNode.CurveTo(176.0f, 236.41827f, 172.41827f, 240.0f, 168.0f, 240.0f),
                    PathNode.LineTo(88.0f, 240.0f),
                    PathNode.CurveTo(83.58172f, 240.0f, 80.0f, 236.41827f, 80.0f, 232.0f),
                    PathNode.CurveTo(80.0f, 227.58173f, 83.58172f, 224.0f, 88.0f, 224.0f),
                    PathNode.LineTo(168.0f, 224.0f),
                    PathNode.CurveTo(172.41827f, 224.0f, 176.0f, 227.58173f, 176.0f, 232.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 104.0f),
                    PathNode.CurveTo(216.06987f, 131.02559f, 203.65446f, 156.5687f, 182.36f, 173.21f),
                    PathNode.CurveTo(178.37823f, 176.26208f, 176.03062f, 180.98315f, 176.0f, 186.0f),
                    PathNode.LineTo(176.0f, 192.0f),
                    PathNode.CurveTo(176.0f, 200.83656f, 168.83656f, 208.0f, 160.0f, 208.0f),
                    PathNode.LineTo(96.0f, 208.0f),
                    PathNode.CurveTo(87.163445f, 208.0f, 80.0f, 200.83656f, 80.0f, 192.0f),
                    PathNode.LineTo(80.0f, 186.0f),
                    PathNode.CurveTo(79.99668f, 181.04276f, 77.69575f, 176.36702f, 73.77f, 173.34f),
                    PathNode.CurveTo(52.531155f, 156.7989f, 40.078266f, 131.41006f, 40.0f, 104.49f),
                    PathNode.CurveTo(39.74f, 56.83f, 78.26f, 17.14f, 125.88f, 16.0f),
                    PathNode.CurveTo(149.58417f, 15.428779f, 172.51584f, 24.447392f, 189.48044f, 41.01291f),
                    PathNode.CurveTo(206.44504f, 57.57843f, 216.00688f, 80.288956f, 216.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(183.89f, 94.66f),
                    PathNode.CurveTo(179.64134f, 70.9284f, 161.06252f, 52.353558f, 137.33f, 48.11f),
                    PathNode.CurveTo(132.97247f, 47.37546f, 128.84454f, 50.312473f, 128.11f, 54.67f),
                    PathNode.CurveTo(127.37546f, 59.027527f, 130.31247f, 63.15546f, 134.67f, 63.89f),
                    PathNode.CurveTo(151.24f, 66.68f, 165.3f, 80.74f, 168.11f, 97.34f),
                    PathNode.CurveTo(168.76364f, 101.18722f, 172.09767f, 104.00147f, 176.0f, 104.0f),
                    PathNode.CurveTo(176.45212f, 103.99729f, 176.9034f, 103.960526f, 177.35f, 103.89f),
                    PathNode.CurveTo(181.7044f, 103.146614f, 184.63217f, 99.01462f, 183.89f, 94.66f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _lightbulb!!
    }

private var _lightbulb: ImageVector? = null
