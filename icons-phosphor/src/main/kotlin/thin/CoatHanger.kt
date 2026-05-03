package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CoatHanger: ImageVector
    get() {
        if (_coatHanger != null) return _coatHanger!!
        _coatHanger = phosphorThinIcon(
            name = "CoatHanger",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 239.180 174.400 L 134.670 96.000 L 162.390 75.200 C 163.401 74.447 163.998 73.261 164.000 72.000 C 164.000 52.118 147.882 36.000 128.000 36.000 C 108.118 36.000 92.000 52.118 92.000 72.000 C 92.000 74.209 93.791 76.000 96.000 76.000 C 98.209 76.000 100.000 74.209 100.000 72.000 C 100.060 56.969 111.978 44.667 126.999 44.130 C 142.020 43.593 154.786 55.012 155.920 70.000 L 125.660 92.700 L 125.520 92.800 L 16.820 174.400 C 12.691 177.497 11.004 182.887 12.633 187.785 C 14.261 192.683 18.839 195.991 24.000 196.000 L 232.000 196.000 C 237.165 196.000 241.751 192.695 243.384 187.795 C 245.018 182.895 243.332 177.499 239.200 174.400 ZM 235.770 185.270 C 235.259 186.916 233.724 188.029 232.000 188.000 L 24.000 188.000 C 22.278 188.000 20.750 186.898 20.205 185.265 C 19.661 183.632 20.223 181.833 21.600 180.800 L 128.000 101.000 L 234.380 180.800 C 235.791 181.811 236.359 183.637 235.770 185.270 Z"),
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
        return _coatHanger!!
    }

private var _coatHanger: ImageVector? = null
