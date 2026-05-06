package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SdCardLine: ImageVector
    get() {
        if (_sdCardLine != null) return _sdCardLine!!
        _sdCardLine = remixIcon(
            name = "SdCardLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6 7.828v12.172h12v-16h-8.172L6 7.828ZM4.293 6.707 9 2h10c.552 0 1 .448 1 1v18c0 .552-.448 1-1 1h-14C4.448 22 4 21.552 4 21v-13.586c0-.265 .105-.52 .293-.707ZM15 5h2v4h-2v-4ZM12 5h2v4h-2v-4ZM9 6h2v3h-2v-3Z"),
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
        return _sdCardLine!!
    }

private var _sdCardLine: ImageVector? = null
