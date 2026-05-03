package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Bus: ImageVector
    get() {
        if (_bus != null) return _bus!!
        _bus = phosphorDuotoneIcon(
            name = "Bus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 48.000 184.000 L 88.000 184.000 L 88.000 208.000 C 88.000 212.418 84.418 216.000 80.000 216.000 L 56.000 216.000 C 51.582 216.000 48.000 212.418 48.000 208.000 ZM 168.000 208.000 C 168.000 212.418 171.582 216.000 176.000 216.000 L 200.000 216.000 C 204.418 216.000 208.000 212.418 208.000 208.000 L 208.000 184.000 L 168.000 184.000 ZM 48.000 72.000 L 48.000 112.000 L 208.000 112.000 L 208.000 72.000 Z"),
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
        pathData = parseSvgPathData("M 184.000 32.000 L 72.000 32.000 C 54.327 32.000 40.000 46.327 40.000 64.000 L 40.000 208.000 C 40.000 216.837 47.163 224.000 56.000 224.000 L 80.000 224.000 C 88.837 224.000 96.000 216.837 96.000 208.000 L 96.000 192.000 L 160.000 192.000 L 160.000 208.000 C 160.000 216.837 167.163 224.000 176.000 224.000 L 200.000 224.000 C 208.837 224.000 216.000 216.837 216.000 208.000 L 216.000 64.000 C 216.000 46.327 201.673 32.000 184.000 32.000 ZM 56.000 176.000 L 56.000 120.000 L 200.000 120.000 L 200.000 176.000 ZM 56.000 80.000 L 200.000 80.000 L 200.000 104.000 L 56.000 104.000 ZM 72.000 48.000 L 184.000 48.000 C 192.837 48.000 200.000 55.163 200.000 64.000 L 56.000 64.000 C 56.000 55.163 63.163 48.000 72.000 48.000 ZM 80.000 208.000 L 56.000 208.000 L 56.000 192.000 L 80.000 192.000 ZM 176.000 208.000 L 176.000 192.000 L 200.000 192.000 L 200.000 208.000 ZM 104.000 148.000 C 104.000 154.627 98.627 160.000 92.000 160.000 C 85.373 160.000 80.000 154.627 80.000 148.000 C 80.000 141.373 85.373 136.000 92.000 136.000 C 98.627 136.000 104.000 141.373 104.000 148.000 ZM 176.000 148.000 C 176.000 154.627 170.627 160.000 164.000 160.000 C 157.373 160.000 152.000 154.627 152.000 148.000 C 152.000 141.373 157.373 136.000 164.000 136.000 C 170.627 136.000 176.000 141.373 176.000 148.000 ZM 248.000 80.000 L 248.000 104.000 C 248.000 108.418 244.418 112.000 240.000 112.000 C 235.582 112.000 232.000 108.418 232.000 104.000 L 232.000 80.000 C 232.000 75.582 235.582 72.000 240.000 72.000 C 244.418 72.000 248.000 75.582 248.000 80.000 ZM 24.000 80.000 L 24.000 104.000 C 24.000 108.418 20.418 112.000 16.000 112.000 C 11.582 112.000 8.000 108.418 8.000 104.000 L 8.000 80.000 C 8.000 75.582 11.582 72.000 16.000 72.000 C 20.418 72.000 24.000 75.582 24.000 80.000 Z"),
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
        return _bus!!
    }

private var _bus: ImageVector? = null
