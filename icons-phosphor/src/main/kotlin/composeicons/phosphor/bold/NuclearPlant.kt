package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NuclearPlant: ImageVector
    get() {
        if (_nuclearPlant != null) return _nuclearPlant!!
        _nuclearPlant = phosphorBoldIcon(
            name = "NuclearPlant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M92.83 50C97.63 21.082 122.687-.092 152 0c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-17.591-.064-32.63 12.645-35.5 30-.975 5.769-5.969 9.994-11.82 10-.67 .003-1.34-.054-2-.17-3.141-.526-5.944-2.28-7.791-4.874C93.041 56.362 92.301 53.14 92.83 50ZM148 40c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h4c28.705-.033 51.967-23.295 52-52C204 5.373 198.627 0 192 0c-6.627 0-12 5.373-12 12 0 15.464-12.536 28-28 28ZM252 216c0 6.627-5.373 12-12 12h-224C9.373 228 4 222.627 4 216c0-6.627 5.373-12 12-12h16.15C44.62 177.47 58.35 139.59 59.87 99.19 60.248 88.444 69.098 79.945 79.85 80h88.34c10.696-.011 19.508 8.395 20 19.08 2 44.12 22.46 86.48 32.58 104.92h19.23c6.627 0 12 5.373 12 12ZM164.4 104h-16c2.36 38.59 15.49 74.53 27.47 100h17.78C181.92 180.52 167 143.66 164.4 104ZM58.48 204h91C137.82 177.12 126.37 141.85 124.29 104h-40.62C81.59 141.85 70.14 177.12 58.48 204Z"),
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
        return _nuclearPlant!!
    }

private var _nuclearPlant: ImageVector? = null
