package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CaretDoubleUp: ImageVector
    get() {
        if (_caretDoubleUp != null) return _caretDoubleUp!!
        _caretDoubleUp = phosphorDuotoneIcon(
            name = "CaretDoubleUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 208.000 200.000 L 48.000 200.000 L 128.000 120.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 133.660 114.340 C 132.159 112.838 130.123 111.994 128.000 111.994 C 125.877 111.994 123.841 112.838 122.340 114.340 L 42.340 194.340 C 40.049 196.628 39.364 200.071 40.603 203.062 C 41.842 206.053 44.762 208.003 48.000 208.000 L 208.000 208.000 C 211.238 208.003 214.158 206.053 215.397 203.062 C 216.636 200.071 215.951 196.628 213.660 194.340 ZM 67.310 192.000 L 128.000 131.310 L 188.690 192.000 ZM 42.310 125.660 C 40.808 124.159 39.964 122.123 39.964 120.000 C 39.964 117.877 40.808 115.841 42.310 114.340 L 122.310 34.340 C 123.811 32.838 125.847 31.994 127.970 31.994 C 130.093 31.994 132.129 32.838 133.630 34.340 L 213.630 114.340 C 216.756 117.466 216.756 122.534 213.630 125.660 C 210.504 128.786 205.436 128.786 202.310 125.660 L 128.000 51.310 L 53.660 125.660 C 52.159 127.162 50.123 128.006 48.000 128.006 C 45.877 128.006 43.841 127.162 42.340 125.660 Z"),
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
        return _caretDoubleUp!!
    }

private var _caretDoubleUp: ImageVector? = null
