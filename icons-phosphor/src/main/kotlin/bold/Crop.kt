package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Crop: ImageVector
    get() {
        if (_crop != null) return _crop!!
        _crop = phosphorBoldIcon(
            name = "Crop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 244.000 192.000 C 244.000 198.627 238.627 204.000 232.000 204.000 L 204.000 204.000 L 204.000 232.000 C 204.000 238.627 198.627 244.000 192.000 244.000 C 185.373 244.000 180.000 238.627 180.000 232.000 L 180.000 204.000 L 64.000 204.000 C 57.373 204.000 52.000 198.627 52.000 192.000 L 52.000 76.000 L 24.000 76.000 C 17.373 76.000 12.000 70.627 12.000 64.000 C 12.000 57.373 17.373 52.000 24.000 52.000 L 52.000 52.000 L 52.000 24.000 C 52.000 17.373 57.373 12.000 64.000 12.000 C 70.627 12.000 76.000 17.373 76.000 24.000 L 76.000 180.000 L 232.000 180.000 C 238.627 180.000 244.000 185.373 244.000 192.000 ZM 104.000 76.000 L 180.000 76.000 L 180.000 152.000 C 180.000 158.627 185.373 164.000 192.000 164.000 C 198.627 164.000 204.000 158.627 204.000 152.000 L 204.000 64.000 C 204.000 57.373 198.627 52.000 192.000 52.000 L 104.000 52.000 C 97.373 52.000 92.000 57.373 92.000 64.000 C 92.000 70.627 97.373 76.000 104.000 76.000 Z"),
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
