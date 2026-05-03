package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CodeBlock: ImageVector
    get() {
        if (_codeBlock != null) return _codeBlock!!
        _codeBlock = phosphorRegularIcon(
            name = "CodeBlock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 58.340 101.660 L 26.340 69.660 C 24.838 68.159 23.994 66.123 23.994 64.000 C 23.994 61.877 24.838 59.841 26.340 58.340 L 58.340 26.340 C 61.466 23.214 66.534 23.214 69.660 26.340 C 72.786 29.466 72.786 34.534 69.660 37.660 L 43.310 64.000 L 69.660 90.340 C 72.786 93.466 72.786 98.534 69.660 101.660 C 66.534 104.786 61.466 104.786 58.340 101.660 ZM 98.340 101.660 C 99.841 103.162 101.877 104.006 104.000 104.006 C 106.123 104.006 108.159 103.162 109.660 101.660 L 141.660 69.660 C 143.162 68.159 144.006 66.123 144.006 64.000 C 144.006 61.877 143.162 59.841 141.660 58.340 L 109.660 26.340 C 106.534 23.214 101.466 23.214 98.340 26.340 C 95.214 29.466 95.214 34.534 98.340 37.660 L 124.690 64.000 L 98.340 90.340 C 96.838 91.841 95.994 93.877 95.994 96.000 C 95.994 98.123 96.838 100.159 98.340 101.660 ZM 200.000 40.000 L 176.000 40.000 C 171.582 40.000 168.000 43.582 168.000 48.000 C 168.000 52.418 171.582 56.000 176.000 56.000 L 200.000 56.000 L 200.000 200.000 L 56.000 200.000 L 56.000 136.000 C 56.000 131.582 52.418 128.000 48.000 128.000 C 43.582 128.000 40.000 131.582 40.000 136.000 L 40.000 200.000 C 40.000 208.837 47.163 216.000 56.000 216.000 L 200.000 216.000 C 208.837 216.000 216.000 208.837 216.000 200.000 L 216.000 56.000 C 216.000 47.163 208.837 40.000 200.000 40.000 Z"),
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
