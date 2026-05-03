package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CodaLogo: ImageVector
    get() {
        if (_codaLogo != null) return _codaLogo!!
        _codaLogo = phosphorFillIcon(
            name = "CodaLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 136.000 128.000 C 136.000 150.091 153.909 168.000 176.000 168.000 L 176.320 168.000 C 184.150 168.300 190.320 166.540 197.560 161.890 C 201.253 159.541 205.931 159.389 209.769 161.493 C 213.607 163.597 215.994 167.624 216.000 172.000 L 216.000 208.000 C 216.000 216.837 208.837 224.000 200.000 224.000 L 56.000 224.000 C 47.163 224.000 40.000 216.837 40.000 208.000 L 40.000 48.000 C 40.000 39.163 47.163 32.000 56.000 32.000 L 200.000 32.000 C 208.837 32.000 216.000 39.163 216.000 48.000 L 216.000 84.000 C 215.998 88.384 213.604 92.419 209.757 94.522 C 205.911 96.626 201.223 96.464 197.530 94.100 C 185.162 86.381 169.586 85.957 156.816 92.992 C 144.047 100.028 136.083 113.421 136.000 128.000 Z"),
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
        return _codaLogo!!
    }

private var _codaLogo: ImageVector? = null
