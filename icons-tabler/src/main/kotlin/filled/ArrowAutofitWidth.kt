package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowAutofitWidth: ImageVector
    get() {
        if (_arrowAutofitWidth != null) return _arrowAutofitWidth!!
        _arrowAutofitWidth = tablerFilledIcon(
            name = "ArrowAutofitWidth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.121 12.879 C 18.950 11.708 17.050 11.708 15.879 12.879 L 15.794 12.969 L 15.711 13.063 L 15.631 13.159 L 15.516 13.317 C 15.197 13.788 15.019 14.339 15.001 14.907 L 15.002 15.000 L 8.999 15.000 L 8.999 14.908 C 8.963 13.712 8.219 12.652 7.106 12.210 C 5.994 11.769 4.725 12.032 3.879 12.878 C 3.732 13.025 3.511 13.070 3.319 12.990 C 3.126 12.911 3.001 12.723 3.001 12.515 L 3.000 6.000 C 3.000 4.343 4.343 3.000 6.000 3.000 L 18.000 3.000 C 19.657 3.000 21.000 4.343 21.000 6.000 L 21.000 12.514 C 21.000 12.722 20.875 12.910 20.683 12.990 C 20.490 13.070 20.268 13.026 20.121 12.879"),
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
                pathData = parseSvgPathData("M 11.000 18.000 C 11.000 18.552 10.552 19.000 10.000 19.000 L 5.416 19.000 L 6.707 20.293 C 7.063 20.649 7.099 21.215 6.790 21.613 L 6.707 21.707 C 6.317 22.097 5.683 22.097 5.293 21.707 L 2.293 18.707 C 2.258 18.672 2.226 18.635 2.196 18.595 L 2.125 18.485 L 2.071 18.371 L 2.036 18.266 L 2.006 18.117 L 2.000 18.000 L 2.003 17.925 L 2.020 17.799 L 2.050 17.688 L 2.094 17.577 L 2.146 17.479 L 2.213 17.383 L 2.293 17.293 L 5.293 14.293 C 5.685 13.914 6.309 13.919 6.695 14.305 C 7.081 14.691 7.086 15.315 6.707 15.707 L 5.414 17.000 L 10.000 17.000 C 10.552 17.000 11.000 17.448 11.000 18.000M 21.989 17.852 L 21.996 17.910 L 22.000 18.000 L 21.997 18.075 L 21.980 18.201 L 21.950 18.312 L 21.906 18.423 L 21.854 18.521 L 21.780 18.625 L 21.707 18.707 L 18.707 21.707 C 18.456 21.967 18.084 22.071 17.734 21.980 C 17.385 21.888 17.112 21.615 17.020 21.266 C 16.929 20.916 17.033 20.544 17.293 20.293 L 18.585 19.000 L 14.000 19.000 C 13.448 19.000 13.000 18.552 13.000 18.000 C 13.000 17.448 13.448 17.000 14.000 17.000 L 18.585 17.000 L 17.293 15.707 C 16.937 15.351 16.901 14.785 17.210 14.387 L 17.293 14.293 C 17.684 13.903 18.316 13.903 18.707 14.293 L 21.707 17.293 Q 21.761 17.346 21.804 17.405 L 21.875 17.515 L 21.929 17.629 L 21.964 17.734 Z"),
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
        return _arrowAutofitWidth!!
    }

private var _arrowAutofitWidth: ImageVector? = null
