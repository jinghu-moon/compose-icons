package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LayoutNavbar: ImageVector
    get() {
        if (_layoutNavbar != null) return _layoutNavbar!!
        _layoutNavbar = tablerFilledIcon(
            name = "LayoutNavbar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.000 3.000 C 19.589 3.000 20.902 4.238 20.995 5.824 L 21.000 6.000 L 21.000 18.000 C 21.000 19.589 19.762 20.902 18.176 20.995 L 18.000 21.000 L 6.000 21.000 C 4.411 21.000 3.098 19.762 3.005 18.176 L 3.000 18.000 L 3.000 6.000 C 3.000 4.411 4.238 3.098 5.824 3.005 L 6.000 3.000 L 18.000 3.000 ZM 19.000 9.000 L 5.000 9.000 L 5.000 18.000 C 5.000 18.507 5.380 18.934 5.883 18.993 L 6.000 19.000 L 18.000 19.000 C 18.507 19.000 18.934 18.620 18.993 18.117 L 19.000 18.000 L 19.000 9.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _layoutNavbar!!
    }

private var _layoutNavbar: ImageVector? = null
