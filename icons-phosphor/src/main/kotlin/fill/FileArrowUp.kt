package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FileArrowUp: ImageVector
    get() {
        if (_fileArrowUp != null) return _fileArrowUp!!
        _fileArrowUp = phosphorFillIcon(
            name = "FileArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 213.660 82.340 L 157.660 26.340 C 156.158 24.840 154.122 23.998 152.000 24.000 L 56.000 24.000 C 47.163 24.000 40.000 31.163 40.000 40.000 L 40.000 216.000 C 40.000 224.837 47.163 232.000 56.000 232.000 L 200.000 232.000 C 208.837 232.000 216.000 224.837 216.000 216.000 L 216.000 88.000 C 216.002 85.878 215.160 83.842 213.660 82.340 ZM 157.660 149.660 C 156.159 151.162 154.123 152.006 152.000 152.006 C 149.877 152.006 147.841 151.162 146.340 149.660 L 136.000 139.310 L 136.000 184.000 C 136.000 188.418 132.418 192.000 128.000 192.000 C 123.582 192.000 120.000 188.418 120.000 184.000 L 120.000 139.310 L 109.660 149.660 C 106.534 152.786 101.466 152.786 98.340 149.660 C 95.214 146.534 95.214 141.466 98.340 138.340 L 122.340 114.340 C 123.841 112.838 125.877 111.994 128.000 111.994 C 130.123 111.994 132.159 112.838 133.660 114.340 L 157.660 138.340 C 159.162 139.841 160.006 141.877 160.006 144.000 C 160.006 146.123 159.162 148.159 157.660 149.660 ZM 152.000 88.000 L 152.000 44.000 L 196.000 88.000 Z"),
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
        return _fileArrowUp!!
    }

private var _fileArrowUp: ImageVector? = null
