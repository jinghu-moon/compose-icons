package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Checks: ImageVector
    get() {
        if (_checks != null) return _checks!!
        _checks = phosphorThinIcon(
            name = "Checks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 146.800 82.850 L 57.200 170.850 C 55.645 172.375 53.155 172.375 51.600 170.850 L 13.200 133.140 C 11.686 131.583 11.691 129.101 13.212 127.551 C 14.733 126.000 17.214 125.946 18.800 127.430 L 54.400 162.430 L 141.200 77.190 C 142.793 75.770 145.220 75.850 146.715 77.372 C 148.211 78.895 148.248 81.323 146.800 82.890 ZM 242.800 77.200 C 241.239 75.642 238.711 75.642 237.150 77.200 L 150.350 162.440 L 128.720 141.200 C 127.710 140.156 126.214 139.742 124.811 140.118 C 123.408 140.494 122.319 141.600 121.966 143.009 C 121.612 144.417 122.050 145.907 123.110 146.900 L 147.550 170.900 C 149.105 172.425 151.595 172.425 153.150 170.900 L 242.750 82.900 C 243.527 82.162 243.975 81.142 243.994 80.071 C 244.012 78.999 243.600 77.965 242.850 77.200 Z"),
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
        return _checks!!
    }

private var _checks: ImageVector? = null
