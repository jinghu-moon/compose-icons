package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ReplitLogo: ImageVector
    get() {
        if (_replitLogo != null) return _replitLogo!!
        _replitLogo = phosphorDuotoneIcon(
            name = "ReplitLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 72.000 160.000 L 144.000 160.000 L 144.000 216.000 C 144.000 220.418 140.418 224.000 136.000 224.000 L 72.000 224.000 C 67.582 224.000 64.000 220.418 64.000 216.000 L 64.000 168.000 C 64.000 163.582 67.582 160.000 72.000 160.000 ZM 216.000 96.000 L 144.000 96.000 L 144.000 160.000 L 216.000 160.000 C 220.418 160.000 224.000 156.418 224.000 152.000 L 224.000 104.000 C 224.000 99.582 220.418 96.000 216.000 96.000 ZM 136.000 32.000 L 72.000 32.000 C 67.582 32.000 64.000 35.582 64.000 40.000 L 64.000 88.000 C 64.000 92.418 67.582 96.000 72.000 96.000 L 144.000 96.000 L 144.000 40.000 C 144.000 35.582 140.418 32.000 136.000 32.000 Z"),
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
        pathData = parseSvgPathData("M 216.000 88.000 L 152.000 88.000 L 152.000 40.000 C 152.000 31.163 144.837 24.000 136.000 24.000 L 72.000 24.000 C 63.163 24.000 56.000 31.163 56.000 40.000 L 56.000 88.000 C 56.000 96.837 63.163 104.000 72.000 104.000 L 136.000 104.000 L 136.000 152.000 L 72.000 152.000 C 63.163 152.000 56.000 159.163 56.000 168.000 L 56.000 216.000 C 56.000 224.837 63.163 232.000 72.000 232.000 L 136.000 232.000 C 144.837 232.000 152.000 224.837 152.000 216.000 L 152.000 168.000 L 216.000 168.000 C 224.837 168.000 232.000 160.837 232.000 152.000 L 232.000 104.000 C 232.000 95.163 224.837 88.000 216.000 88.000 ZM 136.000 216.000 L 72.000 216.000 L 72.000 168.000 L 136.000 168.000 ZM 136.000 40.000 L 136.000 88.000 L 72.000 88.000 L 72.000 40.000 L 136.000 40.000 ZM 216.000 152.000 L 152.000 152.000 L 152.000 104.000 L 216.000 104.000 Z"),
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
        return _replitLogo!!
    }

private var _replitLogo: ImageVector? = null
