package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BaiduFill: ImageVector
    get() {
        if (_baiduFill != null) return _baiduFill!!
        _baiduFill = remixIcon(
            name = "BaiduFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.926 12.497 C 7.989 12.054 7.708 9.588 7.646 9.049 C 7.545 8.219 6.568 6.767 5.242 6.882 C 3.572 7.032 3.328 9.443 3.328 9.443 C 3.102 10.558 3.869 12.940 5.926 12.497 ZM 8.117 16.785 C 8.057 16.958 7.922 17.401 8.038 17.787 C 8.269 18.653 9.020 18.692 9.020 18.692 L 10.100 18.692 L 10.100 16.051 L 8.944 16.051 C 8.424 16.206 8.173 16.611 8.117 16.785 ZM 9.755 8.363 C 10.894 8.363 11.815 7.051 11.815 5.430 C 11.815 3.811 10.894 2.500 9.755 2.500 C 8.617 2.500 7.694 3.811 7.694 5.430 C 7.694 7.051 8.618 8.363 9.755 8.363 ZM 14.662 8.556 C 16.185 8.754 17.164 7.129 17.359 5.897 C 17.557 4.667 16.575 3.239 15.497 2.993 C 14.417 2.745 13.068 4.476 12.945 5.604 C 12.798 6.983 13.142 8.361 14.662 8.556 ZM 14.662 12.004 C 12.797 9.099 10.149 10.281 9.263 11.759 C 8.381 13.236 7.007 14.170 6.811 14.417 C 6.613 14.661 3.965 16.090 4.553 18.701 C 5.141 21.310 7.206 21.260 7.206 21.260 C 7.206 21.260 8.727 21.410 10.492 21.015 C 12.258 20.624 13.778 21.113 13.778 21.113 C 13.778 21.113 17.902 22.494 19.031 19.835 C 20.158 17.176 18.393 15.797 18.393 15.797 C 18.393 15.797 16.037 13.974 14.662 12.004 ZM 8.655 19.754 C 7.497 19.523 7.036 18.733 6.978 18.598 C 6.921 18.461 6.592 17.826 6.766 16.745 C 7.266 15.126 8.693 15.010 8.693 15.010 L 10.120 15.010 L 10.120 13.255 L 11.336 13.274 L 11.336 19.754 L 8.655 19.754 ZM 13.245 19.735 C 12.049 19.427 11.993 18.577 11.993 18.577 L 11.993 15.165 L 13.245 15.145 L 13.245 18.211 C 13.321 18.539 13.727 18.598 13.727 18.598 L 14.999 18.598 L 14.999 15.165 L 16.330 15.165 L 16.330 19.735 L 13.245 19.735 ZM 20.698 10.625 C 20.698 10.036 20.209 8.261 18.393 8.261 C 16.575 8.261 16.332 9.936 16.332 11.120 C 16.332 12.250 16.427 13.827 18.686 13.777 C 20.946 13.726 20.698 11.217 20.698 10.625 Z"),
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
        return _baiduFill!!
    }

private var _baiduFill: ImageVector? = null
