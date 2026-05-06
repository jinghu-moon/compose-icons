package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GenderNeuter: ImageVector
    get() {
        if (_genderNeuter != null) return _genderNeuter!!
        _genderNeuter = phosphorLightIcon(
            name = "GenderNeuter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M206 104C206.01 61.699 172.301 27.1 130.014 26.007 87.728 24.915 52.277 57.728 50.103 99.973c-2.174 42.245 29.721 78.523 71.897 81.777v50.25c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-50.25c40.603-3.176 71.947-37.023 72-77.75ZM128 170C91.549 170 62 140.451 62 104 62 67.549 91.549 38 128 38c36.451 0 66 29.549 66 66-.044 36.433-29.567 65.956-66 66Z"),
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
        return _genderNeuter!!
    }

private var _genderNeuter: ImageVector? = null
