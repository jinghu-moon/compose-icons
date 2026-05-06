package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Building4Line: ImageVector
    get() {
        if (_building4Line != null) return _building4Line!!
        _building4Line = remixIcon(
            name = "Building4Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 20h2v2h-22v-2h2v-17C3 2.448 3.448 2 4 2h16c.552 0 1 .448 1 1v17ZM19 20v-16h-14v16h14ZM8 11h3v2h-3v-2ZM8 7h3v2h-3v-2ZM8 15h3v2h-3v-2ZM13 15h3v2h-3v-2ZM13 11h3v2h-3v-2ZM13 7h3v2h-3v-2Z"),
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
        return _building4Line!!
    }

private var _building4Line: ImageVector? = null
