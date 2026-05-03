package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberNine: ImageVector
    get() {
        if (_numberNine != null) return _numberNine!!
        _numberNine = phosphorFillIcon(
            name = "NumberNine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 24.000 L 56.000 24.000 C 47.163 24.000 40.000 31.163 40.000 40.000 L 40.000 216.000 C 40.000 224.837 47.163 232.000 56.000 232.000 L 200.000 232.000 C 208.837 232.000 216.000 224.837 216.000 216.000 L 216.000 40.000 C 216.000 31.163 208.837 24.000 200.000 24.000 ZM 166.300 129.620 L 132.620 188.000 C 130.411 191.827 125.517 193.139 121.690 190.930 C 117.863 188.721 116.551 183.827 118.760 180.000 L 135.280 151.390 C 132.874 151.791 130.439 151.995 128.000 152.000 C 108.096 152.023 90.649 138.696 85.436 119.487 C 80.223 100.277 88.540 79.959 105.725 69.917 C 122.910 59.875 144.694 62.605 158.870 76.577 C 173.046 90.549 176.092 112.291 166.300 129.620 ZM 156.000 108.000 C 156.000 123.464 143.464 136.000 128.000 136.000 C 112.536 136.000 100.000 123.464 100.000 108.000 C 100.000 92.536 112.536 80.000 128.000 80.000 C 143.464 80.000 156.000 92.536 156.000 108.000 Z"),
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
        return _numberNine!!
    }

private var _numberNine: ImageVector? = null
