package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.KeyReturn: ImageVector
    get() {
        if (_keyReturn != null) return _keyReturn!!
        _keyReturn = phosphorRegularIcon(
            name = "KeyReturn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 184.000 104.000 L 184.000 136.000 C 184.000 140.418 180.418 144.000 176.000 144.000 L 99.310 144.000 L 109.660 154.340 C 112.786 157.466 112.786 162.534 109.660 165.660 C 106.534 168.786 101.466 168.786 98.340 165.660 L 74.340 141.660 C 72.838 140.159 71.994 138.123 71.994 136.000 C 71.994 133.877 72.838 131.841 74.340 130.340 L 98.340 106.340 C 101.466 103.214 106.534 103.214 109.660 106.340 C 112.786 109.466 112.786 114.534 109.660 117.660 L 99.310 128.000 L 168.000 128.000 L 168.000 104.000 C 168.000 99.582 171.582 96.000 176.000 96.000 C 180.418 96.000 184.000 99.582 184.000 104.000 ZM 232.000 56.000 L 232.000 200.000 C 232.000 208.837 224.837 216.000 216.000 216.000 L 40.000 216.000 C 31.163 216.000 24.000 208.837 24.000 200.000 L 24.000 56.000 C 24.000 47.163 31.163 40.000 40.000 40.000 L 216.000 40.000 C 224.837 40.000 232.000 47.163 232.000 56.000 ZM 216.000 200.000 L 216.000 56.000 L 40.000 56.000 L 40.000 200.000 L 216.000 200.000 Z"),
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
        return _keyReturn!!
    }

private var _keyReturn: ImageVector? = null
