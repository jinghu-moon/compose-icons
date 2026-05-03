package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TrafficSign: ImageVector
    get() {
        if (_trafficSign != null) return _trafficSign!!
        _trafficSign = phosphorThinIcon(
            name = "TrafficSign",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.320 119.120 L 136.880 15.680 C 134.526 13.323 131.331 11.998 128.000 11.998 C 124.669 11.998 121.474 13.323 119.120 15.680 L 15.680 119.120 C 13.323 121.474 11.998 124.669 11.998 128.000 C 11.998 131.331 13.323 134.526 15.680 136.880 L 119.120 240.320 L 119.120 240.320 C 121.474 242.677 124.669 244.002 128.000 244.002 C 131.331 244.002 134.526 242.677 136.880 240.320 L 240.320 136.880 C 242.677 134.526 244.002 131.331 244.002 128.000 C 244.002 124.669 242.677 121.474 240.320 119.120 ZM 234.660 131.220 L 131.220 234.670 C 129.440 236.445 126.560 236.445 124.780 234.670 L 124.780 234.670 L 21.330 131.220 C 20.475 130.367 19.995 129.208 19.995 128.000 C 19.995 126.792 20.475 125.634 21.330 124.780 L 124.780 21.330 C 126.560 19.555 129.440 19.555 131.220 21.330 L 234.670 124.780 C 235.525 125.634 236.005 126.792 236.005 128.000 C 236.005 129.208 235.525 130.367 234.670 131.220 ZM 170.830 117.220 C 171.581 117.970 172.003 118.988 172.003 120.050 C 172.003 121.112 171.581 122.130 170.830 122.880 L 146.830 146.880 C 145.267 148.443 142.733 148.443 141.170 146.880 C 139.607 145.317 139.607 142.783 141.170 141.220 L 158.340 124.000 L 112.000 124.000 C 100.954 124.000 92.000 132.954 92.000 144.000 L 92.000 152.000 C 92.000 154.209 90.209 156.000 88.000 156.000 C 85.791 156.000 84.000 154.209 84.000 152.000 L 84.000 144.000 C 84.000 128.536 96.536 116.000 112.000 116.000 L 158.340 116.000 L 141.170 98.830 C 139.607 97.267 139.607 94.733 141.170 93.170 C 142.733 91.607 145.267 91.607 146.830 93.170 Z"),
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
        return _trafficSign!!
    }

private var _trafficSign: ImageVector? = null
