package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.QrCodeFill: ImageVector
    get() {
        if (_qrCodeFill != null) return _qrCodeFill!!
        _qrCodeFill = remixIcon(
            name = "QrCodeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 17v-1h-3v-3h3v2h2v2h-1v2h-2v2h-2v-3h2v-1h1ZM21 21h-4v-2h2v-2h2v4ZM3 3h8v8h-8v-8ZM13 3h8v8h-8v-8ZM3 13h8v8h-8v-8ZM18 13h3v2h-3v-2ZM6 6v2h2v-2h-2ZM6 16v2h2v-2h-2ZM16 6v2h2v-2h-2Z"),
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
        return _qrCodeFill!!
    }

private var _qrCodeFill: ImageVector? = null
