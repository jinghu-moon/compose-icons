package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Cheese: ImageVector
    get() {
        if (_cheese != null) return _cheese!!
        _cheese = phosphorBoldIcon(
            name = "Cheese",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 184.000 28.000 C 182.831 27.999 181.669 28.171 180.550 28.510 L 20.550 76.510 L 20.550 76.510 C 15.476 78.033 12.001 82.703 12.000 88.000 L 12.000 112.000 C 12.000 118.627 17.373 124.000 24.000 124.000 L 32.000 124.000 C 38.520 124.036 43.833 129.242 44.000 135.760 C 44.039 138.903 42.801 141.927 40.570 144.140 C 38.168 146.588 34.889 147.977 31.460 148.000 L 24.000 148.000 C 17.373 148.000 12.000 153.373 12.000 160.000 L 12.000 192.000 C 12.000 198.627 17.373 204.000 24.000 204.000 L 224.000 204.000 C 235.046 204.000 244.000 195.046 244.000 184.000 L 244.000 88.000 C 243.961 54.879 217.121 28.039 184.000 28.000 ZM 185.640 52.000 C 200.284 52.690 213.053 62.178 217.940 76.000 L 105.760 76.000 ZM 152.000 100.000 L 184.000 100.000 L 184.000 104.000 C 184.000 112.837 176.837 120.000 168.000 120.000 C 159.163 120.000 152.000 112.837 152.000 104.000 ZM 96.000 180.000 C 96.000 171.163 103.163 164.000 112.000 164.000 C 120.837 164.000 128.000 171.163 128.000 180.000 ZM 220.000 180.000 L 152.000 180.000 C 152.000 157.909 134.091 140.000 112.000 140.000 C 89.909 140.000 72.000 157.909 72.000 180.000 L 36.000 180.000 L 36.000 171.710 C 44.227 170.666 51.867 166.896 57.700 161.000 C 64.478 154.190 68.196 144.917 68.000 135.310 C 67.564 117.275 53.918 102.312 36.000 100.220 L 36.000 100.000 L 128.000 100.000 L 128.000 104.000 C 128.000 126.091 145.909 144.000 168.000 144.000 C 190.091 144.000 208.000 126.091 208.000 104.000 L 208.000 100.000 L 220.000 100.000 Z"),
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
        return _cheese!!
    }

private var _cheese: ImageVector? = null
