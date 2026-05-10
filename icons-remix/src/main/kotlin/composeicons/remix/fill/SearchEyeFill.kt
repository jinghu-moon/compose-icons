package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SearchEyeFill: ImageVector
    get() {
        if (_searchEyeFill != null) return _searchEyeFill!!
        _searchEyeFill = remixIcon(
            name = "SearchEyeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.031 16.617l4.283 4.283-1.414 1.414L16.617 18.031C15.077 19.263 13.124 20 11 20 6.032 20 2 15.968 2 11 2 6.032 6.032 2 11 2c4.968 0 9 4.032 9 9 0 2.124-.737 4.077-1.969 5.617ZM12.178 7.176C11.806 7.062 11.41 7 11 7 8.791 7 7 8.791 7 11c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4 0-.41-.062-.806-.176-1.178C14.51 10.517 13.811 11 13 11c-1.105 0-2-.895-2-2 0-.812 .483-1.51 1.178-1.824Z"),
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
        return _searchEyeFill!!
    }

private var _searchEyeFill: ImageVector? = null
