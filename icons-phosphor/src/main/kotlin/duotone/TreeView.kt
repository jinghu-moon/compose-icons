package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TreeView: ImageVector
    get() {
        if (_treeView != null) return _treeView!!
        _treeView = phosphorDuotoneIcon(
            name = "TreeView",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 104.000 32.000 L 104.000 64.000 C 104.000 68.418 100.418 72.000 96.000 72.000 L 64.000 72.000 C 59.582 72.000 56.000 68.418 56.000 64.000 L 56.000 32.000 C 56.000 27.582 59.582 24.000 64.000 24.000 L 96.000 24.000 C 100.418 24.000 104.000 27.582 104.000 32.000 ZM 208.000 96.000 L 176.000 96.000 C 171.582 96.000 168.000 99.582 168.000 104.000 L 168.000 136.000 C 168.000 140.418 171.582 144.000 176.000 144.000 L 208.000 144.000 C 212.418 144.000 216.000 140.418 216.000 136.000 L 216.000 104.000 C 216.000 99.582 212.418 96.000 208.000 96.000 ZM 208.000 184.000 L 176.000 184.000 C 171.582 184.000 168.000 187.582 168.000 192.000 L 168.000 224.000 C 168.000 228.418 171.582 232.000 176.000 232.000 L 208.000 232.000 C 212.418 232.000 216.000 228.418 216.000 224.000 L 216.000 192.000 C 216.000 187.582 212.418 184.000 208.000 184.000 Z"),
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
                pathData = parseSvgPathData("M 176.000 152.000 L 208.000 152.000 C 216.837 152.000 224.000 144.837 224.000 136.000 L 224.000 104.000 C 224.000 95.163 216.837 88.000 208.000 88.000 L 176.000 88.000 C 167.163 88.000 160.000 95.163 160.000 104.000 L 160.000 112.000 L 88.000 112.000 L 88.000 80.000 L 96.000 80.000 C 104.837 80.000 112.000 72.837 112.000 64.000 L 112.000 32.000 C 112.000 23.163 104.837 16.000 96.000 16.000 L 64.000 16.000 C 55.163 16.000 48.000 23.163 48.000 32.000 L 48.000 64.000 C 48.000 72.837 55.163 80.000 64.000 80.000 L 72.000 80.000 L 72.000 192.000 C 72.000 205.255 82.745 216.000 96.000 216.000 L 160.000 216.000 L 160.000 224.000 C 160.000 232.837 167.163 240.000 176.000 240.000 L 208.000 240.000 C 216.837 240.000 224.000 232.837 224.000 224.000 L 224.000 192.000 C 224.000 183.163 216.837 176.000 208.000 176.000 L 176.000 176.000 C 167.163 176.000 160.000 183.163 160.000 192.000 L 160.000 200.000 L 96.000 200.000 C 91.582 200.000 88.000 196.418 88.000 192.000 L 88.000 128.000 L 160.000 128.000 L 160.000 136.000 C 160.000 144.837 167.163 152.000 176.000 152.000 ZM 64.000 32.000 L 96.000 32.000 L 96.000 64.000 L 64.000 64.000 ZM 176.000 192.000 L 208.000 192.000 L 208.000 224.000 L 176.000 224.000 ZM 176.000 104.000 L 208.000 104.000 L 208.000 136.000 L 176.000 136.000 Z"),
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
        return _treeView!!
    }

private var _treeView: ImageVector? = null
