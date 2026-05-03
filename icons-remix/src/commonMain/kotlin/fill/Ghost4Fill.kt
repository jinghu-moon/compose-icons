package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Ghost4Fill: ImageVector
    get() {
        if (_ghost4Fill != null) return _ghost4Fill!!
        _ghost4Fill = remixIcon(
            name = "Ghost4Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.500 C 14.444 2.500 16.134 3.188 17.253 4.467 C 18.324 5.692 18.732 7.311 18.986 8.836 C 19.087 9.437 19.272 9.757 19.435 9.946 C 19.605 10.142 19.816 10.273 20.102 10.402 C 20.273 10.480 20.376 10.518 20.581 10.607 C 20.748 10.680 20.961 10.778 21.162 10.914 C 21.372 11.056 21.595 11.257 21.761 11.548 C 21.928 11.843 22.000 12.168 22.000 12.500 C 22.000 13.086 21.829 13.564 21.548 13.959 C 21.292 14.318 20.962 14.579 20.742 14.754 C 20.259 15.138 20.059 15.311 19.979 15.700 C 19.932 15.933 19.974 16.348 20.153 16.924 C 20.323 17.469 20.578 18.036 20.816 18.508 C 21.365 19.594 20.444 21.012 19.120 20.718 L 16.823 20.207 C 16.375 20.107 15.905 20.166 15.494 20.371 L 13.789 21.224 C 12.663 21.787 11.337 21.787 10.211 21.224 L 8.506 20.371 C 8.095 20.166 7.625 20.107 7.177 20.207 L 4.855 20.724 C 3.543 21.015 2.617 19.618 3.158 18.529 C 3.398 18.047 3.658 17.464 3.834 16.908 C 4.022 16.315 4.062 15.906 4.021 15.700 C 3.950 15.353 3.761 15.187 3.255 14.776 C 2.780 14.391 2.000 13.752 2.000 12.500 C 2.000 12.168 2.071 11.843 2.239 11.548 C 2.405 11.257 2.628 11.056 2.838 10.914 C 3.039 10.778 3.252 10.680 3.419 10.607 C 3.624 10.518 3.727 10.480 3.898 10.402 C 4.184 10.273 4.395 10.142 4.564 9.946 C 4.728 9.757 4.913 9.437 5.014 8.836 C 5.268 7.311 5.676 5.692 6.747 4.467 C 7.866 3.188 9.556 2.500 12.000 2.500 ZM 10.000 8.500 C 9.310 8.500 8.750 9.283 8.750 10.250 C 8.750 11.217 9.310 12.000 10.000 12.000 C 10.690 12.000 11.250 11.217 11.250 10.250 C 11.250 9.283 10.690 8.500 10.000 8.500 ZM 14.000 8.500 C 13.310 8.500 12.750 9.283 12.750 10.250 C 12.750 11.217 13.310 12.000 14.000 12.000 C 14.690 12.000 15.250 11.217 15.250 10.250 C 15.250 9.283 14.690 8.500 14.000 8.500 Z"),
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
        return _ghost4Fill!!
    }

private var _ghost4Fill: ImageVector? = null
