package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Prescription: ImageVector
    get() {
        if (_prescription != null) return _prescription!!
        _prescription = phosphorThinIcon(
            name = "Prescription",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M177.66 188l25.17-25.17c1.563-1.563 1.563-4.097 0-5.66-1.563-1.563-4.097-1.563-5.66 0L172 182.34 121.66 132h2.34c26.51 0 48-21.49 48-48C172 57.49 150.51 36 124 36h-52c-2.209 0-4 1.791-4 4v152c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-60h34.34l56 56-25.17 25.17c-1.563 1.563-1.563 4.097 0 5.66 1.563 1.563 4.097 1.563 5.66 0L172 193.66l25.17 25.17c1.563 1.563 4.097 1.563 5.66 0 1.563-1.563 1.563-4.097 0-5.66ZM76 44h48c22.091 0 40 17.909 40 40 0 22.091-17.909 40-40 40h-48Z"),
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
        return _prescription!!
    }

private var _prescription: ImageVector? = null
