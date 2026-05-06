package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Barcode: ImageVector
    get() {
        if (_barcode != null) return _barcode!!
        _barcode = phosphorBoldIcon(
            name = "Barcode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 52v40c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-28h-28c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h40c6.627 0 12 5.373 12 12ZM76 192h-28v-28c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v40c0 6.627 5.373 12 12 12h40c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM220 152c-6.627 0-12 5.373-12 12v28h-28c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h40c6.627 0 12-5.373 12-12v-40c0-6.627-5.373-12-12-12ZM36 104c6.627 0 12-5.373 12-12v-28h28c6.627 0 12-5.373 12-12C88 45.373 82.627 40 76 40h-40C29.373 40 24 45.373 24 52v40c0 6.627 5.373 12 12 12ZM88 80C81.373 80 76 85.373 76 92v72c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-72C100 85.373 94.627 80 88 80ZM180 164v-72c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v72c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12ZM128 80c-6.627 0-12 5.373-12 12v72c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-72c0-6.627-5.373-12-12-12Z"),
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
        return _barcode!!
    }

private var _barcode: ImageVector? = null
