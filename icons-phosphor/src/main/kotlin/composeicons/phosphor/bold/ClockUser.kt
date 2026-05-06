package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ClockUser: ImageVector
    get() {
        if (_clockUser != null) return _clockUser!!
        _clockUser = phosphorBoldIcon(
            name = "ClockUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M181.36 114.73l-48 24c-3.719 1.857-8.134 1.656-11.669-.529C118.155 136.016 116.002 132.156 116 128v-56c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v36.58L170.63 93.27c3.848-2.042 8.501-1.837 12.155 .533 3.655 2.371 5.737 6.536 5.441 10.882-.296 4.346-2.924 8.191-6.866 10.044ZM227.08 235.59c-6.404 1.703-12.975-2.107-14.68-8.51C210 218.2 201.65 212 192 212c-9.65 0-18 6.2-20.4 15.08-1.397 5.26-6.158 8.921-11.6 8.92-1.044 .001-2.083-.137-3.09-.41-3.077-.816-5.703-2.822-7.301-5.575-1.598-2.753-2.036-6.028-1.219-9.105 2.424-9.088 7.712-17.153 15.08-23-11.42-14.798-9.615-35.873 4.154-48.514 13.769-12.641 34.922-12.641 48.691 0 13.769 12.641 15.574 33.716 4.154 48.514 7.371 5.844 12.66 13.91 15.08 23 1.706 6.391-2.083 12.958-8.47 14.68ZM180 176c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12ZM117.48 211.35C74.159 205.875 42.257 168.121 44.087 124.494 45.916 80.866 80.866 45.916 124.494 44.087c43.627-1.829 81.381 30.072 86.856 73.393 .488 4.294 3.248 7.994 7.225 9.686 3.977 1.692 8.556 1.115 11.989-1.511 3.433-2.626 5.188-6.894 4.596-11.175C228.127 58.773 179.582 17.748 123.482 20.102 67.382 22.456 22.445 67.405 20.104 123.505c-2.34 56.1 38.697 104.636 94.406 111.655 .497 .067 .998 .101 1.5 .1 6.343 .002 11.591-4.933 11.98-11.264 .389-6.331-4.215-11.871-10.51-12.646Z"),
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
        return _clockUser!!
    }

private var _clockUser: ImageVector? = null
