package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Acorn: ImageVector
    get() {
        if (_acorn != null) return _acorn!!
        _acorn = phosphorLightIcon(
            name = "Acorn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 230.000 104.000 C 229.967 74.190 205.810 50.033 176.000 50.000 L 134.000 50.000 L 134.000 48.000 C 134.000 33.641 145.641 22.000 160.000 22.000 C 163.314 22.000 166.000 19.314 166.000 16.000 C 166.000 12.686 163.314 10.000 160.000 10.000 C 139.013 10.000 122.000 27.013 122.000 48.000 L 122.000 50.000 L 80.000 50.000 C 50.190 50.033 26.033 74.190 26.000 104.000 C 26.007 109.401 29.120 114.315 34.000 116.630 L 34.000 128.000 C 34.000 162.570 66.710 188.830 93.000 209.930 C 107.260 221.380 122.000 233.220 122.000 240.000 C 122.000 243.314 124.686 246.000 128.000 246.000 C 131.314 246.000 134.000 243.314 134.000 240.000 C 134.000 233.220 148.750 221.380 163.000 209.930 C 189.280 188.830 222.000 162.570 222.000 128.000 L 222.000 116.630 C 226.880 114.315 229.993 109.401 230.000 104.000 ZM 80.000 62.000 L 176.000 62.000 C 199.196 62.000 218.000 80.804 218.000 104.000 C 218.000 105.105 217.105 106.000 216.000 106.000 L 40.000 106.000 C 38.895 106.000 38.000 105.105 38.000 104.000 C 38.000 80.804 56.804 62.000 80.000 62.000 ZM 155.500 200.580 C 144.020 209.790 134.020 217.820 128.000 225.580 C 122.000 217.860 112.000 209.830 100.500 200.580 C 76.220 181.080 46.000 156.820 46.000 128.000 L 46.000 118.000 L 210.000 118.000 L 210.000 128.000 C 210.000 156.820 179.780 181.080 155.500 200.580 Z"),
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
        return _acorn!!
    }

private var _acorn: ImageVector? = null
