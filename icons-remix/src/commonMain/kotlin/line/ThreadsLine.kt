package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ThreadsLine: ImageVector
    get() {
        if (_threadsLine != null) return _threadsLine!!
        _threadsLine = remixIcon(
            name = "ThreadsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.184 1.410 L 12.182 1.410 C 9.090 1.432 6.700 2.473 5.094 4.516 C 3.666 6.331 2.935 8.864 2.910 12.007 L 2.910 12.008 C 2.935 15.151 3.666 17.670 5.094 19.485 C 6.700 21.527 9.103 22.569 12.195 22.590 L 12.196 22.590 C 14.944 22.571 16.893 21.850 18.499 20.246 C 20.603 18.143 20.541 15.505 19.846 13.883 C 19.316 12.649 18.271 11.662 16.870 11.048 C 16.689 8.063 15.010 6.322 12.250 6.304 C 10.619 6.294 9.148 7.024 8.247 8.391 L 9.902 9.527 C 10.435 8.718 11.279 8.328 12.237 8.337 C 13.624 8.346 14.536 9.111 14.792 10.454 C 14.020 10.333 13.190 10.298 12.308 10.349 C 9.668 10.501 7.940 12.061 8.055 14.224 C 8.176 16.486 10.367 17.719 12.448 17.605 C 14.940 17.468 16.421 15.629 16.772 13.284 C 17.349 13.658 17.775 14.134 18.016 14.697 C 18.456 15.722 18.484 17.413 17.101 18.795 C 15.884 20.011 14.421 20.541 12.189 20.557 C 9.714 20.539 7.857 19.746 6.652 18.214 C 5.520 16.775 4.928 14.688 4.906 12.000 C 4.928 9.312 5.520 7.225 6.652 5.787 C 7.857 4.254 9.714 3.462 12.189 3.443 C 14.682 3.462 16.573 4.258 17.825 5.799 C 18.516 6.649 18.949 7.665 19.238 8.714 L 21.178 8.197 C 20.815 6.859 20.241 5.584 19.363 4.503 C 17.710 2.469 15.282 1.432 12.184 1.410 ZM 12.420 12.378 C 13.304 12.327 14.124 12.383 14.852 12.535 C 14.711 14.112 14.059 15.481 12.340 15.575 C 11.228 15.638 10.103 15.141 10.048 14.114 C 10.008 13.350 10.573 12.485 12.420 12.378 Z"),
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
        return _threadsLine!!
    }

private var _threadsLine: ImageVector? = null
