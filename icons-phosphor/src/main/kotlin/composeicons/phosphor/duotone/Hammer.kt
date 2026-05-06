package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Hammer: ImageVector
    get() {
        if (_hammer != null) return _hammer!!
        _hammer = phosphorDuotoneIcon(
            name = "Hammer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M245.66 129 217 157.66c-3.123 3.115-8.177 3.115-11.3 0L168.1 120l-28 28L108.1 116 136.1 88 80 31.78c33.322-15.053 72.484-7.883 98.31 18l67.35 67.89c1.505 1.501 2.351 3.539 2.351 5.665 0 2.126-.846 4.164-2.351 5.665Z"),
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
                pathData = parseSvgPathData("M251.34 112 183.88 44.08C146.366 6.641 85.624 6.641 48.11 44.08l-.09 .09L34.25 58.4c-2.967 3.189-2.838 8.165 .291 11.196 3.129 3.031 8.107 3.001 11.199-.066L59.47 55.35C64.994 49.827 71.298 45.144 78.18 41.45L124.68 88l-96 96c-3.001 3.001-4.688 7.071-4.688 11.315 0 4.244 1.686 8.314 4.688 11.315l20.69 20.69c3.001 3.001 7.071 4.688 11.315 4.688 4.244 0 8.314-1.686 11.315-4.688l96-96 14.34 14.34h0L200 163.3c3.001 3.001 7.071 4.688 11.315 4.688 4.244 0 8.314-1.686 11.315-4.688l28.69-28.69c6.242-6.241 6.251-16.358 .02-22.61ZM60.68 216 40 195.31l68-68L128.68 148ZM162.34 114.32 140 136.67 119.31 116 141.66 93.65c1.502-1.501 2.346-3.537 2.346-5.66 0-2.123-.844-4.159-2.346-5.66L94.32 35c27.849-7.843 57.762-.039 78.23 20.41l44.22 44.51L188 128.66 173.66 114.32c-1.501-1.502-3.537-2.346-5.66-2.346-2.123 0-4.159 .844-5.66 2.346ZM211.34 151.98l-12-12L228 111.25l12 12Z"),
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
        return _hammer!!
    }

private var _hammer: ImageVector? = null
