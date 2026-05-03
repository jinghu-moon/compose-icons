package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Bookmarks: ImageVector
    get() {
        if (_bookmarks != null) return _bookmarks!!
        _bookmarks = phosphorRegularIcon(
            name = "Bookmarks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 192.000 24.000 L 96.000 24.000 C 87.163 24.000 80.000 31.163 80.000 40.000 L 80.000 56.000 L 64.000 56.000 C 55.163 56.000 48.000 63.163 48.000 72.000 L 48.000 224.000 C 48.000 226.997 49.675 229.742 52.339 231.114 C 55.004 232.485 58.211 232.252 60.650 230.510 L 112.000 193.830 L 163.360 230.510 C 165.798 232.246 169.002 232.476 171.663 231.105 C 174.324 229.735 175.997 226.993 176.000 224.000 L 176.000 184.690 L 195.350 198.510 C 197.789 200.252 200.996 200.485 203.661 199.114 C 206.325 197.742 208.000 194.997 208.000 192.000 L 208.000 40.000 C 208.000 31.163 200.837 24.000 192.000 24.000 ZM 160.000 208.460 L 116.640 177.460 C 113.858 175.473 110.122 175.473 107.340 177.460 L 64.000 208.450 L 64.000 72.000 L 160.000 72.000 ZM 192.000 176.460 L 176.000 165.000 L 176.000 72.000 C 176.000 63.163 168.837 56.000 160.000 56.000 L 96.000 56.000 L 96.000 40.000 L 192.000 40.000 Z"),
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
        return _bookmarks!!
    }

private var _bookmarks: ImageVector? = null
