package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ScribbleLoop: ImageVector
    get() {
        if (_scribbleLoop != null) return _scribbleLoop!!
        _scribbleLoop = phosphorThinIcon(
            name = "ScribbleLoop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M251 157.32c-1.32-1.46-24.47-26.63-61.79-40.43C187.95 98.33 181.43 81.44 170.55 68.76 156.62 52.56 136.38 44 112 44 62.51 44 30.1 88.58 28.74 90.48c-1.284 1.798-.868 4.296 .93 5.58 1.798 1.284 4.296 .868 5.58-.93C35.56 94.7 66.68 52 112 52c22 0 40.11 7.6 52.45 22 9.11 10.61 14.81 24.62 16.46 40.13C167.852 110.1 154.266 108.034 140.6 108c-25.1 0-46.09 6.48-60.69 18.75C67.26 137.39 60 152.15 60 167.25c-.121 11.686 4.45 22.932 12.69 31.22C81.59 207.32 94 212 108.6 212c51.63 0 79.87-44.08 80.78-86.32 34.07 13.58 55.36 36.67 55.65 37 1.48 1.64 4.01 1.77 5.65 .29 1.64-1.48 1.77-4.01 .29-5.65ZM162.6 178.79C153.23 190.29 136.26 204 108.6 204 80.71 204 68 185 68 167.25 68 142.57 90.72 116 140.6 116c13.875 .052 27.652 2.338 40.8 6.77v.81c0 20.42-6.86 40.52-18.83 55.21Z"),
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
        return _scribbleLoop!!
    }

private var _scribbleLoop: ImageVector? = null
