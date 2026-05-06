package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BlazeFill: ImageVector
    get() {
        if (_blazeFill != null) return _blazeFill!!
        _blazeFill = remixIcon(
            name = "BlazeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.5 9c1 1.061 1.5 2.394 1.5 4 0 3.466-3.7 4.276-5.5 9-.667-.575-1-1.408-1-2.5 0-3.482 5-5.29 5-10.5ZM14.5 5c1.2 1.238 1.8 2.572 1.8 4 0 4.951-6.045 5.692-4.8 13C9.833 20.839 9 19.173 9 17 9 13.675 14.5 11 14.5 5ZM10 1c1.333 1.667 2 3.167 2 4.5C12 11.75 3.5 13.722 8 22 5.384 21.42 3.5 19 3.5 16 3.5 9.5 10 8.5 10 1Z"),
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
        return _blazeFill!!
    }

private var _blazeFill: ImageVector? = null
