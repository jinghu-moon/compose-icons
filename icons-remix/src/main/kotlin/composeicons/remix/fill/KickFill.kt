package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.KickFill: ImageVector
    get() {
        if (_kickFill != null) return _kickFill!!
        _kickFill = remixIcon(
            name = "KickFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 3h18v18h-18v-18ZM10.564 5.536h-4.309v12.927h4.309v-2.873h1.436v1.436h1.436v1.436h4.309v-4.309h-1.436v-1.436h-1.436v-1.436h1.436v-1.436h1.436v-4.309h-4.309v1.436h-1.436v1.436h-1.436v-2.873Z"),
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
        return _kickFill!!
    }

private var _kickFill: ImageVector? = null
