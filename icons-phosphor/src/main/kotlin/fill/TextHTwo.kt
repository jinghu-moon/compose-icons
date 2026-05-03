package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TextHTwo: ImageVector
    get() {
        if (_textHTwo != null) return _textHTwo!!
        _textHTwo = phosphorFillIcon(
            name = "TextHTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 128.000 160.000 C 128.000 164.418 124.418 168.000 120.000 168.000 C 115.582 168.000 112.000 164.418 112.000 160.000 L 112.000 128.000 L 72.000 128.000 L 72.000 160.000 C 72.000 164.418 68.418 168.000 64.000 168.000 C 59.582 168.000 56.000 164.418 56.000 160.000 L 56.000 80.000 C 56.000 75.582 59.582 72.000 64.000 72.000 C 68.418 72.000 72.000 75.582 72.000 80.000 L 72.000 112.000 L 112.000 112.000 L 112.000 80.000 C 112.000 75.582 115.582 72.000 120.000 72.000 C 124.418 72.000 128.000 75.582 128.000 80.000 ZM 192.000 184.000 L 152.000 184.000 C 148.970 184.000 146.200 182.288 144.845 179.578 C 143.489 176.867 143.782 173.624 145.600 171.200 L 181.600 123.200 C 184.276 119.785 184.901 115.192 183.233 111.186 C 181.566 107.181 177.867 104.387 173.558 103.880 C 169.249 103.373 165.002 105.231 162.450 108.740 C 161.261 110.144 160.382 111.783 159.870 113.550 C 159.326 116.375 157.307 118.691 154.582 119.614 C 151.858 120.538 148.847 119.927 146.697 118.015 C 144.548 116.103 143.590 113.184 144.190 110.370 C 146.494 99.049 155.477 90.283 166.850 88.255 C 178.223 86.228 189.682 91.350 195.756 101.177 C 201.830 111.004 201.289 123.543 194.390 132.810 L 168.000 168.000 L 192.000 168.000 C 196.418 168.000 200.000 171.582 200.000 176.000 C 200.000 180.418 196.418 184.000 192.000 184.000 Z"),
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
        return _textHTwo!!
    }

private var _textHTwo: ImageVector? = null
