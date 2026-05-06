package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Bookmark2Line: ImageVector
    get() {
        if (_bookmark2Line != null) return _bookmark2Line!!
        _bookmark2Line = remixIcon(
            name = "Bookmark2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5 2h14c.552 0 1 .448 1 1v19.143c0 .276-.224 .5-.5 .5-.094 0-.186-.027-.266-.076L12 18.031 4.766 22.567c-.234 .147-.543 .076-.689-.158C4.026 22.329 4 22.237 4 22.143v-19.143C4 2.448 4.448 2 5 2ZM18 4h-12v15.432l6-3.762 6 3.762v-15.432ZM8 9h8v2h-8v-2Z"),
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
        return _bookmark2Line!!
    }

private var _bookmark2Line: ImageVector? = null
