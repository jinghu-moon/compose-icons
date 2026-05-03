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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 128.000 212.000 C 81.608 212.000 44.000 174.392 44.000 128.000 C 44.000 81.608 81.608 44.000 128.000 44.000 C 174.392 44.000 212.000 81.608 212.000 128.000 C 211.950 174.371 174.371 211.950 128.000 212.000 ZM 156.700 141.420 C 169.515 132.383 175.006 116.090 170.275 101.140 C 165.545 86.189 151.681 76.021 136.000 76.000 L 104.000 76.000 C 97.373 76.000 92.000 81.373 92.000 88.000 L 92.000 168.000 C 92.000 174.627 97.373 180.000 104.000 180.000 C 110.627 180.000 116.000 174.627 116.000 168.000 L 116.000 148.000 L 132.240 148.000 L 150.000 174.660 C 153.678 180.183 161.137 181.678 166.660 178.000 C 172.183 174.322 173.678 166.863 170.000 161.340 ZM 116.000 100.000 L 136.000 100.000 C 142.627 100.000 148.000 105.373 148.000 112.000 C 148.000 118.627 142.627 124.000 136.000 124.000 L 116.000 124.000 Z"),
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
        return _trademarkRegistered!!
    }

private var _trademarkRegistered: ImageVector? = null
