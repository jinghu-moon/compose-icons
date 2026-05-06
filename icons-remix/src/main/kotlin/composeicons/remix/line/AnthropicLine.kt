package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AnthropicLine: ImageVector
    get() {
        if (_anthropicLine != null) return _anthropicLine!!
        _anthropicLine = remixIcon(
            name = "AnthropicLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.122 5h2.146l5.833 15h-2.146L14.122 5ZM7.66 5h2.681l5.769 15h-2.143L12.429 16h-6.857L4.033 20h-2.143L7.66 5ZM11.66 14 9 7.086 6.341 14h5.319Z"),
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
        return _anthropicLine!!
    }

private var _anthropicLine: ImageVector? = null
