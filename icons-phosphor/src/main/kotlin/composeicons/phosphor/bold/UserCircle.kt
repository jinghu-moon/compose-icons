package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.UserCircle: ImageVector
    get() {
        if (_userCircle != null) return _userCircle!!
        _userCircle = phosphorBoldIcon(
            name = "UserCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM79.57 196.57C90.869 181.121 108.86 171.989 128 171.989c19.14 0 37.131 9.132 48.43 24.581-29.009 20.573-67.851 20.573-96.86 0ZM100 120c0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28-15.464 0-28-12.536-28-28ZM194 179.94c-7.778-9.893-17.692-17.899-29-23.42 20.119-20.374 19.982-53.18-.308-73.384-20.289-20.205-53.095-20.205-73.385 0C71.018 103.34 70.881 136.146 91 156.52c-11.308 5.521-21.222 13.527-29 23.42C34.846 145.518 38.733 96.002 70.924 66.238c32.192-29.764 81.86-29.764 114.052 0 32.192 29.764 36.078 79.28 8.924 113.702Z"),
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
        return _userCircle!!
    }

private var _userCircle: ImageVector? = null
