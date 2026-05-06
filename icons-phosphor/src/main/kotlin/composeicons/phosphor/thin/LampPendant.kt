package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LampPendant: ImageVector
    get() {
        if (_lampPendant != null) return _lampPendant!!
        _lampPendant = phosphorThinIcon(
            name = "LampPendant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172 77.34v-5.34c0-6.627-5.373-12-12-12h-28v-44c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v44h-28C89.373 60 84 65.373 84 72v5.34C45.019 94.66 19.924 133.344 20 176c0 2.209 1.791 4 4 4h68v4c0 19.882 16.118 36 36 36 19.882 0 36-16.118 36-36v-4h68c2.209 0 4-1.791 4-4 .076-42.656-25.019-81.34-64-98.66ZM156 184c0 15.464-12.536 28-28 28-15.464 0-28-12.536-28-28v-4h56ZM28.08 172C29.568 133.081 53.567 98.587 89.54 83.66 91.019 83.043 91.987 81.603 92 80v-8c0-2.209 1.791-4 4-4h64c2.209 0 4 1.791 4 4v8c.001 1.614 .971 3.069 2.46 3.69 35.964 14.922 59.96 49.402 61.46 88.31Z"),
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
        return _lampPendant!!
    }

private var _lampPendant: ImageVector? = null
