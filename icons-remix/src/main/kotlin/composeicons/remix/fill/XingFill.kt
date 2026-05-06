package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.XingFill: ImageVector
    get() {
        if (_xingFill != null) return _xingFill!!
        _xingFill = remixIcon(
            name = "XingFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.462 3.231c.154 0 .308 .077 .385 .154 .077 .154 .077 .308 0 .462L14.77 14.615l3.846 7.077c.077 .154 .077 .308 0 .461-.077 .077-.231 .154-.385 .154h-2.769c-.385 0-.615-.308-.769-.538L10.77 14.615c.231-.308 6.154-10.846 6.154-10.846 .154-.308 .385-.538 .769-.538h2.769ZM8.923 7c.385 0 .615 .308 .769 .538l1.923 3.308c-.154 .154-3 5.231-3 5.231-.154 .231-.385 .538-.769 .538h-2.692c-.154 0-.308-.077-.385-.154-.077-.154-.077-.308 0-.462L7.616 10.846 5.77 7.615c-.077-.154-.077-.308 0-.462 .077-.077 .231-.154 .385-.154h2.769Z"),
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
        return _xingFill!!
    }

private var _xingFill: ImageVector? = null
