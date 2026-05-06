package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CaretLineRight: ImageVector
    get() {
        if (_caretLineRight != null) return _caretLineRight!!
        _caretLineRight = phosphorDuotoneIcon(
            name = "CaretLineRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144 128 64 208v-160Z"),
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
                pathData = parseSvgPathData("M69.66 42.34C67.372 40.049 63.929 39.364 60.938 40.603 57.947 41.842 55.997 44.762 56 48v160c-.003 3.238 1.947 6.158 4.938 7.397 2.991 1.239 6.434 .554 8.722-1.737l80-80c1.502-1.501 2.346-3.537 2.346-5.66 0-2.123-.844-4.159-2.346-5.66ZM72 188.69v-121.38L132.69 128ZM192 48v160c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-160c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _caretLineRight!!
    }

private var _caretLineRight: ImageVector? = null
