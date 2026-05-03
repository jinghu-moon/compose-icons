package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ImageSquare: ImageVector
    get() {
        if (_imageSquare != null) return _imageSquare!!
        _imageSquare = phosphorBoldIcon(
            name = "ImageSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 28.000 L 48.000 28.000 C 36.954 28.000 28.000 36.954 28.000 48.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 208.000 228.000 C 219.046 228.000 228.000 219.046 228.000 208.000 L 228.000 48.000 C 228.000 36.954 219.046 28.000 208.000 28.000 ZM 204.000 52.000 L 204.000 115.720 L 186.140 97.860 C 178.330 90.052 165.670 90.052 157.860 97.860 L 52.000 203.720 L 52.000 52.000 ZM 85.660 204.000 L 172.000 117.660 L 204.000 149.660 L 204.000 204.000 ZM 76.000 96.000 C 76.000 84.954 84.954 76.000 96.000 76.000 C 107.046 76.000 116.000 84.954 116.000 96.000 C 116.000 107.046 107.046 116.000 96.000 116.000 C 84.954 116.000 76.000 107.046 76.000 96.000 Z"),
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
        return _imageSquare!!
    }

private var _imageSquare: ImageVector? = null
