package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TrademarkRegistered: ImageVector
    get() {
        if (_trademarkRegistered != null) return _trademarkRegistered!!
        _trademarkRegistered = phosphorLightIcon(
            name = "TrademarkRegistered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 128.000 218.000 C 78.294 218.000 38.000 177.706 38.000 128.000 C 38.000 78.294 78.294 38.000 128.000 38.000 C 177.706 38.000 218.000 78.294 218.000 128.000 C 217.945 177.683 177.683 217.945 128.000 218.000 ZM 148.160 139.420 C 161.110 133.671 168.273 119.646 165.338 105.785 C 162.402 91.923 150.169 82.005 136.000 82.000 L 104.000 82.000 C 100.686 82.000 98.000 84.686 98.000 88.000 L 98.000 168.000 C 98.000 171.314 100.686 174.000 104.000 174.000 C 107.314 174.000 110.000 171.314 110.000 168.000 L 110.000 142.000 L 135.460 142.000 L 155.000 171.330 C 156.839 174.091 160.569 174.839 163.330 173.000 C 166.091 171.161 166.839 167.431 165.000 164.670 ZM 110.000 94.000 L 136.000 94.000 C 145.941 94.000 154.000 102.059 154.000 112.000 C 154.000 121.941 145.941 130.000 136.000 130.000 L 110.000 130.000 Z"),
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
