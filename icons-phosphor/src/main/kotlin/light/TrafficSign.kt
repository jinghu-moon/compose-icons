package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TrafficSign: ImageVector
    get() {
        if (_trafficSign != null) return _trafficSign!!
        _trafficSign = phosphorLightIcon(
            name = "TrafficSign",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 241.740 117.710 L 138.290 14.260 C 132.605 8.581 123.395 8.581 117.710 14.260 L 14.260 117.710 C 8.581 123.395 8.581 132.605 14.260 138.290 L 117.710 241.740 L 117.710 241.740 C 123.395 247.419 132.605 247.419 138.290 241.740 L 241.740 138.290 C 247.419 132.605 247.419 123.395 241.740 117.710 ZM 233.250 129.810 L 129.810 233.250 C 128.810 234.249 127.190 234.249 126.190 233.250 L 126.190 233.250 L 22.750 129.810 C 21.751 128.810 21.751 127.190 22.750 126.190 L 126.190 22.750 C 127.190 21.751 128.810 21.751 129.810 22.750 L 233.250 126.190 C 234.249 127.190 234.249 128.810 233.250 129.810 ZM 172.250 115.810 C 174.590 118.153 174.590 121.947 172.250 124.290 L 148.250 148.290 C 145.886 150.493 142.202 150.428 139.917 148.143 C 137.632 145.858 137.567 142.174 139.770 139.810 L 153.510 126.000 L 112.000 126.000 C 102.059 126.000 94.000 134.059 94.000 144.000 L 94.000 152.000 C 94.000 155.314 91.314 158.000 88.000 158.000 C 84.686 158.000 82.000 155.314 82.000 152.000 L 82.000 144.000 C 82.000 127.431 95.431 114.000 112.000 114.000 L 153.510 114.000 L 139.760 100.240 C 137.557 97.876 137.622 94.192 139.907 91.907 C 142.192 89.622 145.876 89.557 148.240 91.760 Z"),
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
        return _trafficSign!!
    }

private var _trafficSign: ImageVector? = null
