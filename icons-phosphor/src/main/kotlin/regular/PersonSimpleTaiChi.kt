package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PersonSimpleTaiChi: ImageVector
    get() {
        if (_personSimpleTaiChi != null) return _personSimpleTaiChi!!
        _personSimpleTaiChi = phosphorRegularIcon(
            name = "PersonSimpleTaiChi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 80.000 C 145.673 80.000 160.000 65.673 160.000 48.000 C 160.000 30.327 145.673 16.000 128.000 16.000 C 110.327 16.000 96.000 30.327 96.000 48.000 C 96.000 65.673 110.327 80.000 128.000 80.000 ZM 128.000 32.000 C 136.837 32.000 144.000 39.163 144.000 48.000 C 144.000 56.837 136.837 64.000 128.000 64.000 C 119.163 64.000 112.000 56.837 112.000 48.000 C 112.000 39.163 119.163 32.000 128.000 32.000 ZM 224.000 104.000 C 224.000 108.418 220.418 112.000 216.000 112.000 L 136.000 112.000 L 136.000 138.720 L 187.150 160.650 C 190.091 161.910 191.999 164.801 192.000 168.000 L 192.000 216.000 C 192.000 220.418 188.418 224.000 184.000 224.000 C 179.582 224.000 176.000 220.418 176.000 216.000 L 176.000 173.280 L 129.550 153.370 L 53.350 222.000 C 50.064 224.955 45.005 224.686 42.050 221.400 C 39.095 218.114 39.364 213.055 42.650 210.100 L 120.000 140.440 L 120.000 112.000 L 40.000 112.000 C 35.582 112.000 32.000 108.418 32.000 104.000 C 32.000 99.582 35.582 96.000 40.000 96.000 L 216.000 96.000 C 220.418 96.000 224.000 99.582 224.000 104.000 Z"),
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
        return _personSimpleTaiChi!!
    }

private var _personSimpleTaiChi: ImageVector? = null
