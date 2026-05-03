package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.MichelinStar: ImageVector
    get() {
        if (_michelinStar != null) return _michelinStar!!
        _michelinStar = tablerFilledIcon(
            name = "MichelinStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.810 2.000 C 13.828 2.000 15.288 3.232 15.684 5.129 L 15.700 5.218 L 15.872 5.161 C 16.212 5.057 16.556 5.001 16.927 4.986 L 17.154 4.981 C 19.244 4.981 21.079 6.911 21.079 9.075 C 21.079 10.170 20.569 11.162 19.715 11.910 L 19.597 12.008 L 19.657 12.056 C 20.537 12.793 21.017 13.661 21.073 14.712 L 21.079 14.925 C 21.079 17.165 19.340 19.019 17.154 19.019 C 16.709 19.019 16.231 18.935 15.780 18.786 L 15.737 18.979 C 15.342 20.715 13.931 21.912 12.075 21.995 L 11.867 22.000 C 9.849 22.000 8.390 20.768 7.994 18.870 L 7.964 18.709 L 7.953 18.715 C 7.548 18.862 7.123 18.944 6.693 18.958 L 6.467 18.963 C 4.377 18.963 2.542 17.033 2.542 14.869 C 2.542 13.773 3.052 12.782 3.920 12.029 L 3.993 11.967 L 3.963 11.944 C 3.083 11.207 2.604 10.339 2.548 9.288 L 2.542 9.075 C 2.542 6.836 4.282 4.981 6.467 4.981 C 6.907 4.981 7.387 5.079 7.858 5.251 L 7.894 5.264 L 7.902 5.216 C 8.233 3.376 9.678 2.091 11.602 2.005 Z"),
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
        return _michelinStar!!
    }

private var _michelinStar: ImageVector? = null
