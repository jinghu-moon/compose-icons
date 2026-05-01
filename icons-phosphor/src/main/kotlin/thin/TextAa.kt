package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextAa: ImageVector
    get() {
        if (_textAa != null) return _textAa!!
        _textAa = phosphorThinIcon(
            name = "TextAa",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(83.62f, 54.3f),
                    PathNode.CurveTo(82.96059f, 52.89719f, 81.550064f, 52.001648f, 80.0f, 52.001648f),
                    PathNode.CurveTo(78.449936f, 52.001648f, 77.03941f, 52.89719f, 76.38f, 54.3f),
                    PathNode.LineTo(12.38f, 190.3f),
                    PathNode.CurveTo(11.490429f, 192.2902f, 12.358294f, 194.62625f, 14.331512f, 195.5529f),
                    PathNode.CurveTo(16.30473f, 196.47955f, 18.656597f, 195.65553f, 19.62f, 193.7f),
                    PathNode.LineTo(37.36f, 156.0f),
                    PathNode.LineTo(122.64f, 156.0f),
                    PathNode.LineTo(140.38f, 193.7f),
                    PathNode.CurveTo(140.97043f, 195.02095f, 142.2282f, 195.92007f, 143.66913f, 196.05125f),
                    PathNode.CurveTo(145.11009f, 196.18245f, 146.50955f, 195.52524f, 147.32881f, 194.33263f),
                    PathNode.CurveTo(148.14809f, 193.14001f, 148.25943f, 191.59795f, 147.62f, 190.3f),
                    PathNode.Close,
                    PathNode.MoveTo(41.13f, 148.0f),
                    PathNode.LineTo(80.0f, 65.39f),
                    PathNode.LineTo(118.87f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 100.0f),
                    PathNode.CurveTo(188.33f, 100.0f, 179.31f, 103.08f, 173.18f, 109.16f),
                    PathNode.CurveTo(171.61151f, 110.717445f, 171.60255f, 113.25151f, 173.16f, 114.82f),
                    PathNode.CurveTo(174.71744f, 116.38849f, 177.25151f, 116.397446f, 178.82f, 114.84f),
                    PathNode.CurveTo(183.39f, 110.3f, 190.52f, 108.0f, 200.0f, 108.0f),
                    PathNode.CurveTo(215.44f, 108.0f, 228.0f, 118.77f, 228.0f, 132.0f),
                    PathNode.LineTo(228.0f, 143.92f),
                    PathNode.CurveTo(220.75037f, 136.19716f, 210.59166f, 131.87245f, 200.0f, 132.0f),
                    PathNode.CurveTo(180.15f, 132.0f, 164.0f, 146.35f, 164.0f, 164.0f),
                    PathNode.CurveTo(164.0f, 181.65f, 180.15f, 196.0f, 200.0f, 196.0f),
                    PathNode.CurveTo(210.59166f, 196.12755f, 220.75037f, 191.80284f, 228.0f, 184.08f),
                    PathNode.LineTo(228.0f, 192.0f),
                    PathNode.CurveTo(228.0f, 194.20914f, 229.79086f, 196.0f, 232.0f, 196.0f),
                    PathNode.CurveTo(234.20914f, 196.0f, 236.0f, 194.20914f, 236.0f, 192.0f),
                    PathNode.LineTo(236.0f, 132.0f),
                    PathNode.CurveTo(236.0f, 114.36f, 219.85f, 100.0f, 200.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 188.0f),
                    PathNode.CurveTo(184.56f, 188.0f, 172.0f, 177.23f, 172.0f, 164.0f),
                    PathNode.CurveTo(172.0f, 150.77f, 184.56f, 140.0f, 200.0f, 140.0f),
                    PathNode.CurveTo(215.44f, 140.0f, 228.0f, 150.77f, 228.0f, 164.0f),
                    PathNode.CurveTo(228.0f, 177.23f, 215.44f, 188.0f, 200.0f, 188.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _textAa!!
    }

private var _textAa: ImageVector? = null
