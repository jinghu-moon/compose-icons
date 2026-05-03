package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.WechatPayLine: ImageVector
    get() {
        if (_wechatPayLine != null) return _wechatPayLine!!
        _wechatPayLine = remixIcon(
            name = "WechatPayLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.146 8.993 L 9.347 14.601 L 9.278 14.646 C 9.185 14.693 9.092 14.715 8.976 14.715 C 8.721 14.715 8.513 14.578 8.397 14.371 L 8.351 14.279 L 6.520 10.329 C 6.497 10.283 6.497 10.237 6.497 10.191 C 6.497 10.007 6.636 9.870 6.821 9.870 C 6.891 9.870 6.960 9.893 7.030 9.939 L 9.185 11.454 C 9.347 11.546 9.532 11.615 9.741 11.615 C 9.857 11.615 9.973 11.592 10.089 11.546 L 18.363 7.897 C 16.935 6.273 14.635 5.200 12.001 5.200 C 7.580 5.200 4.101 8.222 4.101 11.800 C 4.101 13.165 4.600 14.473 5.532 15.581 C 5.581 15.638 5.653 15.718 5.747 15.816 C 6.542 16.644 6.943 17.774 6.848 18.918 L 6.823 19.215 L 7.538 18.779 C 8.348 18.285 9.307 18.095 10.244 18.243 C 10.455 18.276 10.629 18.302 10.763 18.319 C 11.170 18.373 11.583 18.400 12.001 18.400 C 16.421 18.400 19.901 15.378 19.901 11.800 C 19.901 10.804 19.631 9.850 19.146 8.993 ZM 6.193 21.942 C 6.010 22.057 5.795 22.109 5.580 22.091 C 5.029 22.045 4.620 21.562 4.666 21.011 L 4.855 18.752 C 4.902 18.180 4.702 17.615 4.304 17.201 C 4.182 17.073 4.081 16.963 4.002 16.868 C 2.806 15.447 2.101 13.695 2.101 11.800 C 2.101 7.050 6.533 3.200 12.001 3.200 C 17.468 3.200 21.901 7.050 21.901 11.800 C 21.901 16.550 17.468 20.400 12.001 20.400 C 11.491 20.400 10.991 20.367 10.502 20.302 C 10.349 20.282 10.159 20.254 9.933 20.218 C 9.464 20.144 8.985 20.240 8.580 20.486 L 6.193 21.942 Z"),
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
        return _wechatPayLine!!
    }

private var _wechatPayLine: ImageVector? = null
