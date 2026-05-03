package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AlignCenterHorizontal: ImageVector
    get() {
        if (_alignCenterHorizontal != null) return _alignCenterHorizontal!!
        _alignCenterHorizontal = phosphorBoldIcon(
            name = "AlignCenterHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 136.000 L 140.000 136.000 L 140.000 120.000 L 184.000 120.000 C 195.046 120.000 204.000 111.046 204.000 100.000 L 204.000 60.000 C 204.000 48.954 195.046 40.000 184.000 40.000 L 140.000 40.000 L 140.000 32.000 C 140.000 25.373 134.627 20.000 128.000 20.000 C 121.373 20.000 116.000 25.373 116.000 32.000 L 116.000 40.000 L 72.000 40.000 C 60.954 40.000 52.000 48.954 52.000 60.000 L 52.000 100.000 C 52.000 111.046 60.954 120.000 72.000 120.000 L 116.000 120.000 L 116.000 136.000 L 48.000 136.000 C 36.954 136.000 28.000 144.954 28.000 156.000 L 28.000 196.000 C 28.000 207.046 36.954 216.000 48.000 216.000 L 116.000 216.000 L 116.000 224.000 C 116.000 230.627 121.373 236.000 128.000 236.000 C 134.627 236.000 140.000 230.627 140.000 224.000 L 140.000 216.000 L 208.000 216.000 C 219.046 216.000 228.000 207.046 228.000 196.000 L 228.000 156.000 C 228.000 144.954 219.046 136.000 208.000 136.000 ZM 76.000 64.000 L 180.000 64.000 L 180.000 96.000 L 76.000 96.000 ZM 204.000 192.000 L 52.000 192.000 L 52.000 160.000 L 204.000 160.000 Z"),
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
        return _alignCenterHorizontal!!
    }

private var _alignCenterHorizontal: ImageVector? = null
