package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Newspaper: ImageVector
    get() {
        if (_newspaper != null) return _newspaper!!
        _newspaper = phosphorFillIcon(
            name = "Newspaper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 48.000 L 56.000 48.000 C 47.163 48.000 40.000 55.163 40.000 64.000 L 40.000 184.000 C 40.000 188.418 36.418 192.000 32.000 192.000 C 27.582 192.000 24.000 188.418 24.000 184.000 L 24.000 88.000 C 24.000 83.582 20.418 80.000 16.000 80.000 C 11.582 80.000 8.000 83.582 8.000 88.000 L 8.000 184.110 C 8.061 197.322 18.788 208.000 32.000 208.000 L 208.000 208.000 C 221.255 208.000 232.000 197.255 232.000 184.000 L 232.000 64.000 C 232.000 55.163 224.837 48.000 216.000 48.000 ZM 176.000 152.000 L 96.000 152.000 C 91.582 152.000 88.000 148.418 88.000 144.000 C 88.000 139.582 91.582 136.000 96.000 136.000 L 176.000 136.000 C 180.418 136.000 184.000 139.582 184.000 144.000 C 184.000 148.418 180.418 152.000 176.000 152.000 ZM 176.000 120.000 L 96.000 120.000 C 91.582 120.000 88.000 116.418 88.000 112.000 C 88.000 107.582 91.582 104.000 96.000 104.000 L 176.000 104.000 C 180.418 104.000 184.000 107.582 184.000 112.000 C 184.000 116.418 180.418 120.000 176.000 120.000 Z"),
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
