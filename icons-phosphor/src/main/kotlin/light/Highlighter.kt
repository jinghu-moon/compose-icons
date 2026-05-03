package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Highlighter: ImageVector
    get() {
        if (_highlighter != null) return _highlighter!!
        _highlighter = phosphorLightIcon(
            name = "Highlighter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 252.240 107.760 C 249.897 105.420 246.103 105.420 243.760 107.760 L 193.410 158.100 C 192.630 158.875 191.370 158.875 190.590 158.100 L 105.900 73.410 C 105.125 72.630 105.125 71.370 105.900 70.590 L 156.240 20.240 C 158.443 17.876 158.378 14.192 156.093 11.907 C 153.808 9.622 150.124 9.557 147.760 11.760 L 97.410 62.100 C 92.680 66.836 91.963 74.257 95.700 79.810 L 73.410 102.100 C 70.784 104.726 69.309 108.287 69.309 112.000 C 69.309 115.713 70.784 119.274 73.410 121.900 L 79.510 128.000 L 19.760 187.760 C 18.292 189.230 17.688 191.355 18.165 193.377 C 18.641 195.399 20.130 197.030 22.100 197.690 L 94.100 221.690 C 96.256 222.409 98.633 221.847 100.240 220.240 L 136.000 184.490 L 142.100 190.590 C 144.726 193.216 148.287 194.691 152.000 194.691 C 155.713 194.691 159.274 193.216 161.900 190.590 L 184.180 168.300 C 189.735 172.042 197.163 171.326 201.900 166.590 L 252.240 116.240 C 254.580 113.897 254.580 110.103 252.240 107.760 ZM 94.380 209.140 L 35.110 189.380 L 88.000 136.490 L 127.510 176.000 ZM 153.380 182.140 C 152.600 182.915 151.340 182.915 150.560 182.140 L 140.210 171.800 L 140.210 171.800 L 92.210 123.800 L 92.210 123.800 L 81.900 113.410 C 81.125 112.630 81.125 111.370 81.900 110.590 L 104.000 88.490 L 175.510 160.000 Z"),
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
        return _highlighter!!
    }

private var _highlighter: ImageVector? = null
