package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Files: ImageVector
    get() {
        if (_files != null) return _files!!
        _files = phosphorFillIcon(
            name = "Files",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 213.660 66.340 L 173.660 26.340 C 172.158 24.840 170.122 23.998 168.000 24.000 L 88.000 24.000 C 79.163 24.000 72.000 31.163 72.000 40.000 L 72.000 56.000 L 56.000 56.000 C 47.163 56.000 40.000 63.163 40.000 72.000 L 40.000 216.000 C 40.000 224.837 47.163 232.000 56.000 232.000 L 168.000 232.000 C 176.837 232.000 184.000 224.837 184.000 216.000 L 184.000 200.000 L 200.000 200.000 C 208.837 200.000 216.000 192.837 216.000 184.000 L 216.000 72.000 C 216.002 69.878 215.160 67.842 213.660 66.340 ZM 136.000 192.000 L 88.000 192.000 C 83.582 192.000 80.000 188.418 80.000 184.000 C 80.000 179.582 83.582 176.000 88.000 176.000 L 136.000 176.000 C 140.418 176.000 144.000 179.582 144.000 184.000 C 144.000 188.418 140.418 192.000 136.000 192.000 ZM 136.000 160.000 L 88.000 160.000 C 83.582 160.000 80.000 156.418 80.000 152.000 C 80.000 147.582 83.582 144.000 88.000 144.000 L 136.000 144.000 C 140.418 144.000 144.000 147.582 144.000 152.000 C 144.000 156.418 140.418 160.000 136.000 160.000 ZM 200.000 184.000 L 184.000 184.000 L 184.000 104.000 C 184.002 101.878 183.160 99.842 181.660 98.340 L 141.660 58.340 C 140.158 56.840 138.122 55.998 136.000 56.000 L 88.000 56.000 L 88.000 40.000 L 164.690 40.000 L 200.000 75.310 Z"),
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
        return _files!!
    }

private var _files: ImageVector? = null
