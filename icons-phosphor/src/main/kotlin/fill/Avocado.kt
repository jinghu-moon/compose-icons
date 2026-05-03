package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Avocado: ImageVector
    get() {
        if (_avocado != null) return _avocado!!
        _avocado = phosphorFillIcon(
            name = "Avocado",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 211.000 130.660 L 181.200 46.470 C 173.710 23.708 152.569 8.234 128.608 7.976 C 104.647 7.719 83.177 22.735 75.200 45.330 L 75.200 45.330 L 45.690 128.830 C 31.941 165.223 43.719 206.326 74.657 229.913 C 105.595 253.499 148.350 253.973 179.802 231.077 C 211.255 208.180 223.940 167.348 211.000 130.660 ZM 128.000 200.000 C 105.909 200.000 88.000 182.091 88.000 160.000 C 88.000 137.909 105.909 120.000 128.000 120.000 C 150.091 120.000 168.000 137.909 168.000 160.000 C 168.000 182.091 150.091 200.000 128.000 200.000 Z"),
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
        return _avocado!!
    }

private var _avocado: ImageVector? = null
