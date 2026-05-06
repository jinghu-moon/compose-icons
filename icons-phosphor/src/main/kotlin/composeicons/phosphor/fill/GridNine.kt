package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GridNine: ImageVector
    get() {
        if (_gridNine != null) return _gridNine!!
        _gridNine = phosphorFillIcon(
            name = "GridNine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M84 52v40h-56c-2.209 0-4-1.791-4-4v-24C24 55.163 31.163 48 40 48h40c2.209 0 4 1.791 4 4ZM100 204c0 2.209 1.791 4 4 4h48c2.209 0 4-1.791 4-4v-40h-56ZM24 168v24c0 8.837 7.163 16 16 16h40c2.209 0 4-1.791 4-4v-40h-56c-2.209 0-4 1.791-4 4ZM24 112v32c0 2.209 1.791 4 4 4h56v-40h-56c-2.209 0-4 1.791-4 4ZM152 48h-48c-2.209 0-4 1.791-4 4v40h56v-40c0-2.209-1.791-4-4-4ZM228 108h-56v40h56c2.209 0 4-1.791 4-4v-32c0-2.209-1.791-4-4-4ZM100 148h56v-40h-56ZM216 48h-40c-2.209 0-4 1.791-4 4v40h56c2.209 0 4-1.791 4-4v-24c0-8.837-7.163-16-16-16ZM228 164h-56v40c0 2.209 1.791 4 4 4h40c8.837 0 16-7.163 16-16v-24c0-2.209-1.791-4-4-4Z"),
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
        return _gridNine!!
    }

private var _gridNine: ImageVector? = null
