package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UserMinus: ImageVector
    get() {
        if (_userMinus != null) return _userMinus!!
        _userMinus = phosphorFillIcon(
            name = "UserMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M198.13 194.85c2.004 2.382 2.444 5.709 1.129 8.53-1.315 2.821-4.147 4.623-7.259 4.62h-168c-3.111-.001-5.939-1.804-7.251-4.624-1.312-2.82-.871-6.145 1.131-8.526C32.82 177.07 51.4 164.44 72.05 157.68 46.284 141.632 34.275 110.45 42.62 81.265 50.966 52.079 77.645 31.96 108 31.96c30.355 0 57.034 20.119 65.38 49.305 8.346 29.185-3.663 60.367-29.43 76.415 20.65 6.76 39.23 19.39 54.18 37.17ZM248 128h-48c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h48c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
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
