package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ScribbleLoop: ImageVector
    get() {
        if (_scribbleLoop != null) return _scribbleLoop!!
        _scribbleLoop = phosphorBoldIcon(
            name = "ScribbleLoop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M252.9 152c-1.33-1.47-23.75-25.85-60.21-40.69C190.54 93.03 183.59 76.41 172.59 63.6 157.12 45.52 134.79 36 108 36 54.44 36 19.69 83.79 18.24 85.82c-3.866 5.393-2.628 12.899 2.765 16.765 5.393 3.866 12.899 2.628 16.765-2.765C38.05 99.38 66.65 60 108 60c19.85 0 35.45 6.45 46.38 19.18 5.865 6.979 10.101 15.178 12.4 24C156.864 101.058 146.751 99.992 136.61 100c-27 0-49.79 7.13-65.85 20.63C56.3 132.79 48 149.78 48 167.25 48 193.46 67.44 220 104.61 220c51.93 0 82.34-40.28 87.87-82.43 15.819 7.692 30.228 17.996 42.62 30.48 2.795 3.445 7.263 5.066 11.617 4.216 4.354-.85 7.884-4.033 9.178-8.276 1.295-4.243 .142-8.854-2.996-11.99ZM152.37 173.74C144.09 183.9 129.09 196 104.61 196 82.08 196 72 181.56 72 167.25 72 146.42 92.22 124 136.61 124c11.041 .029 22.025 1.584 32.64 4.62-1.01 16.82-7.04 33.04-16.88 45.12Z"),
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
