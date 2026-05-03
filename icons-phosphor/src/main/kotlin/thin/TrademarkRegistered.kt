package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TrademarkRegistered: ImageVector
    get() {
        if (_trademarkRegistered != null) return _trademarkRegistered!!
        _trademarkRegistered = phosphorThinIcon(
            name = "TrademarkRegistered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 128.000 220.000 C 77.190 220.000 36.000 178.810 36.000 128.000 C 36.000 77.190 77.190 36.000 128.000 36.000 C 178.810 36.000 220.000 77.190 220.000 128.000 C 219.945 178.787 178.787 219.945 128.000 220.000 ZM 145.120 138.470 C 158.049 134.011 165.865 120.865 163.607 107.376 C 161.348 93.888 149.676 84.004 136.000 84.000 L 104.000 84.000 C 101.791 84.000 100.000 85.791 100.000 88.000 L 100.000 168.000 C 100.000 170.209 101.791 172.000 104.000 172.000 C 106.209 172.000 108.000 170.209 108.000 168.000 L 108.000 140.000 L 136.520 140.000 L 156.670 170.230 C 157.896 172.069 160.381 172.566 162.220 171.340 C 164.059 170.114 164.556 167.629 163.330 165.790 ZM 108.000 92.000 L 136.000 92.000 C 147.046 92.000 156.000 100.954 156.000 112.000 C 156.000 123.046 147.046 132.000 136.000 132.000 L 108.000 132.000 Z"),
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
