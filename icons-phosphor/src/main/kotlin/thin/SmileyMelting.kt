package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SmileyMelting: ImageVector
    get() {
        if (_smileyMelting != null) return _smileyMelting!!
        _smileyMelting = phosphorThinIcon(
            name = "SmileyMelting",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 172.000 140.000 C 172.000 144.418 168.418 148.000 164.000 148.000 C 159.582 148.000 156.000 144.418 156.000 140.000 C 156.000 135.582 159.582 132.000 164.000 132.000 C 168.418 132.000 172.000 135.582 172.000 140.000 ZM 124.000 92.000 C 124.000 87.582 120.418 84.000 116.000 84.000 C 111.582 84.000 108.000 87.582 108.000 92.000 C 108.000 96.418 111.582 100.000 116.000 100.000 C 120.418 100.000 124.000 96.418 124.000 92.000 ZM 198.210 56.800 C 159.754 18.879 98.136 18.345 59.028 55.594 C 19.920 92.843 17.455 154.414 53.460 194.670 C 54.935 196.327 57.473 196.475 59.130 195.000 C 60.787 193.525 60.935 190.987 59.460 189.330 C 26.478 152.447 28.576 96.083 64.207 61.753 C 99.839 27.422 156.241 27.422 191.873 61.753 C 227.504 96.083 229.602 152.447 196.620 189.330 C 195.145 190.987 195.293 193.525 196.950 195.000 C 198.607 196.475 201.145 196.327 202.620 194.670 C 238.154 154.892 236.214 94.226 198.210 56.800 ZM 152.000 172.000 L 136.000 172.000 C 124.000 172.000 110.720 167.080 100.580 158.840 C 89.890 150.150 84.000 139.190 84.000 128.000 C 83.997 125.541 84.201 123.085 84.610 120.660 C 84.952 118.492 83.483 116.454 81.319 116.091 C 79.154 115.729 77.102 117.179 76.720 119.340 C 76.240 122.202 75.999 125.098 76.000 128.000 C 76.000 157.290 108.250 180.000 136.000 180.000 L 152.000 180.000 C 158.627 180.000 164.000 185.373 164.000 192.000 C 164.000 198.627 158.627 204.000 152.000 204.000 L 96.000 204.000 C 84.954 204.000 76.000 212.954 76.000 224.000 C 76.000 235.046 84.954 244.000 96.000 244.000 C 98.209 244.000 100.000 242.209 100.000 240.000 C 100.000 237.791 98.209 236.000 96.000 236.000 C 89.373 236.000 84.000 230.627 84.000 224.000 C 84.000 217.373 89.373 212.000 96.000 212.000 L 152.000 212.000 C 163.046 212.000 172.000 203.046 172.000 192.000 C 172.000 180.954 163.046 172.000 152.000 172.000 Z"),
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
        return _smileyMelting!!
    }

private var _smileyMelting: ImageVector? = null
