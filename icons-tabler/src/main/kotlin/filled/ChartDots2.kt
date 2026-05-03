package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChartDots2: ImageVector
    get() {
        if (_chartDots2 != null) return _chartDots2!!
        _chartDots2 = tablerFilledIcon(
            name = "ChartDots2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 2.000 C 3.552 2.000 4.000 2.448 4.000 3.000 L 4.000 20.000 L 21.000 20.000 C 21.507 20.000 21.934 20.380 21.993 20.883 L 22.000 21.000 C 22.000 21.552 21.552 22.000 21.000 22.000 L 3.000 22.000 C 2.448 22.000 2.000 21.552 2.000 21.000 L 2.000 3.000 C 2.000 2.448 2.448 2.000 3.000 2.000M 21.970 2.757 C 22.104 3.293 21.779 3.836 21.243 3.970 L 15.987 5.284 C 15.936 5.812 15.747 6.318 15.437 6.749 L 17.205 9.107 C 18.108 8.860 19.073 9.048 19.818 9.615 C 20.562 10.183 20.999 11.064 21.000 12.000 C 21.000 13.302 20.160 14.456 18.920 14.856 C 17.680 15.255 16.324 14.809 15.564 13.751 L 11.994 15.179 C 11.892 16.794 10.528 18.037 8.910 17.988 C 7.293 17.940 6.006 16.618 6.000 15.000 L 6.005 14.824 C 6.080 13.556 6.944 12.473 8.164 12.119 C 9.383 11.765 10.693 12.217 11.435 13.248 L 15.005 11.820 L 15.020 11.650 C 15.080 11.132 15.273 10.654 15.562 10.250 L 13.795 7.893 C 12.892 8.140 11.927 7.952 11.182 7.385 C 10.438 6.817 10.001 5.936 10.000 5.000 L 10.005 4.824 C 10.080 3.535 10.973 2.438 12.220 2.102 C 13.467 1.766 14.789 2.267 15.502 3.344 L 20.757 2.030 C 21.293 1.896 21.836 2.221 21.970 2.757"),
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
        return _chartDots2!!
    }

private var _chartDots2: ImageVector? = null
