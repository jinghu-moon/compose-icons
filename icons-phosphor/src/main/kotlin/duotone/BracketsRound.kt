package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.BracketsRound: ImageVector
    get() {
        if (_bracketsRound != null) return _bracketsRound!!
        _bracketsRound = phosphorDuotoneIcon(
            name = "BracketsRound",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 224.000 128.000 C 224.000 192.000 184.000 216.000 184.000 216.000 L 72.000 216.000 C 72.000 216.000 32.000 192.000 32.000 128.000 C 32.000 64.000 72.000 40.000 72.000 40.000 L 184.000 40.000 C 184.000 40.000 224.000 64.000 224.000 128.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 40.000 128.000 C 40.000 186.290 74.670 208.250 76.150 209.160 C 79.933 211.444 81.149 216.362 78.865 220.145 C 76.581 223.928 71.663 225.144 67.880 222.860 C 66.090 221.780 24.000 195.750 24.000 128.000 C 24.000 60.250 66.090 34.220 67.880 33.140 C 71.656 30.955 76.486 32.198 78.738 35.933 C 80.991 39.669 79.835 44.521 76.140 46.840 C 74.540 47.830 40.000 69.820 40.000 128.000 ZM 188.120 33.140 C 184.337 30.856 179.419 32.072 177.135 35.855 C 174.851 39.638 176.067 44.556 179.850 46.840 C 181.330 47.750 216.000 69.710 216.000 128.000 C 216.000 186.290 181.330 208.250 179.880 209.140 C 176.091 211.415 174.865 216.331 177.140 220.120 C 179.415 223.909 184.331 225.135 188.120 222.860 C 189.910 221.780 232.000 195.750 232.000 128.000 C 232.000 60.250 189.910 34.220 188.120 33.140 Z"),
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
        return _bracketsRound!!
    }

private var _bracketsRound: ImageVector? = null
