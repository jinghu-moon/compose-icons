package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Kanban: ImageVector
    get() {
        if (_kanban != null) return _kanban!!
        _kanban = phosphorDuotoneIcon(
            name = "Kanban",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 216.000 56.000 L 216.000 120.000 L 160.000 120.000 L 160.000 56.000 ZM 40.000 208.000 C 40.000 212.418 43.582 216.000 48.000 216.000 L 88.000 216.000 C 92.418 216.000 96.000 212.418 96.000 208.000 L 96.000 120.000 L 40.000 120.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 216.000 48.000 L 40.000 48.000 C 35.582 48.000 32.000 51.582 32.000 56.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 88.000 224.000 C 96.837 224.000 104.000 216.837 104.000 208.000 L 104.000 160.000 L 152.000 160.000 L 152.000 176.000 C 152.000 184.837 159.163 192.000 168.000 192.000 L 208.000 192.000 C 216.837 192.000 224.000 184.837 224.000 176.000 L 224.000 56.000 C 224.000 51.582 220.418 48.000 216.000 48.000 ZM 208.000 112.000 L 168.000 112.000 L 168.000 64.000 L 208.000 64.000 ZM 88.000 64.000 L 88.000 112.000 L 48.000 112.000 L 48.000 64.000 ZM 88.000 208.000 L 48.000 208.000 L 48.000 128.000 L 88.000 128.000 ZM 104.000 144.000 L 104.000 64.000 L 152.000 64.000 L 152.000 144.000 ZM 168.000 176.000 L 168.000 128.000 L 208.000 128.000 L 208.000 176.000 Z"),
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
