package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CarBattery: ImageVector
    get() {
        if (_carBattery != null) return _carBattery!!
        _carBattery = phosphorThinIcon(
            name = "CarBattery",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M188 136c0 2.209-1.791 4-4 4h-12v12c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-12h-12c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h12v-12c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v12h12c2.209 0 4 1.791 4 4ZM104 132h-32c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h32c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM236 88v96c0 6.627-5.373 12-12 12h-192c-6.627 0-12-5.373-12-12v-96C20 81.373 25.373 76 32 76h20v-20C52 49.373 57.373 44 64 44h32c6.627 0 12 5.373 12 12v20h40v-20c0-6.627 5.373-12 12-12h32c6.627 0 12 5.373 12 12v20h20c6.627 0 12 5.373 12 12ZM156 76h40v-20c0-2.209-1.791-4-4-4h-32c-2.209 0-4 1.791-4 4ZM60 76h40v-20c0-2.209-1.791-4-4-4h-32c-2.209 0-4 1.791-4 4ZM228 88c0-2.209-1.791-4-4-4h-192c-2.209 0-4 1.791-4 4v96c0 2.209 1.791 4 4 4h192c2.209 0 4-1.791 4-4Z"),
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
        return _carBattery!!
    }

private var _carBattery: ImageVector? = null
