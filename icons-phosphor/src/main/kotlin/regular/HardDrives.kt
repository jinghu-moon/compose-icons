package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.HardDrives: ImageVector
    get() {
        if (_hardDrives != null) return _hardDrives!!
        _hardDrives = phosphorRegularIcon(
            name = "HardDrives",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 136.000 L 48.000 136.000 C 39.163 136.000 32.000 143.163 32.000 152.000 L 32.000 200.000 C 32.000 208.837 39.163 216.000 48.000 216.000 L 208.000 216.000 C 216.837 216.000 224.000 208.837 224.000 200.000 L 224.000 152.000 C 224.000 143.163 216.837 136.000 208.000 136.000 ZM 208.000 200.000 L 48.000 200.000 L 48.000 152.000 L 208.000 152.000 L 208.000 200.000 ZM 208.000 40.000 L 48.000 40.000 C 39.163 40.000 32.000 47.163 32.000 56.000 L 32.000 104.000 C 32.000 112.837 39.163 120.000 48.000 120.000 L 208.000 120.000 C 216.837 120.000 224.000 112.837 224.000 104.000 L 224.000 56.000 C 224.000 47.163 216.837 40.000 208.000 40.000 ZM 208.000 104.000 L 48.000 104.000 L 48.000 56.000 L 208.000 56.000 L 208.000 104.000 ZM 192.000 80.000 C 192.000 86.627 186.627 92.000 180.000 92.000 C 173.373 92.000 168.000 86.627 168.000 80.000 C 168.000 73.373 173.373 68.000 180.000 68.000 C 186.627 68.000 192.000 73.373 192.000 80.000 ZM 192.000 176.000 C 192.000 182.627 186.627 188.000 180.000 188.000 C 173.373 188.000 168.000 182.627 168.000 176.000 C 168.000 169.373 173.373 164.000 180.000 164.000 C 186.627 164.000 192.000 169.373 192.000 176.000 Z"),
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
        return _hardDrives!!
    }

private var _hardDrives: ImageVector? = null
