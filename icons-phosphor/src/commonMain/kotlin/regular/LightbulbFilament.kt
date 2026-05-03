package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.LightbulbFilament: ImageVector
    get() {
        if (_lightbulbFilament != null) return _lightbulbFilament!!
        _lightbulbFilament = phosphorRegularIcon(
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
                    PathNode.CurveTo(52.533913f, 156.80107f, 40.08134f, 131.41656f, 40.0f, 104.5f),
                    PathNode.CurveTo(39.74f, 56.83f, 78.26f, 17.15f, 125.88f, 16.0f),
                    PathNode.CurveTo(149.58417f, 15.428779f, 172.51584f, 24.447392f, 189.48044f, 41.01291f),
                    PathNode.CurveTo(206.44504f, 57.57843f, 216.00688f, 80.288956f, 216.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 104.0f),
                    PathNode.CurveTo(200.00566f, 84.59908f, 192.1816f, 66.016884f, 178.30026f, 52.463116f),
                    PathNode.CurveTo(164.41895f, 38.909348f, 145.65526f, 31.531143f, 126.26f, 32.0f),
                    PathNode.CurveTo(87.26f, 32.92f, 55.79f, 65.39f, 56.0f, 104.39f),
                    PathNode.CurveTo(56.07254f, 126.4069f, 66.26486f, 147.16766f, 83.64f, 160.69f),
                    PathNode.LineTo(83.64f, 160.69f),
                    PathNode.CurveTo(91.45114f, 166.76228f, 96.01421f, 176.10625f, 96.0f, 186.0f),
                    PathNode.LineTo(96.0f, 192.0f),
                    PathNode.LineTo(120.0f, 192.0f),
                    PathNode.LineTo(120.0f, 147.31f),
                    PathNode.LineTo(90.34f, 117.66f),
                    PathNode.CurveTo(87.214066f, 114.534065f, 87.214066f, 109.465935f, 90.34f, 106.34f),
                    PathNode.CurveTo(93.465935f, 103.214066f, 98.534065f, 103.214066f, 101.66f, 106.34f),
                    PathNode.LineTo(128.0f, 132.69f),
                    PathNode.LineTo(154.34f, 106.34f),
                    PathNode.CurveTo(157.46593f, 103.214066f, 162.53407f, 103.214066f, 165.66f, 106.34f),
                    PathNode.CurveTo(168.78593f, 109.465935f, 168.78593f, 114.534065f, 165.66f, 117.66f),
                    PathNode.LineTo(136.0f, 147.31f),
                    PathNode.LineTo(136.0f, 192.0f),
                    PathNode.LineTo(160.0f, 192.0f),
                    PathNode.LineTo(160.0f, 186.0f),
                    PathNode.CurveTo(160.01796f, 176.07748f, 164.6209f, 166.72028f, 172.47f, 160.65f),
                    PathNode.CurveTo(189.8995f, 147.02881f, 200.0602f, 126.120605f, 200.0f, 104.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _lightbulbFilament!!
    }

private var _lightbulbFilament: ImageVector? = null
