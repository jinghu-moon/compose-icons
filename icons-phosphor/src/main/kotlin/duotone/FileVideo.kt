package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FileVideo: ImageVector
    get() {
        if (_fileVideo != null) return _fileVideo!!
        _fileVideo = phosphorDuotoneIcon(
            name = "FileVideo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 208.000 88.000 L 152.000 88.000 L 152.000 32.000 ZM 120.000 160.000 C 120.000 155.582 116.418 152.000 112.000 152.000 L 48.000 152.000 C 43.582 152.000 40.000 155.582 40.000 160.000 L 40.000 208.000 C 40.000 212.418 43.582 216.000 48.000 216.000 L 112.000 216.000 C 116.418 216.000 120.000 212.418 120.000 208.000 L 120.000 196.000 L 152.000 216.000 L 152.000 152.000 L 120.000 172.000 Z"),
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
        pathData = parseSvgPathData("M 213.660 82.340 L 157.660 26.340 C 156.158 24.840 154.122 23.998 152.000 24.000 L 56.000 24.000 C 47.163 24.000 40.000 31.163 40.000 40.000 L 40.000 112.000 C 40.000 116.418 43.582 120.000 48.000 120.000 C 52.418 120.000 56.000 116.418 56.000 112.000 L 56.000 40.000 L 144.000 40.000 L 144.000 88.000 C 144.000 92.418 147.582 96.000 152.000 96.000 L 200.000 96.000 L 200.000 216.000 L 192.000 216.000 C 187.582 216.000 184.000 219.582 184.000 224.000 C 184.000 228.418 187.582 232.000 192.000 232.000 L 200.000 232.000 C 208.837 232.000 216.000 224.837 216.000 216.000 L 216.000 88.000 C 216.002 85.878 215.160 83.842 213.660 82.340 ZM 160.000 51.310 L 188.690 80.000 L 160.000 80.000 ZM 155.880 145.000 C 153.335 143.592 150.225 143.676 147.760 145.220 L 127.810 157.680 C 126.660 149.831 119.933 144.010 112.000 144.000 L 48.000 144.000 C 39.163 144.000 32.000 151.163 32.000 160.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 112.000 224.000 C 119.933 223.990 126.660 218.169 127.810 210.320 L 147.760 222.780 C 150.226 224.321 153.333 224.403 155.876 222.994 C 158.420 221.585 159.999 218.907 160.000 216.000 L 160.000 152.000 C 160.001 149.091 158.424 146.411 155.880 145.000 ZM 112.000 208.000 L 48.000 208.000 L 48.000 160.000 L 112.000 160.000 L 112.000 208.000 ZM 144.000 201.570 L 128.000 191.570 L 128.000 176.430 L 144.000 166.430 Z"),
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
        return _fileVideo!!
    }

private var _fileVideo: ImageVector? = null
