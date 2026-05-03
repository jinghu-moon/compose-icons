package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Barbell: ImageVector
    get() {
        if (_barbell != null) return _barbell!!
        _barbell = phosphorDuotoneIcon(
            name = "Barbell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 96.000 64.000 L 96.000 192.000 C 96.000 196.418 92.418 200.000 88.000 200.000 L 64.000 200.000 C 59.582 200.000 56.000 196.418 56.000 192.000 L 56.000 64.000 C 56.000 59.582 59.582 56.000 64.000 56.000 L 88.000 56.000 C 92.418 56.000 96.000 59.582 96.000 64.000 ZM 192.000 56.000 L 168.000 56.000 C 163.582 56.000 160.000 59.582 160.000 64.000 L 160.000 192.000 C 160.000 196.418 163.582 200.000 168.000 200.000 L 192.000 200.000 C 196.418 200.000 200.000 196.418 200.000 192.000 L 200.000 64.000 C 200.000 59.582 196.418 56.000 192.000 56.000 Z"),
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
        pathData = parseSvgPathData("M 248.000 120.000 L 240.000 120.000 L 240.000 88.000 C 240.000 79.163 232.837 72.000 224.000 72.000 L 208.000 72.000 L 208.000 64.000 C 208.000 55.163 200.837 48.000 192.000 48.000 L 168.000 48.000 C 159.163 48.000 152.000 55.163 152.000 64.000 L 152.000 120.000 L 104.000 120.000 L 104.000 64.000 C 104.000 55.163 96.837 48.000 88.000 48.000 L 64.000 48.000 C 55.163 48.000 48.000 55.163 48.000 64.000 L 48.000 72.000 L 32.000 72.000 C 23.163 72.000 16.000 79.163 16.000 88.000 L 16.000 120.000 L 8.000 120.000 C 3.582 120.000 0.000 123.582 0.000 128.000 C 0.000 132.418 3.582 136.000 8.000 136.000 L 16.000 136.000 L 16.000 168.000 C 16.000 176.837 23.163 184.000 32.000 184.000 L 48.000 184.000 L 48.000 192.000 C 48.000 200.837 55.163 208.000 64.000 208.000 L 88.000 208.000 C 96.837 208.000 104.000 200.837 104.000 192.000 L 104.000 136.000 L 152.000 136.000 L 152.000 192.000 C 152.000 200.837 159.163 208.000 168.000 208.000 L 192.000 208.000 C 200.837 208.000 208.000 200.837 208.000 192.000 L 208.000 184.000 L 224.000 184.000 C 232.837 184.000 240.000 176.837 240.000 168.000 L 240.000 136.000 L 248.000 136.000 C 252.418 136.000 256.000 132.418 256.000 128.000 C 256.000 123.582 252.418 120.000 248.000 120.000 ZM 32.000 168.000 L 32.000 88.000 L 48.000 88.000 L 48.000 168.000 ZM 88.000 192.000 L 64.000 192.000 L 64.000 64.000 L 88.000 64.000 L 88.000 192.000 ZM 192.000 192.000 L 168.000 192.000 L 168.000 64.000 L 192.000 64.000 L 192.000 175.830 C 192.000 175.890 192.000 175.940 192.000 176.000 C 192.000 176.060 192.000 176.120 192.000 176.170 L 192.000 192.000 ZM 224.000 168.000 L 208.000 168.000 L 208.000 88.000 L 224.000 88.000 Z"),
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
        return _barbell!!
    }

private var _barbell: ImageVector? = null
