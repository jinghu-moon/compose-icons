package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MultiImageLine: ImageVector
    get() {
        if (_multiImageLine != null) return _multiImageLine!!
        _multiImageLine = remixIcon(
            name = "MultiImageLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 3C6.448 3 6 3.448 6 4v3h-3C2.448 7 2 7.448 2 8v12c0 .552 .448 1 1 1h14c.552 0 1-.448 1-1v-3h3c.552 0 1-.448 1-1v-12C22 3.448 21.552 3 21 3h-14ZM17 7h-9v-2h12v10h-2v-7C18 7.448 17.552 7 17 7ZM16 9v6.739L11.491 11.64 4 18.632v-9.632h12ZM11.509 14.36 16 18.442v.558h-9.463l4.972-4.64ZM7 13.5c.828 0 1.5-.672 1.5-1.5C8.5 11.172 7.828 10.5 7 10.5c-.828 0-1.5 .672-1.5 1.5 0 .828 .672 1.5 1.5 1.5Z"),
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
        return _multiImageLine!!
    }

private var _multiImageLine: ImageVector? = null
