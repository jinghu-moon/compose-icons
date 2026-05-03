package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HandbagSimple: ImageVector
    get() {
        if (_handbagSimple != null) return _handbagSimple!!
        _handbagSimple = phosphorFillIcon(
            name = "HandbagSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 239.890 198.120 L 225.630 78.120 C 224.672 70.025 217.782 63.944 209.630 64.000 L 176.000 64.000 C 176.000 37.490 154.510 16.000 128.000 16.000 C 101.490 16.000 80.000 37.490 80.000 64.000 L 46.330 64.000 C 38.178 63.944 31.288 70.025 30.330 78.120 L 16.070 198.120 C 15.541 202.650 16.971 207.190 20.000 210.600 C 23.051 214.024 27.414 215.988 32.000 216.000 L 223.920 216.000 C 228.534 216.010 232.931 214.045 236.000 210.600 C 239.014 207.184 240.429 202.644 239.890 198.120 ZM 128.000 32.000 C 145.673 32.000 160.000 46.327 160.000 64.000 L 96.000 64.000 C 96.000 46.327 110.327 32.000 128.000 32.000 Z"),
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
        return _handbagSimple!!
    }

private var _handbagSimple: ImageVector? = null
