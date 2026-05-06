package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Trademark: ImageVector
    get() {
        if (_trademark != null) return _trademark!!
        _trademark = phosphorThinIcon(
            name = "Trademark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM128 220C77.19 220 36 178.81 36 128 36 77.19 77.19 36 128 36c50.81 0 92 41.19 92 92-.055 50.787-41.213 91.945-92 92ZM108 104c0 2.209-1.791 4-4 4h-12v44c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-44h-12c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h32c2.209 0 4 1.791 4 4ZM188 104v48c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-37.35l-21 24c-.759 .861-1.852 1.354-3 1.354-1.148 0-2.241-.493-3-1.354L132 114.65v37.35c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-48c.007-1.661 1.039-3.145 2.593-3.729 1.555-.584 3.308-.147 4.407 1.099l25 28.56 25-28.56c1.098-1.246 2.852-1.683 4.407-1.099 1.555 .584 2.587 2.068 2.593 3.729Z"),
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
        return _trademark!!
    }

private var _trademark: ImageVector? = null
