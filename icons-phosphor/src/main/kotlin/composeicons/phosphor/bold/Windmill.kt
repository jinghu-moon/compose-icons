package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Windmill: ImageVector
    get() {
        if (_windmill != null) return _windmill!!
        _windmill = phosphorBoldIcon(
            name = "Windmill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 220h-37.59l-4.72-33c8.95 2.978 18.764-.701 23.55-8.83l12-20.33c2.697-4.573 3.465-10.03 2.135-15.17-1.33-5.14-4.649-9.539-9.225-12.23L178.58 111.86 217.24 46.18c2.694-4.571 3.462-10.025 2.134-15.162-1.328-5.137-4.642-9.536-9.214-12.228L189.82 6.79C185.248 4.096 179.793 3.33 174.656 4.66c-5.137 1.33-9.535 4.647-12.226 9.22L143.84 45.43 78.15 6.77C73.578 4.076 68.123 3.31 62.986 4.64 57.849 5.97 53.451 9.286 50.76 13.86l-12 20.33c-2.697 4.573-3.465 10.03-2.135 15.17 1.33 5.14 4.649 9.539 9.225 12.23L77.43 80.17 38.77 145.85c-2.694 4.571-3.462 10.025-2.134 15.162 1.328 5.137 4.642 9.536 9.214 12.228l20.34 12c2.446 1.446 5.174 2.35 8 2.65L69.59 220h-37.59c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h192c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM186.59 162.53 124.33 125.89l7.93-13.46 62.26 36.65ZM181.07 29.53l13.46 7.93L157.89 99.67 144.43 91.75ZM69.41 29.53l62.26 36.64-7.93 13.46L61.48 42.93ZM61.47 154.59 98.11 92.34l13.46 7.92L74.93 162.52ZM101.81 164.15l10.35-17.57L155.3 172l6.86 48h-68.32Z"),
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
        return _windmill!!
    }

private var _windmill: ImageVector? = null
