package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BeerStein: ImageVector
    get() {
        if (_beerStein != null) return _beerStein!!
        _beerStein = phosphorBoldIcon(
            name = "BeerStein",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 84.000 L 204.000 84.000 L 204.000 72.000 C 203.972 47.711 184.289 28.028 160.000 28.000 L 150.270 28.000 C 137.770 17.780 121.180 12.000 104.000 12.000 C 66.500 12.000 36.000 38.920 36.000 72.000 L 36.000 208.000 C 36.000 219.046 44.954 228.000 56.000 228.000 L 184.000 228.000 C 195.046 228.000 204.000 219.046 204.000 208.000 L 204.000 204.000 L 216.000 204.000 C 231.464 204.000 244.000 191.464 244.000 176.000 L 244.000 112.000 C 244.000 96.536 231.464 84.000 216.000 84.000 ZM 104.000 36.000 C 116.850 36.000 129.000 40.620 137.440 48.670 C 139.674 50.808 142.648 52.001 145.740 52.000 L 160.000 52.000 C 169.505 51.998 177.699 58.687 179.600 68.000 L 60.280 68.000 C 62.720 50.000 81.390 36.000 104.000 36.000 ZM 180.000 204.000 L 60.000 204.000 L 60.000 92.000 L 180.000 92.000 ZM 220.000 176.000 C 220.000 178.209 218.209 180.000 216.000 180.000 L 204.000 180.000 L 204.000 108.000 L 216.000 108.000 C 218.209 108.000 220.000 109.791 220.000 112.000 ZM 108.000 120.000 L 108.000 176.000 C 108.000 182.627 102.627 188.000 96.000 188.000 C 89.373 188.000 84.000 182.627 84.000 176.000 L 84.000 120.000 C 84.000 113.373 89.373 108.000 96.000 108.000 C 102.627 108.000 108.000 113.373 108.000 120.000 ZM 156.000 120.000 L 156.000 176.000 C 156.000 182.627 150.627 188.000 144.000 188.000 C 137.373 188.000 132.000 182.627 132.000 176.000 L 132.000 120.000 C 132.000 113.373 137.373 108.000 144.000 108.000 C 150.627 108.000 156.000 113.373 156.000 120.000 Z"),
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
        return _beerStein!!
    }

private var _beerStein: ImageVector? = null
