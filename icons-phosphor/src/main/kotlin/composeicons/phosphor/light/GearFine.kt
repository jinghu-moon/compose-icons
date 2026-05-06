package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GearFine: ImageVector
    get() {
        if (_gearFine != null) return _gearFine!!
        _gearFine = phosphorLightIcon(
            name = "GearFine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 122h-18.23c-.759-11.012-3.642-21.773-8.49-31.69l15.79-9.11c2.872-1.657 3.857-5.328 2.2-8.2-1.657-2.872-5.328-3.857-8.2-2.2l-15.8 9.12C193.085 70.785 185.215 62.915 176.08 56.73l9.12-15.8c1.657-2.872 .672-6.543-2.2-8.2-2.872-1.657-6.543-.672-8.2 2.2l-9.11 15.79C155.773 45.872 145.012 42.989 134 42.23v-18.23c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v18.23c-11.012 .759-21.773 3.642-31.69 8.49L81.2 34.93C79.543 32.058 75.872 31.073 73 32.73c-2.872 1.657-3.857 5.328-2.2 8.2l9.12 15.8C70.785 62.915 62.915 70.785 56.73 79.92L40.93 70.8C38.058 69.143 34.387 70.128 32.73 73c-1.657 2.872-.672 6.543 2.2 8.2l15.79 9.11c-4.848 9.917-7.731 20.678-8.49 31.69h-18.23c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h18.23c.759 11.012 3.642 21.773 8.49 31.69l-15.79 9.11c-2.872 1.657-3.857 5.328-2.2 8.2 1.657 2.872 5.328 3.857 8.2 2.2l15.8-9.12c6.185 9.135 14.055 17.005 23.19 23.19l-9.12 15.8c-1.657 2.872-.672 6.543 2.2 8.2 2.872 1.657 6.543 .672 8.2-2.2l9.11-15.79c9.917 4.848 20.678 7.731 31.69 8.49v18.23c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-18.23c11.012-.759 21.773-3.642 31.69-8.49l9.11 15.79c1.074 1.861 3.061 3.005 5.21 3 1.054 .001 2.09-.278 3-.81 2.867-1.655 3.852-5.321 2.2-8.19l-9.12-15.8c9.135-6.185 17.005-14.055 23.19-23.19l15.8 9.12c2.872 1.657 6.543 .672 8.2-2.2 1.657-2.872 .672-6.543-2.2-8.2l-15.79-9.11c4.844-9.917 7.724-20.679 8.48-31.69h18.23c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM86 188.84C65.995 175.046 54.049 152.3 54.049 128 54.049 103.7 65.995 80.954 86 67.16L121.07 128ZM128 202c-10.957 .01-21.777-2.429-31.67-7.14L131.46 134h70.28c-3.166 38.389-35.221 67.948-73.74 68ZM131.46 122 96.33 61.14c21.956-10.418 47.629-9.382 68.676 2.769 21.046 12.151 34.779 33.868 36.734 58.091Z"),
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
        return _gearFine!!
    }

private var _gearFine: ImageVector? = null
