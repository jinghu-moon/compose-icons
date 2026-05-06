package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Coffee: ImageVector
    get() {
        if (_coffee != null) return _coffee!!
        _coffee = phosphorBoldIcon(
            name = "Coffee",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212 76h-180C25.373 76 20 81.373 20 88v48c.038 25.222 9.582 49.503 26.73 68h-14.73c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h176c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-14.73c8.623-9.312 15.408-20.169 20-32 23.803-.687 42.74-20.187 42.73-44v-8C255.972 95.711 236.289 76.028 212 76ZM196 136c-.052 28.775-16.294 55.071-42 68h-68C60.294 191.071 44.052 164.775 44 136v-36h152ZM232 128c-.008 8.17-4.984 15.515-12.57 18.55 .381-3.504 .571-7.026 .57-10.55v-34.32c7.285 3.179 11.996 10.371 12 18.32ZM68 48v-24C68 17.373 73.373 12 80 12c6.627 0 12 5.373 12 12v24c0 6.627-5.373 12-12 12C73.373 60 68 54.627 68 48ZM108 48v-24c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v24c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM148 48v-24c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v24c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12Z"),
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
        return _coffee!!
    }

private var _coffee: ImageVector? = null
