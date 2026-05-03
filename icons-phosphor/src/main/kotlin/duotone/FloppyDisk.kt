package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FloppyDisk: ImageVector
    get() {
        if (_floppyDisk != null) return _floppyDisk!!
        _floppyDisk = phosphorDuotoneIcon(
            name = "FloppyDisk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 216.000 83.310 L 216.000 208.000 C 216.000 212.418 212.418 216.000 208.000 216.000 L 176.000 216.000 L 176.000 152.000 C 176.000 147.582 172.418 144.000 168.000 144.000 L 88.000 144.000 C 83.582 144.000 80.000 147.582 80.000 152.000 L 80.000 216.000 L 48.000 216.000 C 43.582 216.000 40.000 212.418 40.000 208.000 L 40.000 48.000 C 40.000 43.582 43.582 40.000 48.000 40.000 L 172.690 40.000 C 174.809 40.001 176.841 40.843 178.340 42.340 L 213.660 77.660 C 215.157 79.159 215.999 81.191 216.000 83.310 Z"),
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
