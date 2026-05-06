package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Checkerboard: ImageVector
    get() {
        if (_checkerboard != null) return _checkerboard!!
        _checkerboard = phosphorThinIcon(
            name = "Checkerboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 36h-160C41.373 36 36 41.373 36 48v160c0 6.627 5.373 12 12 12h160c6.627 0 12-5.373 12-12v-160c0-6.627-5.373-12-12-12ZM193.66 124 132 62.34v-18.34h18.34L212 105.66v18.34ZM132 73.66 182.34 124h-50.34ZM212 48v46.34L161.66 44h46.34c2.209 0 4 1.791 4 4ZM48 44h76v80h-80v-76c0-2.209 1.791-4 4-4ZM105.66 212 44 150.34v-18.34h18.34L124 193.66v18.34ZM124 182.34 73.66 132h50.34ZM44 208v-46.34L94.34 212h-46.34c-2.209 0-4-1.791-4-4ZM208 212h-76v-80h80v76c0 2.209-1.791 4-4 4Z"),
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
        return _checkerboard!!
    }

private var _checkerboard: ImageVector? = null
