package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BankCardFill: ImageVector
    get() {
        if (_bankCardFill != null) return _bankCardFill!!
        _bankCardFill = remixIcon(
            name = "BankCardFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22.005 10v10c0 .552-.448 1-1 1h-18c-.552 0-1-.448-1-1v-10h20ZM22.005 8h-20v-4c0-.552 .448-1 1-1h18c.552 0 1 .448 1 1v4ZM15.005 16v2h4v-2h-4Z"),
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
        return _bankCardFill!!
    }

private var _bankCardFill: ImageVector? = null
