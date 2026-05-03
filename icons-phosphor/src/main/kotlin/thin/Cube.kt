package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Cube: ImageVector
    get() {
        if (_cube != null) return _cube!!
        _cube = phosphorThinIcon(
            name = "Cube",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 221.760 69.660 L 133.760 21.480 C 130.171 19.516 125.829 19.516 122.240 21.480 L 34.240 69.660 C 30.395 71.764 28.003 75.797 28.000 80.180 L 28.000 175.820 C 28.003 180.203 30.395 184.236 34.240 186.340 L 122.240 234.520 C 125.827 236.493 130.173 236.493 133.760 234.520 L 221.760 186.340 C 225.605 184.236 227.997 180.203 228.000 175.820 L 228.000 80.180 C 227.997 75.797 225.605 71.764 221.760 69.660 ZM 126.080 28.500 C 127.273 27.834 128.727 27.834 129.920 28.500 L 216.670 76.000 L 128.000 124.520 L 39.330 76.000 ZM 38.080 179.330 C 36.797 178.628 36.000 177.282 36.000 175.820 L 36.000 83.290 L 124.000 131.450 L 124.000 226.360 ZM 217.920 179.330 L 132.000 226.330 L 132.000 131.450 L 220.000 83.290 L 220.000 175.820 C 219.997 177.279 219.200 178.620 217.920 179.320 Z"),
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
        return _cube!!
    }

private var _cube: ImageVector? = null
