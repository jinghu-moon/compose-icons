package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Rss: ImageVector
    get() {
        if (_rss != null) return _rss!!
        _rss = phosphorLightIcon(
            name = "Rss",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 105.500 150.500 C 118.670 163.600 126.052 181.424 126.000 200.000 C 126.000 203.314 123.314 206.000 120.000 206.000 C 116.686 206.000 114.000 203.314 114.000 200.000 C 114.000 167.967 88.033 142.000 56.000 142.000 C 52.686 142.000 50.000 139.314 50.000 136.000 C 50.000 132.686 52.686 130.000 56.000 130.000 C 74.576 129.948 92.400 137.330 105.500 150.500 ZM 56.000 82.000 C 52.686 82.000 50.000 84.686 50.000 88.000 C 50.000 91.314 52.686 94.000 56.000 94.000 C 114.542 94.000 162.000 141.458 162.000 200.000 C 162.000 203.314 164.686 206.000 168.000 206.000 C 171.314 206.000 174.000 203.314 174.000 200.000 C 174.000 134.830 121.170 82.000 56.000 82.000 ZM 173.380 82.620 C 142.317 51.388 100.050 33.880 56.000 34.000 C 52.686 34.000 50.000 36.686 50.000 40.000 C 50.000 43.314 52.686 46.000 56.000 46.000 C 96.864 45.892 136.074 62.135 164.890 91.110 C 193.865 119.926 210.108 159.136 210.000 200.000 C 210.000 203.314 212.686 206.000 216.000 206.000 C 219.314 206.000 222.000 203.314 222.000 200.000 C 222.120 155.950 204.612 113.683 173.380 82.620 ZM 60.000 186.000 C 54.477 186.000 50.000 190.477 50.000 196.000 C 50.000 201.523 54.477 206.000 60.000 206.000 C 65.523 206.000 70.000 201.523 70.000 196.000 C 70.000 190.477 65.523 186.000 60.000 186.000 Z"),
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
        return _rss!!
    }

private var _rss: ImageVector? = null
