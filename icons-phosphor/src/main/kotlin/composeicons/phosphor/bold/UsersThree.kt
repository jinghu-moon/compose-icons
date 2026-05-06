package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.UsersThree: ImageVector
    get() {
        if (_usersThree != null) return _usersThree!!
        _usersThree = phosphorBoldIcon(
            name = "UsersThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M164.38 181.1c15.099-14.784 19.75-37.236 11.766-56.801C168.162 104.733 149.132 91.945 128 91.945c-21.132 0-40.162 12.788-48.146 32.354-7.984 19.566-3.333 42.017 11.766 56.801-12.499 6.644-22.89 16.651-30 28.89-3.168 5.724-1.167 12.931 4.498 16.202 5.665 3.272 12.907 1.402 16.282-4.202 9.54-16.119 26.88-26.005 45.61-26.005 18.73 0 36.07 9.886 45.61 26.005 2.101 3.797 6.088 6.163 10.428 6.189 4.339 .026 8.355-2.293 10.501-6.064 2.146-3.771 2.09-8.408-.149-12.125-7.116-12.242-17.514-22.249-30.02-28.89ZM100 144c0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28-15.464 0-28-12.536-28-28ZM247.21 153.59c-2.546 1.914-5.747 2.737-8.9 2.289-3.153-.448-5.998-2.132-7.91-4.679-8.33-11.09-19.85-19.59-29.33-21.64-5.176-1.119-9.006-5.499-9.426-10.779-.419-5.279 2.671-10.209 7.606-12.131 8.222-3.21 13.368-11.429 12.664-20.227-.705-8.798-7.093-16.094-15.721-17.954-8.628-1.86-17.455 2.155-21.722 9.882-2.005 3.879-5.958 6.363-10.323 6.486-4.365 .123-8.451-2.135-10.671-5.895-2.22-3.76-2.222-8.429-.006-12.191 8.093-14.31 23.489-22.915 39.918-22.31 16.429 .605 31.151 10.318 38.17 25.184 7.019 14.866 5.165 32.406-4.808 45.476 8.805 5.865 16.534 13.202 22.85 21.69 3.979 5.299 2.909 12.82-2.39 16.8ZM54.93 129.59c-9.48 2.05-21 10.55-29.33 21.65-3.99 5.299-11.521 6.36-16.82 2.37C3.481 149.62 2.42 142.089 6.41 136.79c6.318-8.485 14.047-15.822 22.85-21.69C19.287 102.03 17.433 84.49 24.452 69.624 31.472 54.758 46.193 45.044 62.622 44.44c16.429-.605 31.825 8 39.918 22.31 2.216 3.762 2.214 8.431-.006 12.191-2.22 3.76-6.307 6.017-10.671 5.895C87.498 84.713 83.545 82.229 81.54 78.35 77.273 70.624 68.446 66.608 59.818 68.468 51.19 70.329 44.801 77.625 44.096 86.423c-.705 8.798 4.441 17.018 12.664 20.227 4.934 1.923 8.025 6.852 7.606 12.131-.419 5.279-4.25 9.659-9.426 10.779Z"),
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
        return _usersThree!!
    }

private var _usersThree: ImageVector? = null
