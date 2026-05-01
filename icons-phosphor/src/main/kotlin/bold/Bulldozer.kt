package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Bulldozer: ImageVector
    get() {
        if (_bulldozer != null) return _bulldozer!!
        _bulldozer = phosphorBoldIcon(
            name = "Bulldozer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.0f, 196.0f),
                    PathNode.LineTo(236.0f, 196.0f),
                    PathNode.CurveTo(233.79086f, 196.0f, 232.0f, 194.20914f, 232.0f, 192.0f),
                    PathNode.LineTo(232.0f, 160.0f),
                    PathNode.CurveTo(232.0f, 157.79086f, 233.79086f, 156.0f, 236.0f, 156.0f),
                    PathNode.LineTo(244.0f, 156.0f),
                    PathNode.CurveTo(250.62741f, 156.0f, 256.0f, 150.62741f, 256.0f, 144.0f),
                    PathNode.CurveTo(256.0f, 137.37259f, 250.62741f, 132.0f, 244.0f, 132.0f),
                    PathNode.LineTo(236.0f, 132.0f),
                    PathNode.CurveTo(220.53603f, 132.0f, 208.0f, 144.53603f, 208.0f, 160.0f),
                    PathNode.LineTo(208.0f, 164.0f),
                    PathNode.LineTo(198.32f, 164.0f),
                    PathNode.CurveTo(193.76021f, 148.03093f, 180.6212f, 135.97395f, 164.32f, 132.8f),
                    PathNode.LineTo(129.12f, 48.31f),
                    PathNode.CurveTo(126.01694f, 40.86003f, 118.74038f, 36.005043f, 110.67f, 36.0f),
                    PathNode.LineTo(24.0f, 36.0f),
                    PathNode.CurveTo(12.954305f, 36.0f, 4.0f, 44.954304f, 4.0f, 56.0f),
                    PathNode.LineTo(4.0f, 157.7f),
                    PathNode.CurveTo(-2.22847f, 171.31886f, -1.10248f, 187.1706f, 6.988508f, 199.77231f),
                    PathNode.CurveTo(15.079495f, 212.37402f, 29.024446f, 219.99529f, 44.0f, 220.0f),
                    PathNode.LineTo(156.0f, 220.0f),
                    PathNode.CurveTo(175.6677f, 219.9744f, 192.93661f, 206.91661f, 198.32f, 188.0f),
                    PathNode.LineTo(208.0f, 188.0f),
                    PathNode.LineTo(208.0f, 192.0f),
                    PathNode.CurveTo(208.0f, 207.46397f, 220.53603f, 220.0f, 236.0f, 220.0f),
                    PathNode.LineTo(244.0f, 220.0f),
                    PathNode.CurveTo(250.62741f, 220.0f, 256.0f, 214.62741f, 256.0f, 208.0f),
                    PathNode.CurveTo(256.0f, 201.37259f, 250.62741f, 196.0f, 244.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(138.0f, 132.0f),
                    PathNode.LineTo(68.0f, 132.0f),
                    PathNode.LineTo(68.0f, 60.0f),
                    PathNode.LineTo(108.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 60.0f),
                    PathNode.LineTo(44.0f, 132.0f),
                    PathNode.CurveTo(38.52617f, 131.99258f, 33.09934f, 133.01012f, 28.0f, 135.0f),
                    PathNode.LineTo(28.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 196.0f),
                    PathNode.LineTo(44.0f, 196.0f),
                    PathNode.CurveTo(32.954304f, 196.0f, 24.0f, 187.0457f, 24.0f, 176.0f),
                    PathNode.CurveTo(24.0f, 164.9543f, 32.954304f, 156.0f, 44.0f, 156.0f),
                    PathNode.LineTo(156.0f, 156.0f),
                    PathNode.CurveTo(167.0457f, 156.0f, 176.0f, 164.9543f, 176.0f, 176.0f),
                    PathNode.CurveTo(176.0f, 187.0457f, 167.0457f, 196.0f, 156.0f, 196.0f),
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
        return _bulldozer!!
    }

private var _bulldozer: ImageVector? = null
