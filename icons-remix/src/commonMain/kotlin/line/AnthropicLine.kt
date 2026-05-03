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
                pathData = parseSvgPathData("M 14.122 5.000 L 16.268 5.000 L 22.101 20.000 L 19.955 20.000 L 14.122 5.000 ZM 7.660 5.000 L 10.341 5.000 L 16.110 20.000 L 13.967 20.000 L 12.429 16.000 L 5.572 16.000 L 4.033 20.000 L 1.891 20.000 L 7.660 5.000 ZM 11.660 14.000 L 9.000 7.086 L 6.341 14.000 L 11.660 14.000 Z"),
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
