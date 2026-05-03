package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ShuffleSimple: ImageVector
    get() {
        if (_shuffleSimple != null) return _shuffleSimple!!
        _shuffleSimple = phosphorRegularIcon(
            name = "ShuffleSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 48.000 L 216.000 88.000 C 216.000 92.418 212.418 96.000 208.000 96.000 C 203.582 96.000 200.000 92.418 200.000 88.000 L 200.000 67.310 L 156.280 111.000 C 153.106 113.718 148.374 113.535 145.419 110.581 C 142.465 107.626 142.282 102.894 145.000 99.720 L 188.690 56.000 L 168.000 56.000 C 163.582 56.000 160.000 52.418 160.000 48.000 C 160.000 43.582 163.582 40.000 168.000 40.000 L 208.000 40.000 C 212.418 40.000 216.000 43.582 216.000 48.000 ZM 208.000 160.000 C 203.582 160.000 200.000 163.582 200.000 168.000 L 200.000 188.690 L 53.660 42.340 C 50.534 39.214 45.466 39.214 42.340 42.340 C 39.214 45.466 39.214 50.534 42.340 53.660 L 188.690 200.000 L 168.000 200.000 C 163.582 200.000 160.000 203.582 160.000 208.000 C 160.000 212.418 163.582 216.000 168.000 216.000 L 208.000 216.000 C 212.418 216.000 216.000 212.418 216.000 208.000 L 216.000 168.000 C 216.000 163.582 212.418 160.000 208.000 160.000 ZM 99.720 145.000 L 42.340 202.340 C 39.214 205.466 39.214 210.534 42.340 213.660 C 45.466 216.786 50.534 216.786 53.660 213.660 L 111.000 156.280 C 113.718 153.106 113.535 148.374 110.581 145.419 C 107.626 142.465 102.894 142.282 99.720 145.000 Z"),
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
        return _shuffleSimple!!
    }

private var _shuffleSimple: ImageVector? = null
