package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PicnicTable: ImageVector
    get() {
        if (_picnicTable != null) return _picnicTable!!
        _picnicTable = phosphorFillIcon(
            name = "PicnicTable",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M146.85 96l14.54 32h-66.78L109.15 96ZM232 56v144c0 8.837-7.163 16-16 16h-176c-8.837 0-16-7.163-16-16v-144C24 47.163 31.163 40 40 40h176c8.837 0 16 7.163 16 16ZM208 136c0-4.418-3.582-8-8-8h-21L164.42 96h11.58c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-96c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h11.58L77 128h-21c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h13.76L56.76 172.69c-1.274 2.615-1.028 5.716 .642 8.097 1.67 2.382 4.502 3.669 7.394 3.362 2.893-.307 5.391-2.16 6.524-4.839L87.32 144h81.34l16.05 35.31c1.899 3.897 6.556 5.573 10.503 3.778 3.946-1.794 5.746-6.406 4.057-10.398L186.27 144h13.73c4.418 0 8-3.582 8-8Z"),
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
        return _picnicTable!!
    }

private var _picnicTable: ImageVector? = null
