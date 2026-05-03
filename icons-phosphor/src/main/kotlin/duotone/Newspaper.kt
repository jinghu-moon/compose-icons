package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Newspaper: ImageVector
    get() {
        if (_newspaper != null) return _newspaper!!
        _newspaper = phosphorDuotoneIcon(
            name = "Newspaper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 224.000 64.000 L 224.000 184.000 C 224.000 192.837 216.837 200.000 208.000 200.000 L 32.000 200.000 C 40.837 200.000 48.000 192.837 48.000 184.000 L 48.000 64.000 C 48.000 59.582 51.582 56.000 56.000 56.000 L 216.000 56.000 C 220.418 56.000 224.000 59.582 224.000 64.000 Z"),
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
        pathData = parseSvgPathData("M 88.000 112.000 C 88.000 107.582 91.582 104.000 96.000 104.000 L 176.000 104.000 C 180.418 104.000 184.000 107.582 184.000 112.000 C 184.000 116.418 180.418 120.000 176.000 120.000 L 96.000 120.000 C 91.582 120.000 88.000 116.418 88.000 112.000 ZM 96.000 152.000 L 176.000 152.000 C 180.418 152.000 184.000 148.418 184.000 144.000 C 184.000 139.582 180.418 136.000 176.000 136.000 L 96.000 136.000 C 91.582 136.000 88.000 139.582 88.000 144.000 C 88.000 148.418 91.582 152.000 96.000 152.000 ZM 232.000 64.000 L 232.000 184.000 C 232.000 197.255 221.255 208.000 208.000 208.000 L 32.000 208.000 C 18.788 208.000 8.061 197.322 8.000 184.110 L 8.000 88.000 C 8.000 83.582 11.582 80.000 16.000 80.000 C 20.418 80.000 24.000 83.582 24.000 88.000 L 24.000 184.000 C 24.000 188.418 27.582 192.000 32.000 192.000 C 36.418 192.000 40.000 188.418 40.000 184.000 L 40.000 64.000 C 40.000 55.163 47.163 48.000 56.000 48.000 L 216.000 48.000 C 224.837 48.000 232.000 55.163 232.000 64.000 ZM 216.000 64.000 L 56.000 64.000 L 56.000 184.000 C 56.004 186.725 55.541 189.431 54.630 192.000 L 208.000 192.000 C 212.418 192.000 216.000 188.418 216.000 184.000 Z"),
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
        return _newspaper!!
    }

private var _newspaper: ImageVector? = null
