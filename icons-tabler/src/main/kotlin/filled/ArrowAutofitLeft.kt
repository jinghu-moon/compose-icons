package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowAutofitLeft: ImageVector
    get() {
        if (_arrowAutofitLeft != null) return _arrowAutofitLeft!!
        _arrowAutofitLeft = tablerFilledIcon(
            name = "ArrowAutofitLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.000 14.000 C 21.000 14.552 20.552 15.000 20.000 15.000 L 8.999 15.000 L 8.999 14.908 C 8.963 13.712 8.219 12.652 7.106 12.210 C 5.994 11.769 4.725 12.032 3.879 12.878 C 3.732 13.025 3.511 13.069 3.318 12.990 C 3.126 12.910 3.001 12.723 3.000 12.515 L 3.000 6.000 C 3.000 4.343 4.343 3.000 6.000 3.000 L 18.000 3.000 C 19.657 3.000 21.000 4.343 21.000 6.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 21.000 18.000 C 21.000 18.552 20.552 19.000 20.000 19.000 L 5.416 19.000 L 6.707 20.293 C 7.063 20.649 7.099 21.215 6.790 21.613 L 6.707 21.707 C 6.317 22.097 5.683 22.097 5.293 21.707 L 2.293 18.707 C 2.258 18.672 2.226 18.635 2.196 18.595 L 2.125 18.485 L 2.071 18.371 L 2.036 18.266 L 2.006 18.117 L 2.000 18.000 L 2.003 17.925 L 2.020 17.799 L 2.050 17.688 L 2.094 17.577 L 2.146 17.479 L 2.213 17.383 L 2.293 17.293 L 5.293 14.293 C 5.544 14.033 5.916 13.929 6.266 14.020 C 6.615 14.112 6.888 14.385 6.980 14.734 C 7.071 15.084 6.967 15.456 6.707 15.707 L 5.414 17.000 L 20.000 17.000 C 20.552 17.000 21.000 17.448 21.000 18.000"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _arrowAutofitLeft!!
    }

private var _arrowAutofitLeft: ImageVector? = null
