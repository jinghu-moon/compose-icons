package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GitbookFill: ImageVector
    get() {
        if (_gitbookFill != null) return _gitbookFill!!
        _gitbookFill = remixIcon(
            name = "GitbookFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.420 12.535 C 11.399 13.127 11.889 13.423 12.427 13.423 C 12.965 13.423 13.455 13.129 14.435 12.539 L 20.671 8.786 C 20.953 8.617 21.127 8.302 21.127 7.962 C 21.127 7.622 20.953 7.308 20.671 7.138 L 14.433 3.384 C 13.454 2.794 12.964 2.500 12.427 2.500 C 11.890 2.500 11.400 2.795 10.422 3.386 L 5.061 6.616 C 5.018 6.643 4.996 6.656 4.976 6.669 C 3.147 7.792 2.017 9.837 2.000 12.054 L 2.000 12.261 C 2.016 14.476 3.144 16.519 4.970 17.643 L 5.056 17.695 L 8.408 19.722 C 10.369 20.906 11.350 21.499 12.427 21.500 C 13.504 21.500 14.486 20.909 16.448 19.724 L 19.990 17.586 C 20.971 16.994 21.461 16.698 21.731 16.210 C 22.000 15.723 22.000 15.131 22.000 13.947 L 22.000 11.653 C 21.999 11.330 21.835 11.031 21.567 10.870 C 21.300 10.708 20.970 10.707 20.702 10.868 L 13.429 15.245 C 12.940 15.539 12.695 15.686 12.427 15.686 C 12.158 15.686 11.914 15.540 11.425 15.246 L 6.504 12.288 C 6.256 12.140 6.133 12.065 6.034 12.052 C 5.807 12.022 5.590 12.154 5.504 12.374 C 5.467 12.471 5.467 12.620 5.469 12.919 C 5.470 13.138 5.470 13.247 5.490 13.349 C 5.534 13.574 5.647 13.778 5.813 13.929 C 5.887 13.997 5.978 14.052 6.159 14.161 L 11.422 17.341 C 11.912 17.638 12.158 17.786 12.427 17.786 C 12.697 17.786 12.941 17.638 13.432 17.342 L 19.883 13.449 C 20.050 13.348 20.134 13.298 20.197 13.335 C 20.260 13.373 20.260 13.475 20.260 13.677 L 20.260 14.716 C 20.260 15.012 20.260 15.160 20.192 15.282 C 20.125 15.404 20.003 15.478 19.757 15.626 L 14.438 18.837 C 13.456 19.429 12.966 19.725 12.427 19.724 C 11.889 19.724 11.398 19.427 10.417 18.834 L 5.442 15.826 L 5.407 15.805 C 4.365 15.166 3.722 14.000 3.715 12.737 L 3.715 11.739 C 3.715 11.042 4.070 10.397 4.647 10.046 C 5.158 9.736 5.789 9.736 6.300 10.045 L 10.421 12.534 L 10.420 12.535 Z"),
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
        return _gitbookFill!!
    }

private var _gitbookFill: ImageVector? = null
