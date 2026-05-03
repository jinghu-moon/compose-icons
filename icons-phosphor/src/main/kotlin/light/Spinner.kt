package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Spinner: ImageVector
    get() {
        if (_spinner != null) return _spinner!!
        _spinner = phosphorLightIcon(
            name = "Spinner",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 134.000 32.000 L 134.000 64.000 C 134.000 67.314 131.314 70.000 128.000 70.000 C 124.686 70.000 122.000 67.314 122.000 64.000 L 122.000 32.000 C 122.000 28.686 124.686 26.000 128.000 26.000 C 131.314 26.000 134.000 28.686 134.000 32.000 ZM 173.250 88.750 C 174.843 88.754 176.372 88.124 177.500 87.000 L 200.120 64.370 C 202.323 62.006 202.258 58.322 199.973 56.037 C 197.688 53.752 194.004 53.687 191.640 55.890 L 169.000 78.500 C 167.279 80.215 166.762 82.798 167.691 85.043 C 168.620 87.289 170.810 88.752 173.240 88.750 ZM 224.000 122.000 L 192.000 122.000 C 188.686 122.000 186.000 124.686 186.000 128.000 C 186.000 131.314 188.686 134.000 192.000 134.000 L 224.000 134.000 C 227.314 134.000 230.000 131.314 230.000 128.000 C 230.000 124.686 227.314 122.000 224.000 122.000 ZM 177.500 169.000 C 175.153 166.653 171.347 166.653 169.000 169.000 C 166.653 171.347 166.653 175.153 169.000 177.500 L 191.630 200.120 C 193.994 202.323 197.678 202.258 199.963 199.973 C 202.248 197.688 202.313 194.004 200.110 191.640 ZM 128.000 186.000 C 124.686 186.000 122.000 188.686 122.000 192.000 L 122.000 224.000 C 122.000 227.314 124.686 230.000 128.000 230.000 C 131.314 230.000 134.000 227.314 134.000 224.000 L 134.000 192.000 C 134.000 188.686 131.314 186.000 128.000 186.000 ZM 78.500 169.000 L 55.880 191.640 C 54.275 193.136 53.614 195.388 54.157 197.514 C 54.700 199.640 56.360 201.300 58.486 201.843 C 60.612 202.386 62.864 201.725 64.360 200.120 L 87.000 177.500 C 89.347 175.153 89.347 171.347 87.000 169.000 C 84.653 166.653 80.847 166.653 78.500 169.000 ZM 70.000 128.000 C 70.000 124.686 67.314 122.000 64.000 122.000 L 32.000 122.000 C 28.686 122.000 26.000 124.686 26.000 128.000 C 26.000 131.314 28.686 134.000 32.000 134.000 L 64.000 134.000 C 67.314 134.000 70.000 131.314 70.000 128.000 ZM 64.360 55.880 C 61.996 53.677 58.312 53.742 56.027 56.027 C 53.742 58.312 53.677 61.996 55.880 64.360 L 78.500 87.000 C 80.847 89.347 84.653 89.347 87.000 87.000 C 89.347 84.653 89.347 80.847 87.000 78.500 Z"),
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
        return _spinner!!
    }

private var _spinner: ImageVector? = null
