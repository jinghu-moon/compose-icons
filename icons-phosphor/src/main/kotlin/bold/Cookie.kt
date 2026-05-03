package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Cookie: ImageVector
    get() {
        if (_cookie != null) return _cookie!!
        _cookie = phosphorBoldIcon(
            name = "Cookie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 167.310 160.690 C 171.888 165.265 173.259 172.148 170.783 178.128 C 168.307 184.108 162.472 188.007 156.000 188.007 C 149.528 188.007 143.693 184.108 141.217 178.128 C 138.741 172.148 140.112 165.265 144.690 160.690 C 150.938 154.447 161.062 154.447 167.310 160.690 ZM 80.690 152.690 C 76.112 157.265 74.741 164.148 77.217 170.128 C 79.693 176.108 85.528 180.007 92.000 180.007 C 98.472 180.007 104.307 176.108 106.783 170.128 C 109.259 164.148 107.888 157.265 103.310 152.690 C 97.062 146.447 86.938 146.447 80.690 152.690 ZM 95.310 119.310 C 99.888 114.735 101.259 107.852 98.783 101.872 C 96.307 95.892 90.472 91.993 84.000 91.993 C 77.528 91.993 71.693 95.892 69.217 101.872 C 66.741 107.852 68.112 114.735 72.690 119.310 C 78.938 125.553 89.062 125.553 95.310 119.310 ZM 143.310 112.690 C 138.735 108.112 131.852 106.741 125.872 109.217 C 119.892 111.693 115.993 117.528 115.993 124.000 C 115.993 130.472 119.892 136.307 125.872 138.783 C 131.852 141.259 138.735 139.888 143.310 135.310 C 149.553 129.062 149.553 118.938 143.310 112.690 ZM 236.000 128.000 C 236.000 187.647 187.647 236.000 128.000 236.000 C 68.353 236.000 20.000 187.647 20.000 128.000 C 20.000 68.353 68.353 20.000 128.000 20.000 C 134.627 20.000 140.000 25.373 140.000 32.000 C 140.000 51.882 156.118 68.000 176.000 68.000 C 182.627 68.000 188.000 73.373 188.000 80.000 C 188.000 99.882 204.118 116.000 224.000 116.000 C 230.627 116.000 236.000 121.373 236.000 128.000 ZM 211.330 138.650 C 187.720 133.510 169.475 114.745 165.000 91.000 C 141.254 86.530 122.485 68.289 117.340 44.680 C 74.067 50.228 42.244 87.979 44.098 131.567 C 45.952 175.155 80.865 210.068 124.453 211.922 C 168.041 213.776 205.792 181.953 211.340 138.680 Z"),
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
        return _cookie!!
    }

private var _cookie: ImageVector? = null
