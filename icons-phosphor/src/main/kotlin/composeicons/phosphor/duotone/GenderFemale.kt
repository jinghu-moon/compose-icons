package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GenderFemale: ImageVector
    get() {
        if (_genderFemale != null) return _genderFemale!!
        _genderFemale = phosphorDuotoneIcon(
            name = "GenderFemale",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 96c0 39.764-32.236 72-72 72C88.235 168 56 135.764 56 96 56 56.235 88.235 24 128 24c39.764 0 72 32.235 72 72Z"),
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
                pathData = parseSvgPathData("M208 96C207.999 52.857 173.789 17.485 130.67 16.046 87.551 14.606 51.057 47.616 48.178 90.663c-2.879 43.047 28.895 80.623 71.822 84.937v24.4h-32c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h32v24c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-24h32c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-32v-24.4C176.855 171.443 207.95 137.066 208 96ZM64 96C64 60.654 92.654 32 128 32c35.346 0 64 28.654 64 64 0 35.346-28.654 64-64 64C92.67 159.961 64.039 131.33 64 96Z"),
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
        return _genderFemale!!
    }

private var _genderFemale: ImageVector? = null
