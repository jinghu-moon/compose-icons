package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PersonSimpleTaiChi: ImageVector
    get() {
        if (_personSimpleTaiChi != null) return _personSimpleTaiChi!!
        _personSimpleTaiChi = phosphorBoldIcon(
            name = "PersonSimpleTaiChi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 84.000 C 147.882 84.000 164.000 67.882 164.000 48.000 C 164.000 28.118 147.882 12.000 128.000 12.000 C 108.118 12.000 92.000 28.118 92.000 48.000 C 92.000 67.882 108.118 84.000 128.000 84.000 ZM 128.000 36.000 C 134.627 36.000 140.000 41.373 140.000 48.000 C 140.000 54.627 134.627 60.000 128.000 60.000 C 121.373 60.000 116.000 54.627 116.000 48.000 C 116.000 41.373 121.373 36.000 128.000 36.000 ZM 228.000 108.000 C 228.000 114.627 222.627 120.000 216.000 120.000 L 140.000 120.000 L 140.000 136.090 L 188.730 157.000 C 193.131 158.888 195.989 163.211 196.000 168.000 L 196.000 216.000 C 196.000 222.627 190.627 228.000 184.000 228.000 C 177.373 228.000 172.000 222.627 172.000 216.000 L 172.000 175.910 L 130.330 158.050 L 56.000 224.920 C 51.030 228.907 43.811 228.316 39.557 223.572 C 35.303 218.829 35.497 211.588 40.000 207.080 L 116.000 138.660 L 116.000 120.000 L 40.000 120.000 C 33.373 120.000 28.000 114.627 28.000 108.000 C 28.000 101.373 33.373 96.000 40.000 96.000 L 216.000 96.000 C 222.627 96.000 228.000 101.373 228.000 108.000 Z"),
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
