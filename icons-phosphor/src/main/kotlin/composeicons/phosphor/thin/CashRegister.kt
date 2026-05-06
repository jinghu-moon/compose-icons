package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CashRegister: ImageVector
    get() {
        if (_cashRegister != null) return _cashRegister!!
        _cashRegister = phosphorThinIcon(
            name = "CashRegister",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.88 159 213.4 69.09C212.064 63.745 207.26 59.996 201.75 60h-69.75v-20c0-6.627-5.373-12-12-12h-40C73.373 28 68 33.373 68 40v20h-13.75c-5.51-.004-10.314 3.745-11.65 9.09L20.12 159c-.082 .327-.122 .663-.12 1v32c0 6.627 5.373 12 12 12h192c6.627 0 12-5.373 12-12v-32c.002-.337-.038-.673-.12-1ZM76 40c0-2.209 1.791-4 4-4h40c2.209 0 4 1.791 4 4v20h-48ZM50.37 71c.457-1.769 2.053-3.003 3.88-3h147.5c1.827-.003 3.423 1.231 3.88 3l21.25 85h-197.76ZM224 196h-192c-2.209 0-4-1.791-4-4v-28h200v28c0 2.209-1.791 4-4 4ZM68 96c0-2.209 1.791-4 4-4h16c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-16c-2.209 0-4-1.791-4-4ZM116 96c0-2.209 1.791-4 4-4h16c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-16c-2.209 0-4-1.791-4-4ZM164 96c0-2.209 1.791-4 4-4h16c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-16c-2.209 0-4-1.791-4-4ZM68 128c0-2.209 1.791-4 4-4h16c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-16c-2.209 0-4-1.791-4-4ZM116 128c0-2.209 1.791-4 4-4h16c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-16c-2.209 0-4-1.791-4-4ZM164 128c0-2.209 1.791-4 4-4h16c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-16c-2.209 0-4-1.791-4-4Z"),
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
        return _cashRegister!!
    }

private var _cashRegister: ImageVector? = null
