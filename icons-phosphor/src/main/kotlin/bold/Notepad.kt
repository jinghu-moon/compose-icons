package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Notepad: ImageVector
    get() {
        if (_notepad != null) return _notepad!!
        _notepad = phosphorBoldIcon(
            name = "Notepad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 172.000 124.000 C 172.000 130.627 166.627 136.000 160.000 136.000 L 96.000 136.000 C 89.373 136.000 84.000 130.627 84.000 124.000 C 84.000 117.373 89.373 112.000 96.000 112.000 L 160.000 112.000 C 166.627 112.000 172.000 117.373 172.000 124.000 ZM 160.000 152.000 L 96.000 152.000 C 89.373 152.000 84.000 157.373 84.000 164.000 C 84.000 170.627 89.373 176.000 96.000 176.000 L 160.000 176.000 C 166.627 176.000 172.000 170.627 172.000 164.000 C 172.000 157.373 166.627 152.000 160.000 152.000 ZM 220.000 40.000 L 220.000 200.000 C 220.000 219.882 203.882 236.000 184.000 236.000 L 72.000 236.000 C 52.118 236.000 36.000 219.882 36.000 200.000 L 36.000 40.000 C 36.000 33.373 41.373 28.000 48.000 28.000 L 72.000 28.000 L 72.000 24.000 C 72.000 17.373 77.373 12.000 84.000 12.000 C 90.627 12.000 96.000 17.373 96.000 24.000 L 96.000 28.000 L 116.000 28.000 L 116.000 24.000 C 116.000 17.373 121.373 12.000 128.000 12.000 C 134.627 12.000 140.000 17.373 140.000 24.000 L 140.000 28.000 L 160.000 28.000 L 160.000 24.000 C 160.000 17.373 165.373 12.000 172.000 12.000 C 178.627 12.000 184.000 17.373 184.000 24.000 L 184.000 28.000 L 208.000 28.000 C 214.627 28.000 220.000 33.373 220.000 40.000 ZM 196.000 52.000 L 184.000 52.000 L 184.000 56.000 C 184.000 62.627 178.627 68.000 172.000 68.000 C 165.373 68.000 160.000 62.627 160.000 56.000 L 160.000 52.000 L 140.000 52.000 L 140.000 56.000 C 140.000 62.627 134.627 68.000 128.000 68.000 C 121.373 68.000 116.000 62.627 116.000 56.000 L 116.000 52.000 L 96.000 52.000 L 96.000 56.000 C 96.000 62.627 90.627 68.000 84.000 68.000 C 77.373 68.000 72.000 62.627 72.000 56.000 L 72.000 52.000 L 60.000 52.000 L 60.000 200.000 C 60.000 206.627 65.373 212.000 72.000 212.000 L 184.000 212.000 C 190.627 212.000 196.000 206.627 196.000 200.000 Z"),
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
        return _notepad!!
    }

private var _notepad: ImageVector? = null
