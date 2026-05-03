package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Orange: ImageVector
    get() {
        if (_orange != null) return _orange!!
        _orange = phosphorLightIcon(
            name = "Orange",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 161.150 72.650 C 183.536 62.693 197.972 40.501 198.000 16.000 C 198.000 12.686 195.314 10.000 192.000 10.000 L 184.000 10.000 C 160.066 10.025 138.278 23.806 128.000 45.420 C 117.722 23.806 95.934 10.025 72.000 10.000 L 64.000 10.000 C 60.686 10.000 58.000 12.686 58.000 16.000 C 58.000 19.314 60.686 22.000 64.000 22.000 L 72.000 22.000 C 97.380 22.032 118.720 41.051 121.660 66.260 C 78.207 69.501 44.055 104.745 42.182 148.278 C 40.310 191.811 71.310 229.858 114.323 236.818 C 157.337 243.779 198.754 217.450 210.706 175.548 C 222.658 133.645 201.363 89.429 161.150 72.650 ZM 184.000 22.000 L 185.640 22.000 C 182.575 47.096 161.282 65.969 136.000 66.000 L 134.360 66.000 C 137.425 40.904 158.718 22.031 184.000 22.000 ZM 128.000 226.000 C 87.131 226.000 54.000 192.869 54.000 152.000 C 54.000 111.131 87.131 78.000 128.000 78.000 C 168.869 78.000 202.000 111.131 202.000 152.000 C 201.950 192.849 168.849 225.950 128.000 226.000 ZM 181.920 161.000 C 177.849 183.912 159.912 201.849 137.000 205.920 C 136.669 205.971 136.335 205.998 136.000 206.000 C 132.872 206.012 130.259 203.619 129.997 200.502 C 129.736 197.384 131.913 194.589 135.000 194.080 C 152.898 190.911 166.911 176.898 170.080 159.000 C 170.632 155.730 173.730 153.528 177.000 154.080 C 180.270 154.632 182.472 157.730 181.920 161.000 Z"),
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
        return _orange!!
    }

private var _orange: ImageVector? = null
