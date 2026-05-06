package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CoinVertical: ImageVector
    get() {
        if (_coinVertical != null) return _coinVertical!!
        _coinVertical = phosphorLightIcon(
            name = "CoinVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M196.78 57.09C185.08 37 169.18 26 152 26h-48C86.82 26 70.92 37 59.22 57.09 48.12 76.13 42 101.31 42 128c0 26.69 6.12 51.87 17.22 70.91C70.92 219 86.82 230 104 230h48c17.18 0 33.08-11 44.78-31.09C207.88 179.91 214 154.69 214 128c0-26.69-6.12-51.87-17.22-70.91ZM201.88 122h-36c-.65-18.84-4.37-36.73-10.74-52h34.86c7.06 14.74 11.16 32.77 11.88 52ZM152 38c11.31 0 22.22 7.06 31.14 20h-33.86l-.5-.91C144.736 49.951 139.574 43.506 133.49 38ZM69.58 192.86C59.54 175.63 54 152.6 54 128 54 103.4 59.54 80.37 69.58 63.14 79 46.93 91.26 38 104 38c12.74 0 25 8.93 34.42 25.14C148.46 80.37 154 103.4 154 128c0 24.6-5.54 47.63-15.58 64.86C129 209.07 116.74 218 104 218 91.26 218 79 209.07 69.58 192.86ZM152 218h-18.51c6.084-5.506 11.246-11.951 15.29-19.09l.5-.91h33.86c-8.92 12.94-19.83 20-31.14 20ZM190 186h-34.86c6.37-15.27 10.09-33.16 10.74-52h36c-.72 19.23-4.82 37.26-11.88 52Z"),
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
        return _coinVertical!!
    }

private var _coinVertical: ImageVector? = null
