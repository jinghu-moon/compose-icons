package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HighlighterCircle: ImageVector
    get() {
        if (_highlighterCircle != null) return _highlighterCircle!!
        _highlighterCircle = phosphorBoldIcon(
            name = "HighlighterCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 204.370 51.590 C 167.941 15.159 110.851 9.531 68.010 38.149 C 25.169 66.766 8.507 121.660 28.212 169.263 C 47.917 216.865 98.502 243.922 149.036 233.887 C 199.569 223.852 235.979 179.520 236.000 128.000 C 236.000 99.345 224.623 71.862 204.370 51.590 ZM 140.000 136.000 L 116.000 136.000 L 116.000 111.390 L 140.000 99.390 ZM 100.000 207.250 L 100.000 160.000 L 156.000 160.000 L 156.000 207.250 C 137.873 213.597 118.127 213.597 100.000 207.250 ZM 187.400 187.410 C 185.063 189.736 182.592 191.923 180.000 193.960 L 180.000 156.000 C 180.002 146.495 173.313 138.301 164.000 136.400 L 164.000 80.000 C 164.000 75.841 161.845 71.978 158.307 69.792 C 154.768 67.606 150.350 67.409 146.630 69.270 L 98.630 93.270 C 94.567 95.303 92.001 99.457 92.000 104.000 L 92.000 136.410 C 82.690 138.310 76.003 146.498 76.000 156.000 L 76.000 194.000 C 73.408 191.963 70.937 189.776 68.600 187.450 C 35.798 154.645 35.800 101.461 68.604 68.658 C 101.408 35.855 154.592 35.855 187.396 68.658 C 220.200 101.461 220.202 154.645 187.400 187.450 Z"),
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
        return _highlighterCircle!!
    }

private var _highlighterCircle: ImageVector? = null
