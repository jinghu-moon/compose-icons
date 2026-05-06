package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SmartphoneFill: ImageVector
    get() {
        if (_smartphoneFill != null) return _smartphoneFill!!
        _smartphoneFill = remixIcon(
            name = "SmartphoneFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6 2h12c.552 0 1 .448 1 1v18c0 .552-.448 1-1 1h-12C5.448 22 5 21.552 5 21v-18C5 2.448 5.448 2 6 2ZM12 17c-.552 0-1 .448-1 1 0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1Z"),
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
        return _smartphoneFill!!
    }

private var _smartphoneFill: ImageVector? = null
