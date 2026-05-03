package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Backpack: ImageVector
    get() {
        if (_backpack != null) return _backpack!!
        _backpack = phosphorBoldIcon(
            name = "Backpack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 172.000 48.550 L 172.000 36.000 C 172.000 20.536 159.464 8.000 144.000 8.000 L 112.000 8.000 C 96.536 8.000 84.000 20.536 84.000 36.000 L 84.000 48.550 C 54.246 52.588 32.042 77.973 32.000 108.000 L 32.000 220.000 C 32.000 231.046 40.954 240.000 52.000 240.000 L 204.000 240.000 C 215.046 240.000 224.000 231.046 224.000 220.000 L 224.000 108.000 C 223.958 77.973 201.754 52.588 172.000 48.550 ZM 112.000 32.000 L 144.000 32.000 C 146.209 32.000 148.000 33.791 148.000 36.000 L 148.000 48.000 L 108.000 48.000 L 108.000 36.000 C 108.000 33.791 109.791 32.000 112.000 32.000 ZM 160.000 160.000 L 96.000 160.000 L 96.000 152.000 C 96.000 149.791 97.791 148.000 100.000 148.000 L 156.000 148.000 C 158.209 148.000 160.000 149.791 160.000 152.000 ZM 96.000 184.000 L 160.000 184.000 L 160.000 216.000 L 96.000 216.000 ZM 200.000 216.000 L 184.000 216.000 L 184.000 152.000 C 184.000 136.536 171.464 124.000 156.000 124.000 L 100.000 124.000 C 84.536 124.000 72.000 136.536 72.000 152.000 L 72.000 216.000 L 56.000 216.000 L 56.000 108.000 C 56.000 88.118 72.118 72.000 92.000 72.000 L 164.000 72.000 C 183.882 72.000 200.000 88.118 200.000 108.000 ZM 160.000 100.000 C 160.000 106.627 154.627 112.000 148.000 112.000 L 108.000 112.000 C 101.373 112.000 96.000 106.627 96.000 100.000 C 96.000 93.373 101.373 88.000 108.000 88.000 L 148.000 88.000 C 154.627 88.000 160.000 93.373 160.000 100.000 Z"),
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
        return _backpack!!
    }

private var _backpack: ImageVector? = null
