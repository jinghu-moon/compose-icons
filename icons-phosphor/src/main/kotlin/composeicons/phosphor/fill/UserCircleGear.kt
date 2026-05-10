package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UserCircleGear: ImageVector
    get() {
        if (_userCircleGear != null) return _userCircleGear!!
        _userCircleGear = phosphorFillIcon(
            name = "UserCircleGear",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228.25 63.07l-4.66-2.69c.547-2.894 .547-5.866 0-8.76l4.66-2.69c3.827-2.209 5.139-7.103 2.93-10.93-2.209-3.827-7.103-5.139-10.93-2.93l-4.67 2.7C213.345 35.853 210.775 34.364 208 33.38v-5.38c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v5.38c-2.775 .984-5.345 2.473-7.58 4.39l-4.67-2.7c-3.827-2.209-8.721-.897-10.93 2.93-2.209 3.827-.897 8.721 2.93 10.93l4.66 2.69c-.547 2.894-.547 5.866 0 8.76l-4.66 2.69c-3.138 1.81-4.668 5.502-3.731 9 .937 3.499 4.109 5.931 7.731 5.93 1.405 .004 2.785-.365 4-1.07l4.67-2.7c2.235 1.917 4.805 3.406 7.58 4.39v5.38c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-5.38c2.775-.984 5.345-2.473 7.58-4.39l4.67 2.7c1.215 .705 2.595 1.074 4 1.07 3.622 .001 6.793-2.431 7.731-5.93 .937-3.499-.593-7.191-3.731-9ZM200 64c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM128 76c24.301 0 44 19.699 44 44 0 24.301-19.699 44-44 44C103.699 164 84 144.301 84 120 84 95.699 103.699 76 128 76ZM230.56 110.68c7.499 44.578-14.679 88.891-54.858 109.606C135.523 241.001 86.562 233.367 54.597 201.403 22.633 169.438 14.999 120.477 35.714 80.298 56.429 40.119 100.742 17.941 145.32 25.44c4.322 .764 7.221 4.869 6.497 9.198-.724 4.329-4.801 7.266-9.137 6.582C117.139 36.924 91.002 44.087 71.221 60.805 51.44 77.523 40.021 102.101 40 128c-.019 21.542 7.898 42.336 22.24 58.41C68.056 177.974 75.444 170.739 84 165.1c1.499-.99 3.475-.859 4.83 .32 22.468 19.441 55.802 19.441 78.27 0 1.357-1.184 3.339-1.315 4.84-.32 8.564 5.639 15.962 12.874 21.79 21.31C208.082 170.34 216.011 149.546 216 128c0-4.919-.408-9.829-1.22-14.68-.501-2.832 .557-5.715 2.77-7.551 2.213-1.836 5.242-2.343 7.933-1.327 2.691 1.016 4.629 3.397 5.077 6.238Z"),
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
        return _userCircleGear!!
    }

private var _userCircleGear: ImageVector? = null
