package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CaretDoubleLeft: ImageVector
    get() {
        if (_caretDoubleLeft != null) return _caretDoubleLeft!!
        _caretDoubleLeft = phosphorDuotoneIcon(
            name = "CaretDoubleLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 200.000 48.000 L 200.000 208.000 L 120.000 128.000 Z"),
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
        pathData = parseSvgPathData("M 203.060 40.610 C 200.071 39.370 196.629 40.053 194.340 42.340 L 114.340 122.340 C 112.838 123.841 111.994 125.877 111.994 128.000 C 111.994 130.123 112.838 132.159 114.340 133.660 L 194.340 213.660 C 196.628 215.951 200.071 216.636 203.062 215.397 C 206.053 214.158 208.003 211.238 208.000 208.000 L 208.000 48.000 C 207.999 44.764 206.050 41.848 203.060 40.610 ZM 192.000 188.690 L 131.310 128.000 L 192.000 67.310 ZM 125.660 202.340 C 128.786 205.466 128.786 210.534 125.660 213.660 C 122.534 216.786 117.466 216.786 114.340 213.660 L 34.340 133.660 C 32.838 132.159 31.994 130.123 31.994 128.000 C 31.994 125.877 32.838 123.841 34.340 122.340 L 114.340 42.340 C 117.466 39.214 122.534 39.214 125.660 42.340 C 128.786 45.466 128.786 50.534 125.660 53.660 L 51.310 128.000 Z"),
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
        return _caretDoubleLeft!!
    }

private var _caretDoubleLeft: ImageVector? = null
