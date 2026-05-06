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
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM128 218C78.294 218 38 177.706 38 128 38 78.294 78.294 38 128 38c49.706 0 90 40.294 90 90-.055 49.683-40.317 89.945-90 90ZM148.16 139.42c12.95-5.749 20.113-19.774 17.178-33.635C162.402 91.923 150.169 82.005 136 82h-32c-3.314 0-6 2.686-6 6v80c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-26h25.46L155 171.33c1.839 2.761 5.569 3.509 8.33 1.67 2.761-1.839 3.509-5.569 1.67-8.33ZM110 94h26c9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18h-26Z"),
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
