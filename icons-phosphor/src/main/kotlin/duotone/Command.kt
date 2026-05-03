package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Command: ImageVector
    get() {
        if (_command != null) return _command!!
        _command = phosphorDuotoneIcon(
            name = "Command",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 208.000 76.000 L 208.000 76.000 C 208.000 91.464 195.464 104.000 180.000 104.000 L 152.000 104.000 L 152.000 76.000 C 152.000 60.536 164.536 48.000 180.000 48.000 L 180.000 48.000 C 195.464 48.000 208.000 60.536 208.000 76.000 ZM 76.000 48.000 L 76.000 48.000 C 60.536 48.000 48.000 60.536 48.000 76.000 L 48.000 76.000 C 48.000 91.464 60.536 104.000 76.000 104.000 L 104.000 104.000 L 104.000 76.000 C 104.000 60.536 91.464 48.000 76.000 48.000 ZM 180.000 152.000 L 152.000 152.000 L 152.000 180.000 C 152.000 195.464 164.536 208.000 180.000 208.000 L 180.000 208.000 C 195.464 208.000 208.000 195.464 208.000 180.000 L 208.000 180.000 C 208.000 164.536 195.464 152.000 180.000 152.000 ZM 48.000 180.000 L 48.000 180.000 C 48.000 195.464 60.536 208.000 76.000 208.000 L 76.000 208.000 C 91.464 208.000 104.000 195.464 104.000 180.000 L 104.000 152.000 L 76.000 152.000 C 60.536 152.000 48.000 164.536 48.000 180.000 Z"),
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
        pathData = parseSvgPathData("M 180.000 144.000 L 160.000 144.000 L 160.000 112.000 L 180.000 112.000 C 199.882 112.000 216.000 95.882 216.000 76.000 C 216.000 56.118 199.882 40.000 180.000 40.000 C 160.118 40.000 144.000 56.118 144.000 76.000 L 144.000 96.000 L 112.000 96.000 L 112.000 76.000 C 112.000 56.118 95.882 40.000 76.000 40.000 C 56.118 40.000 40.000 56.118 40.000 76.000 C 40.000 95.882 56.118 112.000 76.000 112.000 L 96.000 112.000 L 96.000 144.000 L 76.000 144.000 C 56.118 144.000 40.000 160.118 40.000 180.000 C 40.000 199.882 56.118 216.000 76.000 216.000 C 95.882 216.000 112.000 199.882 112.000 180.000 L 112.000 160.000 L 144.000 160.000 L 144.000 180.000 C 144.000 199.882 160.118 216.000 180.000 216.000 C 199.882 216.000 216.000 199.882 216.000 180.000 C 216.000 160.118 199.882 144.000 180.000 144.000 ZM 160.000 76.000 C 160.000 64.954 168.954 56.000 180.000 56.000 C 191.046 56.000 200.000 64.954 200.000 76.000 C 200.000 87.046 191.046 96.000 180.000 96.000 L 160.000 96.000 ZM 56.000 76.000 C 56.000 64.954 64.954 56.000 76.000 56.000 C 87.046 56.000 96.000 64.954 96.000 76.000 L 96.000 96.000 L 76.000 96.000 C 64.954 96.000 56.000 87.046 56.000 76.000 ZM 96.000 180.000 C 96.000 191.046 87.046 200.000 76.000 200.000 C 64.954 200.000 56.000 191.046 56.000 180.000 C 56.000 168.954 64.954 160.000 76.000 160.000 L 96.000 160.000 ZM 112.000 112.000 L 144.000 112.000 L 144.000 144.000 L 112.000 144.000 ZM 180.000 200.000 C 168.954 200.000 160.000 191.046 160.000 180.000 L 160.000 160.000 L 180.000 160.000 C 191.046 160.000 200.000 168.954 200.000 180.000 C 200.000 191.046 191.046 200.000 180.000 200.000 Z"),
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
        return _command!!
    }

private var _command: ImageVector? = null
