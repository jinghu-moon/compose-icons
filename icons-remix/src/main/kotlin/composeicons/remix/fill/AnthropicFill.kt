package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AnthropicFill: ImageVector
    get() {
        if (_anthropicFill != null) return _anthropicFill!!
        _anthropicFill = remixIcon(
            name = "AnthropicFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16.764 5h-3.308l5.923 15h3.231L16.764 5ZM7.226 5 1.38 20h3.308L5.995 16.846h6.154l1.231 3.077h3.308L10.688 5h-3.385-.077ZM6.918 14.077 8.918 8.769l2.077 5.308h-4-.077Z"),
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
        return _anthropicFill!!
    }

private var _anthropicFill: ImageVector? = null
