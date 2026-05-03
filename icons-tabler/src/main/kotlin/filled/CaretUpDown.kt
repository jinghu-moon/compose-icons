package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CaretUpDown: ImageVector
    get() {
        if (_caretUpDown != null) return _caretUpDown!!
        _caretUpDown = tablerFilledIcon(
            name = "CaretUpDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.293 3.293 C 11.684 2.903 12.316 2.903 12.707 3.293 L 18.707 9.293 C 18.733 9.319 18.757 9.346 18.780 9.375 L 18.786 9.383 L 18.802 9.405 L 18.844 9.464 L 18.853 9.479 L 18.860 9.489 L 18.874 9.516 L 18.898 9.560 L 18.905 9.577 L 18.915 9.597 L 18.927 9.629 L 18.942 9.663 L 18.949 9.688 L 18.957 9.708 L 18.962 9.734 L 18.974 9.771 L 18.978 9.799 L 18.984 9.824 L 18.987 9.850 L 18.993 9.883 L 18.995 9.913 L 18.998 9.941 L 18.998 9.967 L 19.000 10.000 L 18.998 10.033 L 18.998 10.059 L 18.995 10.085 L 18.993 10.117 L 18.988 10.146 L 18.984 10.176 L 18.978 10.200 L 18.974 10.230 L 18.962 10.265 L 18.957 10.292 L 18.949 10.311 L 18.942 10.337 L 18.927 10.370 L 18.915 10.404 L 18.905 10.422 L 18.898 10.440 L 18.874 10.483 L 18.860 10.511 L 18.853 10.520 L 18.844 10.536 L 18.802 10.594 L 18.790 10.613 L 18.786 10.616 L 18.780 10.626 C 18.734 10.683 18.682 10.734 18.625 10.780 L 18.616 10.786 L 18.594 10.802 L 18.536 10.844 L 18.520 10.853 L 18.511 10.860 L 18.483 10.874 L 18.440 10.898 L 18.422 10.905 L 18.404 10.915 L 18.370 10.927 L 18.337 10.942 L 18.313 10.948 L 18.292 10.957 L 18.265 10.962 L 18.229 10.974 L 18.200 10.978 L 18.176 10.984 L 18.148 10.987 L 18.117 10.993 L 18.085 10.995 L 18.059 10.998 L 18.033 10.998 L 18.000 11.000 L 6.000 11.000 C 5.110 11.000 4.663 9.923 5.293 9.293 L 11.293 3.293 Z"),
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
                pathData = parseSvgPathData("M 18.000 13.000 L 18.033 13.002 L 18.059 13.002 L 18.085 13.005 L 18.117 13.007 L 18.148 13.013 L 18.176 13.016 L 18.200 13.022 L 18.230 13.026 L 18.265 13.038 L 18.292 13.043 L 18.311 13.051 L 18.337 13.058 L 18.370 13.073 L 18.404 13.085 L 18.422 13.095 L 18.440 13.102 L 18.483 13.126 L 18.511 13.140 L 18.520 13.147 L 18.536 13.156 L 18.587 13.193 L 18.613 13.210 L 18.616 13.214 L 18.626 13.220 C 18.683 13.266 18.735 13.318 18.780 13.375 L 18.786 13.384 L 18.801 13.404 L 18.844 13.464 L 18.853 13.480 L 18.860 13.489 L 18.874 13.517 L 18.898 13.560 L 18.903 13.573 L 18.915 13.596 L 18.927 13.630 L 18.942 13.663 L 18.949 13.689 L 18.957 13.709 L 18.962 13.735 L 18.974 13.771 L 18.978 13.800 L 18.984 13.824 L 18.987 13.852 L 18.993 13.883 L 18.995 13.915 L 18.998 13.941 L 18.998 13.967 L 19.000 14.000 L 18.998 14.033 L 18.998 14.059 L 18.995 14.085 L 18.993 14.117 L 18.987 14.148 L 18.984 14.176 L 18.978 14.200 L 18.974 14.230 L 18.962 14.265 L 18.957 14.292 L 18.949 14.311 L 18.942 14.337 L 18.927 14.370 L 18.915 14.404 L 18.905 14.422 L 18.898 14.440 L 18.874 14.483 L 18.860 14.511 L 18.853 14.520 L 18.844 14.536 L 18.802 14.594 L 18.790 14.613 L 18.786 14.616 L 18.780 14.626 L 18.707 14.707 L 12.707 20.707 C 12.316 21.097 11.684 21.097 11.293 20.707 L 5.293 14.707 C 4.663 14.077 5.109 13.000 6.000 13.000 L 18.000 13.000 Z"),
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
        return _caretUpDown!!
    }

private var _caretUpDown: ImageVector? = null
