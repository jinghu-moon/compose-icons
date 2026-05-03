package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.WifiLow: ImageVector
    get() {
        if (_wifiLow != null) return _wifiLow!!
        _wifiLow = phosphorBoldIcon(
            name = "WifiLow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 144.000 204.000 C 144.000 212.837 136.837 220.000 128.000 220.000 C 119.163 220.000 112.000 212.837 112.000 204.000 C 112.000 195.163 119.163 188.000 128.000 188.000 C 136.837 188.000 144.000 195.163 144.000 204.000 ZM 175.060 155.300 C 147.005 134.892 108.995 134.892 80.940 155.300 C 75.583 159.202 74.403 166.708 78.305 172.065 C 82.207 177.422 89.713 178.602 95.070 174.700 C 114.703 160.426 141.297 160.426 160.930 174.700 C 166.287 178.602 173.793 177.422 177.695 172.065 C 181.597 166.708 180.417 159.202 175.060 155.300 Z"),
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
        return _wifiLow!!
    }

private var _wifiLow: ImageVector? = null
