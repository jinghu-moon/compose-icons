package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowAutofitUp: ImageVector
    get() {
        if (_arrowAutofitUp != null) return _arrowAutofitUp!!
        _arrowAutofitUp = tablerFilledIcon(
            name = "ArrowAutofitUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.000 21.000 C 14.552 21.000 15.000 20.552 15.000 20.000 L 15.000 8.999 L 14.908 8.999 C 13.712 8.963 12.652 8.219 12.210 7.106 C 11.769 5.994 12.032 4.725 12.878 3.879 C 13.025 3.732 13.069 3.511 12.990 3.318 C 12.910 3.126 12.723 3.001 12.515 3.000 L 6.000 3.000 C 4.343 3.000 3.000 4.343 3.000 6.000 L 3.000 18.000 C 3.000 19.657 4.343 21.000 6.000 21.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 18.000 21.000 C 18.552 21.000 19.000 20.552 19.000 20.000 L 19.000 5.416 L 20.293 6.707 C 20.649 7.063 21.215 7.099 21.613 6.790 L 21.707 6.707 C 22.097 6.317 22.097 5.683 21.707 5.293 L 18.707 2.293 C 18.672 2.258 18.635 2.226 18.595 2.196 L 18.485 2.125 L 18.371 2.071 L 18.266 2.036 L 18.117 2.006 L 18.000 2.000 L 17.925 2.003 L 17.799 2.020 L 17.688 2.050 L 17.577 2.094 L 17.479 2.146 L 17.383 2.213 L 17.293 2.293 L 14.293 5.293 C 14.033 5.544 13.929 5.916 14.020 6.266 C 14.112 6.615 14.385 6.888 14.734 6.980 C 15.084 7.071 15.456 6.967 15.707 6.707 L 17.000 5.414 L 17.000 20.000 C 17.000 20.552 17.448 21.000 18.000 21.000"),
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
        return _arrowAutofitUp!!
    }

private var _arrowAutofitUp: ImageVector? = null
