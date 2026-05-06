package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RamFill: ImageVector
    get() {
        if (_ramFill != null) return _ramFill!!
        _ramFill = remixIcon(
            name = "RamFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2 5C1.448 5 1 5.448 1 6v12c0 .552 .448 1 1 1h3v-2h2v2h2v-2h2v2h2v-2h2v2h2v-2h2v2h3c.552 0 1-.448 1-1v-12C23 5.448 22.552 5 22 5h-20ZM5 9h6v3h-6v-3ZM13 9h6v3h-6v-3Z"),
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
        return _ramFill!!
    }

private var _ramFill: ImageVector? = null
