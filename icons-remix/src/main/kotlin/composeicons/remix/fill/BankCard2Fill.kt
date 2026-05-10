package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BankCard2Fill: ImageVector
    get() {
        if (_bankCard2Fill != null) return _bankCard2Fill!!
        _bankCard2Fill = remixIcon(
            name = "BankCard2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22.005 11v9c0 .552-.448 1-1 1h-18c-.552 0-1-.448-1-1v-9h20ZM22.005 7h-20v-3c0-.552 .448-1 1-1h18c.552 0 1 .448 1 1v3Z"),
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
        return _bankCard2Fill!!
    }

private var _bankCard2Fill: ImageVector? = null
