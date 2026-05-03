package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Tabs: ImageVector
    get() {
        if (_tabs != null) return _tabs!!
        _tabs = phosphorLightIcon(
            name = "Tabs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 253.750 166.280 L 253.750 166.280 L 253.750 166.280 L 253.750 166.280 L 231.460 92.000 C 229.718 86.051 224.249 81.973 218.050 82.000 L 208.000 82.000 C 204.686 82.000 202.000 84.686 202.000 88.000 C 202.000 91.314 204.686 94.000 208.000 94.000 L 218.050 94.000 C 218.944 93.984 219.741 94.564 220.000 95.420 L 240.000 162.000 L 204.460 162.000 L 183.460 92.000 C 181.718 86.051 176.249 81.973 170.050 82.000 L 160.000 82.000 C 156.686 82.000 154.000 84.686 154.000 88.000 C 154.000 91.314 156.686 94.000 160.000 94.000 L 170.050 94.000 C 170.944 93.984 171.741 94.564 172.000 95.420 L 192.000 162.000 L 156.460 162.000 L 135.460 92.000 C 133.718 86.051 128.249 81.973 122.050 82.000 L 38.000 82.000 C 31.783 81.951 26.288 86.033 24.540 92.000 L 2.280 166.200 L 2.280 166.250 L 2.280 166.250 L 2.280 166.400 C 2.237 166.527 2.204 166.658 2.180 166.790 C 2.176 166.806 2.176 166.824 2.180 166.840 C 1.835 168.589 2.286 170.401 3.411 171.785 C 4.535 173.168 6.217 173.980 8.000 174.000 L 248.000 174.000 C 249.896 174.001 251.681 173.105 252.814 171.584 C 253.946 170.063 254.294 168.097 253.750 166.280 ZM 36.000 95.420 C 36.264 94.545 37.087 93.961 38.000 94.000 L 122.100 94.000 C 122.979 94.007 123.750 94.588 124.000 95.430 L 144.000 162.000 L 16.060 162.000 Z"),
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
        return _tabs!!
    }

private var _tabs: ImageVector? = null
