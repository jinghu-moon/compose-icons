package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FileIni: ImageVector
    get() {
        if (_fileIni != null) return _fileIni!!
        _fileIni = phosphorRegularIcon(
            name = "FileIni",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 48.000 152.000 L 48.000 208.000 C 48.000 212.418 44.418 216.000 40.000 216.000 C 35.582 216.000 32.000 212.418 32.000 208.000 L 32.000 152.000 C 32.000 147.582 35.582 144.000 40.000 144.000 C 44.418 144.000 48.000 147.582 48.000 152.000 ZM 120.000 144.000 C 115.582 144.000 112.000 147.582 112.000 152.000 L 112.000 183.000 L 86.510 147.350 C 84.489 144.520 80.870 143.320 77.559 144.381 C 74.247 145.443 72.000 148.522 72.000 152.000 L 72.000 208.000 C 72.000 212.418 75.582 216.000 80.000 216.000 C 84.418 216.000 88.000 212.418 88.000 208.000 L 88.000 177.000 L 113.490 212.690 C 115.000 214.777 117.424 216.009 120.000 216.000 C 120.828 216.002 121.652 215.874 122.440 215.620 C 125.753 214.559 128.001 211.479 128.000 208.000 L 128.000 152.000 C 128.000 147.582 124.418 144.000 120.000 144.000 ZM 160.000 144.000 C 155.582 144.000 152.000 147.582 152.000 152.000 L 152.000 208.000 C 152.000 212.418 155.582 216.000 160.000 216.000 C 164.418 216.000 168.000 212.418 168.000 208.000 L 168.000 152.000 C 168.000 147.582 164.418 144.000 160.000 144.000 ZM 216.000 88.000 L 216.000 224.000 C 216.000 228.418 212.418 232.000 208.000 232.000 C 203.582 232.000 200.000 228.418 200.000 224.000 L 200.000 96.000 L 152.000 96.000 C 147.582 96.000 144.000 92.418 144.000 88.000 L 144.000 40.000 L 56.000 40.000 L 56.000 112.000 C 56.000 116.418 52.418 120.000 48.000 120.000 C 43.582 120.000 40.000 116.418 40.000 112.000 L 40.000 40.000 C 40.000 31.163 47.163 24.000 56.000 24.000 L 152.000 24.000 C 154.122 23.998 156.158 24.840 157.660 26.340 L 213.660 82.340 C 215.160 83.842 216.002 85.878 216.000 88.000 ZM 160.000 80.000 L 188.690 80.000 L 160.000 51.310 Z"),
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
        return _fileIni!!
    }

private var _fileIni: ImageVector? = null
