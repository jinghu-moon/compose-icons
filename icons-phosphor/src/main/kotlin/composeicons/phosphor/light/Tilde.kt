package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Tilde: ImageVector
    get() {
        if (_tilde != null) return _tilde!!
        _tilde = phosphorLightIcon(
            name = "Tilde",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220.68 129.34c-14.17 17.62-28.06 26.92-42.46 28.44-1.402 .146-2.81 .22-4.22 .22-18.64 0-34.44-12.87-49.76-25.35C108.92 120.17 94.57 108.51 79 110.16c-11.06 1.16-22.3 9-34.36 24-2.077 2.585-5.855 2.997-8.44 .92-2.585-2.077-2.997-5.855-.92-8.44C49.45 109.03 63.34 99.72 77.74 98.21c20.52-2.18 37.54 11.7 54 25.12C147 135.76 161.42 147.48 177 145.84c11.06-1.16 22.3-9 34.36-24 2.077-2.585 5.855-2.997 8.44-.92 2.585 2.077 2.997 5.855 .92 8.44Z"),
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
        return _tilde!!
    }

private var _tilde: ImageVector? = null
