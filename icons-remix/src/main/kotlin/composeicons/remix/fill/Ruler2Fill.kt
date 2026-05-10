package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Ruler2Fill: ImageVector
    get() {
        if (_ruler2Fill != null) return _ruler2Fill!!
        _ruler2Fill = remixIcon(
            name = "Ruler2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15 21h-2v-3h-2v3h-2v-2h-2v2h-3C3.448 21 3 20.552 3 20v-3h2v-2h-2v-2h3v-2h-3v-2h2v-2h-2v-3C3 3.448 3.448 3 4 3h6c.552 0 1 .448 1 1v9h9c.552 0 1 .448 1 1v6c0 .552-.448 1-1 1h-3v-2h-2v2Z"),
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
        return _ruler2Fill!!
    }

private var _ruler2Fill: ImageVector? = null
