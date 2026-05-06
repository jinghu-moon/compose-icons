package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.HomeOfficeFill: ImageVector
    get() {
        if (_homeOfficeFill != null) return _homeOfficeFill!!
        _homeOfficeFill = remixIcon(
            name = "HomeOfficeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.8 9h-8.8v8h-1v4h-6c-.552 0-1-.448-1-1v-9h-3L11.327 1.612c.381-.347 .964-.347 1.345 0L20.8 9ZM14 11h9v7h-9v-7ZM13 21h11v-2h-11v2Z"),
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
        return _homeOfficeFill!!
    }

private var _homeOfficeFill: ImageVector? = null
