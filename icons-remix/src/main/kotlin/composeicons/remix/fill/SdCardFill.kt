package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SdCardFill: ImageVector
    get() {
        if (_sdCardFill != null) return _sdCardFill!!
        _sdCardFill = remixIcon(
            name = "SdCardFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.293 6.707 9 2h10c.552 0 1 .448 1 1v18c0 .552-.448 1-1 1h-14C4.448 22 4 21.552 4 21v-13.586c0-.265 .105-.52 .293-.707ZM15 5v4h2v-4h-2ZM12 5v4h2v-4h-2ZM9 5v4h2v-4h-2Z"),
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
        return _sdCardFill!!
    }

private var _sdCardFill: ImageVector? = null
