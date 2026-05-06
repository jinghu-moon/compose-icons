package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CalendarHeart: ImageVector
    get() {
        if (_calendarHeart != null) return _calendarHeart!!
        _calendarHeart = phosphorBoldIcon(
            name = "CalendarHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 28h-20v-4c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v4h-72v-4C92 17.373 86.627 12 80 12 73.373 12 68 17.373 68 24v4h-20C36.954 28 28 36.954 28 48v160c0 11.046 8.954 20 20 20h160c11.046 0 20-8.954 20-20v-160C228 36.954 219.046 28 208 28ZM204 204h-152v-152h16c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12h72c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12h16ZM152 84c-8.861-.007-17.41 3.267-24 9.19C117.422 83.728 102.271 81.365 89.313 87.155 76.356 92.945 68.009 105.807 68 120c0 17 9.53 33.56 28.32 49.22 8.135 6.738 16.953 12.607 26.31 17.51 3.38 1.691 7.36 1.691 10.74 0 9.357-4.903 18.175-10.772 26.31-17.51C178.47 153.56 188 137 188 120 188 100.118 171.882 84 152 84ZM128 162.29C114.85 154.43 92 137.23 92 120c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 17.23-22.86 34.44-36 42.29Z"),
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
        return _calendarHeart!!
    }

private var _calendarHeart: ImageVector? = null
