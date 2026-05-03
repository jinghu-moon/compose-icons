package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Copyright: ImageVector
    get() {
        if (_copyright != null) return _copyright!!
        _copyright = phosphorFillIcon(
            name = "Copyright",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 56.000 C 88.235 56.000 56.000 88.235 56.000 128.000 C 56.000 167.764 88.235 200.000 128.000 200.000 C 167.764 200.000 200.000 167.764 200.000 128.000 C 199.956 88.254 167.746 56.044 128.000 56.000 ZM 128.000 160.000 C 138.083 160.035 147.585 155.286 153.610 147.200 C 155.308 144.864 158.134 143.624 161.003 143.957 C 163.872 144.290 166.339 146.144 167.457 148.807 C 168.575 151.470 168.171 154.529 166.400 156.810 C 153.999 173.331 132.419 180.065 112.823 173.529 C 93.228 166.993 80.011 148.652 80.011 127.995 C 80.011 107.338 93.228 88.997 112.823 82.461 C 132.419 75.925 153.999 82.659 166.400 99.180 C 168.171 101.461 168.575 104.520 167.457 107.183 C 166.339 109.846 163.872 111.700 161.003 112.033 C 158.134 112.366 155.308 111.126 153.610 108.790 C 144.579 96.758 128.385 92.642 114.704 98.901 C 101.024 105.160 93.550 120.104 96.749 134.804 C 99.948 149.505 112.955 159.992 128.000 160.000 ZM 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 128.000 216.000 C 79.399 216.000 40.000 176.601 40.000 128.000 C 40.000 79.399 79.399 40.000 128.000 40.000 C 176.601 40.000 216.000 79.399 216.000 128.000 C 215.945 176.578 176.578 215.945 128.000 216.000 Z"),
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
        return _copyright!!
    }

private var _copyright: ImageVector? = null
