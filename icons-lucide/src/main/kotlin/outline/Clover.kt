package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Clover: ImageVector
    get() {
        if (_clover != null) return _clover!!
        _clover = lucideOutlineIcon(
            name = "Clover",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.170 7.830 L 2.000 22.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 4.020 12.000 C 3.222 11.333 2.854 10.282 3.063 9.264 C 3.272 8.245 4.023 7.423 5.018 7.123 C 6.014 6.824 7.094 7.095 7.830 7.830 C 7.095 7.094 6.824 6.014 7.123 5.018 C 7.423 4.023 8.245 3.272 9.264 3.063 C 10.282 2.854 11.333 3.222 12.000 4.020 C 12.667 3.222 13.718 2.854 14.736 3.063 C 15.755 3.272 16.577 4.023 16.877 5.018 C 17.176 6.014 16.905 7.094 16.170 7.830 C 16.906 7.095 17.986 6.824 18.982 7.123 C 19.977 7.423 20.728 8.245 20.937 9.264 C 21.146 10.282 20.778 11.333 19.980 12.000 C 20.778 12.667 21.146 13.718 20.937 14.736 C 20.728 15.755 19.977 16.577 18.982 16.877 C 17.986 17.176 16.906 16.905 16.170 16.170 C 16.905 16.906 17.176 17.986 16.877 18.982 C 16.577 19.977 15.755 20.728 14.736 20.937 C 13.718 21.146 12.667 20.778 12.000 19.980 C 11.333 20.778 10.282 21.146 9.264 20.937 C 8.245 20.728 7.423 19.977 7.123 18.982 C 6.824 17.986 7.095 16.906 7.830 16.170 C 6.678 17.228 4.888 17.152 3.830 16.000 C 2.772 14.848 2.848 13.058 4.000 12.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 7.830 7.830 L 16.170 16.170"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _clover!!
    }

private var _clover: ImageVector? = null
