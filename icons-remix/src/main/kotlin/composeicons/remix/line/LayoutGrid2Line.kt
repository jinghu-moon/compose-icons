package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.LayoutGrid2Line: ImageVector
    get() {
        if (_layoutGrid2Line != null) return _layoutGrid2Line!!
        _layoutGrid2Line = remixIcon(
            name = "LayoutGrid2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 10h4v4h-4v-4ZM4 19v-3h4v3h-4ZM10 19v-3h4v3h-4ZM16 19v-3h4v3h-4ZM16 14v-4h4v4h-4ZM16 8v-3h4v3h-4ZM14 5v3h-4v-3h4ZM14 10v4h-4v-4h4ZM4 8v-3h4v3h-4ZM3 3C2.448 3 2 3.448 2 4v16c0 .552 .448 1 1 1h18c.552 0 1-.448 1-1v-16C22 3.448 21.552 3 21 3h-18Z"),
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
        return _layoutGrid2Line!!
    }

private var _layoutGrid2Line: ImageVector? = null
