package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Ferry: ImageVector
    get() {
        if (_ferry != null) return _ferry!!
        _ferry = tablerFilledIcon(
            name = "Ferry",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 22.000 12.000 C 22.359 12.000 22.691 12.193 22.869 12.505 C 23.047 12.817 23.043 13.201 22.860 13.510 L 20.658 17.219 C 19.901 18.334 18.641 19.002 17.293 19.000 L 2.000 19.000 C 1.683 19.000 1.385 18.850 1.196 18.596 C 1.008 18.341 0.951 18.012 1.043 17.709 L 2.564 12.709 C 2.692 12.288 3.081 12.000 3.521 12.000 ZM 19.000 13.000 C 18.448 13.000 18.000 13.448 18.000 14.000 C 18.000 14.552 18.448 15.000 19.000 15.000 C 19.552 15.000 20.000 14.552 20.000 14.000 C 20.000 13.448 19.552 13.000 19.000 13.000M 13.894 5.553 L 14.617 7.000 L 15.491 7.000 C 15.847 7.000 16.176 7.189 16.355 7.497 L 18.392 11.000 L 5.560 11.000 L 6.533 7.716 C 6.659 7.292 7.048 7.000 7.491 7.000 L 12.381 7.000 L 12.106 6.447 C 11.879 5.957 12.083 5.375 12.567 5.133 C 13.050 4.892 13.638 5.077 13.894 5.553"),
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
        return _ferry!!
    }

private var _ferry: ImageVector? = null
