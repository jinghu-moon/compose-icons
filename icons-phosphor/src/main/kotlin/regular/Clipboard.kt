package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Clipboard: ImageVector
    get() {
        if (_clipboard != null) return _clipboard!!
        _clipboard = phosphorRegularIcon(
            name = "Clipboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 32.000 L 163.740 32.000 C 154.648 21.821 141.648 16.001 128.000 16.001 C 114.352 16.001 101.351 21.821 92.260 32.000 L 56.000 32.000 C 47.163 32.000 40.000 39.163 40.000 48.000 L 40.000 216.000 C 40.000 224.837 47.163 232.000 56.000 232.000 L 200.000 232.000 C 208.837 232.000 216.000 224.837 216.000 216.000 L 216.000 48.000 C 216.000 39.163 208.837 32.000 200.000 32.000 ZM 128.000 32.000 C 145.673 32.000 160.000 46.327 160.000 64.000 L 96.000 64.000 C 96.000 46.327 110.327 32.000 128.000 32.000 ZM 200.000 216.000 L 56.000 216.000 L 56.000 48.000 L 82.750 48.000 C 80.930 53.138 80.000 58.549 80.000 64.000 L 80.000 72.000 C 80.000 76.418 83.582 80.000 88.000 80.000 L 168.000 80.000 C 172.418 80.000 176.000 76.418 176.000 72.000 L 176.000 64.000 C 176.000 58.549 175.070 53.138 173.250 48.000 L 200.000 48.000 Z"),
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
        return _clipboard!!
    }

private var _clipboard: ImageVector? = null
