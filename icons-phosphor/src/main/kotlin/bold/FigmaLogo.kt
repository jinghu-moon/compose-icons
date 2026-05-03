package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FigmaLogo: ImageVector
    get() {
        if (_figmaLogo != null) return _figmaLogo!!
        _figmaLogo = phosphorBoldIcon(
            name = "FigmaLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 198.150 96.000 C 211.255 83.632 215.495 64.524 208.850 47.775 C 202.205 31.025 186.019 20.020 168.000 20.000 L 96.000 20.000 C 77.981 20.020 61.795 31.025 55.150 47.775 C 48.505 64.524 52.745 83.632 65.850 96.000 C 56.802 104.495 51.773 116.424 52.007 128.833 C 52.241 141.242 57.717 152.972 67.080 161.120 C 51.136 176.145 47.389 200.059 57.973 219.241 C 68.557 238.423 90.786 248.005 111.998 242.529 C 133.211 237.052 148.024 217.908 148.000 196.000 L 148.000 167.170 C 167.483 177.015 191.238 171.087 203.811 153.243 C 216.385 135.400 213.975 111.035 198.150 96.000 ZM 188.000 64.000 C 188.000 75.046 179.046 84.000 168.000 84.000 L 148.000 84.000 L 148.000 44.000 L 168.000 44.000 C 179.046 44.000 188.000 52.954 188.000 64.000 ZM 76.000 64.000 C 76.000 52.954 84.954 44.000 96.000 44.000 L 124.000 44.000 L 124.000 84.000 L 96.000 84.000 C 84.954 84.000 76.000 75.046 76.000 64.000 ZM 96.000 148.000 C 84.954 148.000 76.000 139.046 76.000 128.000 C 76.000 116.954 84.954 108.000 96.000 108.000 L 124.000 108.000 L 124.000 148.000 L 96.000 148.000 ZM 124.000 196.000 C 124.000 209.255 113.255 220.000 100.000 220.000 C 86.745 220.000 76.000 209.255 76.000 196.000 C 76.000 182.745 86.745 172.000 100.000 172.000 L 124.000 172.000 ZM 168.000 148.000 C 156.954 148.000 148.000 139.046 148.000 128.000 C 148.000 116.954 156.954 108.000 168.000 108.000 C 179.046 108.000 188.000 116.954 188.000 128.000 C 188.000 139.046 179.046 148.000 168.000 148.000 Z"),
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
        return _figmaLogo!!
    }

private var _figmaLogo: ImageVector? = null
