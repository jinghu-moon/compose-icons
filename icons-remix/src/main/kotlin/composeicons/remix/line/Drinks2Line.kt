package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Drinks2Line: ImageVector
    get() {
        if (_drinks2Line != null) return _drinks2Line!!
        _drinks2Line = remixIcon(
            name = "Drinks2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 2h3.323L8.523 5h-5.523v2h2.118l.827 14.059c.031 .529 .469 .941 .998 .941h10.114c.529 0 .967-.413 .998-.941L18.882 7h2.118v-2h-10.323L8.677 0h-4.677v2ZM7.299 10.025 7.121 7h9.758l-.292 4.967c-2.307-.115-3.164-.476-4.215-.896C11.279 10.635 9.971 10.135 7.299 10.025ZM7.417 12.033c2.304 .115 3.172 .48 4.223 .9 1.06 .424 2.316 .905 4.829 1.031L16.114 20h-8.228L7.417 12.033Z"),
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
        return _drinks2Line!!
    }

private var _drinks2Line: ImageVector? = null
