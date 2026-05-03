package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PushPinSimpleSlash: ImageVector
    get() {
        if (_pushPinSimpleSlash != null) return _pushPinSimpleSlash!!
        _pushPinSimpleSlash = phosphorLightIcon(
            name = "PushPinSimpleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 85.250 40.000 C 85.250 36.686 87.936 34.000 91.250 34.000 L 192.000 34.000 C 195.314 34.000 198.000 36.686 198.000 40.000 C 198.000 43.314 195.314 46.000 192.000 46.000 L 183.150 46.000 L 202.320 154.640 C 202.611 156.214 202.261 157.838 201.349 159.153 C 200.436 160.467 199.036 161.363 197.460 161.640 C 197.114 161.707 196.762 161.741 196.410 161.740 C 193.488 161.732 190.997 159.621 190.510 156.740 L 171.000 46.000 L 91.250 46.000 C 87.936 46.000 85.250 43.314 85.250 40.000 ZM 212.000 220.440 C 210.823 221.512 209.268 222.073 207.677 221.997 C 206.087 221.922 204.591 221.218 203.520 220.040 L 169.000 182.000 L 134.000 182.000 L 134.000 240.000 C 134.000 243.314 131.314 246.000 128.000 246.000 C 124.686 246.000 122.000 243.314 122.000 240.000 L 122.000 182.000 L 40.000 182.000 C 36.686 182.000 34.000 179.314 34.000 176.000 C 34.000 172.686 36.686 170.000 40.000 170.000 L 51.000 170.000 L 68.380 71.330 L 43.560 44.000 C 41.695 41.516 42.034 38.019 44.342 35.940 C 46.650 33.861 50.163 33.887 52.440 36.000 L 212.440 212.000 C 214.636 214.457 214.439 218.225 212.000 220.440 ZM 158.000 170.000 L 78.580 82.560 L 63.150 170.000 Z"),
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
        return _pushPinSimpleSlash!!
    }

private var _pushPinSimpleSlash: ImageVector? = null
