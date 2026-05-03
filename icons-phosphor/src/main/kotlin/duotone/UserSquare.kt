package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.UserSquare: ImageVector
    get() {
        if (_userSquare != null) return _userSquare!!
        _userSquare = phosphorDuotoneIcon(
            name = "UserSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 208.000 40.000 L 48.000 40.000 C 43.582 40.000 40.000 43.582 40.000 48.000 L 40.000 208.000 C 40.000 212.418 43.582 216.000 48.000 216.000 L 208.000 216.000 C 212.418 216.000 216.000 212.418 216.000 208.000 L 216.000 48.000 C 216.000 43.582 212.418 40.000 208.000 40.000 ZM 57.780 216.000 C 65.248 183.233 94.392 159.991 128.000 160.000 C 105.909 160.000 88.000 142.091 88.000 120.000 C 88.000 97.909 105.909 80.000 128.000 80.000 C 150.091 80.000 168.000 97.909 168.000 120.000 C 168.000 142.091 150.091 160.000 128.000 160.000 C 161.608 159.991 190.752 183.233 198.220 216.000 Z"),
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
        pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 96.000 120.000 C 96.000 102.327 110.327 88.000 128.000 88.000 C 145.673 88.000 160.000 102.327 160.000 120.000 C 160.000 137.673 145.673 152.000 128.000 152.000 C 110.327 152.000 96.000 137.673 96.000 120.000 ZM 68.670 208.000 C 72.767 197.923 79.348 189.048 87.800 182.200 C 111.256 163.266 144.744 163.266 168.200 182.200 C 176.652 189.048 183.233 197.923 187.330 208.000 ZM 208.000 208.000 L 204.330 208.000 C 197.128 185.064 179.979 166.593 157.640 157.710 C 173.738 145.072 180.052 123.618 173.367 104.274 C 166.681 84.931 148.466 71.955 128.000 71.955 C 107.534 71.955 89.319 84.931 82.633 104.274 C 75.948 123.618 82.262 145.072 98.360 157.710 C 76.021 166.593 58.872 185.064 51.670 208.000 L 48.000 208.000 L 48.000 48.000 L 208.000 48.000 L 208.000 208.000 Z"),
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
        return _userSquare!!
    }

private var _userSquare: ImageVector? = null
