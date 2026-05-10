package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FingerprintFill: ImageVector
    get() {
        if (_fingerprintFill != null) return _fingerprintFill!!
        _fingerprintFill = remixIcon(
            name = "FingerprintFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 13v1c0 2.77-.664 5.445-1.915 7.846l-.227 .421-1.747-.974c1.16-2.081 1.809-4.411 1.882-6.837L15 14v-1h2ZM11 10h2v4l-.006 .379c-.079 2.771-1.03 5.394-2.691 7.549l-.231 .291L8.524 20.954c1.517-1.857 2.39-4.152 2.47-6.587L11 14v-4ZM12 6c2.761 0 5 2.239 5 5h-2c0-1.657-1.343-3-3-3C10.343 8 9 9.343 9 11v3c0 2.235-.82 4.344-2.271 5.977l-.212 .23L5.07 18.827C6.233 17.606 6.921 16.012 6.994 14.303L7 14v-3c0-2.761 2.239-5 5-5ZM12 2c4.97 0 9 4.029 9 9v3c0 1.698-.202 3.37-.597 4.99l-.139 .538-1.93-.525c.391-1.437 .613-2.922 .657-4.435L19 14v-3c0-3.866-3.134-7-7-7C10.428 4 8.977 4.518 7.808 5.394L6.383 3.968C7.923 2.736 9.875 2 12 2ZM4.968 5.383 6.394 6.808C5.563 7.917 5.054 9.28 5.004 10.759l-.005 .24L5.004 13c0 1.12-.264 2.203-.761 3.177l-.156 .289L2.35 15.475c.379-.664 .601-1.407 .646-2.182L3.004 13 3.004 11C3 8.875 3.737 6.922 4.968 5.383Z"),
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
        return _fingerprintFill!!
    }

private var _fingerprintFill: ImageVector? = null
