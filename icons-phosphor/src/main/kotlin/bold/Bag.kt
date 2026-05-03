package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Bag: ImageVector
    get() {
        if (_bag != null) return _bag!!
        _bag = phosphorBoldIcon(
            name = "Bag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 60.000 L 179.830 60.000 C 177.641 32.999 155.090 12.201 128.000 12.201 C 100.910 12.201 78.359 32.999 76.170 60.000 L 40.000 60.000 C 28.954 60.000 20.000 68.954 20.000 80.000 L 20.000 200.000 C 20.000 211.046 28.954 220.000 40.000 220.000 L 216.000 220.000 C 227.046 220.000 236.000 211.046 236.000 200.000 L 236.000 80.000 C 236.000 68.954 227.046 60.000 216.000 60.000 ZM 128.000 36.000 C 141.918 36.001 153.722 46.225 155.710 60.000 L 100.290 60.000 C 102.278 46.225 114.082 36.001 128.000 36.000 ZM 212.000 196.000 L 44.000 196.000 L 44.000 84.000 L 76.000 84.000 L 76.000 96.000 C 76.000 102.627 81.373 108.000 88.000 108.000 C 94.627 108.000 100.000 102.627 100.000 96.000 L 100.000 84.000 L 156.000 84.000 L 156.000 96.000 C 156.000 102.627 161.373 108.000 168.000 108.000 C 174.627 108.000 180.000 102.627 180.000 96.000 L 180.000 84.000 L 212.000 84.000 Z"),
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
        return _bag!!
    }

private var _bag: ImageVector? = null
