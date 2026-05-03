package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.NumberEight: ImageVector
    get() {
        if (_numberEight != null) return _numberEight!!
        _numberEight = phosphorRegularIcon(
            name = "NumberEight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 155.550 119.270 C 172.702 107.248 180.078 85.493 173.775 65.519 C 167.472 45.545 148.945 31.964 128.000 31.964 C 107.055 31.964 88.528 45.545 82.225 65.519 C 75.922 85.493 83.298 107.248 100.450 119.270 C 78.300 131.787 67.371 157.662 73.842 182.268 C 80.313 206.873 102.558 224.024 128.000 224.024 C 153.442 224.024 175.687 206.873 182.158 182.268 C 188.630 157.662 177.700 131.787 155.550 119.270 ZM 96.000 80.000 C 96.000 62.327 110.327 48.000 128.000 48.000 C 145.673 48.000 160.000 62.327 160.000 80.000 C 160.000 97.673 145.673 112.000 128.000 112.000 C 110.327 112.000 96.000 97.673 96.000 80.000 ZM 128.000 208.000 C 105.909 208.000 88.000 190.091 88.000 168.000 C 88.000 145.909 105.909 128.000 128.000 128.000 C 150.091 128.000 168.000 145.909 168.000 168.000 C 168.000 190.091 150.091 208.000 128.000 208.000 Z"),
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
        return _numberEight!!
    }

private var _numberEight: ImageVector? = null
