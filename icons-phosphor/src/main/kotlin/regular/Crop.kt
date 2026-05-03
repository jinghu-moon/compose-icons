package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Crop: ImageVector
    get() {
        if (_crop != null) return _crop!!
        _crop = phosphorRegularIcon(
            name = "Crop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 192.000 C 240.000 196.418 236.418 200.000 232.000 200.000 L 200.000 200.000 L 200.000 232.000 C 200.000 236.418 196.418 240.000 192.000 240.000 C 187.582 240.000 184.000 236.418 184.000 232.000 L 184.000 200.000 L 64.000 200.000 C 59.582 200.000 56.000 196.418 56.000 192.000 L 56.000 72.000 L 24.000 72.000 C 19.582 72.000 16.000 68.418 16.000 64.000 C 16.000 59.582 19.582 56.000 24.000 56.000 L 56.000 56.000 L 56.000 24.000 C 56.000 19.582 59.582 16.000 64.000 16.000 C 68.418 16.000 72.000 19.582 72.000 24.000 L 72.000 184.000 L 232.000 184.000 C 236.418 184.000 240.000 187.582 240.000 192.000 ZM 96.000 72.000 L 184.000 72.000 L 184.000 160.000 C 184.000 164.418 187.582 168.000 192.000 168.000 C 196.418 168.000 200.000 164.418 200.000 160.000 L 200.000 64.000 C 200.000 59.582 196.418 56.000 192.000 56.000 L 96.000 56.000 C 91.582 56.000 88.000 59.582 88.000 64.000 C 88.000 68.418 91.582 72.000 96.000 72.000 Z"),
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
        return _crop!!
    }

private var _crop: ImageVector? = null
