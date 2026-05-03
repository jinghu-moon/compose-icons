package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ColumnsPlusRight: ImageVector
    get() {
        if (_columnsPlusRight != null) return _columnsPlusRight!!
        _columnsPlusRight = phosphorDuotoneIcon(
            name = "ColumnsPlusRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 88.000 48.000 L 88.000 208.000 C 88.000 212.418 84.418 216.000 80.000 216.000 L 56.000 216.000 C 51.582 216.000 48.000 212.418 48.000 208.000 L 48.000 48.000 C 48.000 43.582 51.582 40.000 56.000 40.000 L 80.000 40.000 C 84.418 40.000 88.000 43.582 88.000 48.000 ZM 152.000 40.000 L 128.000 40.000 C 123.582 40.000 120.000 43.582 120.000 48.000 L 120.000 208.000 C 120.000 212.418 123.582 216.000 128.000 216.000 L 152.000 216.000 C 156.418 216.000 160.000 212.418 160.000 208.000 L 160.000 48.000 C 160.000 43.582 156.418 40.000 152.000 40.000 Z"),
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
        pathData = parseSvgPathData("M 80.000 32.000 L 56.000 32.000 C 47.163 32.000 40.000 39.163 40.000 48.000 L 40.000 208.000 C 40.000 216.837 47.163 224.000 56.000 224.000 L 80.000 224.000 C 88.837 224.000 96.000 216.837 96.000 208.000 L 96.000 48.000 C 96.000 39.163 88.837 32.000 80.000 32.000 ZM 80.000 208.000 L 56.000 208.000 L 56.000 48.000 L 80.000 48.000 ZM 152.000 32.000 L 128.000 32.000 C 119.163 32.000 112.000 39.163 112.000 48.000 L 112.000 208.000 C 112.000 216.837 119.163 224.000 128.000 224.000 L 152.000 224.000 C 160.837 224.000 168.000 216.837 168.000 208.000 L 168.000 48.000 C 168.000 39.163 160.837 32.000 152.000 32.000 ZM 152.000 208.000 L 128.000 208.000 L 128.000 48.000 L 152.000 48.000 ZM 248.000 128.000 C 248.000 132.418 244.418 136.000 240.000 136.000 L 224.000 136.000 L 224.000 152.000 C 224.000 156.418 220.418 160.000 216.000 160.000 C 211.582 160.000 208.000 156.418 208.000 152.000 L 208.000 136.000 L 192.000 136.000 C 187.582 136.000 184.000 132.418 184.000 128.000 C 184.000 123.582 187.582 120.000 192.000 120.000 L 208.000 120.000 L 208.000 104.000 C 208.000 99.582 211.582 96.000 216.000 96.000 C 220.418 96.000 224.000 99.582 224.000 104.000 L 224.000 120.000 L 240.000 120.000 C 244.418 120.000 248.000 123.582 248.000 128.000 Z"),
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
        return _columnsPlusRight!!
    }

private var _columnsPlusRight: ImageVector? = null
