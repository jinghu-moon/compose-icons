package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TreeEvergreen: ImageVector
    get() {
        if (_treeEvergreen != null) return _treeEvergreen!!
        _treeEvergreen = phosphorFillIcon(
            name = "TreeEvergreen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 231.190 195.510 C 229.848 198.258 227.058 200.000 224.000 200.000 L 136.000 200.000 L 136.000 240.000 C 136.000 244.418 132.418 248.000 128.000 248.000 C 123.582 248.000 120.000 244.418 120.000 240.000 L 120.000 200.000 L 32.000 200.000 C 28.946 199.998 26.160 198.257 24.819 195.513 C 23.477 192.769 23.816 189.501 25.690 187.090 L 71.690 128.000 L 48.000 128.000 C 44.952 128.000 42.168 126.268 40.822 123.533 C 39.475 120.798 39.800 117.536 41.660 115.120 L 121.660 11.120 C 123.174 9.152 125.517 7.999 128.000 7.999 C 130.483 7.999 132.826 9.152 134.340 11.120 L 214.340 115.120 C 216.200 117.536 216.525 120.798 215.178 123.533 C 213.832 126.268 211.048 128.000 208.000 128.000 L 184.360 128.000 L 230.310 187.090 C 232.186 189.499 232.527 192.765 231.190 195.510 Z"),
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
        return _treeEvergreen!!
    }

private var _treeEvergreen: ImageVector? = null
