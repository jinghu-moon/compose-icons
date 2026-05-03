package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Airplane: ImageVector
    get() {
        if (_airplane != null) return _airplane!!
        _airplane = phosphorRegularIcon(
            name = "Airplane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 235.580 128.840 L 160.000 91.060 L 160.000 48.000 C 160.000 30.327 145.673 16.000 128.000 16.000 C 110.327 16.000 96.000 30.327 96.000 48.000 L 96.000 91.060 L 20.420 128.840 C 17.709 130.197 15.998 132.969 16.000 136.000 L 16.000 168.000 C 16.001 170.396 17.077 172.666 18.930 174.184 C 20.784 175.703 23.220 176.310 25.570 175.840 L 96.000 161.760 L 96.000 180.690 L 82.340 194.340 C 80.840 195.842 79.998 197.878 80.000 200.000 L 80.000 232.000 C 79.995 234.663 81.316 237.153 83.522 238.643 C 85.729 240.134 88.532 240.428 91.000 239.430 L 128.000 224.620 L 165.000 239.430 C 167.468 240.428 170.271 240.134 172.478 238.643 C 174.684 237.153 176.005 234.663 176.000 232.000 L 176.000 200.000 C 176.002 197.878 175.160 195.842 173.660 194.340 L 160.000 180.690 L 160.000 161.760 L 230.430 175.840 C 232.780 176.310 235.216 175.703 237.070 174.184 C 238.923 172.666 239.999 170.396 240.000 168.000 L 240.000 136.000 C 240.002 132.969 238.291 130.197 235.580 128.840 ZM 224.000 158.240 L 153.570 144.160 C 151.220 143.690 148.784 144.297 146.930 145.816 C 145.077 147.334 144.001 149.604 144.000 152.000 L 144.000 184.000 C 143.998 186.122 144.840 188.158 146.340 189.660 L 160.000 203.310 L 160.000 220.180 L 131.000 208.570 C 129.093 207.808 126.967 207.808 125.060 208.570 L 96.000 220.180 L 96.000 203.310 L 109.660 189.660 C 111.160 188.158 112.002 186.122 112.000 184.000 L 112.000 152.000 C 111.999 149.604 110.923 147.334 109.070 145.816 C 107.216 144.297 104.780 143.690 102.430 144.160 L 32.000 158.240 L 32.000 140.940 L 107.580 103.160 C 110.291 101.803 112.002 99.031 112.000 96.000 L 112.000 48.000 C 112.000 39.163 119.163 32.000 128.000 32.000 C 136.837 32.000 144.000 39.163 144.000 48.000 L 144.000 96.000 C 143.998 99.031 145.709 101.803 148.420 103.160 L 224.000 140.940 Z"),
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
        return _airplane!!
    }

private var _airplane: ImageVector? = null
