package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Browsers: ImageVector
    get() {
        if (_browsers != null) return _browsers!!
        _browsers = phosphorBoldIcon(
            name = "Browsers",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 220.000 32.000 L 76.000 32.000 C 64.954 32.000 56.000 40.954 56.000 52.000 L 56.000 72.000 L 36.000 72.000 C 24.954 72.000 16.000 80.954 16.000 92.000 L 16.000 204.000 C 16.000 215.046 24.954 224.000 36.000 224.000 L 180.000 224.000 C 191.046 224.000 200.000 215.046 200.000 204.000 L 200.000 184.000 L 220.000 184.000 C 231.046 184.000 240.000 175.046 240.000 164.000 L 240.000 52.000 C 240.000 40.954 231.046 32.000 220.000 32.000 ZM 176.000 96.000 L 176.000 112.000 L 40.000 112.000 L 40.000 96.000 ZM 176.000 200.000 L 40.000 200.000 L 40.000 136.000 L 176.000 136.000 ZM 216.000 160.000 L 200.000 160.000 L 200.000 92.000 C 200.000 80.954 191.046 72.000 180.000 72.000 L 80.000 72.000 L 80.000 56.000 L 216.000 56.000 Z"),
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
        return _browsers!!
    }

private var _browsers: ImageVector? = null
