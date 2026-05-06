package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UserGear: ImageVector
    get() {
        if (_userGear != null) return _userGear!!
        _userGear = phosphorFillIcon(
            name = "UserGear",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M198.13 194.85c2.004 2.382 2.444 5.709 1.129 8.53-1.315 2.821-4.147 4.623-7.259 4.62h-168c-3.111-.001-5.939-1.804-7.251-4.624-1.312-2.82-.871-6.145 1.131-8.526C32.82 177.07 51.4 164.44 72.05 157.68 46.284 141.632 34.275 110.45 42.62 81.265 50.966 52.079 77.645 31.96 108 31.96c30.355 0 57.034 20.119 65.38 49.305 8.346 29.185-3.663 60.367-29.43 76.415 20.65 6.76 39.23 19.39 54.18 37.17ZM255.18 154c-1.431 2.479-4.078 4.004-6.94 4-1.405 .004-2.785-.365-4-1.07l-4.67-2.7c-2.235 1.917-4.805 3.406-7.58 4.39v5.38c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-5.38c-2.775-.984-5.345-2.473-7.58-4.39l-4.67 2.7c-1.215 .705-2.595 1.074-4 1.07-3.622 .001-6.793-2.431-7.731-5.93-.937-3.499 .593-7.191 3.731-9l4.66-2.69c-.547-2.894-.547-5.866 0-8.76l-4.66-2.69c-3.827-2.209-5.139-7.103-2.93-10.93 2.209-3.827 7.103-5.139 10.93-2.93l4.67 2.7c2.235-1.917 4.805-3.406 7.58-4.39v-5.38c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v5.38c2.775 .984 5.345 2.473 7.58 4.39l4.67-2.7c3.827-2.209 8.721-.897 10.93 2.93 2.209 3.827 .897 8.721-2.93 10.93l-4.66 2.69c.547 2.894 .547 5.866 0 8.76l4.66 2.69c1.84 1.059 3.184 2.806 3.735 4.856 .551 2.05 .265 4.235-.795 6.074ZM224 144c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8Z"),
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
        return _userGear!!
    }

private var _userGear: ImageVector? = null
