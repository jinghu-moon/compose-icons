package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MusicNotesMinus: ImageVector
    get() {
        if (_musicNotesMinus != null) return _musicNotesMinus!!
        _musicNotesMinus = phosphorLightIcon(
            name = "MusicNotesMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230 48c0 3.314-2.686 6-6 6h-48c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h48c3.314 0 6 2.686 6 6ZM214 88v76c.029 15.996-11.079 29.857-26.697 33.315-15.618 3.458-31.538-4.418-38.265-18.932-6.727-14.513-2.448-31.752 10.285-41.435 12.733-9.683 30.489-9.2 42.676 1.161v-50.11c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM202 164c0-12.15-9.85-22-22-22-12.15 0-22 9.85-22 22 0 12.15 9.85 22 22 22 12.15 0 22-9.85 22-22ZM86 108.69v87.31c.029 15.996-11.079 29.857-26.697 33.315C43.685 232.773 27.765 224.897 21.038 210.384 14.311 195.871 18.59 178.632 31.324 168.949c12.733-9.683 30.489-9.2 42.676 1.161v-114.11c-0-2.751 1.871-5.15 4.54-5.82l56-14c3.214-.806 6.474 1.146 7.28 4.36 .806 3.214-1.146 6.474-4.36 7.28L86 60.68v35.63L158.54 78.18c3.214-.806 6.474 1.146 7.28 4.36 .806 3.214-1.146 6.474-4.36 7.28ZM74 196C74 183.85 64.15 174 52 174c-12.15 0-22 9.85-22 22 0 12.15 9.85 22 22 22 12.15 0 22-9.85 22-22Z"),
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
        return _musicNotesMinus!!
    }

private var _musicNotesMinus: ImageVector? = null
