package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HardDrives: ImageVector
    get() {
        if (_hardDrives != null) return _hardDrives!!
        _hardDrives = phosphorBoldIcon(
            name = "HardDrives",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 36.000 L 48.000 36.000 C 36.954 36.000 28.000 44.954 28.000 56.000 L 28.000 200.000 C 28.000 211.046 36.954 220.000 48.000 220.000 L 208.000 220.000 C 219.046 220.000 228.000 211.046 228.000 200.000 L 228.000 56.000 C 228.000 44.954 219.046 36.000 208.000 36.000 ZM 204.000 60.000 L 204.000 116.000 L 52.000 116.000 L 52.000 60.000 ZM 52.000 196.000 L 52.000 140.000 L 204.000 140.000 L 204.000 196.000 ZM 160.000 88.000 C 160.000 79.163 167.163 72.000 176.000 72.000 C 184.837 72.000 192.000 79.163 192.000 88.000 C 192.000 96.837 184.837 104.000 176.000 104.000 C 167.163 104.000 160.000 96.837 160.000 88.000 ZM 192.000 168.000 C 192.000 176.837 184.837 184.000 176.000 184.000 C 167.163 184.000 160.000 176.837 160.000 168.000 C 160.000 159.163 167.163 152.000 176.000 152.000 C 184.837 152.000 192.000 159.163 192.000 168.000 Z"),
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
