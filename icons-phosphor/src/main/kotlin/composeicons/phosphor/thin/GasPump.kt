package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GasPump: ImageVector
    get() {
        if (_gasPump != null) return _gasPump!!
        _gasPump = phosphorThinIcon(
            name = "GasPump",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M238.14 72.49 218.83 53.17c-1.563-1.563-4.097-1.563-5.66 0-1.563 1.563-1.563 4.097 0 5.66l19.32 19.31c2.25 2.252 3.512 5.306 3.51 8.49v81.37c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-40c0-11.046-8.954-20-20-20h-20v-52C172 44.954 163.046 36 152 36h-80C60.954 36 52 44.954 52 56v156h-20c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h160c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-20v-96h20c6.627 0 12 5.373 12 12v40c0 11.046 8.954 20 20 20 11.046 0 20-8.954 20-20v-81.37c.015-5.307-2.095-10.4-5.86-14.14ZM60 212v-156C60 49.373 65.373 44 72 44h80c6.627 0 12 5.373 12 12v156ZM140 112c0 2.209-1.791 4-4 4h-48c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h48c2.209 0 4 1.791 4 4Z"),
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
        return _gasPump!!
    }

private var _gasPump: ImageVector? = null
