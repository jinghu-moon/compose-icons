package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Hockey: ImageVector
    get() {
        if (_hockey != null) return _hockey!!
        _hockey = phosphorLightIcon(
            name = "Hockey",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 154.000 L 130.000 154.000 L 36.570 44.120 C 35.200 42.426 33.019 41.607 30.873 41.982 C 28.726 42.356 26.952 43.865 26.237 45.923 C 25.521 47.981 25.978 50.265 27.430 51.890 L 161.000 209.070 C 163.668 212.207 167.582 214.010 171.700 214.000 L 224.000 214.000 C 231.732 214.000 238.000 207.732 238.000 200.000 L 238.000 168.000 C 238.000 160.268 231.732 154.000 224.000 154.000 ZM 170.180 201.300 L 140.180 166.000 L 194.000 166.000 L 194.000 202.000 L 171.700 202.000 C 171.115 202.000 170.560 201.744 170.180 201.300 ZM 226.000 200.000 C 226.000 201.105 225.105 202.000 224.000 202.000 L 206.000 202.000 L 206.000 166.000 L 224.000 166.000 C 225.105 166.000 226.000 166.895 226.000 168.000 ZM 110.890 181.080 C 109.678 180.048 108.106 179.540 106.519 179.667 C 104.932 179.795 103.461 180.548 102.430 181.760 L 85.820 201.300 C 85.440 201.744 84.885 202.000 84.300 202.000 L 62.000 202.000 L 62.000 166.000 L 85.200 166.000 C 88.514 166.000 91.200 163.314 91.200 160.000 C 91.200 156.686 88.514 154.000 85.200 154.000 L 32.000 154.000 C 24.268 154.000 18.000 160.268 18.000 168.000 L 18.000 200.000 C 18.000 207.732 24.268 214.000 32.000 214.000 L 84.300 214.000 C 88.418 214.010 92.332 212.207 95.000 209.070 L 111.600 189.530 C 113.735 187.000 113.417 183.218 110.890 181.080 ZM 30.000 200.000 L 30.000 168.000 C 30.000 166.895 30.895 166.000 32.000 166.000 L 50.000 166.000 L 50.000 202.000 L 32.000 202.000 C 30.895 202.000 30.000 201.105 30.000 200.000 ZM 151.430 124.120 L 219.430 44.120 C 220.800 42.426 222.981 41.607 225.127 41.982 C 227.274 42.356 229.048 43.865 229.763 45.923 C 230.479 47.981 230.022 50.265 228.570 51.890 L 160.570 131.890 C 158.401 134.318 154.690 134.573 152.210 132.464 C 149.729 130.355 149.383 126.652 151.430 124.120 Z"),
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
