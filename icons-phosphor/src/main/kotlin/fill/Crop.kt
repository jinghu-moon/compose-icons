package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Crop: ImageVector
    get() {
        if (_crop != null) return _crop!!
        _crop = phosphorFillIcon(
            name = "Crop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 120.000 80.000 L 168.000 80.000 C 172.418 80.000 176.000 83.582 176.000 88.000 L 176.000 136.000 C 176.000 140.418 172.418 144.000 168.000 144.000 C 163.582 144.000 160.000 140.418 160.000 136.000 L 160.000 96.000 L 120.000 96.000 C 115.582 96.000 112.000 92.418 112.000 88.000 C 112.000 83.582 115.582 80.000 120.000 80.000 ZM 192.000 176.000 L 176.000 176.000 L 176.000 192.000 C 176.000 196.418 172.418 200.000 168.000 200.000 C 163.582 200.000 160.000 196.418 160.000 192.000 L 160.000 176.000 L 88.000 176.000 C 83.582 176.000 80.000 172.418 80.000 168.000 L 80.000 96.000 L 64.000 96.000 C 59.582 96.000 56.000 92.418 56.000 88.000 C 56.000 83.582 59.582 80.000 64.000 80.000 L 80.000 80.000 L 80.000 64.000 C 80.000 59.582 83.582 56.000 88.000 56.000 C 92.418 56.000 96.000 59.582 96.000 64.000 L 96.000 160.000 L 192.000 160.000 C 196.418 160.000 200.000 163.582 200.000 168.000 C 200.000 172.418 196.418 176.000 192.000 176.000 Z"),
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
        return _crop!!
    }

private var _crop: ImageVector? = null
