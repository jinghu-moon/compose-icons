package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ClockUser: ImageVector
    get() {
        if (_clockUser != null) return _clockUser!!
        _clockUser = phosphorThinIcon(
            name = "ClockUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M132 72v49.53l42.21-21.11c1.977-.989 4.381-.187 5.37 1.79 .989 1.977 .187 4.381-1.79 5.37l-48 24c-.557 .275-1.169 .419-1.79 .42-2.209 0-4-1.791-4-4v-56c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM128 220C77.19 220 36 178.81 36 128 36 77.19 77.19 36 128 36c50.81 0 92 41.19 92 92 0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4C228 72.772 183.228 28 128 28 72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM227.86 223c.41 1.395 .03 2.903-.992 3.938-1.022 1.035-2.525 1.433-3.925 1.041-1.4-.392-2.477-1.514-2.813-2.929-3.29-12.37-14.86-21-28.13-21-13.27 0-24.84 8.65-28.14 21-.455 1.761-2.041 2.994-3.86 3-.338-.001-.675-.048-1-.14-2.134-.567-3.405-2.756-2.84-4.89 2.848-10.574 10.325-19.292 20.34-23.72-10.282-6.834-14.874-19.596-11.304-31.414 3.57-11.818 14.458-19.904 26.804-19.904 12.346 0 23.234 8.086 26.804 19.904 3.57 11.818-1.023 24.58-11.304 31.414 10.022 4.414 17.507 13.127 20.36 23.7ZM192 196c11.046 0 20-8.954 20-20 0-11.046-8.954-20-20-20-11.046 0-20 8.954-20 20 0 11.046 8.954 20 20 20Z"),
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
