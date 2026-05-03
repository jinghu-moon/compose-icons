package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HighlighterCircle: ImageVector
    get() {
        if (_highlighterCircle != null) return _highlighterCircle!!
        _highlighterCircle = phosphorThinIcon(
            name = "HighlighterCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(198.71f, 57.29f),
                    PathNode.CurveTo(173.48494f, 31.843018f, 136.57294f, 21.836878f, 101.949455f, 31.06006f),
                    PathNode.CurveTo(67.32597f, 40.28324f, 40.28324f, 67.32597f, 31.06006f, 101.949455f),
                    PathNode.CurveTo(21.836878f, 136.57294f, 31.843018f, 173.48494f, 57.29f, 198.71f),
                    PathNode.CurveTo(82.51506f, 224.15698f, 119.42706f, 234.16312f, 154.05057f, 224.93994f),
                    PathNode.CurveTo(188.67403f, 215.71675f, 215.71675f, 188.67403f, 224.93994f, 154.05057f),
                    PathNode.CurveTo(234.16312f, 119.42706f, 224.15698f, 82.51506f, 198.71f, 57.29f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 212.7f),
                    PathNode.LineTo(92.0f, 152.0f),
                    PathNode.CurveTo(92.0f, 149.79086f, 93.79086f, 148.0f, 96.0f, 148.0f),
                    PathNode.LineTo(160.0f, 148.0f),
                    PathNode.CurveTo(162.20914f, 148.0f, 164.0f, 149.79086f, 164.0f, 152.0f),
                    PathNode.LineTo(164.0f, 212.7f),
                    PathNode.CurveTo(140.98679f, 222.433f, 115.013214f, 222.433f, 92.0f, 212.7f),
                    PathNode.Close,
                    PathNode.MoveTo(148.0f, 140.0f),
                    PathNode.LineTo(108.0f, 140.0f),
                    PathNode.LineTo(108.0f, 98.47f),
                    PathNode.LineTo(148.0f, 78.47f),
                    PathNode.Close,
                    PathNode.MoveTo(193.05f, 193.05f),
                    PathNode.CurveTo(186.82552f, 199.29124f, 179.73639f, 204.60558f, 172.0f, 208.83f),
                    PathNode.LineTo(172.0f, 152.0f),
                    PathNode.CurveTo(172.0f, 145.37259f, 166.62741f, 140.0f, 160.0f, 140.0f),
                    PathNode.LineTo(156.0f, 140.0f),
                    PathNode.LineTo(156.0f, 72.0f),
                    PathNode.CurveTo(156.00099f, 70.61295f, 155.28334f, 69.324394f, 154.10358f, 68.59494f),
                    PathNode.CurveTo(152.92384f, 67.8655f, 151.45041f, 67.79929f, 150.21f, 68.42f),
                    PathNode.LineTo(102.21f, 92.42f),
                    PathNode.CurveTo(100.85457f, 93.09826f, 99.99892f, 94.484344f, 100.0f, 96.0f),
                    PathNode.LineTo(100.0f, 140.0f),
                    PathNode.LineTo(96.0f, 140.0f),
                    PathNode.CurveTo(89.37258f, 140.0f, 84.0f, 145.37259f, 84.0f, 152.0f),
                    PathNode.LineTo(84.0f, 208.83f),
                    PathNode.CurveTo(49.194984f, 189.89088f, 30.4263f, 150.79445f, 37.415573f, 111.79152f),
                    PathNode.CurveTo(44.404846f, 72.78858f, 75.581726f, 42.64233f, 114.7975f, 36.96764f),
                    PathNode.CurveTo(154.01328f, 31.29295f, 192.45692f, 51.364815f, 210.21577f, 86.78659f),
                    PathNode.CurveTo(227.97462f, 122.208374f, 221.0586f, 165.02148f, 193.05f, 193.05f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _highlighterCircle!!
    }

private var _highlighterCircle: ImageVector? = null
