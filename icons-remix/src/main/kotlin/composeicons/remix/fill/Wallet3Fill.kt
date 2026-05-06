package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Wallet3Fill: ImageVector
    get() {
        if (_wallet3Fill != null) return _wallet3Fill!!
        _wallet3Fill = remixIcon(
            name = "Wallet3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22.005 6h-7c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h7v2c0 .552-.448 1-1 1h-18c-.552 0-1-.448-1-1v-16c0-.552 .448-1 1-1h18c.552 0 1 .448 1 1v2ZM15.005 8h8v8h-8c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4ZM15.005 11v2h3v-2h-3Z"),
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
        return _wallet3Fill!!
    }

private var _wallet3Fill: ImageVector? = null
