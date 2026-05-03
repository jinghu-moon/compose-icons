package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.UserSquare: ImageVector
    get() {
        if (_userSquare != null) return _userSquare!!
        _userSquare = phosphorRegularIcon(
            name = "UserSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 96.000 120.000 C 96.000 102.327 110.327 88.000 128.000 88.000 C 145.673 88.000 160.000 102.327 160.000 120.000 C 160.000 137.673 145.673 152.000 128.000 152.000 C 110.327 152.000 96.000 137.673 96.000 120.000 ZM 68.670 208.000 C 72.764 197.922 79.345 189.045 87.800 182.200 C 111.256 163.266 144.744 163.266 168.200 182.200 C 176.655 189.045 183.236 197.922 187.330 208.000 ZM 208.000 208.000 L 204.330 208.000 C 197.126 185.069 179.982 166.599 157.650 157.710 C 173.743 145.069 180.052 123.616 173.365 104.276 C 166.677 84.936 148.464 71.962 128.000 71.962 C 107.536 71.962 89.323 84.936 82.635 104.276 C 75.948 123.616 82.257 145.069 98.350 157.710 C 76.018 166.599 58.874 185.069 51.670 208.000 L 48.000 208.000 L 48.000 48.000 L 208.000 48.000 L 208.000 208.000 Z"),
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
