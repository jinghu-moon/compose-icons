package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BabyCarriage: ImageVector
    get() {
        if (_babyCarriage != null) return _babyCarriage!!
        _babyCarriage = phosphorLightIcon(
            name = "BabyCarriage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 160.000 34.000 L 152.000 34.000 C 144.268 34.000 138.000 40.268 138.000 48.000 L 138.000 106.000 L 53.520 106.000 C 50.553 87.576 34.662 74.023 16.000 74.000 C 12.686 74.000 10.000 76.686 10.000 80.000 C 10.000 83.314 12.686 86.000 16.000 86.000 C 30.359 86.000 42.000 97.641 42.000 112.000 C 42.050 155.058 76.942 189.950 120.000 190.000 L 160.000 190.000 C 203.078 190.000 238.000 155.078 238.000 112.000 C 238.000 68.922 203.078 34.000 160.000 34.000 ZM 225.710 106.000 L 161.100 106.000 L 208.920 67.750 C 218.531 78.332 224.426 91.762 225.710 106.000 ZM 152.000 46.000 L 160.000 46.000 C 174.459 45.983 188.520 50.739 200.000 59.530 L 150.000 99.530 L 150.000 48.000 C 150.000 46.895 150.895 46.000 152.000 46.000 ZM 160.000 178.000 L 120.000 178.000 C 85.889 177.959 57.413 151.966 54.270 118.000 L 225.730 118.000 C 222.587 151.966 194.111 177.959 160.000 178.000 ZM 102.000 224.000 C 102.000 231.732 95.732 238.000 88.000 238.000 C 80.268 238.000 74.000 231.732 74.000 224.000 C 74.000 216.268 80.268 210.000 88.000 210.000 C 95.732 210.000 102.000 216.268 102.000 224.000 ZM 206.000 224.000 C 206.000 231.732 199.732 238.000 192.000 238.000 C 184.268 238.000 178.000 231.732 178.000 224.000 C 178.000 216.268 184.268 210.000 192.000 210.000 C 199.732 210.000 206.000 216.268 206.000 224.000 Z"),
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
        return _babyCarriage!!
    }

private var _babyCarriage: ImageVector? = null
