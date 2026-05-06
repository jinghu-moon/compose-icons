package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HardDrive: ImageVector
    get() {
        if (_hardDrive != null) return _hardDrive!!
        _hardDrive = phosphorThinIcon(
            name = "HardDrive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 68h-192C25.373 68 20 73.373 20 80v96c0 6.627 5.373 12 12 12h192c6.627 0 12-5.373 12-12v-96c0-6.627-5.373-12-12-12ZM228 176c0 2.209-1.791 4-4 4h-192c-2.209 0-4-1.791-4-4v-96c0-2.209 1.791-4 4-4h192c2.209 0 4 1.791 4 4ZM196 128c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _hardDrive!!
    }

private var _hardDrive: ImageVector? = null
