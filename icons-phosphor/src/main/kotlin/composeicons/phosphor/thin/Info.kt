package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Info: ImageVector
    get() {
        if (_info != null) return _info!!
        _info = phosphorThinIcon(
            name = "Info",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M140 176c0 2.209-1.791 4-4 4-6.627 0-12-5.373-12-12v-40c0-2.209-1.791-4-4-4-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4 6.627 0 12 5.373 12 12v40c0 2.209 1.791 4 4 4 2.209 0 4 1.791 4 4ZM124 92c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM228 128c0 55.228-44.772 100-100 100C72.772 228 28 183.228 28 128 28 72.772 72.772 28 128 28c55.203 .061 99.939 44.797 100 100ZM220 128C220 77.19 178.81 36 128 36 77.19 36 36 77.19 36 128c0 50.81 41.19 92 92 92 50.787-.055 91.945-41.213 92-92Z"),
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
        return _info!!
    }

private var _info: ImageVector? = null
