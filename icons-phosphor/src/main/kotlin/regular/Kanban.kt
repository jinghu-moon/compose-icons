package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Kanban: ImageVector
    get() {
        if (_kanban != null) return _kanban!!
        _kanban = phosphorRegularIcon(
            name = "Kanban",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 48.000 L 40.000 48.000 C 35.582 48.000 32.000 51.582 32.000 56.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 88.000 224.000 C 96.837 224.000 104.000 216.837 104.000 208.000 L 104.000 160.000 L 152.000 160.000 L 152.000 176.000 C 152.000 184.837 159.163 192.000 168.000 192.000 L 208.000 192.000 C 216.837 192.000 224.000 184.837 224.000 176.000 L 224.000 56.000 C 224.000 51.582 220.418 48.000 216.000 48.000 ZM 88.000 208.000 L 48.000 208.000 L 48.000 128.000 L 88.000 128.000 ZM 88.000 112.000 L 48.000 112.000 L 48.000 64.000 L 88.000 64.000 ZM 152.000 144.000 L 104.000 144.000 L 104.000 64.000 L 152.000 64.000 ZM 208.000 176.000 L 168.000 176.000 L 168.000 128.000 L 208.000 128.000 ZM 208.000 112.000 L 168.000 112.000 L 168.000 64.000 L 208.000 64.000 Z"),
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
        return _kanban!!
    }

private var _kanban: ImageVector? = null
