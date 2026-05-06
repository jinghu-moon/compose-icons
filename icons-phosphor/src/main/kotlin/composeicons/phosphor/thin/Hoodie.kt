package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Hoodie: ImageVector
    get() {
        if (_hoodie != null) return _hoodie!!
        _hoodie = phosphorThinIcon(
            name = "Hoodie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M234 122.75 179.71 41.34c-2.229-3.342-5.983-5.346-10-5.34h-83.44c-4.017-.006-7.771 1.998-10 5.34L22 122.75c-1.929 2.888-2.513 6.469-1.6 9.82l21.44 78.59c1.426 5.224 6.175 8.846 11.59 8.84h26.57c6.627 0 12-5.373 12-12v-20h72v20c0 6.627 5.373 12 12 12h26.57c5.408-.003 10.146-3.623 11.57-8.84l21.44-78.59c.919-3.348 .342-6.929-1.58-9.82ZM80 180c-2.209 0-4-1.791-4-4v-114l32 18.86v55.14c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-50.43l10 5.88c1.253 .738 2.807 .738 4.06 0l10-5.88v42.43c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-47.15L180 62v114c0 2.209-1.791 4-4 4ZM82.94 45.78c.742-1.113 1.992-1.781 3.33-1.78h83.46c1.338-.001 2.588 .667 3.33 1.78l5.27 7.91L128 83.36 77.67 53.69ZM84 208c0 2.209-1.791 4-4 4h-26.57c-1.801-.004-3.377-1.212-3.85-2.95L28.14 130.46c-.304-1.115-.111-2.308 .53-3.27L68 68.2v107.8c0 6.627 5.373 12 12 12h4ZM227.86 130.46l-21.44 78.59c-.473 1.738-2.049 2.946-3.85 2.95h-26.57c-2.209 0-4-1.791-4-4v-20h4c6.627 0 12-5.373 12-12v-107.8l39.33 59c.638 .96 .831 2.148 .53 3.26Z"),
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
        return _hoodie!!
    }

private var _hoodie: ImageVector? = null
