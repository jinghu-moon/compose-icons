package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ListDashes: ImageVector
    get() {
        if (_listDashes != null) return _listDashes!!
        _listDashes = phosphorDuotoneIcon(
            name = "ListDashes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 216.000 64.000 L 216.000 192.000 L 96.000 192.000 L 96.000 64.000 Z"),
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
        pathData = parseSvgPathData("M 88.000 64.000 C 88.000 59.582 91.582 56.000 96.000 56.000 L 216.000 56.000 C 220.418 56.000 224.000 59.582 224.000 64.000 C 224.000 68.418 220.418 72.000 216.000 72.000 L 96.000 72.000 C 91.582 72.000 88.000 68.418 88.000 64.000 ZM 216.000 120.000 L 96.000 120.000 C 91.582 120.000 88.000 123.582 88.000 128.000 C 88.000 132.418 91.582 136.000 96.000 136.000 L 216.000 136.000 C 220.418 136.000 224.000 132.418 224.000 128.000 C 224.000 123.582 220.418 120.000 216.000 120.000 ZM 216.000 184.000 L 96.000 184.000 C 91.582 184.000 88.000 187.582 88.000 192.000 C 88.000 196.418 91.582 200.000 96.000 200.000 L 216.000 200.000 C 220.418 200.000 224.000 196.418 224.000 192.000 C 224.000 187.582 220.418 184.000 216.000 184.000 ZM 56.000 56.000 L 40.000 56.000 C 35.582 56.000 32.000 59.582 32.000 64.000 C 32.000 68.418 35.582 72.000 40.000 72.000 L 56.000 72.000 C 60.418 72.000 64.000 68.418 64.000 64.000 C 64.000 59.582 60.418 56.000 56.000 56.000 ZM 56.000 120.000 L 40.000 120.000 C 35.582 120.000 32.000 123.582 32.000 128.000 C 32.000 132.418 35.582 136.000 40.000 136.000 L 56.000 136.000 C 60.418 136.000 64.000 132.418 64.000 128.000 C 64.000 123.582 60.418 120.000 56.000 120.000 ZM 56.000 184.000 L 40.000 184.000 C 35.582 184.000 32.000 187.582 32.000 192.000 C 32.000 196.418 35.582 200.000 40.000 200.000 L 56.000 200.000 C 60.418 200.000 64.000 196.418 64.000 192.000 C 64.000 187.582 60.418 184.000 56.000 184.000 Z"),
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
        return _listDashes!!
    }

private var _listDashes: ImageVector? = null
