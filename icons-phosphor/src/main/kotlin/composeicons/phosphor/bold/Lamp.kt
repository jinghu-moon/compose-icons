package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Lamp: ImageVector
    get() {
        if (_lamp != null) return _lamp!!
        _lamp = phosphorBoldIcon(
            name = "Lamp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M251 147.27 203 35.27C201.112 30.869 196.789 28.011 192 28h-128c-4.789 .011-9.112 2.869-11 7.27L5 147.27c-1.588 3.703-1.212 7.956 1.002 11.323 2.214 3.367 5.969 5.398 9.998 5.407h100v40h-20c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h64c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-20v-40h48v28c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-28h28c4.029-.01 7.785-2.041 9.998-5.407 2.214-3.367 2.59-7.62 1.002-11.323ZM34.2 140 71.91 52h112.18l37.71 88Z"),
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
        return _lamp!!
    }

private var _lamp: ImageVector? = null
