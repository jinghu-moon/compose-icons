package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FloppyDisk: ImageVector
    get() {
        if (_floppyDisk != null) return _floppyDisk!!
        _floppyDisk = phosphorRegularIcon(
            name = "FloppyDisk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 219.310 72.000 L 184.000 36.690 C 181.010 33.676 176.936 31.986 172.690 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 83.310 C 224.014 79.064 222.324 74.990 219.310 72.000 ZM 168.000 208.000 L 88.000 208.000 L 88.000 152.000 L 168.000 152.000 ZM 208.000 208.000 L 184.000 208.000 L 184.000 152.000 C 184.000 143.163 176.837 136.000 168.000 136.000 L 88.000 136.000 C 79.163 136.000 72.000 143.163 72.000 152.000 L 72.000 208.000 L 48.000 208.000 L 48.000 48.000 L 172.690 48.000 L 208.000 83.310 ZM 160.000 72.000 C 160.000 76.418 156.418 80.000 152.000 80.000 L 96.000 80.000 C 91.582 80.000 88.000 76.418 88.000 72.000 C 88.000 67.582 91.582 64.000 96.000 64.000 L 152.000 64.000 C 156.418 64.000 160.000 67.582 160.000 72.000 Z"),
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
        return _floppyDisk!!
    }

private var _floppyDisk: ImageVector? = null
