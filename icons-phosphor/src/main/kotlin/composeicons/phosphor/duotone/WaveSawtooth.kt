package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.WaveSawtooth: ImageVector
    get() {
        if (_waveSawtooth != null) return _waveSawtooth!!
        _waveSawtooth = phosphorDuotoneIcon(
            name = "WaveSawtooth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 64v64h-104ZM232 128h-104v64Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M236.19 134.81l-104 64c-2.468 1.517-5.563 1.582-8.092 .169C121.569 197.566 120.002 194.897 120 192v-113.68L28.19 134.81c-3.748 2.141-8.52 .923-10.782-2.754-2.262-3.677-1.199-8.485 2.402-10.866L123.81 57.19c2.468-1.517 5.563-1.582 8.092-.169 2.529 1.413 4.097 4.082 4.098 6.979v113.68l91.81-56.49c3.748-2.141 8.52-.922 10.782 2.754 2.262 3.677 1.199 8.485-2.402 10.866Z"),
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
        return _waveSawtooth!!
    }

private var _waveSawtooth: ImageVector? = null
