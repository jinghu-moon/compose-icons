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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.764 5.000 L 13.457 5.000 L 19.380 20.000 L 22.611 20.000 L 16.764 5.000 ZM 7.226 5.000 L 1.380 20.000 L 4.688 20.000 L 5.995 16.846 L 12.149 16.846 L 13.380 19.923 L 16.688 19.923 L 10.688 5.000 L 7.303 5.000 L 7.226 5.000 ZM 6.918 14.077 L 8.918 8.769 L 10.995 14.077 L 6.995 14.077 L 6.918 14.077 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _anthropicFill!!
    }

private var _anthropicFill: ImageVector? = null
