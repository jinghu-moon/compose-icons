package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TrademarkRegistered: ImageVector
    get() {
        if (_trademarkRegistered != null) return _trademarkRegistered!!
        _trademarkRegistered = phosphorBoldIcon(
            name = "TrademarkRegistered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM128 212C81.608 212 44 174.392 44 128 44 81.608 81.608 44 128 44c46.392 0 84 37.608 84 84-.05 46.371-37.629 83.95-84 84ZM156.7 141.42c12.815-9.037 18.306-25.33 13.575-40.28C165.545 86.189 151.681 76.021 136 76h-32C97.373 76 92 81.373 92 88v80c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-20h16.24L150 174.66c3.678 5.523 11.137 7.018 16.66 3.34 5.523-3.678 7.018-11.137 3.34-16.66ZM116 100h20c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-20Z"),
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
        return _trademarkRegistered!!
    }

private var _trademarkRegistered: ImageVector? = null
