package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Image: ImageVector
    get() {
        if (_image != null) return _image!!
        _image = phosphorBoldIcon(
            name = "Image",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 144.000 96.000 C 144.000 87.163 151.163 80.000 160.000 80.000 C 168.837 80.000 176.000 87.163 176.000 96.000 C 176.000 104.837 168.837 112.000 160.000 112.000 C 151.163 112.000 144.000 104.837 144.000 96.000 ZM 236.000 56.000 L 236.000 200.000 C 236.000 211.046 227.046 220.000 216.000 220.000 L 40.000 220.000 C 28.954 220.000 20.000 211.046 20.000 200.000 L 20.000 56.000 C 20.000 44.954 28.954 36.000 40.000 36.000 L 216.000 36.000 C 227.046 36.000 236.000 44.954 236.000 56.000 ZM 44.000 60.000 L 44.000 139.720 L 77.860 105.860 C 85.670 98.052 98.330 98.052 106.140 105.860 L 147.310 147.000 L 164.490 129.830 C 172.300 122.022 184.960 122.022 192.770 129.830 L 212.000 149.090 L 212.000 60.000 ZM 44.000 196.000 L 162.340 196.000 L 92.000 125.660 L 44.000 173.660 ZM 212.000 196.000 L 212.000 183.000 L 178.630 149.630 L 164.280 164.000 L 196.280 196.000 Z"),
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
        return _image!!
    }

private var _image: ImageVector? = null
