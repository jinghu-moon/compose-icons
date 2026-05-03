package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Onigiri: ImageVector
    get() {
        if (_onigiri != null) return _onigiri!!
        _onigiri = phosphorLightIcon(
            name = "Onigiri",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 229.820 147.600 L 174.000 51.670 L 173.910 51.520 C 164.058 35.660 146.711 26.015 128.040 26.015 C 109.369 26.015 92.022 35.660 82.170 51.520 L 82.080 51.670 L 26.180 147.600 C 15.882 164.254 15.406 185.178 24.936 202.283 C 34.466 219.387 52.509 229.993 72.090 230.000 L 183.910 230.000 C 203.491 229.993 221.534 219.387 231.064 202.283 C 240.594 185.178 240.118 164.254 229.820 147.600 ZM 162.000 218.000 L 94.000 218.000 L 94.000 168.000 C 94.000 166.895 94.895 166.000 96.000 166.000 L 160.000 166.000 C 161.105 166.000 162.000 166.895 162.000 168.000 ZM 220.610 196.420 C 213.284 209.823 199.184 218.114 183.910 218.000 L 174.000 218.000 L 174.000 168.000 C 174.000 160.268 167.732 154.000 160.000 154.000 L 96.000 154.000 C 88.268 154.000 82.000 160.268 82.000 168.000 L 82.000 218.000 L 72.090 218.000 C 56.848 217.995 42.805 209.732 35.397 196.411 C 27.990 183.089 28.382 166.800 36.420 153.850 L 36.500 153.710 L 92.370 57.780 C 100.042 45.487 113.509 38.017 128.000 38.017 C 142.491 38.017 155.958 45.487 163.630 57.780 L 219.500 153.710 L 219.580 153.850 C 227.733 166.769 228.125 183.125 220.600 196.420 Z"),
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
        return _onigiri!!
    }

private var _onigiri: ImageVector? = null
