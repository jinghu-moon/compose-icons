package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Building: ImageVector
    get() {
        if (_building != null) return _building!!
        _building = phosphorDuotoneIcon(
            name = "Building",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 200.000 24.000 L 200.000 232.000 L 152.000 232.000 L 152.000 184.000 L 104.000 184.000 L 104.000 232.000 L 56.000 232.000 L 56.000 24.000 Z"),
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
        pathData = parseSvgPathData("M 232.000 224.000 L 208.000 224.000 L 208.000 32.000 L 216.000 32.000 C 220.418 32.000 224.000 28.418 224.000 24.000 C 224.000 19.582 220.418 16.000 216.000 16.000 L 40.000 16.000 C 35.582 16.000 32.000 19.582 32.000 24.000 C 32.000 28.418 35.582 32.000 40.000 32.000 L 48.000 32.000 L 48.000 224.000 L 24.000 224.000 C 19.582 224.000 16.000 227.582 16.000 232.000 C 16.000 236.418 19.582 240.000 24.000 240.000 L 232.000 240.000 C 236.418 240.000 240.000 236.418 240.000 232.000 C 240.000 227.582 236.418 224.000 232.000 224.000 ZM 64.000 32.000 L 192.000 32.000 L 192.000 224.000 L 160.000 224.000 L 160.000 184.000 C 160.000 179.582 156.418 176.000 152.000 176.000 L 104.000 176.000 C 99.582 176.000 96.000 179.582 96.000 184.000 L 96.000 224.000 L 64.000 224.000 ZM 144.000 224.000 L 112.000 224.000 L 112.000 192.000 L 144.000 192.000 ZM 88.000 64.000 C 88.000 59.582 91.582 56.000 96.000 56.000 L 112.000 56.000 C 116.418 56.000 120.000 59.582 120.000 64.000 C 120.000 68.418 116.418 72.000 112.000 72.000 L 96.000 72.000 C 91.582 72.000 88.000 68.418 88.000 64.000 ZM 136.000 64.000 C 136.000 59.582 139.582 56.000 144.000 56.000 L 160.000 56.000 C 164.418 56.000 168.000 59.582 168.000 64.000 C 168.000 68.418 164.418 72.000 160.000 72.000 L 144.000 72.000 C 139.582 72.000 136.000 68.418 136.000 64.000 ZM 88.000 104.000 C 88.000 99.582 91.582 96.000 96.000 96.000 L 112.000 96.000 C 116.418 96.000 120.000 99.582 120.000 104.000 C 120.000 108.418 116.418 112.000 112.000 112.000 L 96.000 112.000 C 91.582 112.000 88.000 108.418 88.000 104.000 ZM 136.000 104.000 C 136.000 99.582 139.582 96.000 144.000 96.000 L 160.000 96.000 C 164.418 96.000 168.000 99.582 168.000 104.000 C 168.000 108.418 164.418 112.000 160.000 112.000 L 144.000 112.000 C 139.582 112.000 136.000 108.418 136.000 104.000 ZM 88.000 144.000 C 88.000 139.582 91.582 136.000 96.000 136.000 L 112.000 136.000 C 116.418 136.000 120.000 139.582 120.000 144.000 C 120.000 148.418 116.418 152.000 112.000 152.000 L 96.000 152.000 C 91.582 152.000 88.000 148.418 88.000 144.000 ZM 136.000 144.000 C 136.000 139.582 139.582 136.000 144.000 136.000 L 160.000 136.000 C 164.418 136.000 168.000 139.582 168.000 144.000 C 168.000 148.418 164.418 152.000 160.000 152.000 L 144.000 152.000 C 139.582 152.000 136.000 148.418 136.000 144.000 Z"),
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
        return _building!!
    }

private var _building: ImageVector? = null
