package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FileText: ImageVector
    get() {
        if (_fileText != null) return _fileText!!
        _fileText = phosphorFillIcon(
            name = "FileText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 213.660 82.340 L 157.660 26.340 C 156.158 24.840 154.122 23.998 152.000 24.000 L 56.000 24.000 C 47.163 24.000 40.000 31.163 40.000 40.000 L 40.000 216.000 C 40.000 224.837 47.163 232.000 56.000 232.000 L 200.000 232.000 C 208.837 232.000 216.000 224.837 216.000 216.000 L 216.000 88.000 C 216.002 85.878 215.160 83.842 213.660 82.340 ZM 160.000 176.000 L 96.000 176.000 C 91.582 176.000 88.000 172.418 88.000 168.000 C 88.000 163.582 91.582 160.000 96.000 160.000 L 160.000 160.000 C 164.418 160.000 168.000 163.582 168.000 168.000 C 168.000 172.418 164.418 176.000 160.000 176.000 ZM 160.000 144.000 L 96.000 144.000 C 91.582 144.000 88.000 140.418 88.000 136.000 C 88.000 131.582 91.582 128.000 96.000 128.000 L 160.000 128.000 C 164.418 128.000 168.000 131.582 168.000 136.000 C 168.000 140.418 164.418 144.000 160.000 144.000 ZM 152.000 88.000 L 152.000 44.000 L 196.000 88.000 Z"),
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
        return _fileText!!
    }

private var _fileText: ImageVector? = null
