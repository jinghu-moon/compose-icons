package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PieChart2Line: ImageVector
    get() {
        if (_pieChart2Line != null) return _pieChart2Line!!
        _pieChart2Line = remixIcon(
            name = "PieChart2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 .5C18.351 .5 23.5 5.649 23.5 12c0 .337-.014 .67-.043 1h-1.507c-.502 5.053-4.765 9-9.951 9C6.477 22 2 17.523 2 12 2 6.815 5.947 2.551 11 2.049v-1.507c.33-.028 .663-.043 1-.043ZM11 4.062C7.054 4.554 4 7.92 4 12c0 4.418 3.582 8 8 8 4.08 0 7.446-3.054 7.938-7h-8.938v-8.938ZM13 2.552v8.448h8.448C20.983 6.552 17.448 3.017 13 2.552Z"),
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
        return _pieChart2Line!!
    }

private var _pieChart2Line: ImageVector? = null
