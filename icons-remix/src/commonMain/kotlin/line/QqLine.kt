package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.QqLine: ImageVector
    get() {
        if (_qqLine != null) return _qqLine!!
        _qqLine = remixIcon(
            name = "QqLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.536 12.514 L 16.840 10.717 C 16.841 10.697 16.849 10.343 16.849 10.160 C 16.849 7.088 15.448 4.000 12.001 4.000 C 8.555 4.000 7.153 7.088 7.153 10.160 C 7.153 10.343 7.162 10.697 7.162 10.717 L 6.467 12.514 C 6.276 13.028 6.088 13.564 5.950 14.023 C 5.293 16.213 5.506 17.119 5.668 17.139 C 6.016 17.182 7.022 15.491 7.022 15.491 C 7.022 16.470 7.510 17.749 8.564 18.672 C 8.170 18.798 7.686 18.991 7.376 19.228 C 7.096 19.442 7.131 19.659 7.182 19.747 C 7.403 20.133 10.971 19.993 12.002 19.873 C 13.032 19.993 16.601 20.133 16.822 19.747 C 16.872 19.659 16.907 19.442 16.628 19.228 C 16.317 18.991 15.833 18.798 15.439 18.672 C 16.493 17.749 16.980 16.470 16.980 15.491 C 16.980 15.491 17.987 17.182 18.335 17.139 C 18.497 17.119 18.713 16.211 18.052 14.023 C 17.913 13.560 17.726 13.028 17.536 12.514 ZM 18.557 20.741 C 18.184 21.393 17.724 21.633 17.119 21.798 C 16.879 21.863 16.621 21.906 16.325 21.936 C 15.884 21.981 15.339 22.001 14.712 22.000 C 13.786 21.999 12.693 21.949 12.002 21.884 C 11.310 21.949 10.217 21.999 9.291 22.000 C 8.664 22.001 8.119 21.981 7.678 21.936 C 7.382 21.906 7.124 21.863 6.885 21.798 C 6.280 21.633 5.820 21.393 5.445 20.739 C 5.152 20.226 5.077 19.641 5.206 19.087 C 4.614 18.955 4.205 18.604 3.927 18.176 C 3.779 17.947 3.684 17.713 3.618 17.466 C 3.530 17.134 3.495 16.767 3.502 16.360 C 3.515 15.575 3.689 14.598 4.034 13.448 C 4.174 12.982 4.361 12.440 4.602 11.793 L 5.155 10.363 C 5.154 10.287 5.153 10.215 5.153 10.160 C 5.153 5.605 7.589 2.000 12.001 2.000 C 16.414 2.000 18.849 5.605 18.849 10.160 C 18.849 10.215 18.849 10.287 18.848 10.363 L 19.401 11.792 L 19.411 11.819 C 19.636 12.425 19.824 12.972 19.967 13.445 C 20.315 14.596 20.489 15.573 20.502 16.361 C 20.508 16.768 20.473 17.136 20.384 17.469 C 20.318 17.715 20.223 17.948 20.075 18.177 C 19.798 18.604 19.390 18.953 18.797 19.086 C 18.927 19.641 18.852 20.227 18.557 20.741 Z"),
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
        return _qqLine!!
    }

private var _qqLine: ImageVector? = null
