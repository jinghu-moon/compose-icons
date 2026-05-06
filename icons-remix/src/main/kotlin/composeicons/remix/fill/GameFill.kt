package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GameFill: ImageVector
    get() {
        if (_gameFill != null) return _gameFill!!
        _gameFill = remixIcon(
            name = "GameFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c3.122 0 5.909 1.43 7.743 3.671L13.414 12l6.329 6.329C17.909 20.57 15.122 22 12 22 6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2ZM12 5c-.828 0-1.5 .672-1.5 1.5C10.5 7.328 11.172 8 12 8c.828 0 1.5-.672 1.5-1.5C13.5 5.672 12.828 5 12 5Z"),
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
        return _gameFill!!
    }

private var _gameFill: ImageVector? = null
