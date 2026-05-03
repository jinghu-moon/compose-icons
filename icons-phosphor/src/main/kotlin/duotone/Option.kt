package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Option: ImageVector
    get() {
        if (_option != null) return _option!!
        _option = phosphorDuotoneIcon(
            name = "Option",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 224.000 80.000 L 224.000 192.000 L 48.000 192.000 C 39.163 192.000 32.000 184.837 32.000 176.000 L 32.000 80.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 232.000 192.000 C 232.000 196.418 228.418 200.000 224.000 200.000 L 160.940 200.000 C 154.876 200.019 149.327 196.592 146.630 191.160 L 95.060 88.000 L 32.000 88.000 C 27.582 88.000 24.000 84.418 24.000 80.000 C 24.000 75.582 27.582 72.000 32.000 72.000 L 95.060 72.000 C 101.124 71.981 106.673 75.408 109.370 80.840 L 160.940 184.000 L 224.000 184.000 C 228.418 184.000 232.000 187.582 232.000 192.000 ZM 152.000 88.000 L 224.000 88.000 C 228.418 88.000 232.000 84.418 232.000 80.000 C 232.000 75.582 228.418 72.000 224.000 72.000 L 152.000 72.000 C 147.582 72.000 144.000 75.582 144.000 80.000 C 144.000 84.418 147.582 88.000 152.000 88.000 Z"),
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
