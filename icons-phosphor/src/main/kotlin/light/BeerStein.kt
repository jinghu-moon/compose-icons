package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BeerStein: ImageVector
    get() {
        if (_beerStein != null) return _beerStein!!
        _beerStein = phosphorLightIcon(
            name = "BeerStein",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 90.000 L 198.000 90.000 L 198.000 72.000 C 198.000 51.013 180.987 34.000 160.000 34.000 L 148.070 34.000 C 136.470 23.800 120.560 18.000 104.000 18.000 C 69.810 18.000 42.000 42.220 42.000 72.000 L 42.000 208.000 C 42.000 215.732 48.268 222.000 56.000 222.000 L 184.000 222.000 C 191.732 222.000 198.000 215.732 198.000 208.000 L 198.000 198.000 L 216.000 198.000 C 228.150 198.000 238.000 188.150 238.000 176.000 L 238.000 112.000 C 238.000 99.850 228.150 90.000 216.000 90.000 ZM 104.000 30.000 C 118.380 30.000 132.080 35.220 141.590 44.330 C 142.706 45.401 144.193 45.999 145.740 46.000 L 160.000 46.000 C 172.045 46.004 182.510 54.280 185.290 66.000 L 54.520 66.000 C 58.000 45.670 78.860 30.000 104.000 30.000 ZM 186.000 208.000 C 186.000 209.105 185.105 210.000 184.000 210.000 L 56.000 210.000 C 54.895 210.000 54.000 209.105 54.000 208.000 L 54.000 78.000 L 186.000 78.000 ZM 226.000 176.000 C 226.000 181.523 221.523 186.000 216.000 186.000 L 198.000 186.000 L 198.000 102.000 L 216.000 102.000 C 221.523 102.000 226.000 106.477 226.000 112.000 ZM 102.000 104.000 L 102.000 184.000 C 102.000 187.314 99.314 190.000 96.000 190.000 C 92.686 190.000 90.000 187.314 90.000 184.000 L 90.000 104.000 C 90.000 100.686 92.686 98.000 96.000 98.000 C 99.314 98.000 102.000 100.686 102.000 104.000 ZM 150.000 104.000 L 150.000 184.000 C 150.000 187.314 147.314 190.000 144.000 190.000 C 140.686 190.000 138.000 187.314 138.000 184.000 L 138.000 104.000 C 138.000 100.686 140.686 98.000 144.000 98.000 C 147.314 98.000 150.000 100.686 150.000 104.000 Z"),
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
