package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TwitchLogo: ImageVector
    get() {
        if (_twitchLogo != null) return _twitchLogo!!
        _twitchLogo = phosphorLightIcon(
            name = "TwitchLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 34.000 L 48.000 34.000 C 40.268 34.000 34.000 40.268 34.000 48.000 L 34.000 192.000 C 34.000 199.732 40.268 206.000 48.000 206.000 L 66.000 206.000 L 66.000 240.000 C 66.000 242.328 67.347 244.445 69.455 245.433 C 71.562 246.421 74.051 246.100 75.840 244.610 L 122.170 206.000 L 165.100 206.000 C 168.389 206.007 171.575 204.857 174.100 202.750 L 217.000 167.000 C 220.179 164.332 222.011 160.391 222.000 156.240 L 222.000 48.000 C 222.000 40.268 215.732 34.000 208.000 34.000 ZM 210.000 156.250 C 210.001 156.845 209.737 157.409 209.280 157.790 L 166.380 193.540 C 166.020 193.838 165.567 194.001 165.100 194.000 L 120.000 194.000 C 118.597 194.000 117.238 194.492 116.160 195.390 L 78.000 227.190 L 78.000 200.000 C 78.000 196.686 75.314 194.000 72.000 194.000 L 48.000 194.000 C 46.895 194.000 46.000 193.105 46.000 192.000 L 46.000 48.000 C 46.000 46.895 46.895 46.000 48.000 46.000 L 208.000 46.000 C 209.105 46.000 210.000 46.895 210.000 48.000 ZM 174.000 88.000 L 174.000 136.000 C 174.000 139.314 171.314 142.000 168.000 142.000 C 164.686 142.000 162.000 139.314 162.000 136.000 L 162.000 88.000 C 162.000 84.686 164.686 82.000 168.000 82.000 C 171.314 82.000 174.000 84.686 174.000 88.000 ZM 126.000 88.000 L 126.000 136.000 C 126.000 139.314 123.314 142.000 120.000 142.000 C 116.686 142.000 114.000 139.314 114.000 136.000 L 114.000 88.000 C 114.000 84.686 116.686 82.000 120.000 82.000 C 123.314 82.000 126.000 84.686 126.000 88.000 Z"),
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
        return _twitchLogo!!
    }

private var _twitchLogo: ImageVector? = null
