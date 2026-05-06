package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NuclearPlant: ImageVector
    get() {
        if (_nuclearPlant != null) return _nuclearPlant!!
        _nuclearPlant = phosphorThinIcon(
            name = "NuclearPlant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 36h24c6.627 0 12-5.373 12-12 0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4 0 11.046-8.954 20-20 20h-24c-6.627 0-12 5.373-12 12 0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4 0-11.046 8.954-20 20-20ZM104 60c2.209 0 4-1.791 4-4 .028-24.289 19.711-43.972 44-44h8c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-8c-28.705 .033-51.967 23.295-52 52 0 2.209 1.791 4 4 4ZM244 216c0 2.209-1.791 4-4 4h-224c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h19.21C49.42 183.79 66.15 141.35 67.86 95.49 68.098 89.05 73.406 83.963 79.85 84h88.33c6.422-.007 11.711 5.044 12 11.46 2.21 50.34 25.71 97 37 116.54h22.82c2.209 0 4 1.791 4 4ZM171.85 212c-14.14-28.88-30-70.85-31.7-116.21-.112-2.127-1.87-3.793-4-3.79h-56.3c-2.13-.003-3.888 1.663-4 3.79C74.16 141.15 58.29 183.12 44.15 212ZM207.94 212C195.77 190 174.32 144.7 172.17 95.81c-.102-2.135-1.863-3.812-4-3.81h-20.68c.391 1.124 .61 2.301 .65 3.49 1.71 45.86 18.44 88.3 32.65 116.51Z"),
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
        return _nuclearPlant!!
    }

private var _nuclearPlant: ImageVector? = null
