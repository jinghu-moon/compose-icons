package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Clipboard: ImageVector
    get() {
        if (_clipboard != null) return _clipboard!!
        _clipboard = phosphorBoldIcon(
            name = "Clipboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 28.000 L 165.470 28.000 C 155.684 17.781 142.149 12.002 128.000 12.002 C 113.851 12.002 100.316 17.781 90.530 28.000 L 56.000 28.000 C 44.954 28.000 36.000 36.954 36.000 48.000 L 36.000 216.000 C 36.000 227.046 44.954 236.000 56.000 236.000 L 200.000 236.000 C 211.046 236.000 220.000 227.046 220.000 216.000 L 220.000 48.000 C 220.000 36.954 211.046 28.000 200.000 28.000 ZM 155.710 60.000 L 100.290 60.000 C 102.287 46.233 114.089 36.019 128.000 36.019 C 141.911 36.019 153.713 46.233 155.710 60.000 ZM 196.000 212.000 L 60.000 212.000 L 60.000 52.000 L 77.410 52.000 C 76.476 55.932 76.003 59.959 76.000 64.000 L 76.000 72.000 C 76.000 78.627 81.373 84.000 88.000 84.000 L 168.000 84.000 C 174.627 84.000 180.000 78.627 180.000 72.000 L 180.000 64.000 C 179.997 59.959 179.524 55.932 178.590 52.000 L 196.000 52.000 Z"),
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
        return _clipboard!!
    }

private var _clipboard: ImageVector? = null
