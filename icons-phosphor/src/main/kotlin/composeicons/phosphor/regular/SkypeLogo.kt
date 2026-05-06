package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SkypeLogo: ImageVector
    get() {
        if (_skypeLogo != null) return _skypeLogo!!
        _skypeLogo = phosphorRegularIcon(
            name = "SkypeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 152c0 17.64-17.94 32-40 32C105.94 184 88 169.64 88 152c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 8.67 11 16 24 16 13 0 24-7.33 24-16 0-9.48-8.61-13-26.88-18.26C109.37 129.2 89.78 123.55 89.78 104 89.78 85.76 106.21 72 128 72c15.72 0 29.18 7.3 35.12 19 1.395 2.561 1.287 5.678-.284 8.136-1.57 2.457-4.354 3.866-7.264 3.675-2.91-.191-5.486-1.95-6.723-4.591C145.64 91.94 137.65 88 128 88c-12.67 0-22.22 6.88-22.22 16 0 7 9 10.1 23.77 14.36C145.78 123 168 129.45 168 152ZM232 176c-.033 30.914-25.086 55.967-56 56-11.104 .04-21.964-3.26-31.17-9.47-30.89 5.465-62.503-4.493-84.685-26.675C37.963 173.673 28.005 142.06 33.47 111.17 27.26 101.964 23.96 91.104 24 80 24.033 49.086 49.086 24.033 80 24c11.104-.04 21.964 3.26 31.17 9.47 30.89-5.465 62.503 4.493 84.685 26.675 22.182 22.182 32.14 53.795 26.675 84.685 6.21 9.206 9.51 20.066 9.47 31.17ZM216 176c.03-8.84-2.899-17.437-8.32-24.42-1.442-1.866-1.988-4.274-1.49-6.58 5.755-26.601-2.397-54.304-21.642-73.548C165.304 52.207 137.601 44.055 111 49.81c-2.306 .498-4.714-.048-6.58-1.49C97.437 42.899 88.841 39.97 80 40 57.909 40 40 57.909 40 80c-.03 8.841 2.899 17.437 8.32 24.42 1.442 1.866 1.988 4.274 1.49 6.58-5.755 26.601 2.397 54.304 21.642 73.548 19.245 19.245 46.948 27.396 73.548 21.642 2.306-.498 4.714 .048 6.58 1.49 6.983 5.421 15.579 8.35 24.42 8.32 22.091 0 40-17.909 40-40Z"),
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
