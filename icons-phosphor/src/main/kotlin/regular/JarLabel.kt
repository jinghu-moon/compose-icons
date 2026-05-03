package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.JarLabel: ImageVector
    get() {
        if (_jarLabel != null) return _jarLabel!!
        _jarLabel = phosphorRegularIcon(
            name = "JarLabel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 184.000 48.810 L 184.000 32.000 C 184.000 23.163 176.837 16.000 168.000 16.000 L 88.000 16.000 C 79.163 16.000 72.000 23.163 72.000 32.000 L 72.000 48.810 C 53.388 52.629 40.020 69.000 40.000 88.000 L 40.000 200.000 C 40.000 222.091 57.909 240.000 80.000 240.000 L 176.000 240.000 C 198.091 240.000 216.000 222.091 216.000 200.000 L 216.000 88.000 C 215.980 69.000 202.612 52.629 184.000 48.810 ZM 56.000 112.000 L 200.000 112.000 L 200.000 176.000 L 56.000 176.000 ZM 168.000 48.000 L 152.000 48.000 L 152.000 32.000 L 168.000 32.000 ZM 120.000 48.000 L 120.000 32.000 L 136.000 32.000 L 136.000 48.000 ZM 104.000 32.000 L 104.000 48.000 L 88.000 48.000 L 88.000 32.000 ZM 80.000 64.000 L 176.000 64.000 C 189.255 64.000 200.000 74.745 200.000 88.000 L 200.000 96.000 L 56.000 96.000 L 56.000 88.000 C 56.000 74.745 66.745 64.000 80.000 64.000 ZM 176.000 224.000 L 80.000 224.000 C 66.745 224.000 56.000 213.255 56.000 200.000 L 56.000 192.000 L 200.000 192.000 L 200.000 200.000 C 200.000 213.255 189.255 224.000 176.000 224.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _jarLabel!!
    }

private var _jarLabel: ImageVector? = null
