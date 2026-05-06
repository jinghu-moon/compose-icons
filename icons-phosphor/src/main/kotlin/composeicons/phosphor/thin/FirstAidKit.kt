package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FirstAidKit: ImageVector
    get() {
        if (_firstAidKit != null) return _firstAidKit!!
        _firstAidKit = phosphorThinIcon(
            name = "FirstAidKit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 60h-44v-12C172 36.954 163.046 28 152 28h-48C92.954 28 84 36.954 84 48v12h-44C33.373 60 28 65.373 28 72v128c0 6.627 5.373 12 12 12h176c6.627 0 12-5.373 12-12v-128c0-6.627-5.373-12-12-12ZM92 48c0-6.627 5.373-12 12-12h48c6.627 0 12 5.373 12 12v12h-72ZM220 200c0 2.209-1.791 4-4 4h-176c-2.209 0-4-1.791-4-4v-128c0-2.209 1.791-4 4-4h176c2.209 0 4 1.791 4 4ZM156 136c0 2.209-1.791 4-4 4h-20v20c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-20h-20c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h20v-20c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v20h20c2.209 0 4 1.791 4 4Z"),
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
        return _firstAidKit!!
    }

private var _firstAidKit: ImageVector? = null
