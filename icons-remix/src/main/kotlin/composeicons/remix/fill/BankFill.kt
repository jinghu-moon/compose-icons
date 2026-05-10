package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BankFill: ImageVector
    get() {
        if (_bankFill != null) return _bankFill!!
        _bankFill = remixIcon(
            name = "BankFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2 20h20v2h-20v-2ZM4 12h2v7h-2v-7ZM9 12h2v7h-2v-7ZM13 12h2v7h-2v-7ZM18 12h2v7h-2v-7ZM2 7 12 2 22 7v4h-20v-4ZM12 8c.552 0 1-.448 1-1C13 6.448 12.552 6 12 6c-.552 0-1 .448-1 1 0 .552 .448 1 1 1Z"),
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
        return _bankFill!!
    }

private var _bankFill: ImageVector? = null
