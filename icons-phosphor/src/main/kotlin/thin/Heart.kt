package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Heart: ImageVector
    get() {
        if (_heart != null) return _heart!!
        _heart = phosphorThinIcon(
            name = "Heart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 178.000 44.000 C 156.560 44.000 138.080 54.190 128.000 71.070 C 117.920 54.190 99.440 44.000 78.000 44.000 C 45.983 44.039 20.039 69.983 20.000 102.000 C 20.000 130.590 38.000 160.470 73.400 190.790 C 89.745 204.699 107.393 216.999 126.100 227.520 C 127.286 228.160 128.714 228.160 129.900 227.520 C 148.607 216.999 166.255 204.699 182.600 190.790 C 218.000 160.470 236.000 130.590 236.000 102.000 C 235.961 69.983 210.017 44.039 178.000 44.000 ZM 128.000 219.420 C 114.000 211.420 28.000 160.070 28.000 102.000 C 28.033 74.399 50.399 52.033 78.000 52.000 C 99.110 52.000 116.850 63.310 124.300 81.510 C 124.916 83.010 126.378 83.990 128.000 83.990 C 129.622 83.990 131.084 83.010 131.700 81.510 C 139.150 63.310 156.890 52.000 178.000 52.000 C 205.601 52.033 227.967 74.399 228.000 102.000 C 228.000 160.000 142.000 211.460 128.000 219.420 Z"),
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
        return _heart!!
    }

private var _heart: ImageVector? = null
