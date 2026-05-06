package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Newspaper: ImageVector
    get() {
        if (_newspaper != null) return _newspaper!!
        _newspaper = phosphorFillIcon(
            name = "Newspaper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 48h-160C47.163 48 40 55.163 40 64v120c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-96c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v96.11c.061 13.212 10.788 23.89 24 23.89h176c13.255 0 24-10.745 24-24v-120c0-8.837-7.163-16-16-16ZM176 152h-80c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h80c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM176 120h-80c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h80c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8Z"),
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
        return _newspaper!!
    }

private var _newspaper: ImageVector? = null
