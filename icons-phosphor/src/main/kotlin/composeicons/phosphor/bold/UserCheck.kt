package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.UserCheck: ImageVector
    get() {
        if (_userCheck != null) return _userCheck!!
        _userCheck = phosphorBoldIcon(
            name = "UserCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152.5 156.54c24.126-18.968 33.577-51.144 23.542-80.146C166.006 47.392 138.69 27.938 108 27.938c-30.69 0-58.006 19.453-68.042 48.456-10.036 29.002-.585 61.178 23.542 80.146-18.928 7.718-35.654 19.996-48.69 35.74-4.264 5.076-3.605 12.646 1.47 16.91 5.075 4.264 12.646 3.605 16.91-1.47C46.88 191.42 71 172 108 172c37 0 61.12 19.42 74.81 35.72 4.264 5.076 11.835 5.734 16.91 1.47 5.076-4.264 5.734-11.835 1.47-16.91C188.157 176.532 171.43 164.254 152.5 156.54ZM60 100C60 73.49 81.49 52 108 52c26.51 0 48 21.49 48 48 0 26.51-21.49 48-48 48C81.502 147.972 60.028 126.498 60 100ZM252.49 136.49l-32 32c-2.252 2.259-5.31 3.529-8.5 3.529-3.19 0-6.248-1.27-8.5-3.529l-16-16c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0L212 143l23.51-23.52c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17Z"),
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
        return _userCheck!!
    }

private var _userCheck: ImageVector? = null
