package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GenderMale: ImageVector
    get() {
        if (_genderMale != null) return _genderMale!!
        _genderMale = phosphorLightIcon(
            name = "GenderMale",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 34h-48c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h33.52L154.72 92.79C122.594 65.279 74.395 68.386 46.066 99.793c-28.329 31.407-26.464 79.67 4.204 108.798 30.668 29.128 78.963 28.506 108.871-1.401h0c28.765-28.842 30.537-74.946 4.07-105.91L210 54.49v33.51c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-48c0-3.314-2.686-6-6-6ZM150.66 198.7c-25.778 25.766-67.561 25.759-93.331-.015-25.77-25.774-25.77-67.557 0-93.331 25.77-25.774 67.553-25.78 93.331-.015 25.734 25.8 25.734 67.56 0 93.36Z"),
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
        return _genderMale!!
    }

private var _genderMale: ImageVector? = null
