package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Pillow: ImageVector
    get() {
        if (_pillow != null) return _pillow!!
        _pillow = tablerOutlineIcon(
            name = "Pillow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.000 9.000 C 6.660 10.946 6.660 13.054 6.000 15.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 21.699 16.607 C 22.180 17.541 21.979 18.695 21.213 19.397 C 20.446 20.100 19.313 20.167 18.473 19.562 C 14.177 20.147 9.823 20.147 5.527 19.562 C 4.692 20.169 3.543 20.100 2.787 19.397 C 2.018 18.681 1.820 17.541 2.301 16.607 C 1.964 13.562 1.964 10.489 2.301 7.444 C 1.773 6.505 1.951 5.328 2.734 4.588 C 3.504 3.862 4.686 3.801 5.527 4.443 C 9.823 3.858 14.177 3.858 18.473 4.443 C 19.314 3.801 20.496 3.862 21.266 4.588 C 22.046 5.314 22.227 6.506 21.699 7.444 C 22.036 10.489 22.036 13.562 21.699 16.607"),
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
        return _pillow!!
    }

private var _pillow: ImageVector? = null
