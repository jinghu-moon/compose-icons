package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PieChart2Fill: ImageVector
    get() {
        if (_pieChart2Fill != null) return _pieChart2Fill!!
        _pieChart2Fill = remixIcon(
            name = "PieChart2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 2.049v10.951h10.951c-.502 5.053-4.765 9-9.951 9C6.477 22 2 17.523 2 12 2 6.815 5.947 2.551 11 2.049ZM13 .543C18.553 1.021 22.979 5.446 23.457 11h-10.457v-10.457Z"),
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
        return _pieChart2Fill!!
    }

private var _pieChart2Fill: ImageVector? = null
