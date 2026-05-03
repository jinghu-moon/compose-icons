package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FidgetSpinner: ImageVector
    get() {
        if (_fidgetSpinner != null) return _fidgetSpinner!!
        _fidgetSpinner = tablerFilledIcon(
            name = "FidgetSpinner",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 0.000 C 14.010 -0.001 15.826 1.203 16.608 3.055 C 17.390 4.907 16.986 7.048 15.584 8.488 L 15.572 8.500 C 16.250 9.192 16.712 10.067 16.902 11.017 L 16.920 11.118 L 17.171 11.070 Q 17.321 11.045 17.471 11.029 L 17.775 11.005 L 18.000 11.000 C 20.625 11.000 22.803 13.031 22.987 15.649 C 23.171 18.268 21.299 20.583 18.699 20.951 C 16.100 21.318 13.659 19.613 13.110 17.046 L 13.078 16.882 L 12.838 16.930 C 12.654 16.961 12.468 16.982 12.282 16.992 L 12.000 17.000 Q 11.573 17.000 11.160 16.930 L 10.921 16.882 L 10.917 16.907 C 10.587 18.696 9.311 20.164 7.586 20.741 L 7.366 20.809 C 5.382 21.372 3.257 20.659 2.013 19.014 C 0.770 17.369 0.664 15.129 1.746 13.374 C 2.828 11.619 4.877 10.708 6.905 11.081 L 7.078 11.117 L 7.097 11.015 C 7.287 10.065 7.750 9.191 8.428 8.499 L 8.378 8.447 C 7.606 7.634 7.129 6.585 7.023 5.469 L 7.005 5.225 L 7.000 5.000 C 7.000 2.239 9.239 0.000 12.000 0.000M 18.000 15.000 C 17.448 15.000 17.000 15.448 17.000 16.000 L 17.000 16.010 C 17.000 16.562 17.448 17.010 18.000 17.010 C 18.552 17.010 19.000 16.562 19.000 16.010 L 19.000 16.000 C 19.000 15.448 18.552 15.000 18.000 15.000M 6.000 15.000 C 5.448 15.000 5.000 15.448 5.000 16.000 L 5.000 16.010 C 5.000 16.562 5.448 17.010 6.000 17.010 C 6.552 17.010 7.000 16.562 7.000 16.010 L 7.000 16.000 C 7.000 15.448 6.552 15.000 6.000 15.000M 12.000 10.005 C 10.900 10.005 10.010 10.896 10.010 11.995 L 10.010 12.015 C 10.010 13.114 10.901 14.005 12.000 14.005 C 13.099 14.005 13.990 13.114 13.990 12.015 L 13.990 11.995 C 13.990 10.896 13.099 10.005 12.000 10.005M 12.000 4.000 C 11.448 4.000 11.000 4.448 11.000 5.000 L 11.000 5.010 C 11.000 5.562 11.448 6.010 12.000 6.010 C 12.552 6.010 13.000 5.562 13.000 5.010 L 13.000 5.000 C 13.000 4.448 12.552 4.000 12.000 4.000"),
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
        return _fidgetSpinner!!
    }

private var _fidgetSpinner: ImageVector? = null
