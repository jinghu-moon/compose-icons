package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Cylinder: ImageVector
    get() {
        if (_cylinder != null) return _cylinder!!
        _cylinder = phosphorThinIcon(
            name = "Cylinder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 20.000 C 89.870 20.000 60.000 37.570 60.000 60.000 L 60.000 196.000 C 60.000 218.430 89.870 236.000 128.000 236.000 C 166.130 236.000 196.000 218.430 196.000 196.000 L 196.000 60.000 C 196.000 37.570 166.130 20.000 128.000 20.000 ZM 128.000 28.000 C 160.520 28.000 188.000 42.650 188.000 60.000 C 188.000 77.350 160.520 92.000 128.000 92.000 C 95.480 92.000 68.000 77.350 68.000 60.000 C 68.000 42.650 95.480 28.000 128.000 28.000 ZM 188.000 196.000 C 188.000 213.350 160.520 228.000 128.000 228.000 C 95.480 228.000 68.000 213.350 68.000 196.000 L 68.000 79.110 C 79.350 91.650 101.710 100.000 128.000 100.000 C 154.290 100.000 176.650 91.650 188.000 79.110 Z"),
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
        return _cylinder!!
    }

private var _cylinder: ImageVector? = null
