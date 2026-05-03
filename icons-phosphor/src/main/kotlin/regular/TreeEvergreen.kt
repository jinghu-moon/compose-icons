package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TreeEvergreen: ImageVector
    get() {
        if (_treeEvergreen != null) return _treeEvergreen!!
        _treeEvergreen = phosphorRegularIcon(
            name = "TreeEvergreen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 230.320 187.090 L 184.320 128.000 L 208.000 128.000 C 211.048 128.000 213.832 126.268 215.178 123.533 C 216.525 120.798 216.200 117.536 214.340 115.120 L 134.340 11.120 C 132.826 9.152 130.483 7.999 128.000 7.999 C 125.517 7.999 123.174 9.152 121.660 11.120 L 41.660 115.120 C 39.800 117.536 39.475 120.798 40.822 123.533 C 42.168 126.268 44.952 128.000 48.000 128.000 L 71.640 128.000 L 25.640 187.090 C 23.760 189.508 23.426 192.788 24.779 195.536 C 26.133 198.283 28.937 200.017 32.000 200.000 L 120.000 200.000 L 120.000 240.000 C 120.000 244.418 123.582 248.000 128.000 248.000 C 132.418 248.000 136.000 244.418 136.000 240.000 L 136.000 200.000 L 224.000 200.000 C 227.056 200.002 229.846 198.262 231.189 195.517 C 232.533 192.773 232.196 189.503 230.320 187.090 ZM 48.360 184.000 L 94.360 124.910 C 96.240 122.492 96.574 119.212 95.221 116.464 C 93.867 113.717 91.063 111.983 88.000 112.000 L 64.250 112.000 L 128.000 29.120 L 191.750 112.000 L 168.000 112.000 C 164.946 112.002 162.160 113.743 160.819 116.487 C 159.477 119.231 159.816 122.499 161.690 124.910 L 207.640 184.000 Z"),
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
        return _treeEvergreen!!
    }

private var _treeEvergreen: ImageVector? = null
