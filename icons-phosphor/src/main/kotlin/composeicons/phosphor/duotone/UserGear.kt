package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.UserGear: ImageVector
    get() {
        if (_userGear != null) return _userGear!!
        _userGear = phosphorDuotoneIcon(
            name = "UserGear",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 100c0 33.137-26.863 60-60 60C74.863 160 48 133.137 48 100 48 66.863 74.863 40 108 40c33.137 0 60 26.863 60 60Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M144 157.68c25.766-16.048 37.775-47.23 29.43-76.415C165.084 52.079 138.405 31.96 108.05 31.96c-30.355 0-57.034 20.119-65.38 49.305-8.346 29.185 3.663 60.367 29.43 76.415-20.65 6.76-39.23 19.39-54.17 37.17-1.905 2.179-2.485 5.217-1.516 7.944 .969 2.727 3.335 4.719 6.188 5.207 2.853 .489 5.747-.602 7.568-2.852C50.25 181.19 77.91 168 108 168c30.09 0 57.75 13.19 77.87 37.15 2.844 3.386 7.895 3.824 11.28 .98 3.386-2.844 3.824-7.895 .98-11.28C183.18 177.07 164.6 164.44 144 157.68ZM56 100C56 71.281 79.281 48 108 48c28.719 0 52 23.281 52 52 0 28.719-23.281 52-52 52C79.295 151.967 56.033 128.705 56 100ZM252.25 143.07l-4.66-2.69c.547-2.894 .547-5.866 0-8.76l4.66-2.69c3.827-2.209 5.139-7.103 2.93-10.93-2.209-3.827-7.103-5.139-10.93-2.93l-4.67 2.7c-2.235-1.917-4.805-3.406-7.58-4.39v-5.38c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v5.38c-2.775 .984-5.345 2.473-7.58 4.39l-4.67-2.7c-3.827-2.209-8.721-.897-10.93 2.93-2.209 3.827-.897 8.721 2.93 10.93l4.66 2.69c-.547 2.894-.547 5.866 0 8.76l-4.66 2.69c-3.827 2.209-5.139 7.103-2.93 10.93 2.209 3.827 7.103 5.139 10.93 2.93l4.67-2.7c2.235 1.917 4.805 3.406 7.58 4.39v5.38c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-5.38c2.775-.984 5.345-2.473 7.58-4.39l4.67 2.7c1.215 .705 2.595 1.074 4 1.07 3.622 .001 6.793-2.431 7.731-5.93 .937-3.499-.593-7.191-3.731-9ZM224 144c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8Z"),
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
