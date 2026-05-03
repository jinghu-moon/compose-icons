package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Golf: ImageVector
    get() {
        if (_golf != null) return _golf!!
        _golf = phosphorFillIcon(
            name = "Golf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 175.470 197.140 C 177.049 201.266 174.985 205.890 170.860 207.470 C 159.691 211.854 147.952 214.618 136.000 215.680 L 136.000 248.000 C 136.000 252.418 132.418 256.000 128.000 256.000 C 123.582 256.000 120.000 252.418 120.000 248.000 L 120.000 215.680 C 108.048 214.618 96.309 211.854 85.140 207.470 C 82.422 206.483 80.448 204.107 79.977 201.254 C 79.505 198.402 80.610 195.517 82.866 193.708 C 85.122 191.900 88.178 191.449 90.860 192.530 C 104.000 197.560 116.150 200.000 128.000 200.000 C 139.850 200.000 152.000 197.560 165.140 192.530 C 169.266 190.951 173.890 193.015 175.470 197.140 ZM 216.000 96.000 C 216.000 144.601 176.601 184.000 128.000 184.000 C 79.399 184.000 40.000 144.601 40.000 96.000 C 40.000 47.399 79.399 8.000 128.000 8.000 C 176.578 8.055 215.945 47.422 216.000 96.000 ZM 144.000 132.000 C 144.000 125.373 138.627 120.000 132.000 120.000 C 125.373 120.000 120.000 125.373 120.000 132.000 C 120.000 138.627 125.373 144.000 132.000 144.000 C 138.627 144.000 144.000 138.627 144.000 132.000 ZM 176.000 100.000 C 176.000 93.373 170.627 88.000 164.000 88.000 C 157.373 88.000 152.000 93.373 152.000 100.000 C 152.000 106.627 157.373 112.000 164.000 112.000 C 170.627 112.000 176.000 106.627 176.000 100.000 Z"),
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
        return _golf!!
    }

private var _golf: ImageVector? = null
