package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FileX: ImageVector
    get() {
        if (_fileX != null) return _fileX!!
        _fileX = phosphorRegularIcon(
            name = "FileX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 213.660 82.340 L 157.660 26.340 C 156.158 24.840 154.122 23.998 152.000 24.000 L 56.000 24.000 C 47.163 24.000 40.000 31.163 40.000 40.000 L 40.000 216.000 C 40.000 224.837 47.163 232.000 56.000 232.000 L 200.000 232.000 C 208.837 232.000 216.000 224.837 216.000 216.000 L 216.000 88.000 C 216.002 85.878 215.160 83.842 213.660 82.340 ZM 160.000 51.310 L 188.690 80.000 L 160.000 80.000 ZM 200.000 216.000 L 56.000 216.000 L 56.000 40.000 L 144.000 40.000 L 144.000 88.000 C 144.000 92.418 147.582 96.000 152.000 96.000 L 200.000 96.000 L 200.000 216.000 ZM 157.660 133.660 L 139.310 152.000 L 157.660 170.340 C 160.786 173.466 160.786 178.534 157.660 181.660 C 154.534 184.786 149.466 184.786 146.340 181.660 L 128.000 163.310 L 109.660 181.660 C 106.534 184.786 101.466 184.786 98.340 181.660 C 95.214 178.534 95.214 173.466 98.340 170.340 L 116.690 152.000 L 98.340 133.660 C 95.214 130.534 95.214 125.466 98.340 122.340 C 101.466 119.214 106.534 119.214 109.660 122.340 L 128.000 140.690 L 146.340 122.340 C 149.466 119.214 154.534 119.214 157.660 122.340 C 160.786 125.466 160.786 130.534 157.660 133.660 Z"),
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
        return _fileX!!
    }

private var _fileX: ImageVector? = null
