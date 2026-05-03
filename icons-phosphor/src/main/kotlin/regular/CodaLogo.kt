package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CodaLogo: ImageVector
    get() {
        if (_codaLogo != null) return _codaLogo!!
        _codaLogo = phosphorRegularIcon(
            name = "CodaLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 176.000 88.000 C 183.612 87.932 191.085 90.049 197.530 94.100 C 201.223 96.464 205.911 96.626 209.757 94.522 C 213.604 92.419 215.998 88.384 216.000 84.000 L 216.000 48.000 C 216.000 39.163 208.837 32.000 200.000 32.000 L 56.000 32.000 C 47.163 32.000 40.000 39.163 40.000 48.000 L 40.000 208.000 C 40.000 216.837 47.163 224.000 56.000 224.000 L 200.000 224.000 C 208.837 224.000 216.000 216.837 216.000 208.000 L 216.000 172.000 C 215.994 167.624 213.607 163.597 209.769 161.493 C 205.931 159.389 201.253 159.541 197.560 161.890 C 190.310 166.540 184.150 168.300 176.320 168.000 L 176.000 168.000 C 153.909 168.000 136.000 150.091 136.000 128.000 C 136.000 105.909 153.909 88.000 176.000 88.000 ZM 120.000 128.000 C 120.038 158.850 144.991 183.873 175.840 184.000 C 184.200 184.416 192.524 182.655 200.000 178.890 L 200.000 208.000 L 56.000 208.000 L 56.000 48.000 L 200.000 48.000 L 200.000 77.230 C 182.613 69.161 162.316 70.492 146.132 80.763 C 129.948 91.033 120.102 108.832 120.000 128.000 Z"),
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
