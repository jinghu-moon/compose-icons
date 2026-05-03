package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PlanetLine: ImageVector
    get() {
        if (_planetLine != null) return _planetLine!!
        _planetLine = remixIcon(
            name = "PlanetLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.918 8.037 C 3.330 9.233 3.000 10.579 3.000 12.000 C 3.000 16.971 7.029 21.000 12.000 21.000 C 13.422 21.000 14.768 20.670 15.966 20.081 C 16.838 20.455 17.685 20.699 18.456 20.762 C 19.358 20.836 20.300 20.667 20.982 19.985 C 21.734 19.233 21.862 18.169 21.728 17.173 C 21.605 16.264 21.248 15.254 20.726 14.212 C 20.905 13.503 21.000 12.762 21.000 12.000 C 21.000 7.029 16.971 3.000 12.000 3.000 C 11.239 3.000 10.499 3.095 9.791 3.273 C 8.747 2.750 7.736 2.392 6.826 2.268 C 5.829 2.133 4.764 2.261 4.011 3.014 C 3.329 3.697 3.160 4.640 3.234 5.542 C 3.298 6.315 3.543 7.163 3.918 8.037 ZM 5.322 5.966 C 5.273 5.753 5.242 5.557 5.227 5.379 C 5.179 4.793 5.317 4.537 5.425 4.428 C 5.545 4.309 5.848 4.154 6.557 4.250 C 6.755 4.277 6.970 4.322 7.200 4.386 C 6.504 4.825 5.872 5.358 5.322 5.966 ZM 19.612 16.803 C 19.675 17.032 19.719 17.245 19.746 17.441 C 19.842 18.149 19.687 18.452 19.568 18.571 C 19.459 18.679 19.204 18.816 18.619 18.769 C 18.442 18.754 18.247 18.723 18.037 18.675 C 18.643 18.127 19.174 17.497 19.612 16.803 ZM 15.881 17.826 C 14.205 16.948 12.257 15.503 10.375 13.621 C 8.495 11.741 7.051 9.796 6.172 8.120 C 7.064 6.785 8.401 5.773 9.969 5.299 C 10.611 5.105 11.292 5.000 12.000 5.000 C 15.866 5.000 19.000 8.134 19.000 12.000 C 19.000 12.708 18.895 13.391 18.701 14.033 C 18.226 15.599 17.215 16.936 15.881 17.826 ZM 13.605 18.815 C 13.090 18.936 12.553 19.000 12.000 19.000 C 8.134 19.000 5.000 15.866 5.000 12.000 C 5.000 11.448 5.064 10.911 5.184 10.396 C 6.149 11.913 7.435 13.509 8.961 15.035 C 10.489 16.563 12.087 17.850 13.605 18.815 Z"),
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
        return _planetLine!!
    }

private var _planetLine: ImageVector? = null
