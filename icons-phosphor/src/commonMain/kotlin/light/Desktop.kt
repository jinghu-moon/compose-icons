package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Desktop: ImageVector
    get() {
        if (_desktop != null) return _desktop!!
        _desktop = phosphorLightIcon(
            name = "Desktop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 42.0f),
                    PathNode.LineTo(48.0f, 42.0f),
                    PathNode.CurveTo(35.849735f, 42.0f, 26.0f, 51.849735f, 26.0f, 64.0f),
                    PathNode.LineTo(26.0f, 176.0f),
                    PathNode.CurveTo(26.0f, 188.15027f, 35.849735f, 198.0f, 48.0f, 198.0f),
                    PathNode.LineTo(122.0f, 198.0f),
                    PathNode.LineTo(122.0f, 218.0f),
                    PathNode.LineTo(96.0f, 218.0f),
                    PathNode.CurveTo(92.686295f, 218.0f, 90.0f, 220.6863f, 90.0f, 224.0f),
                    PathNode.CurveTo(90.0f, 227.3137f, 92.686295f, 230.0f, 96.0f, 230.0f),
                    PathNode.LineTo(160.0f, 230.0f),
                    PathNode.CurveTo(163.3137f, 230.0f, 166.0f, 227.3137f, 166.0f, 224.0f),
                    PathNode.CurveTo(166.0f, 220.6863f, 163.3137f, 218.0f, 160.0f, 218.0f),
                    PathNode.LineTo(134.0f, 218.0f),
                    PathNode.LineTo(134.0f, 198.0f),
                    PathNode.LineTo(208.0f, 198.0f),
                    PathNode.CurveTo(220.15027f, 198.0f, 230.0f, 188.15027f, 230.0f, 176.0f),
                    PathNode.LineTo(230.0f, 64.0f),
                    PathNode.CurveTo(230.0f, 51.849735f, 220.15027f, 42.0f, 208.0f, 42.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 54.0f),
                    PathNode.LineTo(208.0f, 54.0f),
                    PathNode.CurveTo(213.52284f, 54.0f, 218.0f, 58.477154f, 218.0f, 64.0f),
                    PathNode.LineTo(218.0f, 146.0f),
                    PathNode.LineTo(38.0f, 146.0f),
                    PathNode.LineTo(38.0f, 64.0f),
                    PathNode.CurveTo(38.0f, 58.477154f, 42.477154f, 54.0f, 48.0f, 54.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 186.0f),
                    PathNode.LineTo(48.0f, 186.0f),
                    PathNode.CurveTo(42.477154f, 186.0f, 38.0f, 181.52284f, 38.0f, 176.0f),
                    PathNode.LineTo(38.0f, 158.0f),
                    PathNode.LineTo(218.0f, 158.0f),
                    PathNode.LineTo(218.0f, 176.0f),
                    PathNode.CurveTo(218.0f, 181.52284f, 213.52284f, 186.0f, 208.0f, 186.0f),
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
        return _desktop!!
    }

private var _desktop: ImageVector? = null
