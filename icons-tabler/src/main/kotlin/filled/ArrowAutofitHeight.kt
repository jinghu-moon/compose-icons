package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowAutofitHeight: ImageVector
    get() {
        if (_arrowAutofitHeight != null) return _arrowAutofitHeight!!
        _arrowAutofitHeight = tablerFilledIcon(
            name = "ArrowAutofitHeight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.879 3.879 C 11.708 5.050 11.708 6.950 12.879 8.121 L 12.969 8.206 L 13.063 8.289 L 13.159 8.369 L 13.317 8.484 C 13.788 8.803 14.339 8.981 14.907 8.999 L 15.000 8.998 L 15.000 15.001 L 14.908 15.001 C 13.712 15.037 12.652 15.781 12.210 16.894 C 11.769 18.006 12.032 19.275 12.878 20.121 C 13.025 20.268 13.070 20.489 12.990 20.681 C 12.911 20.874 12.723 20.999 12.515 20.999 L 6.000 21.000 C 4.343 21.000 3.000 19.657 3.000 18.000 L 3.000 6.000 C 3.000 4.343 4.343 3.000 6.000 3.000 L 12.514 3.000 C 12.722 3.000 12.910 3.125 12.990 3.317 C 13.070 3.510 13.026 3.732 12.879 3.879"),
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
        pathData = parseSvgPathData("M 18.000 13.000 C 18.552 13.000 19.000 13.448 19.000 14.000 L 19.000 18.584 L 20.293 17.293 C 20.649 16.937 21.215 16.901 21.613 17.210 L 21.707 17.293 C 22.097 17.684 22.097 18.316 21.707 18.707 L 18.707 21.707 C 18.672 21.742 18.635 21.774 18.595 21.804 L 18.485 21.875 L 18.371 21.929 L 18.266 21.964 L 18.117 21.994 L 18.000 22.000 L 17.925 21.997 L 17.799 21.980 L 17.688 21.950 L 17.577 21.906 L 17.479 21.854 L 17.383 21.787 L 17.293 21.707 L 14.293 18.707 C 13.914 18.315 13.919 17.691 14.305 17.305 C 14.691 16.919 15.315 16.914 15.707 17.293 L 17.000 18.586 L 17.000 14.000 C 17.000 13.448 17.448 13.000 18.000 13.000"),
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
        pathData = parseSvgPathData("M 17.852 2.011 L 17.910 2.004 L 18.000 2.000 L 18.075 2.003 L 18.201 2.020 L 18.312 2.050 L 18.423 2.094 L 18.521 2.146 L 18.625 2.220 L 18.707 2.293 L 21.707 5.293 C 21.967 5.544 22.071 5.916 21.980 6.266 C 21.888 6.615 21.615 6.888 21.266 6.980 C 20.916 7.071 20.544 6.967 20.293 6.707 L 19.000 5.415 L 19.000 10.000 C 19.000 10.552 18.552 11.000 18.000 11.000 C 17.448 11.000 17.000 10.552 17.000 10.000 L 17.000 5.415 L 15.707 6.707 C 15.351 7.063 14.785 7.099 14.387 6.790 L 14.293 6.707 C 13.903 6.317 13.903 5.683 14.293 5.293 L 17.293 2.293 Q 17.346 2.239 17.405 2.196 L 17.515 2.125 L 17.629 2.071 L 17.734 2.036 Z"),
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
        return _arrowAutofitHeight!!
    }

private var _arrowAutofitHeight: ImageVector? = null
