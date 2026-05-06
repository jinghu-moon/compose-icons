package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TrolleySuitcase: ImageVector
    get() {
        if (_trolleySuitcase != null) return _trolleySuitcase!!
        _trolleySuitcase = phosphorThinIcon(
            name = "TrolleySuitcase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M88 156h128c6.627 0 12-5.373 12-12v-72c0-6.627-5.373-12-12-12h-36v-20c0-6.627-5.373-12-12-12h-32c-6.627 0-12 5.373-12 12v20h-36C81.373 60 76 65.373 76 72v72c0 6.627 5.373 12 12 12ZM132 40c0-2.209 1.791-4 4-4h32c2.209 0 4 1.791 4 4v20h-40ZM84 72c0-2.209 1.791-4 4-4h128c2.209 0 4 1.791 4 4v72c0 2.209-1.791 4-4 4h-128c-2.209 0-4-1.791-4-4ZM84 224c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM228 224c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM244 184c0 2.209-1.791 4-4 4h-208c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h12v-104.69c.001-1.061-.42-2.079-1.17-2.83L21.17 50.83c-1.563-1.563-1.563-4.097 0-5.66 1.563-1.563 4.097-1.563 5.66 0L48.49 66.83c2.247 2.25 3.51 5.3 3.51 8.48v104.69h188c2.209 0 4 1.791 4 4Z"),
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
        return _trolleySuitcase!!
    }

private var _trolleySuitcase: ImageVector? = null
