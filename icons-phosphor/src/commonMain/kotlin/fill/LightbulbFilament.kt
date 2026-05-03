package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LightbulbFilament: ImageVector
    get() {
        if (_lightbulbFilament != null) return _lightbulbFilament!!
        _lightbulbFilament = phosphorFillIcon(
            name = "LightbulbFilament",
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
                    PathNode.MoveTo(165.66f, 106.34f),
                    PathNode.CurveTo(164.15945f, 104.83778f, 162.12328f, 103.993706f, 160.0f, 103.993706f),
                    PathNode.CurveTo(157.87672f, 103.993706f, 155.84055f, 104.83778f, 154.34f, 106.34f),
                    PathNode.LineTo(128.0f, 132.69f),
                    PathNode.LineTo(101.66f, 106.34f),
                    PathNode.CurveTo(98.534065f, 103.214066f, 93.465935f, 103.214066f, 90.34f, 106.34f),
                    PathNode.CurveTo(87.214066f, 109.465935f, 87.214066f, 114.534065f, 90.34f, 117.66f),
                    PathNode.LineTo(120.0f, 147.31f),
                    PathNode.LineTo(120.0f, 184.0f),
                    PathNode.CurveTo(120.0f, 188.41827f, 123.58172f, 192.0f, 128.0f, 192.0f),
                    PathNode.CurveTo(132.41827f, 192.0f, 136.0f, 188.41827f, 136.0f, 184.0f),
                    PathNode.LineTo(136.0f, 147.31f),
                    PathNode.LineTo(165.66f, 117.66f),
                    PathNode.CurveTo(167.16223f, 116.159454f, 168.00629f, 114.123276f, 168.00629f, 112.0f),
                    PathNode.CurveTo(168.00629f, 109.876724f, 167.16223f, 107.840546f, 165.66f, 106.34f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _lightbulbFilament!!
    }

private var _lightbulbFilament: ImageVector? = null
