package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Exclude: ImageVector
    get() {
        if (_exclude != null) return _exclude!!
        _exclude = phosphorBoldIcon(
            name = "Exclude",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M178 78C169.084 37.21 131.562 9.161 89.917 12.154 48.272 15.146 15.146 48.272 12.154 89.917 9.161 131.562 37.21 169.084 78 178c8.916 40.79 46.438 68.839 88.083 65.846 41.645-2.992 74.771-36.118 77.764-77.764C246.839 124.438 218.79 86.916 178 78ZM220 160c-.005 2.222-.132 4.442-.38 6.65l-44-44c2.095-6.265 3.438-12.758 4-19.34 24.148 8.384 40.348 31.128 40.38 56.69ZM100.16 155.84c2.111-29.833 25.847-53.569 55.68-55.68-2.111 29.833-25.847 53.569-55.68 55.68ZM152.67 76.34c-6.582 .562-13.075 1.905-19.34 4l-44-44C91.545 36.104 93.772 35.991 96 36c25.544 .035 48.274 16.215 56.67 40.34ZM64.19 45.16l46.73 46.73c-7.301 5.286-13.714 11.699-19 19L45.16 64.19C49.993 56.497 56.497 49.993 64.19 45.16ZM36 96c.005-2.222 .132-4.442 .38-6.65l44 44c-2.095 6.265-3.438 12.758-4 19.34C52.232 144.306 36.032 121.562 36 96ZM103.33 179.66c6.582-.562 13.075-1.905 19.34-4l44 44c-2.215 .236-4.442 .349-6.67 .34-25.544-.035-48.274-16.215-56.67-40.34ZM191.81 210.84 145.08 164.11c7.301-5.286 13.714-11.699 19-19l46.73 46.73c-4.828 7.679-11.321 14.172-19 19Z"),
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
        return _exclude!!
    }

private var _exclude: ImageVector? = null
