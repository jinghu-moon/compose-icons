package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GenderTransgender: ImageVector
    get() {
        if (_genderTransgender != null) return _genderTransgender!!
        _genderTransgender = phosphorLightIcon(
            name = "GenderTransgender",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 34h-48c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h33.52L168 79.52 148.24 59.76c-1.512-1.535-3.732-2.142-5.815-1.588-2.083 .553-3.709 2.181-4.26 4.265-.551 2.084 .058 4.303 1.595 5.813L159.52 88l-18.46 18.46C112.384 82.359 69.81 85.131 44.501 112.746c-25.31 27.615-24.368 70.268 2.135 96.74 26.503 26.472 69.157 27.363 96.742 2.021 27.585-25.342 30.307-67.919 6.172-96.567L168 96.5l19.76 19.76c2.35 2.309 6.122 2.292 8.451-.039 2.328-2.331 2.341-6.104 .029-8.451L176.48 88 210 54.49v33.51c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-48c0-3.314-2.686-6-6-6ZM137 201c-19.572 19.561-50.236 22.571-73.239 7.19C40.759 192.81 31.825 163.322 42.423 137.761 53.021 112.2 80.2 97.686 107.337 103.094c27.137 5.409 46.674 29.235 46.663 56.906-.006 15.38-6.121 30.128-17 41Z"),
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
        return _genderTransgender!!
    }

private var _genderTransgender: ImageVector? = null
