package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BeerStein: ImageVector
    get() {
        if (_beerStein != null) return _beerStein!!
        _beerStein = phosphorThinIcon(
            name = "BeerStein",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 92.000 L 196.000 92.000 L 196.000 72.000 C 196.000 52.118 179.882 36.000 160.000 36.000 L 147.310 36.000 C 136.000 25.810 120.340 20.000 104.000 20.000 C 70.920 20.000 44.000 43.330 44.000 72.000 L 44.000 208.000 C 44.000 214.627 49.373 220.000 56.000 220.000 L 184.000 220.000 C 190.627 220.000 196.000 214.627 196.000 208.000 L 196.000 196.000 L 216.000 196.000 C 227.046 196.000 236.000 187.046 236.000 176.000 L 236.000 112.000 C 236.000 100.954 227.046 92.000 216.000 92.000 ZM 104.000 28.000 C 118.890 28.000 133.090 33.430 143.000 42.890 C 143.738 43.596 144.718 43.993 145.740 44.000 L 160.000 44.000 C 173.918 44.001 185.722 54.225 187.710 68.000 L 52.220 68.000 C 54.620 45.610 76.920 28.000 104.000 28.000 ZM 188.000 208.000 C 188.000 210.209 186.209 212.000 184.000 212.000 L 56.000 212.000 C 53.791 212.000 52.000 210.209 52.000 208.000 L 52.000 76.000 L 188.000 76.000 ZM 228.000 176.000 C 228.000 182.627 222.627 188.000 216.000 188.000 L 196.000 188.000 L 196.000 100.000 L 216.000 100.000 C 222.627 100.000 228.000 105.373 228.000 112.000 ZM 100.000 104.000 L 100.000 184.000 C 100.000 186.209 98.209 188.000 96.000 188.000 C 93.791 188.000 92.000 186.209 92.000 184.000 L 92.000 104.000 C 92.000 101.791 93.791 100.000 96.000 100.000 C 98.209 100.000 100.000 101.791 100.000 104.000 ZM 148.000 104.000 L 148.000 184.000 C 148.000 186.209 146.209 188.000 144.000 188.000 C 141.791 188.000 140.000 186.209 140.000 184.000 L 140.000 104.000 C 140.000 101.791 141.791 100.000 144.000 100.000 C 146.209 100.000 148.000 101.791 148.000 104.000 Z"),
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
        return _beerStein!!
    }

private var _beerStein: ImageVector? = null
