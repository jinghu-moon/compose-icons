package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MicrosoftPowerpointLogo: ImageVector
    get() {
        if (_microsoftPowerpointLogo != null) return _microsoftPowerpointLogo!!
        _microsoftPowerpointLogo = phosphorLightIcon(
            name = "MicrosoftPowerpointLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 96.000 98.000 L 80.000 98.000 C 76.686 98.000 74.000 100.686 74.000 104.000 L 74.000 152.000 C 74.000 155.314 76.686 158.000 80.000 158.000 C 83.314 158.000 86.000 155.314 86.000 152.000 L 86.000 142.000 L 96.000 142.000 C 108.150 142.000 118.000 132.150 118.000 120.000 C 118.000 107.850 108.150 98.000 96.000 98.000 ZM 96.000 130.000 L 86.000 130.000 L 86.000 110.000 L 96.000 110.000 C 101.523 110.000 106.000 114.477 106.000 120.000 C 106.000 125.523 101.523 130.000 96.000 130.000 ZM 136.000 26.000 C 104.258 26.052 74.337 40.828 55.000 66.000 L 40.000 66.000 C 32.268 66.000 26.000 72.268 26.000 80.000 L 26.000 176.000 C 26.000 183.732 32.268 190.000 40.000 190.000 L 55.000 190.000 C 84.079 227.988 135.654 240.661 179.028 220.477 C 222.402 200.294 245.920 152.676 235.585 105.966 C 225.251 59.255 183.840 26.003 136.000 26.000 ZM 225.800 122.000 L 158.000 122.000 L 158.000 80.000 C 158.000 72.268 151.732 66.000 144.000 66.000 L 142.000 66.000 L 142.000 38.200 C 186.949 41.269 222.731 77.051 225.800 122.000 ZM 130.000 38.210 L 130.000 66.000 L 70.780 66.000 C 86.358 49.668 107.483 39.755 130.000 38.210 ZM 38.000 176.000 L 38.000 80.000 C 38.000 78.895 38.895 78.000 40.000 78.000 L 144.000 78.000 C 145.105 78.000 146.000 78.895 146.000 80.000 L 146.000 176.000 C 146.000 177.105 145.105 178.000 144.000 178.000 L 40.000 178.000 C 38.895 178.000 38.000 177.105 38.000 176.000 ZM 70.780 190.000 L 130.000 190.000 L 130.000 217.790 C 107.483 216.245 86.358 206.332 70.780 190.000 ZM 142.000 217.800 L 142.000 190.000 L 144.000 190.000 C 151.732 190.000 158.000 183.732 158.000 176.000 L 158.000 134.000 L 225.800 134.000 C 222.735 178.951 186.951 214.735 142.000 217.800 Z"),
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
        return _microsoftPowerpointLogo!!
    }

private var _microsoftPowerpointLogo: ImageVector? = null
