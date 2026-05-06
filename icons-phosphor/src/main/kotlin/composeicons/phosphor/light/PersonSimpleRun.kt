package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PersonSimpleRun: ImageVector
    get() {
        if (_personSimpleRun != null) return _personSimpleRun!!
        _personSimpleRun = phosphorLightIcon(
            name = "PersonSimpleRun",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 86c16.569 0 30-13.431 30-30C182 39.431 168.569 26 152 26c-16.569 0-30 13.431-30 30 0 16.569 13.431 30 30 30ZM152 38c9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18ZM218.49 138.86c-.59 .27-7.17 3.13-18.88 3.13-13.86 0-34.9-4-61.73-21-4.299 12.836-10.152 25.097-17.43 36.51 9.43 2.78 22 7.72 33.19 16.26C172.46 188.05 182 207.65 182 232c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6 0-44-37.23-59.18-56.91-64.11q-1.2 1.55-2.46 3.09C91.38 194.29 67.29 206.43 40.52 206.43c-3.045 .01-6.089-.134-9.12-.43-3.314-.331-5.731-3.286-5.4-6.6 .331-3.314 3.286-5.731 6.6-5.4 26.63 2.66 49.77-7.66 68.77-30.69 13.16-15.94 21.94-35.51 26.08-49.15C86.94 89.64 60.86 109.38 59.73 110.27c-2.595 1.98-6.296 1.523-8.331-1.029-2.035-2.552-1.657-6.262 .851-8.351 .37-.3 9.39-7.43 24.76-10 13.86-2.31 35.92-1.3 62.36 16.67 47.14 32 73.88 20.47 74.14 20.35 3.015-1.381 6.579-.055 7.96 2.96 1.381 3.015 .055 6.579-2.96 7.96Z"),
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
        return _personSimpleRun!!
    }

private var _personSimpleRun: ImageVector? = null
