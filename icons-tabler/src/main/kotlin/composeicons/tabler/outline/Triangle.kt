package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Triangle: ImageVector
    get() {
        if (_triangle != null) return _triangle!!
        _triangle = tablerOutlineIcon(
            name = "Triangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.363 3.591 2.257 17.125c-.34 .589-.342 1.314-.005 1.905 .337 .591 .962 .959 1.641 .966h16.214c.68-.008 1.304-.376 1.641-.966 .337-.59 .335-1.315-.005-1.904L13.637 3.59C13.29 3.017 12.669 2.668 12 2.668c-.669 0-1.29 .35-1.637 .922"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _triangle!!
    }

private var _triangle: ImageVector? = null
