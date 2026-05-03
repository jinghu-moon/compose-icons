package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PersonSimpleBike: ImageVector
    get() {
        if (_personSimpleBike != null) return _personSimpleBike!!
        _personSimpleBike = phosphorThinIcon(
            name = "PersonSimpleBike",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 164.000 76.000 C 177.255 76.000 188.000 65.255 188.000 52.000 C 188.000 38.745 177.255 28.000 164.000 28.000 C 150.745 28.000 140.000 38.745 140.000 52.000 C 140.000 65.255 150.745 76.000 164.000 76.000 ZM 164.000 36.000 C 172.837 36.000 180.000 43.163 180.000 52.000 C 180.000 60.837 172.837 68.000 164.000 68.000 C 155.163 68.000 148.000 60.837 148.000 52.000 C 148.000 43.163 155.163 36.000 164.000 36.000 ZM 200.000 140.000 C 180.118 140.000 164.000 156.118 164.000 176.000 C 164.000 195.882 180.118 212.000 200.000 212.000 C 219.882 212.000 236.000 195.882 236.000 176.000 C 236.000 156.118 219.882 140.000 200.000 140.000 ZM 200.000 204.000 C 184.536 204.000 172.000 191.464 172.000 176.000 C 172.000 160.536 184.536 148.000 200.000 148.000 C 215.464 148.000 228.000 160.536 228.000 176.000 C 228.000 191.464 215.464 204.000 200.000 204.000 ZM 56.000 140.000 C 36.118 140.000 20.000 156.118 20.000 176.000 C 20.000 195.882 36.118 212.000 56.000 212.000 C 75.882 212.000 92.000 195.882 92.000 176.000 C 92.000 156.118 75.882 140.000 56.000 140.000 ZM 56.000 204.000 C 40.536 204.000 28.000 191.464 28.000 176.000 C 28.000 160.536 40.536 148.000 56.000 148.000 C 71.464 148.000 84.000 160.536 84.000 176.000 C 84.000 191.464 71.464 204.000 56.000 204.000 ZM 192.000 116.000 L 152.000 116.000 C 150.939 116.001 149.921 115.580 149.170 114.830 L 120.000 85.660 L 93.660 112.000 L 130.830 149.170 C 131.580 149.921 132.001 150.939 132.000 152.000 L 132.000 200.000 C 132.000 202.209 130.209 204.000 128.000 204.000 C 125.791 204.000 124.000 202.209 124.000 200.000 L 124.000 153.660 L 85.170 114.830 C 84.419 114.080 83.997 113.062 83.997 112.000 C 83.997 110.938 84.419 109.920 85.170 109.170 L 117.170 77.170 C 117.920 76.419 118.938 75.997 120.000 75.997 C 121.062 75.997 122.080 76.419 122.830 77.170 L 153.660 108.000 L 192.000 108.000 C 194.209 108.000 196.000 109.791 196.000 112.000 C 196.000 114.209 194.209 116.000 192.000 116.000 Z"),
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
        return _personSimpleBike!!
    }

private var _personSimpleBike: ImageVector? = null
