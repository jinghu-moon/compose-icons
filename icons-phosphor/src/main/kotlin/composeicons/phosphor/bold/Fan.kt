package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Fan: ImageVector
    get() {
        if (_fan != null) return _fan!!
        _fan = phosphorBoldIcon(
            name = "Fan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236.85 134C232.03 115.989 219.595 100.975 202.797 92.884c-16.798-8.091-36.289-8.454-53.377-.994L163.64 35.12c1.242-4.994-.838-10.223-5.17-13C129.402 3.697 90.969 11.558 71.471 39.916 51.973 68.274 58.391 106.974 86 127.52L29.72 143.59c-4.96 1.418-8.459 5.847-8.69 11-1.755 34.615 24.363 64.337 58.916 67.046 34.553 2.709 64.984-22.58 68.644-57.046l42 40.7c3.712 3.573 9.29 4.378 13.86 2C231.1 193.48 244.572 163.005 236.85 134ZM116 128c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM124 36c4.78-0 9.522 .857 14 2.53L124.6 92.17c-10.363 .989-19.79 6.416-25.85 14.88C85.601 96.371 80.604 78.567 86.276 62.605 91.949 46.644 107.06 35.986 124 36ZM105 192.1c-11.368 6.578-25.241 7.157-37.117 1.549C56.007 188.04 47.641 176.958 45.5 164L98.68 148.81c6.025 8.497 15.435 13.968 25.8 15-1.886 11.889-9.046 22.287-19.48 28.29ZM209.7 170.54c-2.391 4.153-5.511 7.842-9.21 10.89L160.73 143c4.342-9.465 4.361-20.35 .05-29.83 15.823-6.041 33.736-1.461 44.718 11.433 10.982 12.894 12.653 31.307 4.172 45.967Z"),
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
        return _fan!!
    }

private var _fan: ImageVector? = null
