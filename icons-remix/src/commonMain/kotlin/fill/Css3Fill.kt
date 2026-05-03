package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Css3Fill: ImageVector
    get() {
        if (_css3Fill != null) return _css3Fill!!
        _css3Fill = remixIcon(
            name = "Css3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.000 3.000 L 4.350 6.340 L 17.940 6.340 L 17.500 8.500 L 3.920 8.500 L 3.260 11.830 L 16.850 11.830 L 16.090 15.640 L 10.610 17.450 L 5.860 15.640 L 6.190 14.000 L 2.850 14.000 L 2.060 18.000 L 9.910 21.000 L 18.960 18.000 L 20.160 11.970 L 20.400 10.760 L 21.940 3.000 L 5.000 3.000 Z"),
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
        return _css3Fill!!
    }

private var _css3Fill: ImageVector? = null
