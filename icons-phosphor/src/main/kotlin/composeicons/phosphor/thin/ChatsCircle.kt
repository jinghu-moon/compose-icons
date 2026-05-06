package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChatsCircle: ImageVector
    get() {
        if (_chatsCircle != null) return _chatsCircle!!
        _chatsCircle = phosphorThinIcon(
            name = "ChatsCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M227.79 186.39c11.403-22.485 10.912-49.162-1.308-71.213C214.261 93.126 191.901 78.57 166.79 76.32 156.519 50.305 132.788 32.034 105.011 28.754 77.234 25.475 49.901 37.717 33.854 60.626 17.806 83.534 15.638 113.405 28.21 138.39l-7.71 26.21c-1.24 4.213-.079 8.768 3.026 11.874 3.106 3.106 7.66 4.267 11.874 3.026l26.21-7.71c8.614 4.364 17.981 7.046 27.6 7.9 7.805 19.966 23.679 35.706 43.709 43.343 20.031 7.637 42.355 6.459 61.471-3.243l26.21 7.71c4.213 1.24 8.768 .079 11.874-3.026 3.106-3.106 4.267-7.66 3.026-11.874ZM60.9 163.66l-27.76 8.17c-1.416 .436-2.958 .053-4.006-.994-1.048-1.048-1.431-2.589-.994-4.006l8.17-27.76c.285-1.003 .174-2.077-.31-3C20.122 106.344 28.412 69.474 55.485 49.404c27.073-20.069 64.761-17.281 88.587 6.553 23.826 23.834 26.6 61.523 6.521 88.589C130.514 171.612 93.64 179.889 63.92 164c-.925-.5-2.007-.622-3.02-.34ZM226.82 218.82c-1.046 1.048-2.584 1.432-4 1l-27.76-8.17c-1.003-.285-2.077-.174-3 .31-16.599 8.885-36.139 10.489-53.966 4.432C120.268 210.335 105.75 197.158 98 180c23.201-.613 44.85-11.794 58.781-30.357 13.93-18.564 18.615-42.475 12.719-64.923 21.985 3.097 41.073 16.733 51.133 36.525 10.06 19.792 9.823 43.249-.633 62.835-.484 .923-.595 1.997-.31 3l8.17 27.76c.414 1.417 .015 2.947-1.04 3.98Z"),
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
        return _chatsCircle!!
    }

private var _chatsCircle: ImageVector? = null
