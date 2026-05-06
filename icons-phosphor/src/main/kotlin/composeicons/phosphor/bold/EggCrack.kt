package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.EggCrack: ImageVector
    get() {
        if (_eggCrack != null) return _eggCrack!!
        _eggCrack = phosphorBoldIcon(
            name = "EggCrack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M190 57.34C171.06 29 147.88 12 128 12 108.12 12 84.94 29 66 57.34 46.94 86 36 120.46 36 152c0 50.81 41.19 92 92 92 50.81 0 92-41.19 92-92C220 120.46 209.06 86 190 57.34ZM128 220C90.461 219.961 60.039 189.539 60 152 60 90.88 106.19 36 128 36c7.59 0 18.13 6.65 28.64 17.88L119.05 96c-2.797 3.129-3.756 7.492-2.529 11.505 1.227 4.013 4.461 7.094 8.529 8.125l20.9 5.23-5.76 28.78c-.624 3.122 .018 6.363 1.785 9.011 1.767 2.648 4.513 4.486 7.635 5.109 .786 .161 1.587 .241 2.39 .24 5.719-.004 10.64-4.042 11.76-9.65l8-40c1.259-6.284-2.642-12.448-8.86-14L150.16 97.16l21.4-24C185.2 94.34 196 122.44 196 152c-.039 37.539-30.461 67.961-68 68Z"),
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
        return _eggCrack!!
    }

private var _eggCrack: ImageVector? = null
