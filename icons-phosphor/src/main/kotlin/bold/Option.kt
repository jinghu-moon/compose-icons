package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Option: ImageVector
    get() {
        if (_option != null) return _option!!
        _option = phosphorBoldIcon(
            name = "Option",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 236.000 192.000 C 236.000 198.627 230.627 204.000 224.000 204.000 L 160.940 204.000 C 153.359 204.022 146.425 199.733 143.060 192.940 L 92.580 92.000 L 32.000 92.000 C 25.373 92.000 20.000 86.627 20.000 80.000 C 20.000 73.373 25.373 68.000 32.000 68.000 L 95.060 68.000 C 102.641 67.978 109.575 72.267 112.940 79.060 L 163.420 180.000 L 224.000 180.000 C 230.627 180.000 236.000 185.373 236.000 192.000 ZM 152.000 92.000 L 224.000 92.000 C 230.627 92.000 236.000 86.627 236.000 80.000 C 236.000 73.373 230.627 68.000 224.000 68.000 L 152.000 68.000 C 145.373 68.000 140.000 73.373 140.000 80.000 C 140.000 86.627 145.373 92.000 152.000 92.000 Z"),
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
        return _option!!
    }

private var _option: ImageVector? = null
