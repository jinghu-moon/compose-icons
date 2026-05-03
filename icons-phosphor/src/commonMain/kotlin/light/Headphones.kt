package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Headphones: ImageVector
    get() {
        if (_headphones != null) return _headphones!!
        _headphones = phosphorLightIcon(
            name = "Headphones",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.47f, 56.07f),
                    PathNode.CurveTo(181.5167f, 36.91518f, 155.71672f, 26.09502f, 128.77f, 26.0f),
                    PathNode.LineTo(128.0f, 26.0f),
                    PathNode.CurveTo(71.666954f, 26.0f, 26.0f, 71.666954f, 26.0f, 128.0f),
                    PathNode.LineTo(26.0f, 184.0f),
                    PathNode.CurveTo(26.0f, 196.15027f, 35.849735f, 206.0f, 48.0f, 206.0f),
                    PathNode.LineTo(64.0f, 206.0f),
                    PathNode.CurveTo(76.15026f, 206.0f, 86.0f, 196.15027f, 86.0f, 184.0f),
                    PathNode.LineTo(86.0f, 144.0f),
                    PathNode.CurveTo(86.0f, 131.84973f, 76.15026f, 122.0f, 64.0f, 122.0f),
                    PathNode.LineTo(38.2f, 122.0f),
                    PathNode.CurveTo(40.588528f, 86.69441f, 63.418076f, 56.053967f, 96.56508f, 43.665867f),
                    PathNode.CurveTo(129.71208f, 31.277765f, 167.04152f, 39.434875f, 192.0f, 64.52f),
                    PathNode.CurveTo(207.29317f, 79.91334f, 216.46655f, 100.34288f, 217.81f, 122.0f),
                    PathNode.LineTo(192.0f, 122.0f),
                    PathNode.CurveTo(179.84973f, 122.0f, 170.0f, 131.84973f, 170.0f, 144.0f),
                    PathNode.LineTo(170.0f, 184.0f),
                    PathNode.CurveTo(170.0f, 196.15027f, 179.84973f, 206.0f, 192.0f, 206.0f),
                    PathNode.LineTo(208.0f, 206.0f),
                    PathNode.CurveTo(220.15027f, 206.0f, 230.0f, 196.15027f, 230.0f, 184.0f),
                    PathNode.LineTo(230.0f, 128.0f),
                    PathNode.CurveTo(230.10146f, 101.05279f, 219.47665f, 75.17261f, 200.47f, 56.07f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 134.0f),
                    PathNode.CurveTo(69.52285f, 134.0f, 74.0f, 138.47716f, 74.0f, 144.0f),
                    PathNode.LineTo(74.0f, 184.0f),
                    PathNode.CurveTo(74.0f, 189.52284f, 69.52285f, 194.0f, 64.0f, 194.0f),
                    PathNode.LineTo(48.0f, 194.0f),
                    PathNode.CurveTo(42.477154f, 194.0f, 38.0f, 189.52284f, 38.0f, 184.0f),
                    PathNode.LineTo(38.0f, 134.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 184.0f),
                    PathNode.CurveTo(218.0f, 189.52284f, 213.52284f, 194.0f, 208.0f, 194.0f),
                    PathNode.LineTo(192.0f, 194.0f),
                    PathNode.CurveTo(186.47716f, 194.0f, 182.0f, 189.52284f, 182.0f, 184.0f),
                    PathNode.LineTo(182.0f, 144.0f),
                    PathNode.CurveTo(182.0f, 138.47716f, 186.47716f, 134.0f, 192.0f, 134.0f),
                    PathNode.LineTo(218.0f, 134.0f),
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
        return _headphones!!
    }

private var _headphones: ImageVector? = null
