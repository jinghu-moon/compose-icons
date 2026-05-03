package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CaretLeftRight: ImageVector
    get() {
        if (_caretLeftRight != null) return _caretLeftRight!!
        _caretLeftRight = tablerFilledIcon(
            name = "CaretLeftRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.000 6.000 C 13.000 5.110 14.077 4.663 14.707 5.293 L 20.707 11.293 C 21.097 11.684 21.097 12.316 20.707 12.707 L 14.707 18.707 C 14.681 18.733 14.654 18.757 14.625 18.780 L 14.616 18.786 L 14.594 18.802 L 14.536 18.844 L 14.520 18.853 L 14.511 18.860 L 14.483 18.874 L 14.440 18.898 L 14.422 18.905 L 14.404 18.915 L 14.370 18.927 L 14.337 18.942 L 14.311 18.949 L 14.291 18.957 L 14.265 18.962 L 14.229 18.974 L 14.200 18.978 L 14.176 18.984 L 14.148 18.987 L 14.117 18.993 L 14.085 18.995 L 14.059 18.998 L 14.033 18.998 L 14.000 19.000 L 13.967 18.998 L 13.941 18.998 L 13.915 18.995 L 13.883 18.993 L 13.852 18.987 L 13.824 18.984 L 13.800 18.978 L 13.770 18.974 L 13.735 18.962 L 13.708 18.957 L 13.689 18.949 L 13.663 18.942 L 13.630 18.927 L 13.596 18.915 L 13.578 18.905 L 13.560 18.898 L 13.517 18.874 L 13.489 18.860 L 13.480 18.853 L 13.464 18.844 L 13.406 18.802 L 13.387 18.790 L 13.384 18.786 L 13.374 18.780 C 13.317 18.734 13.266 18.682 13.220 18.625 L 13.214 18.616 L 13.198 18.594 L 13.156 18.536 L 13.147 18.520 L 13.140 18.511 L 13.126 18.483 L 13.102 18.440 L 13.095 18.422 L 13.085 18.404 L 13.073 18.370 L 13.058 18.337 L 13.051 18.311 L 13.043 18.291 L 13.038 18.265 L 13.026 18.229 L 13.022 18.200 L 13.016 18.176 L 13.013 18.148 L 13.007 18.117 L 13.005 18.085 L 13.002 18.059 L 13.002 18.033 L 13.000 18.000 L 13.000 6.000 Z"),
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
                pathData = parseSvgPathData("M 9.293 5.293 C 9.923 4.663 11.000 5.109 11.000 6.000 L 11.000 18.000 L 10.998 18.033 L 10.998 18.059 L 10.995 18.085 L 10.993 18.117 L 10.987 18.148 L 10.984 18.176 L 10.978 18.200 L 10.974 18.230 L 10.962 18.265 L 10.957 18.292 L 10.949 18.311 L 10.942 18.337 L 10.927 18.370 L 10.915 18.404 L 10.905 18.422 L 10.898 18.440 L 10.874 18.483 L 10.860 18.511 L 10.853 18.520 L 10.844 18.536 L 10.802 18.594 L 10.790 18.613 L 10.786 18.616 L 10.780 18.626 C 10.734 18.683 10.682 18.734 10.625 18.780 L 10.616 18.786 L 10.594 18.802 L 10.536 18.844 L 10.520 18.853 L 10.511 18.860 L 10.483 18.874 L 10.440 18.898 L 10.422 18.905 L 10.404 18.915 L 10.370 18.927 L 10.337 18.942 L 10.311 18.949 L 10.291 18.957 L 10.265 18.962 L 10.229 18.974 L 10.200 18.978 L 10.176 18.984 L 10.148 18.987 L 10.117 18.993 L 10.085 18.995 L 10.059 18.998 L 10.033 18.998 L 10.000 19.000 L 9.967 18.998 L 9.941 18.998 L 9.913 18.995 L 9.883 18.993 L 9.851 18.987 L 9.824 18.984 L 9.799 18.978 L 9.771 18.974 L 9.734 18.962 L 9.708 18.957 L 9.688 18.949 L 9.663 18.942 L 9.629 18.927 L 9.596 18.915 L 9.577 18.905 L 9.560 18.898 L 9.516 18.874 L 9.489 18.860 L 9.479 18.853 L 9.464 18.844 L 9.405 18.802 L 9.387 18.790 L 9.383 18.786 L 9.375 18.780 C 9.346 18.757 9.319 18.733 9.293 18.707 L 3.293 12.707 C 2.903 12.316 2.903 11.684 3.293 11.293 L 9.293 5.293 Z"),
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
        return _caretLeftRight!!
    }

private var _caretLeftRight: ImageVector? = null
