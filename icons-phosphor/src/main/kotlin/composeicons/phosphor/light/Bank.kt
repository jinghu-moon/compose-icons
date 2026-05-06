package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Bank: ImageVector
    get() {
        if (_bank != null) return _bank!!
        _bank = phosphorLightIcon(
            name = "Bank",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M24 102h26v68h-18c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h192c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-18v-68h26c2.684-.002 5.039-1.786 5.769-4.368 .73-2.582-.344-5.335-2.629-6.742l-104-64c-1.926-1.183-4.354-1.183-6.28 0l-104 64c-2.286 1.406-3.359 4.159-2.629 6.742 .73 2.582 3.086 4.366 5.769 4.368ZM62 102h36v68h-36ZM146 102v68h-36v-68ZM194 170h-36v-68h36ZM128 39l82.8 51h-165.6ZM246 208c0 3.314-2.686 6-6 6h-224c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h224c3.314 0 6 2.686 6 6Z"),
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
        return _bank!!
    }

private var _bank: ImageVector? = null
