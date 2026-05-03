package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.NodejsFill: ImageVector
    get() {
        if (_nodejsFill != null) return _nodejsFill!!
        _nodejsFill = remixIcon(
            name = "NodejsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.174 22.555 C 11.430 22.694 11.705 22.773 12.000 22.773 C 12.295 22.773 12.590 22.694 12.826 22.595 L 20.674 18.023 C 21.185 17.726 21.500 17.172 21.500 16.578 L 21.500 7.454 C 21.500 6.861 21.185 6.306 20.674 6.010 L 12.826 1.438 C 12.335 1.161 11.666 1.161 11.174 1.438 L 3.326 6.010 C 2.815 6.306 2.500 6.861 2.500 7.454 L 2.500 16.578 C 2.500 17.172 2.815 17.726 3.326 18.023 L 5.391 19.211 C 6.394 19.705 6.749 19.705 7.201 19.705 C 8.676 19.705 9.522 18.795 9.522 17.231 L 9.522 8.226 C 9.522 8.088 9.404 7.989 9.286 7.989 L 8.283 7.989 C 8.145 7.989 8.047 8.107 8.047 8.226 L 8.047 17.231 C 8.047 17.924 7.319 18.617 6.158 18.023 L 4.015 16.776 C 3.936 16.736 3.897 16.638 3.897 16.558 L 3.897 7.435 C 3.897 7.355 3.936 7.256 4.015 7.217 L 11.863 2.665 C 11.921 2.625 12.020 2.625 12.098 2.665 L 19.947 7.217 C 20.025 7.256 20.065 7.336 20.065 7.435 L 20.065 16.558 C 20.065 16.657 20.025 16.736 19.947 16.776 L 12.098 21.348 C 12.039 21.388 11.941 21.388 11.863 21.348 L 9.856 20.141 C 9.797 20.101 9.718 20.081 9.659 20.121 C 9.109 20.438 9.010 20.477 8.479 20.655 C 8.361 20.695 8.165 20.774 8.558 20.992 L 11.174 22.555 ZM 10.289 13.570 C 10.289 14.916 10.997 16.499 14.439 16.499 C 16.917 16.499 18.353 15.509 18.353 13.768 C 18.353 12.066 17.212 11.610 14.793 11.294 C 12.354 10.977 12.098 10.799 12.098 10.225 C 12.098 9.750 12.315 9.117 14.124 9.117 C 15.737 9.117 16.346 9.473 16.583 10.561 C 16.602 10.660 16.701 10.740 16.799 10.740 L 17.841 10.740 C 17.901 10.740 17.959 10.700 17.999 10.660 C 18.038 10.601 18.058 10.542 18.058 10.482 C 17.901 8.582 16.662 7.712 14.144 7.712 C 11.901 7.712 10.564 8.662 10.564 10.265 C 10.564 11.986 11.901 12.462 14.045 12.679 C 16.622 12.936 16.819 13.313 16.819 13.827 C 16.819 14.718 16.111 15.094 14.459 15.094 C 12.374 15.094 11.921 14.579 11.764 13.530 C 11.764 13.411 11.665 13.332 11.547 13.332 L 10.525 13.332 C 10.387 13.332 10.289 13.451 10.289 13.570 Z"),
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
        return _nodejsFill!!
    }

private var _nodejsFill: ImageVector? = null
