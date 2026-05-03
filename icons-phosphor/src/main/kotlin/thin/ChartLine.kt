package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChartLine: ImageVector
    get() {
        if (_chartLine != null) return _chartLine!!
        _chartLine = phosphorThinIcon(
            name = "ChartLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.000 208.000 C 228.000 210.209 226.209 212.000 224.000 212.000 L 32.000 212.000 C 29.791 212.000 28.000 210.209 28.000 208.000 L 28.000 48.000 C 28.000 45.791 29.791 44.000 32.000 44.000 C 34.209 44.000 36.000 45.791 36.000 48.000 L 36.000 151.190 L 93.370 101.000 C 94.786 99.773 96.865 99.694 98.370 100.810 L 159.780 146.860 L 221.370 93.000 C 223.043 91.735 225.408 91.976 226.791 93.553 C 228.174 95.130 228.103 97.507 226.630 99.000 L 162.630 155.000 C 161.214 156.227 159.135 156.306 157.630 155.190 L 96.220 109.190 L 36.000 161.810 L 36.000 204.000 L 224.000 204.000 C 226.209 204.000 228.000 205.791 228.000 208.000 Z"),
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
        return _chartLine!!
    }

private var _chartLine: ImageVector? = null
