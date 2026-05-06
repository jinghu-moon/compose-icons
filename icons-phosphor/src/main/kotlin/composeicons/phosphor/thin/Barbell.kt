package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Barbell: ImageVector
    get() {
        if (_barbell != null) return _barbell!!
        _barbell = phosphorThinIcon(
            name = "Barbell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 124h-12v-36c0-6.627-5.373-12-12-12h-20v-12c0-6.627-5.373-12-12-12h-24c-6.627 0-12 5.373-12 12v60h-56v-60C100 57.373 94.627 52 88 52h-24C57.373 52 52 57.373 52 64v12h-20C25.373 76 20 81.373 20 88v36h-12c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h12v36c0 6.627 5.373 12 12 12h20v12c0 6.627 5.373 12 12 12h24c6.627 0 12-5.373 12-12v-60h56v60c0 6.627 5.373 12 12 12h24c6.627 0 12-5.373 12-12v-12h20c6.627 0 12-5.373 12-12v-36h12c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM32 172c-2.209 0-4-1.791-4-4v-80c0-2.209 1.791-4 4-4h20v88ZM92 192c0 2.209-1.791 4-4 4h-24c-2.209 0-4-1.791-4-4v-128c0-2.209 1.791-4 4-4h24c2.209 0 4 1.791 4 4ZM196 192c0 2.209-1.791 4-4 4h-24c-2.209 0-4-1.791-4-4v-128c0-2.209 1.791-4 4-4h24c2.209 0 4 1.791 4 4ZM228 168c0 2.209-1.791 4-4 4h-20v-88h20c2.209 0 4 1.791 4 4Z"),
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
        return _barbell!!
    }

private var _barbell: ImageVector? = null
