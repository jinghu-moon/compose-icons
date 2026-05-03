package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BrainAi3Fill: ImageVector
    get() {
        if (_brainAi3Fill != null) return _brainAi3Fill!!
        _brainAi3Fill = remixIcon(
            name = "BrainAi3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.500 4.783 L 19.500 7.671 L 22.000 9.114 L 22.000 14.887 L 19.499 16.331 L 19.500 19.218 L 14.500 22.104 L 12.000 20.661 L 9.500 22.104 L 4.500 19.218 L 4.500 16.331 L 2.000 14.888 L 2.001 9.113 L 4.500 7.670 L 4.500 4.784 L 9.500 1.897 L 11.999 3.341 L 14.501 1.896 L 19.500 4.783 ZM 14.735 13.160 C 14.647 12.947 14.353 12.947 14.265 13.160 L 14.138 13.465 C 13.922 13.986 13.519 14.403 13.013 14.628 L 12.654 14.787 C 12.449 14.878 12.449 15.177 12.654 15.269 L 13.034 15.438 C 13.528 15.657 13.924 16.059 14.144 16.562 L 14.267 16.845 C 14.357 17.052 14.643 17.052 14.733 16.845 L 14.856 16.562 C 15.076 16.059 15.472 15.657 15.966 15.438 L 16.346 15.269 C 16.551 15.177 16.551 14.878 16.346 14.787 L 15.987 14.628 C 15.481 14.403 15.077 13.986 14.861 13.465 L 14.735 13.160 ZM 10.412 7.779 C 10.258 7.407 9.742 7.407 9.588 7.779 L 9.366 8.314 C 8.988 9.227 8.284 9.956 7.397 10.351 L 6.770 10.630 C 6.410 10.790 6.410 11.313 6.770 11.473 L 7.435 11.768 C 8.299 12.152 8.991 12.855 9.376 13.737 L 9.592 14.232 C 9.750 14.595 10.250 14.595 10.408 14.232 L 10.624 13.737 C 11.009 12.855 11.701 12.152 12.565 11.768 L 13.231 11.473 C 13.590 11.313 13.590 10.790 13.231 10.630 L 12.602 10.351 C 11.716 9.956 11.011 9.227 10.633 8.314 L 10.412 7.779 Z"),
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
        return _brainAi3Fill!!
    }

private var _brainAi3Fill: ImageVector? = null
