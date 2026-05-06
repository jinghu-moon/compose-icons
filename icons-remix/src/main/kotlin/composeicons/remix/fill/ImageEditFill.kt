package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ImageEditFill: ImageVector
    get() {
        if (_imageEditFill != null) return _imageEditFill!!
        _imageEditFill = remixIcon(
            name = "ImageEditFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 3c.552 0 1 .448 1 1v1.757l-2 2v-2.757h-14v8.1L9 9.101l4.328 4.328-1.327 1.327-.006 4.239 4.246 .006 1.33-1.33L18.899 19h.101v-2.758l2-2v5.758c0 .552-.448 1-1 1h-16C3.448 21 3 20.552 3 20v-16C3 3.448 3.448 3 4 3h16ZM21.778 7.808l1.414 1.414L15.414 17l-1.416-.002L14 15.586 21.778 7.808ZM15.5 7C16.328 7 17 7.672 17 8.5 17 9.328 16.328 10 15.5 10 14.672 10 14 9.328 14 8.5 14 7.672 14.672 7 15.5 7Z"),
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
        return _imageEditFill!!
    }

private var _imageEditFill: ImageVector? = null
