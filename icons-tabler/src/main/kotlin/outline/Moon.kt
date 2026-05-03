package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Moon: ImageVector
    get() {
        if (_moon != null) return _moon!!
        _moon = tablerOutlineIcon(
            name = "Moon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 3.000 C 12.132 3.000 12.263 3.000 12.393 3.000 C 9.742 5.463 9.228 9.468 11.171 12.521 C 13.113 15.574 16.959 16.804 20.313 15.446 C 18.580 19.615 14.027 21.855 9.667 20.684 C 5.306 19.512 2.489 15.291 3.079 10.815 C 3.670 6.339 7.485 2.993 12.000 2.992 L 12.000 3.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _moon!!
    }

private var _moon: ImageVector? = null
