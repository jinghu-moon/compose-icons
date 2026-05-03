package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CodeBlock: ImageVector
    get() {
        if (_codeBlock != null) return _codeBlock!!
        _codeBlock = phosphorFillIcon(
            name = "CodeBlock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 40.000 L 168.000 40.000 C 168.000 31.163 160.837 24.000 152.000 24.000 L 32.000 24.000 C 23.163 24.000 16.000 31.163 16.000 40.000 L 16.000 120.000 C 16.000 128.837 23.163 136.000 32.000 136.000 L 40.000 136.000 L 40.000 200.000 C 40.000 208.837 47.163 216.000 56.000 216.000 L 200.000 216.000 C 208.837 216.000 216.000 208.837 216.000 200.000 L 216.000 56.000 C 216.000 47.163 208.837 40.000 200.000 40.000 ZM 106.340 61.660 C 103.214 58.534 103.214 53.466 106.340 50.340 C 109.466 47.214 114.534 47.214 117.660 50.340 L 141.660 74.340 C 143.162 75.841 144.006 77.877 144.006 80.000 C 144.006 82.123 143.162 84.159 141.660 85.660 L 117.660 109.660 C 114.534 112.786 109.466 112.786 106.340 109.660 C 103.214 106.534 103.214 101.466 106.340 98.340 L 124.690 80.000 ZM 42.340 85.660 C 40.838 84.159 39.994 82.123 39.994 80.000 C 39.994 77.877 40.838 75.841 42.340 74.340 L 66.340 50.340 C 69.466 47.214 74.534 47.214 77.660 50.340 C 80.786 53.466 80.786 58.534 77.660 61.660 L 59.310 80.000 L 77.660 98.340 C 80.786 101.466 80.786 106.534 77.660 109.660 C 74.534 112.786 69.466 112.786 66.340 109.660 ZM 200.000 200.000 L 56.000 200.000 L 56.000 136.000 L 152.000 136.000 C 160.837 136.000 168.000 128.837 168.000 120.000 L 168.000 56.000 L 200.000 56.000 Z"),
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
        return _codeBlock!!
    }

private var _codeBlock: ImageVector? = null
