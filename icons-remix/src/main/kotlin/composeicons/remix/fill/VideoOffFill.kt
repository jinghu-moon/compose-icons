package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.VideoOffFill: ImageVector
    get() {
        if (_videoOffFill != null) return _videoOffFill!!
        _videoOffFill = remixIcon(
            name = "VideoOffFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 18.414l4.192 4.193 1.414-1.414L2.808 1.393 1.393 2.808 2.586 4h-.586c-.552 0-1 .448-1 1v14c0 .552 .448 1 1 1h14c.552 0 1-.448 1-1v-.586ZM16 4h-7.786L22.708 18.494c.172-.079 .292-.253 .292-.455v-12.079c0-.103-.032-.203-.09-.287-.158-.226-.47-.281-.696-.123L17 9.2v-4.2c0-.552-.448-1-1-1Z"),
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
        return _videoOffFill!!
    }

private var _videoOffFill: ImageVector? = null
