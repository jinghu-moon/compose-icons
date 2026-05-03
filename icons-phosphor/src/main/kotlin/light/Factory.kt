package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Factory: ImageVector
    get() {
        if (_factory != null) return _factory!!
        _factory = phosphorLightIcon(
            name = "Factory",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 114.000 176.000 C 114.000 179.314 111.314 182.000 108.000 182.000 L 80.000 182.000 C 76.686 182.000 74.000 179.314 74.000 176.000 C 74.000 172.686 76.686 170.000 80.000 170.000 L 108.000 170.000 C 111.314 170.000 114.000 172.686 114.000 176.000 ZM 176.000 170.000 L 148.000 170.000 C 144.686 170.000 142.000 172.686 142.000 176.000 C 142.000 179.314 144.686 182.000 148.000 182.000 L 176.000 182.000 C 179.314 182.000 182.000 179.314 182.000 176.000 C 182.000 172.686 179.314 170.000 176.000 170.000 ZM 238.000 216.000 C 238.000 219.314 235.314 222.000 232.000 222.000 L 24.000 222.000 C 20.686 222.000 18.000 219.314 18.000 216.000 C 18.000 212.686 20.686 210.000 24.000 210.000 L 34.000 210.000 L 34.000 88.000 C 34.000 85.727 35.284 83.650 37.317 82.633 C 39.349 81.617 41.782 81.836 43.600 83.200 L 98.000 124.000 L 98.000 88.000 C 98.000 85.727 99.284 83.650 101.317 82.633 C 103.349 81.617 105.782 81.836 107.600 83.200 L 149.000 114.280 L 161.000 30.020 C 162.022 23.146 167.910 18.048 174.860 18.020 L 192.980 18.020 C 199.930 18.048 205.818 23.146 206.840 30.020 L 221.840 135.150 C 221.840 135.150 221.900 135.740 221.900 136.000 L 221.900 210.000 L 231.900 210.000 C 233.509 209.973 235.061 210.593 236.207 211.722 C 237.354 212.850 238.000 214.391 238.000 216.000 ZM 160.000 122.490 L 170.000 130.000 L 209.080 130.000 L 195.000 31.720 C 194.859 30.726 194.004 29.990 193.000 30.000 L 174.940 30.000 C 173.936 29.990 173.081 30.726 172.940 31.720 ZM 46.000 210.000 L 210.000 210.000 L 210.000 142.000 L 168.000 142.000 C 166.702 142.000 165.439 141.579 164.400 140.800 L 150.000 130.000 L 150.000 130.000 L 110.000 100.000 L 110.000 136.000 C 110.000 138.273 108.716 140.350 106.683 141.367 C 104.651 142.383 102.218 142.164 100.400 140.800 L 46.000 100.000 Z"),
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
        return _factory!!
    }

private var _factory: ImageVector? = null
