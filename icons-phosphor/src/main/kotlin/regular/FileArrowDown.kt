package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FileArrowDown: ImageVector
    get() {
        if (_fileArrowDown != null) return _fileArrowDown!!
        _fileArrowDown = phosphorRegularIcon(
            name = "FileArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 213.660 82.340 L 157.660 26.340 C 156.158 24.840 154.122 23.998 152.000 24.000 L 56.000 24.000 C 47.163 24.000 40.000 31.163 40.000 40.000 L 40.000 216.000 C 40.000 224.837 47.163 232.000 56.000 232.000 L 200.000 232.000 C 208.837 232.000 216.000 224.837 216.000 216.000 L 216.000 88.000 C 216.002 85.878 215.160 83.842 213.660 82.340 ZM 160.000 51.310 L 188.690 80.000 L 160.000 80.000 ZM 200.000 216.000 L 56.000 216.000 L 56.000 40.000 L 144.000 40.000 L 144.000 88.000 C 144.000 92.418 147.582 96.000 152.000 96.000 L 200.000 96.000 L 200.000 216.000 ZM 157.660 154.340 C 159.162 155.841 160.006 157.877 160.006 160.000 C 160.006 162.123 159.162 164.159 157.660 165.660 L 133.660 189.660 C 132.159 191.162 130.123 192.006 128.000 192.006 C 125.877 192.006 123.841 191.162 122.340 189.660 L 98.340 165.660 C 95.214 162.534 95.214 157.466 98.340 154.340 C 101.466 151.214 106.534 151.214 109.660 154.340 L 120.000 164.690 L 120.000 120.000 C 120.000 115.582 123.582 112.000 128.000 112.000 C 132.418 112.000 136.000 115.582 136.000 120.000 L 136.000 164.690 L 146.340 154.340 C 147.841 152.838 149.877 151.994 152.000 151.994 C 154.123 151.994 156.159 152.838 157.660 154.340 Z"),
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
        return _fileArrowDown!!
    }

private var _fileArrowDown: ImageVector? = null
