package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DonutChartFill: ImageVector
    get() {
        if (_donutChartFill != null) return _donutChartFill!!
        _donutChartFill = remixIcon(
            name = "DonutChartFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.000 2.049 L 11.000 5.071 C 7.608 5.556 5.000 8.474 5.000 12.000 C 5.000 15.866 8.134 19.000 12.000 19.000 C 13.572 19.000 15.024 18.482 16.192 17.606 L 18.329 19.743 C 16.605 21.154 14.401 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.815 5.947 2.551 11.000 2.049 ZM 21.951 13.000 C 21.751 15.011 20.955 16.847 19.743 18.328 L 17.606 16.192 C 18.293 15.276 18.760 14.186 18.929 13.000 L 21.951 13.000 ZM 13.001 2.049 C 17.725 2.519 21.482 6.276 21.951 11.000 L 18.929 11.000 C 18.490 7.935 16.066 5.510 13.001 5.071 L 13.001 2.049 Z"),
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
        return _donutChartFill!!
    }

private var _donutChartFill: ImageVector? = null
