package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SofaFill: ImageVector
    get() {
        if (_sofaFill != null) return _sofaFill!!
        _sofaFill = remixIcon(
            name = "SofaFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.000 3.000 L 9.000 3.000 C 6.020 3.000 3.548 5.172 3.080 8.019 C 3.218 8.007 3.358 8.000 3.500 8.000 C 5.985 8.000 8.000 10.015 8.000 12.500 L 8.000 14.000 L 16.000 14.000 L 16.000 12.500 C 16.000 10.015 18.015 8.000 20.500 8.000 C 20.642 8.000 20.782 8.007 20.920 8.019 C 20.452 5.172 17.980 3.000 15.000 3.000 ZM 21.000 10.050 C 20.838 10.017 20.671 10.000 20.500 10.000 C 19.119 10.000 18.000 11.119 18.000 12.500 L 18.000 17.000 L 16.000 17.000 L 16.000 16.000 L 8.000 16.000 L 8.000 17.000 L 6.000 17.000 L 6.000 12.500 C 6.000 11.119 4.881 10.000 3.500 10.000 C 3.329 10.000 3.162 10.017 3.000 10.050 C 1.859 10.282 1.000 11.290 1.000 12.500 C 1.000 13.089 1.182 13.539 1.390 14.055 C 1.671 14.750 2.000 15.566 2.000 17.000 L 2.000 20.000 C 2.000 20.552 2.447 21.000 3.000 21.000 L 12.000 21.000 L 21.000 21.000 C 21.552 21.000 22.000 20.552 22.000 20.000 L 22.000 17.000 C 22.000 15.566 22.329 14.750 22.610 14.055 C 22.818 13.539 23.000 13.089 23.000 12.500 C 23.000 11.290 22.141 10.282 21.000 10.050 Z"),
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
        return _sofaFill!!
    }

private var _sofaFill: ImageVector? = null
