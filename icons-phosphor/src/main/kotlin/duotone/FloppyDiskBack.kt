package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FloppyDiskBack: ImageVector
    get() {
        if (_floppyDiskBack != null) return _floppyDiskBack!!
        _floppyDiskBack = phosphorDuotoneIcon(
            name = "FloppyDiskBack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 208.000 40.000 L 176.000 40.000 L 176.000 80.000 C 176.000 84.418 172.418 88.000 168.000 88.000 L 88.000 88.000 C 83.582 88.000 80.000 84.418 80.000 80.000 L 80.000 40.730 C 79.130 41.123 78.338 41.668 77.660 42.340 L 42.340 77.660 C 40.843 79.159 40.001 81.191 40.000 83.310 L 40.000 208.000 C 40.000 212.418 43.582 216.000 48.000 216.000 L 208.000 216.000 C 212.418 216.000 216.000 212.418 216.000 208.000 L 216.000 48.000 C 216.000 43.582 212.418 40.000 208.000 40.000 ZM 128.000 184.000 C 110.327 184.000 96.000 169.673 96.000 152.000 C 96.000 134.327 110.327 120.000 128.000 120.000 C 145.673 120.000 160.000 134.327 160.000 152.000 C 160.000 169.673 145.673 184.000 128.000 184.000 Z"),
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
        pathData = parseSvgPathData("M 208.000 32.000 L 83.310 32.000 C 79.064 31.986 74.990 33.676 72.000 36.690 L 36.690 72.000 C 33.676 74.990 31.986 79.064 32.000 83.310 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 88.000 48.000 L 168.000 48.000 L 168.000 80.000 L 88.000 80.000 ZM 208.000 208.000 L 48.000 208.000 L 48.000 83.310 L 72.000 59.310 L 72.000 80.000 C 72.000 88.837 79.163 96.000 88.000 96.000 L 168.000 96.000 C 176.837 96.000 184.000 88.837 184.000 80.000 L 184.000 48.000 L 208.000 48.000 ZM 128.000 112.000 C 105.909 112.000 88.000 129.909 88.000 152.000 C 88.000 174.091 105.909 192.000 128.000 192.000 C 150.091 192.000 168.000 174.091 168.000 152.000 C 168.000 129.909 150.091 112.000 128.000 112.000 ZM 128.000 176.000 C 114.745 176.000 104.000 165.255 104.000 152.000 C 104.000 138.745 114.745 128.000 128.000 128.000 C 141.255 128.000 152.000 138.745 152.000 152.000 C 152.000 165.255 141.255 176.000 128.000 176.000 Z"),
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
        return _floppyDiskBack!!
    }

private var _floppyDiskBack: ImageVector? = null
