package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Hockey: ImageVector
    get() {
        if (_hockey != null) return _hockey!!
        _hockey = phosphorThinIcon(
            name = "Hockey",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 156.000 L 129.050 156.000 L 35.050 45.410 C 34.175 44.168 32.672 43.530 31.170 43.761 C 29.669 43.993 28.429 45.055 27.968 46.503 C 27.508 47.951 27.908 49.534 29.000 50.590 L 162.560 207.770 C 164.839 210.452 168.180 211.999 171.700 212.000 L 224.000 212.000 C 230.627 212.000 236.000 206.627 236.000 200.000 L 236.000 168.000 C 236.000 161.373 230.627 156.000 224.000 156.000 ZM 168.650 202.590 L 135.850 164.000 L 196.000 164.000 L 196.000 204.000 L 171.700 204.000 C 170.526 204.001 169.410 203.485 168.650 202.590 ZM 228.000 200.000 C 228.000 202.209 226.209 204.000 224.000 204.000 L 204.000 204.000 L 204.000 164.000 L 224.000 164.000 C 226.209 164.000 228.000 165.791 228.000 168.000 ZM 104.000 183.060 L 87.400 202.590 C 86.651 203.472 85.557 203.986 84.400 204.000 L 60.000 204.000 L 60.000 164.000 L 85.200 164.000 C 87.409 164.000 89.200 162.209 89.200 160.000 C 89.200 157.791 87.409 156.000 85.200 156.000 L 32.000 156.000 C 25.373 156.000 20.000 161.373 20.000 168.000 L 20.000 200.000 C 20.000 206.627 25.373 212.000 32.000 212.000 L 84.300 212.000 C 87.820 211.999 91.161 210.452 93.440 207.770 L 110.050 188.240 C 111.480 186.556 111.274 184.030 109.590 182.600 C 107.906 181.170 105.380 181.376 103.950 183.060 ZM 28.000 200.000 L 28.000 168.000 C 28.000 165.791 29.791 164.000 32.000 164.000 L 52.000 164.000 L 52.000 204.000 L 32.000 204.000 C 29.791 204.000 28.000 202.209 28.000 200.000 ZM 153.410 131.050 C 152.601 130.363 152.098 129.383 152.011 128.325 C 151.925 127.268 152.263 126.219 152.950 125.410 L 220.950 45.410 C 222.380 43.726 224.906 43.520 226.590 44.950 C 228.274 46.380 228.480 48.906 227.050 50.590 L 159.050 130.590 C 158.363 131.399 157.383 131.902 156.325 131.989 C 155.268 132.075 154.219 131.737 153.410 131.050 Z"),
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
        return _hockey!!
    }

private var _hockey: ImageVector? = null
