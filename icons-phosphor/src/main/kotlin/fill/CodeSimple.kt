package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CodeSimple: ImageVector
    get() {
        if (_codeSimple != null) return _codeSimple!!
        _codeSimple = phosphorFillIcon(
            name = "CodeSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 101.660 162.340 C 104.786 165.466 104.786 170.534 101.660 173.660 C 98.534 176.786 93.466 176.786 90.340 173.660 L 50.340 133.660 C 48.838 132.159 47.994 130.123 47.994 128.000 C 47.994 125.877 48.838 123.841 50.340 122.340 L 90.340 82.340 C 93.466 79.214 98.534 79.214 101.660 82.340 C 104.786 85.466 104.786 90.534 101.660 93.660 L 67.310 128.000 ZM 205.660 133.660 L 165.660 173.660 C 162.534 176.786 157.466 176.786 154.340 173.660 C 151.214 170.534 151.214 165.466 154.340 162.340 L 188.690 128.000 L 154.340 93.660 C 151.214 90.534 151.214 85.466 154.340 82.340 C 157.466 79.214 162.534 79.214 165.660 82.340 L 205.660 122.340 C 207.162 123.841 208.006 125.877 208.006 128.000 C 208.006 130.123 207.162 132.159 205.660 133.660 Z"),
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
        return _codeSimple!!
    }

private var _codeSimple: ImageVector? = null
