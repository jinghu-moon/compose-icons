package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SuitcaseRolling: ImageVector
    get() {
        if (_suitcaseRolling != null) return _suitcaseRolling!!
        _suitcaseRolling = phosphorBoldIcon(
            name = "SuitcaseRolling",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M116 96v80c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-80c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM140 96v80c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-80c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12ZM212 64v144c0 11.046-8.954 20-20 20h-12v12c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-12h-56v12c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-12h-12C52.954 228 44 219.046 44 208v-144C44 52.954 52.954 44 64 44h20v-16C84 12.536 96.536 0 112 0h32c15.464 0 28 12.536 28 28v16h20c11.046 0 20 8.954 20 20ZM108 44h40v-16c0-2.209-1.791-4-4-4h-32c-2.209 0-4 1.791-4 4ZM188 68h-120v136h120Z"),
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
        return _suitcaseRolling!!
    }

private var _suitcaseRolling: ImageVector? = null
