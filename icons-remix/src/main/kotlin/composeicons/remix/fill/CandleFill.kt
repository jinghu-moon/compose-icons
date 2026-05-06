package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CandleFill: ImageVector
    get() {
        if (_candleFill != null) return _candleFill!!
        _candleFill = remixIcon(
            name = "CandleFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.172 9.331C7.609 7.769 7.609 5.237 9.172 3.675L12 .846l2.828 2.828c1.562 1.562 1.562 4.095 0 5.657-.524 .525-1.158 .873-1.828 1.045v1.623h5c.552 0 1 .448 1 1v7h2v2h-18v-2h2v-7c0-.552 .448-1 1-1h5v-1.623C10.33 10.204 9.696 9.856 9.172 9.331ZM10.586 5.089c-.781 .781-.781 2.047 0 2.828 .781 .781 2.047 .781 2.828 0 .781-.781 .781-2.047 0-2.828L12 3.675 10.586 5.089Z"),
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
        return _candleFill!!
    }

private var _candleFill: ImageVector? = null
