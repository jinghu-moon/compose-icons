package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FileArchive: ImageVector
    get() {
        if (_fileArchive != null) return _fileArchive!!
        _fileArchive = phosphorRegularIcon(
            name = "FileArchive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 213.660 82.340 L 157.660 26.340 C 156.158 24.840 154.122 23.998 152.000 24.000 L 56.000 24.000 C 47.163 24.000 40.000 31.163 40.000 40.000 L 40.000 216.000 C 40.000 224.837 47.163 232.000 56.000 232.000 L 200.000 232.000 C 208.837 232.000 216.000 224.837 216.000 216.000 L 216.000 88.000 C 216.002 85.878 215.160 83.842 213.660 82.340 ZM 160.000 51.310 L 188.690 80.000 L 160.000 80.000 ZM 200.000 216.000 L 112.000 216.000 L 112.000 200.000 L 120.000 200.000 C 124.418 200.000 128.000 196.418 128.000 192.000 C 128.000 187.582 124.418 184.000 120.000 184.000 L 112.000 184.000 L 112.000 168.000 L 120.000 168.000 C 124.418 168.000 128.000 164.418 128.000 160.000 C 128.000 155.582 124.418 152.000 120.000 152.000 L 112.000 152.000 L 112.000 136.000 L 120.000 136.000 C 124.418 136.000 128.000 132.418 128.000 128.000 C 128.000 123.582 124.418 120.000 120.000 120.000 L 112.000 120.000 L 112.000 112.000 C 112.000 107.582 108.418 104.000 104.000 104.000 C 99.582 104.000 96.000 107.582 96.000 112.000 L 96.000 120.000 L 88.000 120.000 C 83.582 120.000 80.000 123.582 80.000 128.000 C 80.000 132.418 83.582 136.000 88.000 136.000 L 96.000 136.000 L 96.000 152.000 L 88.000 152.000 C 83.582 152.000 80.000 155.582 80.000 160.000 C 80.000 164.418 83.582 168.000 88.000 168.000 L 96.000 168.000 L 96.000 184.000 L 88.000 184.000 C 83.582 184.000 80.000 187.582 80.000 192.000 C 80.000 196.418 83.582 200.000 88.000 200.000 L 96.000 200.000 L 96.000 216.000 L 56.000 216.000 L 56.000 40.000 L 144.000 40.000 L 144.000 88.000 C 144.000 92.418 147.582 96.000 152.000 96.000 L 200.000 96.000 L 200.000 216.000 Z"),
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
        return _fileArchive!!
    }

private var _fileArchive: ImageVector? = null
