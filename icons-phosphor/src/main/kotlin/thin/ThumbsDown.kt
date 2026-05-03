package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ThumbsDown: ImageVector
    get() {
        if (_thumbsDown != null) return _thumbsDown!!
        _thumbsDown = phosphorThinIcon(
            name = "ThumbsDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 235.850 157.520 L 223.850 61.520 C 222.599 51.509 214.088 43.998 204.000 44.000 L 32.000 44.000 C 25.373 44.000 20.000 49.373 20.000 56.000 L 20.000 144.000 C 20.000 150.627 25.373 156.000 32.000 156.000 L 77.530 156.000 L 116.420 233.790 C 117.098 235.145 118.484 236.001 120.000 236.000 C 139.882 236.000 156.000 219.882 156.000 200.000 L 156.000 180.000 L 216.000 180.000 C 221.737 180.001 227.199 177.539 230.996 173.238 C 234.794 168.937 236.561 163.213 235.850 157.520 ZM 76.000 148.000 L 32.000 148.000 C 29.791 148.000 28.000 146.209 28.000 144.000 L 28.000 56.000 C 28.000 53.791 29.791 52.000 32.000 52.000 L 76.000 52.000 ZM 225.000 167.940 C 222.721 170.522 219.444 172.001 216.000 172.000 L 152.000 172.000 C 149.791 172.000 148.000 173.791 148.000 176.000 L 148.000 200.000 C 148.002 214.528 136.893 226.644 122.420 227.900 L 84.000 151.060 L 84.000 52.000 L 204.000 52.000 C 210.052 51.999 215.158 56.504 215.910 62.510 L 227.910 158.510 C 228.337 161.925 227.277 165.359 225.000 167.940 Z"),
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
        return _thumbsDown!!
    }

private var _thumbsDown: ImageVector? = null
