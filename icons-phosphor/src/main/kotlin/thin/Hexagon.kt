package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Hexagon: ImageVector
    get() {
        if (_hexagon != null) return _hexagon!!
        _hexagon = phosphorThinIcon(
            name = "Hexagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 221.760 69.660 L 133.760 21.480 C 130.171 19.516 125.829 19.516 122.240 21.480 L 34.240 69.660 C 30.395 71.764 28.003 75.797 28.000 80.180 L 28.000 175.820 C 28.003 180.203 30.395 184.236 34.240 186.340 L 122.240 234.520 C 125.827 236.493 130.173 236.493 133.760 234.520 L 221.760 186.340 C 225.605 184.236 227.997 180.203 228.000 175.820 L 228.000 80.180 C 227.997 75.797 225.605 71.764 221.760 69.660 ZM 220.000 175.820 C 219.997 177.279 219.200 178.620 217.920 179.320 L 129.920 227.500 C 128.724 228.155 127.276 228.155 126.080 227.500 L 38.080 179.320 C 36.800 178.620 36.003 177.279 36.000 175.820 L 36.000 80.180 C 36.003 78.721 36.800 77.380 38.080 76.680 L 126.080 28.500 C 127.273 27.834 128.727 27.834 129.920 28.500 L 217.920 76.680 C 219.200 77.380 219.997 78.721 220.000 80.180 Z"),
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
        return _hexagon!!
    }

private var _hexagon: ImageVector? = null
