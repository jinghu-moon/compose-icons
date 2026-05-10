package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ToggleFill: ImageVector
    get() {
        if (_toggleFill != null) return _toggleFill!!
        _toggleFill = remixIcon(
            name = "ToggleFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8 5h8c3.866 0 7 3.134 7 7 0 3.866-3.134 7-7 7h-8C4.134 19 1 15.866 1 12 1 8.134 4.134 5 8 5ZM16 15c1.657 0 3-1.343 3-3C19 10.343 17.657 9 16 9c-1.657 0-3 1.343-3 3 0 1.657 1.343 3 3 3Z"),
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
        return _toggleFill!!
    }

private var _toggleFill: ImageVector? = null
