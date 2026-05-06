package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FridgeLine: ImageVector
    get() {
        if (_fridgeLine != null) return _fridgeLine!!
        _fridgeLine = remixIcon(
            name = "FridgeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.998 1c.552 0 1 .448 1 1v20c0 .552-.448 1-1 1h-14C4.446 23 3.998 22.552 3.998 22v-20c0-.552 .448-1 1-1h14ZM17.998 12h-12v9h12v-9ZM9.998 14v4h-2v-4h2ZM17.998 3h-12v7h12v-7ZM9.998 5v3h-2v-3h2Z"),
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
        return _fridgeLine!!
    }

private var _fridgeLine: ImageVector? = null
