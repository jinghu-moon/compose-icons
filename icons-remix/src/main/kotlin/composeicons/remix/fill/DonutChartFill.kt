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
                pathData = parseSvgPathData("M11 2.049 11 5.071C7.608 5.556 5 8.474 5 12c0 3.866 3.134 7 7 7 1.572 0 3.024-.518 4.192-1.394l2.137 2.136C16.605 21.154 14.401 22 12 22 6.477 22 2 17.523 2 12 2 6.815 5.947 2.551 11 2.049ZM21.951 13c-.2 2.011-.995 3.847-2.207 5.328L17.606 16.192c.686-.916 1.153-2.006 1.323-3.192l3.021 0ZM13.001 2.049c4.724 .47 8.48 4.226 8.95 8.95l-3.021-0C18.49 7.935 16.066 5.51 13.001 5.071l0-3.022Z"),
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
