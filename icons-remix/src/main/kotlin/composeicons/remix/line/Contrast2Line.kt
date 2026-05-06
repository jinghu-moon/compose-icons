package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Contrast2Line: ImageVector
    get() {
        if (_contrast2Line != null) return _contrast2Line!!
        _contrast2Line = remixIcon(
            name = "Contrast2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 21.997c-5.523 0-10-4.477-10-10C2 6.474 6.477 1.997 12 1.997c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10ZM12 19.997c4.418 0 8-3.582 8-8C20 7.578 16.418 3.997 12 3.997c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM7 15.316c2.08-.151 4.117-1.022 5.707-2.612 1.59-1.59 2.461-3.627 2.612-5.707 .326 .217 .636 .469 .923 .757 2.343 2.343 2.343 6.142 0 8.485-2.343 2.343-6.142 2.343-8.485 0-.288-.288-.54-.597-.757-.923Z"),
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
        return _contrast2Line!!
    }

private var _contrast2Line: ImageVector? = null
