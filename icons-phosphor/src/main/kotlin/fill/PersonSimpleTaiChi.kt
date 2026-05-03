package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PersonSimpleTaiChi: ImageVector
    get() {
        if (_personSimpleTaiChi != null) return _personSimpleTaiChi!!
        _personSimpleTaiChi = phosphorFillIcon(
            name = "PersonSimpleTaiChi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 96.000 48.000 C 96.000 30.327 110.327 16.000 128.000 16.000 C 145.673 16.000 160.000 30.327 160.000 48.000 C 160.000 65.673 145.673 80.000 128.000 80.000 C 110.327 80.000 96.000 65.673 96.000 48.000 ZM 216.000 96.000 L 40.000 96.000 C 35.582 96.000 32.000 99.582 32.000 104.000 C 32.000 108.418 35.582 112.000 40.000 112.000 L 120.000 112.000 L 120.000 140.440 L 42.650 210.050 C 39.350 213.005 39.070 218.075 42.025 221.375 C 44.980 224.675 50.050 224.955 53.350 222.000 L 129.550 153.420 L 176.000 173.280 L 176.000 216.000 C 176.000 220.418 179.582 224.000 184.000 224.000 C 188.418 224.000 192.000 220.418 192.000 216.000 L 192.000 168.000 C 191.999 164.801 190.091 161.910 187.150 160.650 L 136.000 138.720 L 136.000 112.000 L 216.000 112.000 C 220.418 112.000 224.000 108.418 224.000 104.000 C 224.000 99.582 220.418 96.000 216.000 96.000 Z"),
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
        return _personSimpleTaiChi!!
    }

private var _personSimpleTaiChi: ImageVector? = null
