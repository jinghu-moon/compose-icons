package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Cylinder: ImageVector
    get() {
        if (_cylinder != null) return _cylinder!!
        _cylinder = phosphorLightIcon(
            name = "Cylinder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 18C88.75 18 58 36.45 58 60v136c0 23.55 30.75 42 70 42 39.25 0 70-18.45 70-42v-136C198 36.45 167.25 18 128 18ZM128 30c31.44 0 58 13.74 58 30 0 16.26-26.56 30-58 30C96.56 90 70 76.26 70 60 70 43.74 96.56 30 128 30ZM128 226C96.56 226 70 212.26 70 196v-112.19C82.48 94.87 103.59 102 128 102c24.41 0 45.52-7.13 58-18.19v112.19c0 16.26-26.56 30-58 30Z"),
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
        return _cylinder!!
    }

private var _cylinder: ImageVector? = null
