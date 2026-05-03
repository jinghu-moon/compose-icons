package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CheckSquare: ImageVector
    get() {
        if (_checkSquare != null) return _checkSquare!!
        _checkSquare = phosphorRegularIcon(
            name = "CheckSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 173.660 98.340 C 175.162 99.841 176.006 101.877 176.006 104.000 C 176.006 106.123 175.162 108.159 173.660 109.660 L 117.660 165.660 C 116.159 167.162 114.123 168.006 112.000 168.006 C 109.877 168.006 107.841 167.162 106.340 165.660 L 82.340 141.660 C 79.214 138.534 79.214 133.466 82.340 130.340 C 85.466 127.214 90.534 127.214 93.660 130.340 L 112.000 148.690 L 162.340 98.340 C 163.841 96.838 165.877 95.994 168.000 95.994 C 170.123 95.994 172.159 96.838 173.660 98.340 ZM 224.000 48.000 L 224.000 208.000 C 224.000 216.837 216.837 224.000 208.000 224.000 L 48.000 224.000 C 39.163 224.000 32.000 216.837 32.000 208.000 L 32.000 48.000 C 32.000 39.163 39.163 32.000 48.000 32.000 L 208.000 32.000 C 216.837 32.000 224.000 39.163 224.000 48.000 ZM 208.000 208.000 L 208.000 48.000 L 48.000 48.000 L 48.000 208.000 L 208.000 208.000 Z"),
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
        return _checkSquare!!
    }

private var _checkSquare: ImageVector? = null
