package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SkypeLogo: ImageVector
    get() {
        if (_skypeLogo != null) return _skypeLogo!!
        _skypeLogo = phosphorFillIcon(
            name = "SkypeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222.53 144.83c5.465-30.89-4.493-62.503-26.675-84.685C173.673 37.963 142.06 28.005 111.17 33.47 101.964 27.26 91.104 23.96 80 24 49.086 24.033 24.033 49.086 24 80c-.04 11.104 3.26 21.964 9.47 31.17-5.465 30.89 4.493 62.503 26.675 84.685 22.182 22.182 53.795 32.14 84.685 26.675 9.206 6.21 20.066 9.51 31.17 9.47 30.914-.033 55.967-25.086 56-56 .04-11.104-3.26-21.964-9.47-31.17ZM128 184C105.94 184 88 169.64 88 152c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 8.67 11 16 24 16 13 0 24-7.33 24-16 0-9.48-8.61-13-26.88-18.26C109.37 129.2 89.78 123.55 89.78 104 89.78 85.76 106.21 72 128 72c15.72 0 29.18 7.3 35.12 19 1.395 2.561 1.287 5.678-.284 8.136-1.57 2.457-4.354 3.866-7.264 3.675-2.91-.191-5.486-1.95-6.723-4.591C145.64 91.94 137.65 88 128 88c-12.67 0-22.22 6.88-22.22 16 0 7 9 10.1 23.77 14.36C145.78 123 168 129.45 168 152c0 17.64-17.94 32-40 32Z"),
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
        return _skypeLogo!!
    }

private var _skypeLogo: ImageVector? = null
