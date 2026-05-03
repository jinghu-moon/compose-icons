package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.NetflixFill: ImageVector
    get() {
        if (_netflixFill != null) return _netflixFill!!
        _netflixFill = remixIcon(
            name = "NetflixFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.292 3.814 L 13.310 9.521 L 13.706 10.637 L 13.713 5.826 L 13.722 1.009 L 17.993 1.009 L 18.000 11.871 C 18.003 17.852 17.997 22.762 17.985 22.771 C 17.973 22.780 17.776 22.771 17.549 22.743 C 16.560 22.626 15.260 22.508 14.210 22.462 C 13.863 22.446 13.576 22.428 13.573 22.424 C 13.570 22.420 13.300 21.662 12.797 20.240 L 12.797 20.236 C 12.305 18.848 11.585 16.812 10.653 14.175 L 10.313 13.221 L 10.305 17.807 C 10.299 22.172 10.295 22.417 10.248 22.417 C 10.085 22.417 8.678 22.508 8.208 22.553 C 7.900 22.580 7.282 22.644 6.838 22.698 C 6.392 22.749 6.022 22.784 6.015 22.776 C 6.007 22.769 6.001 17.867 6.001 11.883 L 6.001 1.002 L 6.006 1.002 L 6.006 1.000 L 10.294 1.000 L 10.322 1.081 C 10.329 1.096 10.387 1.256 10.479 1.517 L 11.120 3.295 L 11.293 3.791 L 11.292 3.814 Z"),
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
        return _netflixFill!!
    }

private var _netflixFill: ImageVector? = null
