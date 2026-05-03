package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ChatTeardropDots: ImageVector
    get() {
        if (_chatTeardropDots != null) return _chatTeardropDots!!
        _chatTeardropDots = phosphorDuotoneIcon(
            name = "ChatTeardropDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 224.000 124.000 L 224.000 124.000 C 224.000 174.810 182.810 216.000 132.000 216.000 L 48.000 216.000 C 43.582 216.000 40.000 212.418 40.000 208.000 L 40.000 124.000 C 40.000 73.190 81.190 32.000 132.000 32.000 L 132.000 32.000 C 182.810 32.000 224.000 73.190 224.000 124.000 Z"),
            pathFillType = PathFillType.NonZero,
            fill = SolidColor(Color(0xFF000000)),
            fillAlpha = 1.0f,
            stroke = null,
            strokeAlpha = 1.0f,
            strokeLineWidth = 0.0f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
        )
    }
    addPath(
        pathData = parseSvgPathData("M 132.000 24.000 C 76.797 24.061 32.061 68.797 32.000 124.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 132.000 224.000 C 187.228 224.000 232.000 179.228 232.000 124.000 C 232.000 68.772 187.228 24.000 132.000 24.000 ZM 132.000 208.000 L 48.000 208.000 L 48.000 124.000 C 48.000 77.608 85.608 40.000 132.000 40.000 C 178.392 40.000 216.000 77.608 216.000 124.000 C 216.000 170.392 178.392 208.000 132.000 208.000 ZM 144.000 128.000 C 144.000 134.627 138.627 140.000 132.000 140.000 C 125.373 140.000 120.000 134.627 120.000 128.000 C 120.000 121.373 125.373 116.000 132.000 116.000 C 138.627 116.000 144.000 121.373 144.000 128.000 ZM 100.000 128.000 C 100.000 134.627 94.627 140.000 88.000 140.000 C 81.373 140.000 76.000 134.627 76.000 128.000 C 76.000 121.373 81.373 116.000 88.000 116.000 C 94.627 116.000 100.000 121.373 100.000 128.000 ZM 188.000 128.000 C 188.000 134.627 182.627 140.000 176.000 140.000 C 169.373 140.000 164.000 134.627 164.000 128.000 C 164.000 121.373 169.373 116.000 176.000 116.000 C 182.627 116.000 188.000 121.373 188.000 128.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _chatTeardropDots!!
    }

private var _chatTeardropDots: ImageVector? = null
