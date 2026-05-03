package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BrainAi3Line: ImageVector
    get() {
        if (_brainAi3Line != null) return _brainAi3Line!!
        _brainAi3Line = remixIcon(
            name = "BrainAi3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.500 4.783 L 19.500 7.671 L 22.000 9.114 L 22.000 14.887 L 19.499 16.331 L 19.500 19.218 L 14.500 22.104 L 12.000 20.661 L 9.500 22.104 L 4.500 19.218 L 4.500 16.331 L 2.000 14.888 L 2.001 9.113 L 4.500 7.670 L 4.500 4.784 L 9.500 1.897 L 11.999 3.341 L 14.501 1.896 L 19.500 4.783 ZM 13.000 5.072 L 13.000 7.000 L 11.000 7.000 L 11.000 5.073 L 9.500 4.207 L 6.499 5.938 L 6.499 8.825 L 4.000 10.268 L 4.000 13.733 L 6.500 15.177 L 6.500 18.063 L 9.500 19.796 L 11.000 18.929 L 11.000 17.000 L 13.000 17.000 L 13.000 18.930 L 14.500 19.796 L 17.500 18.062 L 17.500 15.177 L 20.000 13.732 L 20.000 10.269 L 17.499 8.825 L 17.500 5.938 L 14.501 4.206 L 13.000 5.072 ZM 14.265 13.160 C 14.353 12.947 14.647 12.947 14.735 13.160 L 14.862 13.465 C 15.078 13.986 15.481 14.403 15.987 14.628 L 16.346 14.787 C 16.551 14.878 16.551 15.177 16.346 15.269 L 15.966 15.438 C 15.472 15.657 15.076 16.059 14.856 16.562 L 14.733 16.845 C 14.643 17.052 14.357 17.052 14.267 16.845 L 14.144 16.562 C 13.924 16.059 13.528 15.657 13.034 15.438 L 12.654 15.269 C 12.449 15.177 12.449 14.878 12.654 14.787 L 13.013 14.628 C 13.519 14.403 13.922 13.986 14.138 13.465 L 14.265 13.160 ZM 9.588 7.779 C 9.742 7.407 10.258 7.407 10.412 7.779 L 10.634 8.314 C 11.012 9.227 11.716 9.956 12.602 10.351 L 13.231 10.629 C 13.590 10.789 13.590 11.312 13.231 11.472 L 12.565 11.768 C 11.701 12.152 11.009 12.855 10.624 13.737 L 10.408 14.232 C 10.250 14.595 9.750 14.595 9.592 14.232 L 9.376 13.737 C 8.991 12.855 8.299 12.152 7.435 11.768 L 6.770 11.472 C 6.410 11.312 6.410 10.789 6.770 10.629 L 7.397 10.351 C 8.284 9.956 8.988 9.227 9.366 8.314 L 9.588 7.779 Z"),
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
        return _brainAi3Line!!
    }

private var _brainAi3Line: ImageVector? = null
