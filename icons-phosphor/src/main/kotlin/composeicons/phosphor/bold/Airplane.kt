package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Airplane: ImageVector
    get() {
        if (_airplane != null) return _airplane!!
        _airplane = phosphorBoldIcon(
            name = "Airplane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M237.37 125.27 164 88.58v-40.58C164 28.118 147.882 12 128 12 108.118 12 92 28.118 92 48v40.58L18.63 125.27C14.567 127.303 12.001 131.457 12 136v32c-.001 3.595 1.61 7.001 4.39 9.281 2.78 2.28 6.435 3.193 9.96 2.489L92 166.64v12.36L79.51 191.51C77.26 193.762 75.997 196.816 76 200v32c0 3.982 1.976 7.705 5.274 9.938 3.298 2.232 7.489 2.683 11.186 1.202L128 228.92l35.54 14.22c1.418 .57 2.932 .862 4.46 .86 6.627 0 12-5.373 12-12v-32c.003-3.184-1.26-6.238-3.51-8.49L164 179v-12.36l65.65 13.13c3.525 .704 7.181-.21 9.96-2.489 2.78-2.28 4.391-5.686 4.39-9.281v-32c-.001-4.543-2.567-8.697-6.63-10.73ZM220 153.36 154.35 140.23c-3.525-.704-7.181 .21-9.96 2.489-2.78 2.28-4.391 5.686-4.39 9.281v32c-.003 3.184 1.26 6.238 3.51 8.49L156 205v9.31l-23.54-9.42c-2.863-1.146-6.057-1.146-8.92 0L100 214.28v-9.28l12.49-12.48c2.257-2.26 3.52-5.326 3.51-8.52v-32c.001-3.595-1.61-7.001-4.39-9.281-2.78-2.28-6.435-3.193-9.96-2.489L36 153.36v-9.94l73.37-36.69c4.063-2.033 6.629-6.187 6.63-10.73v-48c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v48c.001 4.543 2.567 8.697 6.63 10.73L220 143.42Z"),
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
        return _airplane!!
    }

private var _airplane: ImageVector? = null
