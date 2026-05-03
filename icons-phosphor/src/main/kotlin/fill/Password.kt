package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Password: ImageVector
    get() {
        if (_password != null) return _password!!
        _password = phosphorFillIcon(
            name = "Password",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 48.000 L 32.000 48.000 C 23.163 48.000 16.000 55.163 16.000 64.000 L 16.000 192.000 C 16.000 200.837 23.163 208.000 32.000 208.000 L 224.000 208.000 C 232.837 208.000 240.000 200.837 240.000 192.000 L 240.000 64.000 C 240.000 55.163 232.837 48.000 224.000 48.000 ZM 204.580 142.710 C 207.178 146.300 206.375 151.316 202.785 153.915 C 199.195 156.514 194.178 155.710 191.580 152.120 L 184.000 141.610 L 176.370 152.120 C 173.771 155.710 168.755 156.514 165.165 153.915 C 161.575 151.316 160.771 146.300 163.370 142.710 L 171.010 132.210 L 158.650 128.210 C 154.450 126.829 152.164 122.305 153.545 118.105 C 154.926 113.905 159.450 111.619 163.650 113.000 L 176.000 117.000 L 176.000 104.000 C 176.000 99.582 179.582 96.000 184.000 96.000 C 188.418 96.000 192.000 99.582 192.000 104.000 L 192.000 117.000 L 204.350 113.000 C 208.550 111.619 213.074 113.905 214.455 118.105 C 215.836 122.305 213.550 126.829 209.350 128.210 L 196.990 132.210 ZM 132.580 142.710 C 135.178 146.300 134.375 151.316 130.785 153.915 C 127.195 156.514 122.178 155.710 119.580 152.120 L 112.000 141.610 L 104.370 152.120 C 101.771 155.710 96.755 156.514 93.165 153.915 C 89.575 151.316 88.771 146.300 91.370 142.710 L 99.010 132.210 L 86.650 128.210 C 82.450 126.829 80.164 122.305 81.545 118.105 C 82.926 113.905 87.450 111.619 91.650 113.000 L 104.000 117.000 L 104.000 104.000 C 104.000 99.582 107.582 96.000 112.000 96.000 C 116.418 96.000 120.000 99.582 120.000 104.000 L 120.000 117.000 L 132.350 113.000 C 136.550 111.619 141.074 113.905 142.455 118.105 C 143.836 122.305 141.550 126.829 137.350 128.210 L 124.990 132.210 ZM 64.000 88.000 L 64.000 168.000 C 64.000 172.418 60.418 176.000 56.000 176.000 C 51.582 176.000 48.000 172.418 48.000 168.000 L 48.000 88.000 C 48.000 83.582 51.582 80.000 56.000 80.000 C 60.418 80.000 64.000 83.582 64.000 88.000 Z"),
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
        return _password!!
    }

private var _password: ImageVector? = null
