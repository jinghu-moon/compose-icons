package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Rewind: ImageVector
    get() {
        if (_rewind != null) return _rewind!!
        _rewind = phosphorBoldIcon(
            name = "Rewind",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 225.700 54.460 C 219.309 50.960 211.520 51.213 205.370 55.120 L 132.000 101.850 L 132.000 71.850 C 131.979 64.587 128.005 57.912 121.630 54.432 C 115.255 50.952 107.490 51.219 101.370 55.130 L 13.190 111.290 C 7.469 114.920 4.003 121.225 4.003 128.000 C 4.003 134.775 7.469 141.080 13.190 144.710 L 101.370 200.880 C 107.490 204.791 115.255 205.058 121.630 201.578 C 128.005 198.098 131.979 191.423 132.000 184.160 L 132.000 154.160 L 205.370 200.890 C 211.492 204.802 219.258 205.068 225.634 201.586 C 232.010 198.103 235.983 191.425 236.000 184.160 L 236.000 71.840 C 235.994 64.601 232.047 57.941 225.700 54.460 ZM 108.000 176.640 L 31.630 128.000 L 108.000 79.360 ZM 212.000 176.640 L 135.630 128.000 L 212.000 79.360 Z"),
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
        return _rewind!!
    }

private var _rewind: ImageVector? = null
