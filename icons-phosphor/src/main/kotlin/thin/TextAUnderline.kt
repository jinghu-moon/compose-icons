package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextAUnderline: ImageVector
    get() {
        if (_textAUnderline != null) return _textAUnderline!!
        _textAUnderline = phosphorThinIcon(
            name = "TextAUnderline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 62.300 171.620 C 64.299 172.558 66.681 171.699 67.620 169.700 L 85.360 132.000 L 170.640 132.000 L 188.380 169.700 C 188.970 171.021 190.228 171.920 191.669 172.051 C 193.110 172.182 194.510 171.525 195.329 170.333 C 196.148 169.140 196.259 167.598 195.620 166.300 L 131.620 30.300 C 130.961 28.897 129.550 28.002 128.000 28.002 C 126.450 28.002 125.039 28.897 124.380 30.300 L 60.380 166.300 C 59.442 168.299 60.301 170.681 62.300 171.620 ZM 128.000 41.390 L 166.870 124.000 L 89.130 124.000 ZM 220.000 216.000 C 220.000 218.209 218.209 220.000 216.000 220.000 L 40.000 220.000 C 37.791 220.000 36.000 218.209 36.000 216.000 C 36.000 213.791 37.791 212.000 40.000 212.000 L 216.000 212.000 C 218.209 212.000 220.000 213.791 220.000 216.000 Z"),
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
        return _textAUnderline!!
    }

private var _textAUnderline: ImageVector? = null
