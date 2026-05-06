package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Tote: ImageVector
    get() {
        if (_tote != null) return _tote!!
        _tote = phosphorThinIcon(
            name = "Tote",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M233 72.06C230.694 69.469 227.388 67.991 223.92 68h-51.92v-4C172 39.699 152.301 20 128 20 103.699 20 84 39.699 84 64v4h-51.92C28.612 67.991 25.306 69.469 23 72.06c-2.266 2.556-3.336 5.957-2.94 9.35l14.26 120c.718 6.071 5.886 10.632 12 10.59h163.35c6.114 .042 11.282-4.519 12-10.59l14.26-120c.398-3.392-.667-6.792-2.93-9.35ZM92 64C92 44.118 108.118 28 128 28c19.882 0 36 16.118 36 36v4h-72ZM228 80.46 213.75 200.46c-.237 2.047-1.99 3.579-4.05 3.54h-163.37c-2.041 .014-3.765-1.512-4-3.54L28 80.46c-.132-1.126 .233-2.254 1-3.09 .781-.879 1.904-1.379 3.08-1.37h51.92v28c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-28h72v28c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-28h51.92c1.176-.009 2.299 .491 3.08 1.37 .767 .836 1.132 1.964 1 3.09Z"),
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
        return _tote!!
    }

private var _tote: ImageVector? = null
