package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TapeFill: ImageVector
    get() {
        if (_tapeFill != null) return _tapeFill!!
        _tapeFill = remixIcon(
            name = "TapeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.829 13c.111-.313 .171-.649 .171-1C11 10.343 9.657 9 8 9 6.343 9 5 10.343 5 12c0 1.657 1.343 3 3 3h8c1.657 0 3-1.343 3-3C19 10.343 17.657 9 16 9c-1.657 0-3 1.343-3 3 0 .351 .06 .687 .171 1h-2.341ZM3 3h18c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3ZM16 13c-.552 0-1-.448-1-1 0-.552 .448-1 1-1 .552 0 1 .448 1 1 0 .552-.448 1-1 1ZM8 13C7.448 13 7 12.552 7 12c0-.552 .448-1 1-1 .552 0 1 .448 1 1 0 .552-.448 1-1 1Z"),
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
        return _tapeFill!!
    }

private var _tapeFill: ImageVector? = null
