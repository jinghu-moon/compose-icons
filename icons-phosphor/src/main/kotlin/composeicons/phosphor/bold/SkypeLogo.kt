package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SkypeLogo: ImageVector
    get() {
        if (_skypeLogo != null) return _skypeLogo!!
        _skypeLogo = phosphorBoldIcon(
            name = "SkypeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172 152c0 20.19-19.33 36-44 36C106.74 188 88.54 175.65 84.73 158.62c-1.38-6.439 2.687-12.788 9.113-14.226 6.427-1.438 12.811 2.572 14.307 8.986C109.3 158.49 117.21 164 128 164c9.44 0 20-5.13 20-12 0-6.37-6.29-9.32-24-14.42C107.86 132.93 85.77 126.58 85.77 104c0-20.52 18.15-36 42.22-36 17.24 0 32.06 8.14 38.69 21.24 2.006 3.833 1.795 8.449-.554 12.081-2.349 3.633-6.471 5.72-10.79 5.463-4.318-.257-8.164-2.819-10.066-6.704C142.8 95.17 136 92 128 92c-10.22 0-18.22 5.27-18.22 12 0 1.09 0 2.21 3.28 4.17 4.18 2.48 11 4.45 17.6 6.35 8.75 2.52 17.8 5.13 25.38 9.86C169.23 132.61 172 143.94 172 152ZM236 176c-.039 33.121-26.879 59.961-60 60-11.333 .028-22.437-3.189-32-9.27-5.291 .846-10.641 1.271-16 1.27C72.797 227.939 28.061 183.203 28 128c-.001-5.359 .424-10.709 1.27-16C23.189 102.437 19.972 91.333 20 80 20.039 46.879 46.879 20.039 80 20c11.35-.038 22.473 3.179 32.05 9.27C117.325 28.426 122.658 28.002 128 28c55.203 .061 99.939 44.797 100 100 .001 5.359-.424 10.709-1.27 16 6.081 9.563 9.298 20.667 9.27 32ZM212 176c.032-7.964-2.605-15.71-7.49-22-2.162-2.8-2.978-6.412-2.23-9.87 5.465-25.27-2.28-51.586-20.562-69.868C163.436 55.98 137.12 48.235 111.85 53.7c-3.449 .747-7.051-.061-9.85-2.21C95.71 46.605 87.964 43.968 80 44 60.118 44 44 60.118 44 80c-.032 7.964 2.605 15.71 7.49 22 2.162 2.8 2.978 6.412 2.23 9.87-5.465 25.27 2.28 51.586 20.562 69.868 18.282 18.282 44.598 26.026 69.868 20.562 3.458-.748 7.07 .068 9.87 2.23 6.287 4.874 14.025 7.504 21.98 7.47 19.882 0 36-16.118 36-36Z"),
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
