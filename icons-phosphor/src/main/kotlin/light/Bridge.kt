package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Bridge: ImageVector
    get() {
        if (_bridge != null) return _bridge!!
        _bridge = phosphorLightIcon(
            name = "Bridge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 162.000 L 198.000 162.000 L 198.000 95.280 C 205.795 106.795 216.850 115.719 229.750 120.910 C 231.749 121.780 234.063 121.496 235.794 120.170 C 237.524 118.843 238.399 116.682 238.078 114.525 C 237.757 112.369 236.292 110.556 234.250 109.790 C 212.297 100.969 197.936 79.659 198.000 56.000 C 198.000 52.686 195.314 50.000 192.000 50.000 C 188.686 50.000 186.000 52.686 186.000 56.000 C 186.000 88.033 160.033 114.000 128.000 114.000 C 95.967 114.000 70.000 88.033 70.000 56.000 C 70.000 52.686 67.314 50.000 64.000 50.000 C 60.686 50.000 58.000 52.686 58.000 56.000 C 58.064 79.659 43.703 100.969 21.750 109.790 C 19.708 110.556 18.243 112.369 17.922 114.525 C 17.601 116.682 18.476 118.843 20.206 120.170 C 21.937 121.496 24.251 121.780 26.250 120.910 C 39.150 115.719 50.205 106.795 58.000 95.280 L 58.000 162.000 L 24.000 162.000 C 20.686 162.000 18.000 164.686 18.000 168.000 C 18.000 171.314 20.686 174.000 24.000 174.000 L 58.000 174.000 L 58.000 200.000 C 58.000 203.314 60.686 206.000 64.000 206.000 C 67.314 206.000 70.000 203.314 70.000 200.000 L 70.000 174.000 L 186.000 174.000 L 186.000 200.000 C 186.000 203.314 188.686 206.000 192.000 206.000 C 195.314 206.000 198.000 203.314 198.000 200.000 L 198.000 174.000 L 232.000 174.000 C 235.314 174.000 238.000 171.314 238.000 168.000 C 238.000 164.686 235.314 162.000 232.000 162.000 ZM 146.000 123.650 L 146.000 162.000 L 110.000 162.000 L 110.000 123.650 C 121.795 126.783 134.205 126.783 146.000 123.650 ZM 70.000 95.150 C 77.026 105.526 86.691 113.842 98.000 119.240 L 98.000 162.000 L 70.000 162.000 ZM 158.000 162.000 L 158.000 119.240 C 169.309 113.842 178.974 105.526 186.000 95.150 L 186.000 162.000 Z"),
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
        return _bridge!!
    }

private var _bridge: ImageVector? = null
