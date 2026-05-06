package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.UserSound: ImageVector
    get() {
        if (_userSound != null) return _userSound!!
        _userSound = phosphorBoldIcon(
            name = "UserSound",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152.5 164.53c24.126-18.968 33.577-51.144 23.542-80.146C166.006 55.382 138.69 35.928 108 35.928c-30.69 0-58.006 19.453-68.042 48.456-10.036 29.002-.585 61.178 23.542 80.146-18.927 7.724-35.653 20.004-48.69 35.75-4.264 5.076-3.605 12.646 1.47 16.91 5.075 4.264 12.646 3.605 16.91-1.47C46.88 199.42 71 180 108 180c37 0 61.12 19.42 74.81 35.72 4.264 5.076 11.835 5.734 16.91 1.47 5.076-4.264 5.734-11.835 1.47-16.91C188.155 184.532 171.429 172.251 152.5 164.53ZM60 108C60 81.49 81.49 60 108 60c26.51 0 48 21.49 48 48 0 26.51-21.49 48-48 48C81.502 155.972 60.028 134.498 60 108ZM252 108c.037 19.504-3.914 38.809-11.61 56.73-1.493 4.22-5.211 7.258-9.644 7.881-4.433 .622-8.844-1.274-11.442-4.92-2.598-3.646-2.95-8.434-.914-12.421 12.881-30.197 12.881-64.343 0-94.54-2.036-3.987-1.683-8.775 .914-12.421 2.598-3.646 7.009-5.542 11.442-4.92 4.433 .623 8.151 3.661 9.644 7.881C248.086 69.191 252.037 88.496 252 108ZM207 64.76c12.014 27.575 12.014 58.905 0 86.48-2.656 6.075-9.735 8.846-15.81 6.19-6.075-2.656-8.846-9.735-6.19-15.81 9.32-21.445 9.32-45.795 0-67.24-2.656-6.075 .115-13.154 6.19-15.81 6.075-2.656 13.154 .115 15.81 6.19Z"),
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
        return _userSound!!
    }

private var _userSound: ImageVector? = null
