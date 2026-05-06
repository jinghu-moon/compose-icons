package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Rug: ImageVector
    get() {
        if (_rug != null) return _rug!!
        _rug = phosphorThinIcon(
            name = "Rug",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 20c-2.209 0-4 1.791-4 4v20h-40v-20c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v20h-40v-20c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v20h-40v-20c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v208c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-20h40v20c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-20h40v20c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-20h40v20c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-208c0-2.209-1.791-4-4-4ZM60 52h136v152h-136ZM128 172c1.405 0 2.707-.736 3.43-1.94l24-40c.762-1.268 .762-2.852 0-4.12l-24-40c-.723-1.205-2.025-1.942-3.43-1.942-1.405 0-2.707 .737-3.43 1.942l-24 40c-.762 1.268-.762 2.852 0 4.12l24 40c.723 1.204 2.025 1.94 3.43 1.94ZM128 95.77 147.33 128 128 160.23 108.67 128Z"),
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
        return _rug!!
    }

private var _rug: ImageVector? = null
