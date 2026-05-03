package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SelectionBackground: ImageVector
    get() {
        if (_selectionBackground != null) return _selectionBackground!!
        _selectionBackground = phosphorRegularIcon(
            name = "SelectionBackground",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 160.000 80.000 L 48.000 80.000 C 39.163 80.000 32.000 87.163 32.000 96.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 160.000 224.000 C 168.837 224.000 176.000 216.837 176.000 208.000 L 176.000 96.000 C 176.000 87.163 168.837 80.000 160.000 80.000 ZM 160.000 208.000 L 48.000 208.000 L 48.000 96.000 L 160.000 96.000 ZM 136.000 40.000 C 136.000 35.582 139.582 32.000 144.000 32.000 L 160.000 32.000 C 164.418 32.000 168.000 35.582 168.000 40.000 C 168.000 44.418 164.418 48.000 160.000 48.000 L 144.000 48.000 C 139.582 48.000 136.000 44.418 136.000 40.000 ZM 224.000 48.000 L 224.000 56.000 C 224.000 60.418 220.418 64.000 216.000 64.000 C 211.582 64.000 208.000 60.418 208.000 56.000 L 208.000 48.000 L 200.000 48.000 C 195.582 48.000 192.000 44.418 192.000 40.000 C 192.000 35.582 195.582 32.000 200.000 32.000 L 208.000 32.000 C 216.837 32.000 224.000 39.163 224.000 48.000 ZM 224.000 96.000 L 224.000 112.000 C 224.000 116.418 220.418 120.000 216.000 120.000 C 211.582 120.000 208.000 116.418 208.000 112.000 L 208.000 96.000 C 208.000 91.582 211.582 88.000 216.000 88.000 C 220.418 88.000 224.000 91.582 224.000 96.000 ZM 224.000 152.000 L 224.000 160.000 C 224.000 168.837 216.837 176.000 208.000 176.000 L 200.000 176.000 C 195.582 176.000 192.000 172.418 192.000 168.000 C 192.000 163.582 195.582 160.000 200.000 160.000 L 208.000 160.000 L 208.000 152.000 C 208.000 147.582 211.582 144.000 216.000 144.000 C 220.418 144.000 224.000 147.582 224.000 152.000 ZM 80.000 56.000 L 80.000 48.000 C 80.000 39.163 87.163 32.000 96.000 32.000 L 104.000 32.000 C 108.418 32.000 112.000 35.582 112.000 40.000 C 112.000 44.418 108.418 48.000 104.000 48.000 L 96.000 48.000 L 96.000 56.000 C 96.000 60.418 92.418 64.000 88.000 64.000 C 83.582 64.000 80.000 60.418 80.000 56.000 Z"),
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
        return _selectionBackground!!
    }

private var _selectionBackground: ImageVector? = null
