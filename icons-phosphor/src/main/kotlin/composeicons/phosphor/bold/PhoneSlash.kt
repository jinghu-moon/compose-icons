package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PhoneSlash: ImageVector
    get() {
        if (_phoneSlash != null) return _phoneSlash!!
        _phoneSlash = phosphorBoldIcon(
            name = "PhoneSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M56.9 31.93C54.053 28.62 49.633 27.117 45.358 28.007c-4.275 .889-7.729 4.03-9.019 8.201-1.291 4.171-.214 8.714 2.811 11.862L63 74.36c-15.381 7.202-29.398 17.014-41.43 29-21.45 21.46-23.52 53.1-5 77 3.811 4.848 9.644 7.667 15.81 7.64 2.434 .001 4.848-.446 7.12-1.32L88.4 169.33l.45-.17c6.272-2.513 10.845-8.03 12.15-14.66l5.44-27.22c1.22-.38 2.47-.72 3.72-1l88.91 97.83c2.847 3.31 7.267 4.813 11.542 3.923 4.275-.889 7.729-4.03 9.019-8.201 1.291-4.171 .214-8.714-2.811-11.862ZM83.4 120.29 78 147.57 33.84 163.22c-9.16-13.84-7.41-30.76 4.73-42.9C50.385 108.49 64.512 99.223 80.07 93.1L92.74 107c-4.848 2.915-8.24 7.741-9.34 13.29ZM239.4 180.29c-2.807 3.619-6.777 6.159-11.24 7.19-6.162 1.444-12.385-2.145-14.222-8.201-1.836-6.056 1.346-12.498 7.272-14.719 10.21-14.07 8.75-31.71-3.79-44.25C194.77 97.65 164 84.76 130.91 84c-6.627-.075-11.94-5.508-11.865-12.135 .075-6.627 5.508-11.94 12.135-11.865h.27c39.33 .87 75.89 16.25 102.94 43.31 21.45 21.5 23.52 53.14 5.02 76.99Z"),
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
        return _phoneSlash!!
    }

private var _phoneSlash: ImageVector? = null
