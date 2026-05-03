package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SelectionForeground: ImageVector
    get() {
        if (_selectionForeground != null) return _selectionForeground!!
        _selectionForeground = phosphorDuotoneIcon(
            name = "SelectionForeground",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 168.000 96.000 L 168.000 208.000 C 168.000 212.418 164.418 216.000 160.000 216.000 L 48.000 216.000 C 43.582 216.000 40.000 212.418 40.000 208.000 L 40.000 96.000 C 40.000 91.582 43.582 88.000 48.000 88.000 L 160.000 88.000 C 164.418 88.000 168.000 91.582 168.000 96.000 Z"),
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
                pathData = parseSvgPathData("M 64.000 216.000 C 64.000 220.418 60.418 224.000 56.000 224.000 L 48.000 224.000 C 39.163 224.000 32.000 216.837 32.000 208.000 L 32.000 200.000 C 32.000 195.582 35.582 192.000 40.000 192.000 C 44.418 192.000 48.000 195.582 48.000 200.000 L 48.000 208.000 L 56.000 208.000 C 60.418 208.000 64.000 211.582 64.000 216.000 ZM 112.000 208.000 L 96.000 208.000 C 91.582 208.000 88.000 211.582 88.000 216.000 C 88.000 220.418 91.582 224.000 96.000 224.000 L 112.000 224.000 C 116.418 224.000 120.000 220.418 120.000 216.000 C 120.000 211.582 116.418 208.000 112.000 208.000 ZM 40.000 168.000 C 44.418 168.000 48.000 164.418 48.000 160.000 L 48.000 144.000 C 48.000 139.582 44.418 136.000 40.000 136.000 C 35.582 136.000 32.000 139.582 32.000 144.000 L 32.000 160.000 C 32.000 164.418 35.582 168.000 40.000 168.000 ZM 168.000 192.000 C 163.582 192.000 160.000 195.582 160.000 200.000 L 160.000 208.000 L 152.000 208.000 C 147.582 208.000 144.000 211.582 144.000 216.000 C 144.000 220.418 147.582 224.000 152.000 224.000 L 160.000 224.000 C 168.837 224.000 176.000 216.837 176.000 208.000 L 176.000 200.000 C 176.000 195.582 172.418 192.000 168.000 192.000 ZM 168.000 112.000 C 172.418 112.000 176.000 108.418 176.000 104.000 L 176.000 96.000 C 176.000 87.163 168.837 80.000 160.000 80.000 L 152.000 80.000 C 147.582 80.000 144.000 83.582 144.000 88.000 C 144.000 92.418 147.582 96.000 152.000 96.000 L 160.000 96.000 L 160.000 104.000 C 160.000 108.418 163.582 112.000 168.000 112.000 ZM 56.000 80.000 L 48.000 80.000 C 39.163 80.000 32.000 87.163 32.000 96.000 L 32.000 104.000 C 32.000 108.418 35.582 112.000 40.000 112.000 C 44.418 112.000 48.000 108.418 48.000 104.000 L 48.000 96.000 L 56.000 96.000 C 60.418 96.000 64.000 92.418 64.000 88.000 C 64.000 83.582 60.418 80.000 56.000 80.000 ZM 208.000 32.000 L 96.000 32.000 C 87.163 32.000 80.000 39.163 80.000 48.000 L 80.000 88.000 C 79.989 88.183 79.989 88.367 80.000 88.550 C 80.290 92.752 83.788 96.010 88.000 96.000 L 112.000 96.000 C 116.418 96.000 120.000 92.418 120.000 88.000 C 120.000 83.582 116.418 80.000 112.000 80.000 L 96.000 80.000 L 96.000 48.000 L 208.000 48.000 L 208.000 160.000 L 176.000 160.000 L 176.000 144.000 C 176.000 139.582 172.418 136.000 168.000 136.000 C 163.582 136.000 160.000 139.582 160.000 144.000 L 160.000 168.000 C 160.000 172.418 163.582 176.000 168.000 176.000 L 208.000 176.000 C 216.837 176.000 224.000 168.837 224.000 160.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 Z"),
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
        return _selectionForeground!!
    }

private var _selectionForeground: ImageVector? = null
