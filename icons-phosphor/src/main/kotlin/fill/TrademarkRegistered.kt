package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TrademarkRegistered: ImageVector
    get() {
        if (_trademarkRegistered != null) return _trademarkRegistered!!
        _trademarkRegistered = phosphorFillIcon(
            name = "TrademarkRegistered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 152.000 112.000 C 152.000 120.837 144.837 128.000 136.000 128.000 L 112.000 128.000 L 112.000 96.000 L 136.000 96.000 C 144.837 96.000 152.000 103.163 152.000 112.000 ZM 232.000 128.000 C 232.000 185.438 185.438 232.000 128.000 232.000 C 70.562 232.000 24.000 185.438 24.000 128.000 C 24.000 70.562 70.562 24.000 128.000 24.000 C 185.412 24.061 231.939 70.588 232.000 128.000 ZM 216.000 128.000 C 216.000 79.399 176.601 40.000 128.000 40.000 C 79.399 40.000 40.000 79.399 40.000 128.000 C 40.000 176.601 79.399 216.000 128.000 216.000 C 176.578 215.945 215.945 176.578 216.000 128.000 ZM 200.000 128.000 C 200.000 167.764 167.764 200.000 128.000 200.000 C 88.235 200.000 56.000 167.764 56.000 128.000 C 56.000 88.235 88.235 56.000 128.000 56.000 C 167.746 56.044 199.956 88.254 200.000 128.000 ZM 166.660 163.560 L 151.090 140.210 C 164.023 133.284 170.590 118.451 167.024 104.221 C 163.457 89.990 150.671 80.007 136.000 80.000 L 104.000 80.000 C 99.582 80.000 96.000 83.582 96.000 88.000 L 96.000 168.000 C 96.000 172.418 99.582 176.000 104.000 176.000 C 108.418 176.000 112.000 172.418 112.000 168.000 L 112.000 144.000 L 134.390 144.000 L 153.390 172.440 C 155.842 176.118 160.812 177.112 164.490 174.660 C 168.168 172.208 169.162 167.238 166.710 163.560 Z"),
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
