package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.GiftCard: ImageVector
    get() {
        if (_giftCard != null) return _giftCard!!
        _giftCard = tablerFilledIcon(
            name = "GiftCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.000 4.000 C 20.131 4.000 21.888 5.671 21.995 7.800 L 22.000 8.000 L 22.000 16.000 C 22.000 18.131 20.329 19.888 18.200 19.995 L 18.000 20.000 L 6.000 20.000 C 3.869 20.000 2.112 18.329 2.005 16.200 L 2.000 16.000 L 2.000 8.000 C 2.000 5.869 3.671 4.112 5.800 4.005 L 6.000 4.000 L 18.000 4.000 ZM 12.507 9.000 L 12.317 9.004 C 11.389 9.056 10.598 9.587 10.000 10.448 C 9.440 9.643 8.712 9.126 7.861 9.020 L 7.663 9.003 L 7.499 9.000 L 7.339 9.005 C 6.059 9.091 5.000 10.184 5.000 11.500 C 5.000 12.726 6.222 13.711 7.453 13.947 L 7.613 13.973 L 6.293 15.293 L 6.210 15.387 C 5.930 15.748 5.930 16.252 6.210 16.613 L 6.293 16.707 L 6.387 16.790 C 6.748 17.070 7.252 17.070 7.613 16.790 L 7.707 16.707 L 10.000 14.415 L 12.293 16.707 L 12.387 16.790 C 12.785 17.099 13.351 17.063 13.707 16.707 C 14.063 16.351 14.099 15.785 13.790 15.387 L 13.707 15.293 L 12.387 13.973 C 13.616 13.804 14.889 12.863 14.993 11.658 L 15.000 11.500 L 14.995 11.337 C 14.915 10.148 13.975 9.175 12.820 9.021 L 12.661 9.005 L 12.507 9.000 ZM 12.482 11.000 L 12.584 11.009 C 12.778 11.049 12.951 11.219 12.991 11.415 L 13.000 11.500 L 12.988 11.531 L 12.954 11.571 C 12.824 11.706 12.441 11.940 12.118 11.991 L 12.000 12.000 L 11.398 12.000 L 11.450 11.900 L 11.538 11.744 C 11.808 11.300 12.112 11.048 12.390 11.006 L 12.482 11.000 ZM 7.518 11.000 L 7.602 11.005 L 7.696 11.025 C 7.950 11.102 8.219 11.345 8.461 11.743 L 8.551 11.900 L 8.601 12.000 L 8.000 12.000 L 7.894 11.992 C 7.496 11.935 7.000 11.592 7.000 11.500 C 7.000 11.270 7.194 11.054 7.416 11.009 L 7.518 10.999 Z"),
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
        return _giftCard!!
    }

private var _giftCard: ImageVector? = null
