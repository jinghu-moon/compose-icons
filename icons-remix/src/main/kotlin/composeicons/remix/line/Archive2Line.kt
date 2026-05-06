package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Archive2Line: ImageVector
    get() {
        if (_archive2Line != null) return _archive2Line!!
        _archive2Line = remixIcon(
            name = "Archive2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 20v-13L20 3h-16L2 7.004v12.996c0 .552 .448 1 1 1h18c.552 0 1-.448 1-1ZM4 9h16v10h-16v-10ZM5.236 5h13.528l1 2h-15.527L5.236 5ZM15 11h-6v2h6v-2Z"),
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
        return _archive2Line!!
    }

private var _archive2Line: ImageVector? = null
