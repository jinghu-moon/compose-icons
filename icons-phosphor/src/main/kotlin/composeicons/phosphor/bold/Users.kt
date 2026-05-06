package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Users: ImageVector
    get() {
        if (_users != null) return _users!!
        _users = phosphorBoldIcon(
            name = "Users",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M125.18 156.94c20.589-17.306 28.161-45.637 18.951-70.907C134.921 60.764 110.896 43.948 84 43.948c-26.896 0-50.921 16.816-60.131 42.085-9.21 25.27-1.637 53.601 18.951 70.907-15.694 7.096-29.295 18.117-39.49 32-3.921 5.343-2.768 12.854 2.575 16.775 5.343 3.921 12.854 2.768 16.775-2.575C36.994 183.591 59.771 172.038 84 172.038c24.229 0 47.006 11.553 61.32 31.102 3.921 5.346 11.434 6.501 16.78 2.58 5.346-3.921 6.501-11.434 2.58-16.78-10.201-13.881-23.805-24.901-39.5-32ZM44 108C44 85.909 61.909 68 84 68c22.091 0 40 17.909 40 40 0 22.091-17.909 40-40 40C61.909 148 44 130.091 44 108ZM250.1 205.67c-2.566 1.885-5.775 2.674-8.923 2.192-3.147-.482-5.974-2.195-7.857-4.762C218.973 183.591 196.217 172.049 172 172c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 15.521-.028 29.625-9.032 36.183-23.1 6.558-14.068 4.386-30.659-5.573-42.565C192.652 70.431 176.705 65.361 161.7 69.33c-4.179 1.209-8.684 .062-11.776-2.998-3.092-3.06-4.285-7.554-3.12-11.745 1.166-4.191 4.508-7.423 8.736-8.447 28.95-7.671 59.348 5.76 73.169 32.329 13.821 26.569 7.37 59.169-15.529 78.471 15.694 7.096 29.295 18.117 39.49 32 3.892 5.334 2.744 12.81-2.57 16.73Z"),
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
        return _users!!
    }

private var _users: ImageVector? = null
