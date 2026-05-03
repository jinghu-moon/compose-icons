package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PersonSimpleTaiChi: ImageVector
    get() {
        if (_personSimpleTaiChi != null) return _personSimpleTaiChi!!
        _personSimpleTaiChi = phosphorThinIcon(
            name = "PersonSimpleTaiChi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 76.000 C 143.464 76.000 156.000 63.464 156.000 48.000 C 156.000 32.536 143.464 20.000 128.000 20.000 C 112.536 20.000 100.000 32.536 100.000 48.000 C 100.000 63.464 112.536 76.000 128.000 76.000 ZM 128.000 28.000 C 139.046 28.000 148.000 36.954 148.000 48.000 C 148.000 59.046 139.046 68.000 128.000 68.000 C 116.954 68.000 108.000 59.046 108.000 48.000 C 108.000 36.954 116.954 28.000 128.000 28.000 ZM 220.000 104.000 C 220.000 106.209 218.209 108.000 216.000 108.000 L 132.000 108.000 L 132.000 141.360 L 185.580 164.360 C 187.037 164.986 187.986 166.414 188.000 168.000 L 188.000 216.000 C 188.000 218.209 186.209 220.000 184.000 220.000 C 181.791 220.000 180.000 218.209 180.000 216.000 L 180.000 170.640 L 128.780 148.640 L 50.680 219.000 C 49.023 220.480 46.480 220.337 45.000 218.680 C 43.520 217.023 43.663 214.480 45.320 213.000 L 124.000 142.220 L 124.000 108.000 L 40.000 108.000 C 37.791 108.000 36.000 106.209 36.000 104.000 C 36.000 101.791 37.791 100.000 40.000 100.000 L 216.000 100.000 C 218.209 100.000 220.000 101.791 220.000 104.000 Z"),
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
