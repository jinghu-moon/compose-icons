package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.RecycleLine: ImageVector
    get() {
        if (_recycleLine != null) return _recycleLine!!
        _recycleLine = remixIcon(
            name = "RecycleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.56 12.097l1.531 2.653c.967 1.674 .393 3.815-1.281 4.781-.532 .307-1.136 .469-1.75 .469l-2.062-.001 0 2.501-5-3.5 5-3.5-0 2.499 2.062 .001c.263 0 .522-.069 .75-.201 .717-.414 .963-1.332 .549-2.049L17.829 13.097l1.732-1ZM7.303 9.134l.531 6.08L5.668 13.964 4.638 15.75c-.132 .228-.201 .487-.201 .75 0 .828 .672 1.5 1.5 1.5l3.063 0v2h-3.063c-1.933 0-3.5-1.567-3.5-3.5 0-.614 .162-1.218 .469-1.75L3.936 12.964 1.771 11.714 7.303 9.134ZM13.749 2.969c.532 .307 .974 .749 1.281 1.281l1.031 1.785L18.226 4.786l-.531 6.08L12.164 8.286 14.328 7.036 13.298 5.25c-.132-.228-.321-.417-.549-.549-.717-.414-1.635-.168-2.049 .549L9.168 7.903 7.436 6.903 8.968 4.25C9.934 2.576 12.075 2.003 13.749 2.969Z"),
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
        return _recycleLine!!
    }

private var _recycleLine: ImageVector? = null
