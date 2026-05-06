package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GenderMale: ImageVector
    get() {
        if (_genderMale != null) return _genderMale!!
        _genderMale = phosphorBoldIcon(
            name = "GenderMale",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 28h-48c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h19L154.28 84.74C118.992 58.368 69.325 63.738 40.489 97.043c-28.836 33.305-27.043 83.229 4.108 114.38 31.151 31.151 81.075 32.944 114.38 4.108 33.305-28.836 38.675-78.503 12.303-113.791L204 69v19c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-48c0-6.627-5.373-12-12-12ZM146.41 194.46c-23.434 23.424-61.419 23.419-84.847-.011-23.428-23.431-23.428-61.416 0-84.847 23.428-23.431 61.413-23.436 84.847-.011 23.388 23.456 23.388 61.414 0 84.87Z"),
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
