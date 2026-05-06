package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Champagne: ImageVector
    get() {
        if (_champagne != null) return _champagne!!
        _champagne = phosphorLightIcon(
            name = "Champagne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M142.26 10h-44.61c-2.577 .023-4.851 1.69-5.65 4.14C90.53 18.65 56.47 124.87 86.15 165.71c6.75 9.28 16.1 14.62 27.86 15.95v52.34h-18.01c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h48c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-18v-52.34c11.76-1.33 21.11-6.67 27.85-15.95C183.53 124.87 149.48 18.65 148.01 14.14 147.2 11.655 144.874 9.98 142.26 10ZM102.08 22h35.75c2.24 7.48 7 24.29 10.75 44h-57.24C95.09 46.29 99.85 29.48 102.08 22ZM144.08 158.66C138.55 166.29 130.66 170 120 170c-10.66 0-18.6-3.71-24.14-11.34C85.46 144.42 83.21 116.55 89.25 78h61.42c6.04 38.55 3.78 66.42-6.57 80.66ZM230 52c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM206 20c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM206 100c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10Z"),
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
        return _champagne!!
    }

private var _champagne: ImageVector? = null
