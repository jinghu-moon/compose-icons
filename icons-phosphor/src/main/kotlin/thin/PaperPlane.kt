package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PaperPlane: ImageVector
    get() {
        if (_paperPlane != null) return _paperPlane!!
        _paperPlane = phosphorThinIcon(
            name = "PaperPlane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 234.430 202.080 L 138.350 34.140 C 136.225 30.360 132.226 28.021 127.890 28.021 C 123.554 28.021 119.555 30.360 117.430 34.140 L 21.550 202.140 C 19.128 206.494 19.648 211.892 22.858 215.703 C 26.067 219.514 31.297 220.946 36.000 219.300 L 128.000 188.220 L 219.940 219.280 C 224.659 220.968 229.930 219.545 233.159 215.712 C 236.387 211.880 236.894 206.444 234.430 202.080 ZM 227.000 210.560 C 225.917 211.871 224.114 212.339 222.530 211.720 L 132.000 181.130 L 132.000 120.000 C 132.000 117.791 130.209 116.000 128.000 116.000 C 125.791 116.000 124.000 117.791 124.000 120.000 L 124.000 181.130 L 33.370 211.740 C 31.806 212.297 30.061 211.830 28.984 210.567 C 27.907 209.303 27.722 207.506 28.520 206.050 L 124.390 38.050 C 125.094 36.777 126.435 35.986 127.890 35.986 C 129.345 35.986 130.686 36.777 131.390 38.050 L 227.470 206.000 C 228.314 207.462 228.125 209.301 227.000 210.560 Z"),
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
        return _paperPlane!!
    }

private var _paperPlane: ImageVector? = null
