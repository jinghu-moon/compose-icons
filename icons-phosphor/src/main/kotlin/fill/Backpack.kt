package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Backpack: ImageVector
    get() {
        if (_backpack != null) return _backpack!!
        _backpack = phosphorFillIcon(
            name = "Backpack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 168.000 40.580 L 168.000 32.000 C 168.000 18.745 157.255 8.000 144.000 8.000 L 112.000 8.000 C 98.745 8.000 88.000 18.745 88.000 32.000 L 88.000 40.580 C 60.470 44.593 40.041 68.179 40.000 96.000 L 40.000 216.000 C 40.000 224.837 47.163 232.000 56.000 232.000 L 200.000 232.000 C 208.837 232.000 216.000 224.837 216.000 216.000 L 216.000 96.000 C 215.959 68.179 195.530 44.593 168.000 40.580 ZM 104.000 32.000 C 104.000 27.582 107.582 24.000 112.000 24.000 L 144.000 24.000 C 148.418 24.000 152.000 27.582 152.000 32.000 L 152.000 40.000 L 104.000 40.000 ZM 112.000 72.000 L 144.000 72.000 C 148.418 72.000 152.000 75.582 152.000 80.000 C 152.000 84.418 148.418 88.000 144.000 88.000 L 112.000 88.000 C 107.582 88.000 104.000 84.418 104.000 80.000 C 104.000 75.582 107.582 72.000 112.000 72.000 ZM 176.000 216.000 L 80.000 216.000 L 80.000 176.000 L 136.000 176.000 L 136.000 184.000 C 136.000 188.418 139.582 192.000 144.000 192.000 C 148.418 192.000 152.000 188.418 152.000 184.000 L 152.000 176.000 L 176.000 176.000 ZM 176.000 160.000 L 80.000 160.000 L 80.000 152.000 C 80.000 143.163 87.163 136.000 96.000 136.000 L 160.000 136.000 C 168.837 136.000 176.000 143.163 176.000 152.000 Z"),
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
