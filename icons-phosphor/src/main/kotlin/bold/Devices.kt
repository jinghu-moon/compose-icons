package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Devices: ImageVector
    get() {
        if (_devices != null) return _devices!!
        _devices = phosphorBoldIcon(
            name = "Devices",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 72.000 L 212.000 72.000 L 212.000 64.000 C 212.000 48.536 199.464 36.000 184.000 36.000 L 40.000 36.000 C 24.536 36.000 12.000 48.536 12.000 64.000 L 12.000 152.000 C 12.000 167.464 24.536 180.000 40.000 180.000 L 136.000 180.000 L 136.000 192.000 C 136.000 207.464 148.536 220.000 164.000 220.000 L 224.000 220.000 C 239.464 220.000 252.000 207.464 252.000 192.000 L 252.000 100.000 C 252.000 84.536 239.464 72.000 224.000 72.000 ZM 40.000 156.000 C 37.791 156.000 36.000 154.209 36.000 152.000 L 36.000 64.000 C 36.000 61.791 37.791 60.000 40.000 60.000 L 184.000 60.000 C 186.209 60.000 188.000 61.791 188.000 64.000 L 188.000 72.000 L 164.000 72.000 C 148.536 72.000 136.000 84.536 136.000 100.000 L 136.000 156.000 ZM 228.000 192.000 C 228.000 194.209 226.209 196.000 224.000 196.000 L 164.000 196.000 C 161.791 196.000 160.000 194.209 160.000 192.000 L 160.000 100.000 C 160.000 97.791 161.791 96.000 164.000 96.000 L 224.000 96.000 C 226.209 96.000 228.000 97.791 228.000 100.000 ZM 124.000 208.000 C 124.000 214.627 118.627 220.000 112.000 220.000 L 88.000 220.000 C 81.373 220.000 76.000 214.627 76.000 208.000 C 76.000 201.373 81.373 196.000 88.000 196.000 L 112.000 196.000 C 118.627 196.000 124.000 201.373 124.000 208.000 ZM 212.000 124.000 C 212.000 130.627 206.627 136.000 200.000 136.000 L 188.000 136.000 C 181.373 136.000 176.000 130.627 176.000 124.000 C 176.000 117.373 181.373 112.000 188.000 112.000 L 200.000 112.000 C 206.627 112.000 212.000 117.373 212.000 124.000 Z"),
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
        return _devices!!
    }

private var _devices: ImageVector? = null
