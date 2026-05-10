package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.OperaFill: ImageVector
    get() {
        if (_operaFill != null) return _operaFill!!
        _operaFill = remixIcon(
            name = "OperaFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.71 6.365C7.603 7.67 6.888 9.601 6.838 11.765v.47c.051 2.165 .765 4.093 1.872 5.399 1.434 1.863 3.566 3.045 5.949 3.045 1.463 0 2.833-.447 4.006-1.226C16.9 21.038 14.563 22 12.001 22c-.16 0-.319-.003-.475-.012C6.221 21.741 2.001 17.363 2.001 12 2.001 6.476 6.478 2 12.001 2h.037c2.546 .01 4.867 .972 6.628 2.546C17.493 3.771 16.124 3.32 14.658 3.32c-2.382 0-4.514 1.183-5.95 3.045h.003ZM22.001 12c0 2.963-1.288 5.623-3.335 7.454-2.565 1.25-4.955 .376-5.747-.171 2.519-.553 4.423-3.6 4.423-7.283 0-3.685-1.903-6.729-4.423-7.283 .791-.545 3.182-1.419 5.747-.171 2.047 1.829 3.335 4.492 3.335 7.454Z"),
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
        return _operaFill!!
    }

private var _operaFill: ImageVector? = null
