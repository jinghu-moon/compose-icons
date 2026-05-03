package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HardDrives: ImageVector
    get() {
        if (_hardDrives != null) return _hardDrives!!
        _hardDrives = phosphorDuotoneIcon(
            name = "HardDrives",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 216.000 152.000 L 216.000 200.000 C 216.000 204.418 212.418 208.000 208.000 208.000 L 48.000 208.000 C 43.582 208.000 40.000 204.418 40.000 200.000 L 40.000 152.000 C 40.000 147.582 43.582 144.000 48.000 144.000 L 208.000 144.000 C 212.418 144.000 216.000 147.582 216.000 152.000 ZM 208.000 48.000 L 48.000 48.000 C 43.582 48.000 40.000 51.582 40.000 56.000 L 40.000 104.000 C 40.000 108.418 43.582 112.000 48.000 112.000 L 208.000 112.000 C 212.418 112.000 216.000 108.418 216.000 104.000 L 216.000 56.000 C 216.000 51.582 212.418 48.000 208.000 48.000 Z"),
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
        pathData = parseSvgPathData("M 208.000 136.000 L 48.000 136.000 C 39.163 136.000 32.000 143.163 32.000 152.000 L 32.000 200.000 C 32.000 208.837 39.163 216.000 48.000 216.000 L 208.000 216.000 C 216.837 216.000 224.000 208.837 224.000 200.000 L 224.000 152.000 C 224.000 143.163 216.837 136.000 208.000 136.000 ZM 208.000 200.000 L 48.000 200.000 L 48.000 152.000 L 208.000 152.000 L 208.000 200.000 ZM 208.000 40.000 L 48.000 40.000 C 39.163 40.000 32.000 47.163 32.000 56.000 L 32.000 104.000 C 32.000 112.837 39.163 120.000 48.000 120.000 L 208.000 120.000 C 216.837 120.000 224.000 112.837 224.000 104.000 L 224.000 56.000 C 224.000 47.163 216.837 40.000 208.000 40.000 ZM 208.000 104.000 L 48.000 104.000 L 48.000 56.000 L 208.000 56.000 L 208.000 104.000 ZM 192.000 80.000 C 192.000 86.627 186.627 92.000 180.000 92.000 C 173.373 92.000 168.000 86.627 168.000 80.000 C 168.000 73.373 173.373 68.000 180.000 68.000 C 186.627 68.000 192.000 73.373 192.000 80.000 ZM 192.000 176.000 C 192.000 182.627 186.627 188.000 180.000 188.000 C 173.373 188.000 168.000 182.627 168.000 176.000 C 168.000 169.373 173.373 164.000 180.000 164.000 C 186.627 164.000 192.000 169.373 192.000 176.000 Z"),
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
        return _hardDrives!!
    }

private var _hardDrives: ImageVector? = null
