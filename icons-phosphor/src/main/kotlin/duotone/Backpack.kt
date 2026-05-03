package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Backpack: ImageVector
    get() {
        if (_backpack != null) return _backpack!!
        _backpack = phosphorDuotoneIcon(
            name = "Backpack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 208.000 96.000 L 208.000 216.000 C 208.000 220.418 204.418 224.000 200.000 224.000 L 176.000 224.000 L 176.000 152.000 C 176.000 143.163 168.837 136.000 160.000 136.000 L 96.000 136.000 C 87.163 136.000 80.000 143.163 80.000 152.000 L 80.000 224.000 L 56.000 224.000 C 51.582 224.000 48.000 220.418 48.000 216.000 L 48.000 96.000 C 48.000 69.490 69.490 48.000 96.000 48.000 L 160.000 48.000 C 186.510 48.000 208.000 69.490 208.000 96.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 168.000 40.580 L 168.000 32.000 C 168.000 18.745 157.255 8.000 144.000 8.000 L 112.000 8.000 C 98.745 8.000 88.000 18.745 88.000 32.000 L 88.000 40.580 C 60.470 44.593 40.041 68.179 40.000 96.000 L 40.000 216.000 C 40.000 224.837 47.163 232.000 56.000 232.000 L 200.000 232.000 C 208.837 232.000 216.000 224.837 216.000 216.000 L 216.000 96.000 C 215.959 68.179 195.530 44.593 168.000 40.580 ZM 112.000 24.000 L 144.000 24.000 C 148.418 24.000 152.000 27.582 152.000 32.000 L 152.000 40.000 L 104.000 40.000 L 104.000 32.000 C 104.000 27.582 107.582 24.000 112.000 24.000 ZM 168.000 160.000 L 88.000 160.000 L 88.000 152.000 C 88.000 147.582 91.582 144.000 96.000 144.000 L 160.000 144.000 C 164.418 144.000 168.000 147.582 168.000 152.000 ZM 88.000 176.000 L 136.000 176.000 L 136.000 184.000 C 136.000 188.418 139.582 192.000 144.000 192.000 C 148.418 192.000 152.000 188.418 152.000 184.000 L 152.000 176.000 L 168.000 176.000 L 168.000 216.000 L 88.000 216.000 ZM 200.000 216.000 L 184.000 216.000 L 184.000 152.000 C 184.000 138.745 173.255 128.000 160.000 128.000 L 96.000 128.000 C 82.745 128.000 72.000 138.745 72.000 152.000 L 72.000 216.000 L 56.000 216.000 L 56.000 96.000 C 56.000 73.909 73.909 56.000 96.000 56.000 L 160.000 56.000 C 182.091 56.000 200.000 73.909 200.000 96.000 L 200.000 216.000 ZM 152.000 88.000 C 152.000 92.418 148.418 96.000 144.000 96.000 L 112.000 96.000 C 107.582 96.000 104.000 92.418 104.000 88.000 C 104.000 83.582 107.582 80.000 112.000 80.000 L 144.000 80.000 C 148.418 80.000 152.000 83.582 152.000 88.000 Z"),
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
