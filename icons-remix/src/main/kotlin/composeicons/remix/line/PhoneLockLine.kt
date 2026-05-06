package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PhoneLockLine: ImageVector
    get() {
        if (_phoneLockLine != null) return _phoneLockLine!!
        _phoneLockLine = remixIcon(
            name = "PhoneLockLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18 2c.552 0 1 .448 1 1v7h-2v-6h-10v16h5v2h-6C5.448 22 5 21.552 5 21v-18C5 2.448 5.448 2 6 2h12ZM18 12c1.657 0 3 1.343 3 3v1h1v5c0 .552-.448 1-1 1h-6c-.552 0-1-.448-1-1v-5h1v-1c0-1.657 1.343-3 3-3ZM20 18h-4v2h4v-2ZM18 14c-.508 0-1 .45-1 1v1h2v-1c0-.552-.448-1-1-1Z"),
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
        return _phoneLockLine!!
    }

private var _phoneLockLine: ImageVector? = null
