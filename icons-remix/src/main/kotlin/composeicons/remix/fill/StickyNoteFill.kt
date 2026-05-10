package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.StickyNoteFill: ImageVector
    get() {
        if (_stickyNoteFill != null) return _stickyNoteFill!!
        _stickyNoteFill = remixIcon(
            name = "StickyNoteFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15 14l-.117 .007c-.459 .053-.823 .418-.877 .877L14 15v6h-10.002C3.447 21 3 20.555 3 20.007v-16.013C3 3.445 3.445 3 3.993 3h16.013c.549 0 .993 .447 .993 .999v10.001h-6ZM21 16l-5 4.997v-4.997h5Z"),
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
        return _stickyNoteFill!!
    }

private var _stickyNoteFill: ImageVector? = null
