package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.UserMinus: ImageVector
    get() {
        if (_userMinus != null) return _userMinus!!
        _userMinus = phosphorRegularIcon(
            name = "UserMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M256 136c0 4.418-3.582 8-8 8h-48c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h48c4.418 0 8 3.582 8 8ZM198.13 194.85c2.844 3.385 2.406 8.436-.98 11.28-3.385 2.844-8.436 2.406-11.28-.98C165.75 181.19 138.09 168 108 168c-30.09 0-57.75 13.19-77.87 37.15-2.844 3.383-7.892 3.819-11.275 .975-3.383-2.844-3.819-7.892-.975-11.275C32.82 177.07 51.4 164.44 72.05 157.68 46.284 141.632 34.275 110.45 42.62 81.265 50.966 52.079 77.645 31.96 108 31.96c30.355 0 57.034 20.119 65.38 49.305 8.346 29.185-3.663 60.367-29.43 76.415 20.65 6.76 39.23 19.39 54.18 37.17ZM108 152c28.719 0 52-23.281 52-52C160 71.281 136.719 48 108 48 79.281 48 56 71.281 56 100c.033 28.705 23.295 51.967 52 52Z"),
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
        return _userMinus!!
    }

private var _userMinus: ImageVector? = null
