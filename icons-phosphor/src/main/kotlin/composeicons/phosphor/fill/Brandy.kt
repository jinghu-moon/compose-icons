package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Brandy: ImageVector
    get() {
        if (_brandy != null) return _brandy!!
        _brandy = phosphorFillIcon(
            name = "Brandy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 88h0c.025-18.595-5.372-36.795-15.53-52.37C206.993 33.366 204.473 32 201.77 32h-147.54c-2.703 0-5.223 1.366-6.7 3.63C37.372 51.205 31.975 69.405 32 88h0c.06 49.893 38.285 91.445 88 95.66v32.34h-32c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h80c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-32v-32.34C185.715 179.445 223.94 137.893 224 88ZM58.7 48h138.6c5.675 9.811 9.186 20.721 10.3 32h-159.2C49.514 68.721 53.025 57.811 58.7 48Z"),
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
        return _brandy!!
    }

private var _brandy: ImageVector? = null
