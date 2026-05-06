package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Popcorn: ImageVector
    get() {
        if (_popcorn != null) return _popcorn!!
        _popcorn = phosphorBoldIcon(
            name = "Popcorn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232.28 71.32c-1.912-1.825-4.372-2.967-7-3.25-8.011-22.718-31.621-35.98-55.19-31C161.673 21.669 145.521 12.09 127.97 12.09c-17.551 0-33.703 9.579-42.12 24.98-23.569-4.98-47.179 8.282-55.19 31-3.411 .383-6.495 2.209-8.471 5.015-1.977 2.806-2.657 6.324-1.869 9.665L50.87 212.58c2.099 9.052 10.178 15.45 19.47 15.42h115.32c9.292 .03 17.371-6.368 19.47-15.42L235.68 82.75c.974-4.143-.32-8.493-3.4-11.43ZM76 60c3.916-.013 7.775 .946 11.23 2.79 3.311 1.76 7.254 1.872 10.659 .302 3.405-1.57 5.88-4.641 6.691-8.302C107.035 43.827 116.766 36.034 128 36.034c11.234 0 20.965 7.793 23.42 18.756 .811 3.661 3.286 6.732 6.691 8.302 3.405 1.57 7.348 1.458 10.659-.302C172.225 60.946 176.084 59.987 180 60c9.34-.009 17.838 5.402 21.78 13.87l-33.13 9.46L135.43 70.05c-4.767-1.92-10.093-1.92-14.86 0L87.35 83.33 54.22 73.87C58.162 65.402 66.66 59.991 76 60ZM101.13 103.67 128 92.92l26.87 10.75L141.49 204h-27ZM48.36 97.16l28.78 8.22L90.29 204h-16.79ZM182.5 204h-16.79l13.15-98.62 28.78-8.22Z"),
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
        return _popcorn!!
    }

private var _popcorn: ImageVector? = null
