package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GenderFemale: ImageVector
    get() {
        if (_genderFemale != null) return _genderFemale!!
        _genderFemale = phosphorLightIcon(
            name = "GenderFemale",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M206 96C206.01 53.699 172.301 19.1 130.014 18.007 87.728 16.915 52.277 49.728 50.103 91.973c-2.174 42.245 29.721 78.523 71.897 81.777v28.25h-34c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h34v26c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-26h34c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-34v-28.25C174.603 170.574 205.947 136.727 206 96ZM62 96C62 59.549 91.549 30 128 30c36.451 0 66 29.549 66 66 0 36.451-29.549 66-66 66C91.567 161.956 62.044 132.433 62 96Z"),
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
