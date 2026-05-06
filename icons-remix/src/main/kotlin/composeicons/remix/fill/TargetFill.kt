package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TargetFill: ImageVector
    get() {
        if (_targetFill != null) return _targetFill!!
        _targetFill = remixIcon(
            name = "TargetFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c.552 0 1 .448 1 1 0 .552-.448 1-1 1C7.582 4 4 7.582 4 12c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-.552 .448-1 1-1 .552 0 1 .448 1 1 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2ZM12 6c.552 0 1 .448 1 1 0 .552-.448 1-1 1C9.791 8 8 9.791 8 12c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4 0-.552 .448-1 1-1 .552 0 1 .448 1 1 0 3.314-2.686 6-6 6C8.686 18 6 15.314 6 12 6 8.686 8.686 6 12 6ZM18.571 2.101c.276 0 .5 .224 .5 .5v1.829c0 .276 .224 .499 .5 .499h1.828c.276 0 .5 .224 .5 .5v.915L20.011 8.232c-.375 .375-.884 .586-1.414 .586h-2l-3.89 3.889c-.391 .39-1.023 .391-1.414 0-.39-.391-.39-1.024 0-1.414L15.183 7.404v-2c0-.53 .21-1.039 .585-1.414L17.657 2.101h.914Z"),
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
        return _targetFill!!
    }

private var _targetFill: ImageVector? = null
