package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Towel: ImageVector
    get() {
        if (_towel != null) return _towel!!
        _towel = phosphorThinIcon(
            name = "Towel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 28h-128C60.954 28 52 36.954 52 48v168c0 6.627 5.373 12 12 12h112c6.627 0 12-5.373 12-12v-168c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v104c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-104C220 36.954 211.046 28 200 28ZM72 36h112c-2.606 3.457-4.01 7.671-4 12v140h-120v-140C60 41.373 65.373 36 72 36ZM176 220h-112c-2.209 0-4-1.791-4-4v-20h120v20c0 2.209-1.791 4-4 4Z"),
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
        return _towel!!
    }

private var _towel: ImageVector? = null
