package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Wechat2Line: ImageVector
    get() {
        if (_wechat2Line != null) return _wechat2Line!!
        _wechat2Line = remixIcon(
            name = "Wechat2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.667 11.511 C 7.950 11.511 7.382 10.943 7.382 10.226 C 7.382 9.508 7.950 8.940 8.667 8.940 C 9.385 8.940 9.952 9.508 9.952 10.226 C 9.952 10.943 9.385 11.511 8.667 11.511 ZM 15.334 11.511 C 14.617 11.511 14.049 10.943 14.049 10.226 C 14.049 9.508 14.617 8.940 15.334 8.940 C 16.051 8.940 16.619 9.508 16.619 10.226 C 16.619 10.943 16.051 11.511 15.334 11.511 ZM 6.823 19.215 L 7.538 18.779 C 8.348 18.285 9.307 18.095 10.244 18.243 C 10.455 18.276 10.629 18.302 10.763 18.319 C 11.170 18.373 11.583 18.400 12.001 18.400 C 16.421 18.400 19.901 15.378 19.901 11.800 C 19.901 8.222 16.421 5.200 12.001 5.200 C 7.580 5.200 4.101 8.222 4.101 11.800 C 4.101 13.165 4.600 14.473 5.532 15.581 C 5.581 15.638 5.653 15.718 5.747 15.816 C 6.542 16.644 6.943 17.774 6.848 18.918 L 6.823 19.215 ZM 6.193 21.942 C 6.010 22.057 5.795 22.109 5.580 22.091 C 5.029 22.045 4.620 21.562 4.666 21.011 L 4.855 18.752 C 4.902 18.180 4.702 17.615 4.304 17.201 C 4.182 17.073 4.081 16.963 4.002 16.868 C 2.806 15.447 2.101 13.695 2.101 11.800 C 2.101 7.050 6.533 3.200 12.001 3.200 C 17.468 3.200 21.901 7.050 21.901 11.800 C 21.901 16.550 17.468 20.400 12.001 20.400 C 11.491 20.400 10.991 20.367 10.502 20.302 C 10.349 20.282 10.159 20.254 9.933 20.218 C 9.464 20.144 8.985 20.240 8.580 20.486 L 6.193 21.942 Z"),
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
        return _wechat2Line!!
    }

private var _wechat2Line: ImageVector? = null
