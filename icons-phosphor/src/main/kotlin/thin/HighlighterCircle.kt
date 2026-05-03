package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HighlighterCircle: ImageVector
    get() {
        if (_highlighterCircle != null) return _highlighterCircle!!
        _highlighterCircle = phosphorThinIcon(
            name = "HighlighterCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 198.710 57.290 C 173.485 31.843 136.573 21.837 101.949 31.060 C 67.326 40.283 40.283 67.326 31.060 101.949 C 21.837 136.573 31.843 173.485 57.290 198.710 C 82.515 224.157 119.427 234.163 154.051 224.940 C 188.674 215.717 215.717 188.674 224.940 154.051 C 234.163 119.427 224.157 82.515 198.710 57.290 ZM 92.000 212.700 L 92.000 152.000 C 92.000 149.791 93.791 148.000 96.000 148.000 L 160.000 148.000 C 162.209 148.000 164.000 149.791 164.000 152.000 L 164.000 212.700 C 140.987 222.433 115.013 222.433 92.000 212.700 ZM 148.000 140.000 L 108.000 140.000 L 108.000 98.470 L 148.000 78.470 ZM 193.050 193.050 C 186.826 199.291 179.736 204.606 172.000 208.830 L 172.000 152.000 C 172.000 145.373 166.627 140.000 160.000 140.000 L 156.000 140.000 L 156.000 72.000 C 156.001 70.613 155.283 69.324 154.104 68.595 C 152.924 67.866 151.450 67.799 150.210 68.420 L 102.210 92.420 C 100.855 93.098 99.999 94.484 100.000 96.000 L 100.000 140.000 L 96.000 140.000 C 89.373 140.000 84.000 145.373 84.000 152.000 L 84.000 208.830 C 49.195 189.891 30.426 150.794 37.416 111.792 C 44.405 72.789 75.582 42.642 114.798 36.968 C 154.013 31.293 192.457 51.365 210.216 86.787 C 227.975 122.208 221.059 165.021 193.050 193.050 Z"),
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
