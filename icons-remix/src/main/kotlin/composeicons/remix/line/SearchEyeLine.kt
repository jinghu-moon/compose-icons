package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SearchEyeLine: ImageVector
    get() {
        if (_searchEyeLine != null) return _searchEyeLine!!
        _searchEyeLine = remixIcon(
            name = "SearchEyeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.031 16.617l4.283 4.283-1.414 1.414L16.617 18.031C15.077 19.263 13.124 20 11 20 6.032 20 2 15.968 2 11 2 6.032 6.032 2 11 2c4.968 0 9 4.032 9 9 0 2.124-.737 4.077-1.969 5.617ZM16.025 15.875C17.247 14.615 18 12.896 18 11 18 7.133 14.868 4 11 4 7.133 4 4 7.133 4 11c0 3.868 3.133 7 7 7 1.896 0 3.615-.753 4.875-1.975l.15-.15ZM12.178 7.176C11.483 7.49 11 8.188 11 9c0 1.105 .895 2 2 2 .811 0 1.51-.483 1.824-1.178 .115 .372 .176 .768 .176 1.178 0 2.209-1.791 4-4 4C8.791 15 7 13.209 7 11 7 8.791 8.791 7 11 7c.41 0 .806 .062 1.178 .176Z"),
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
        return _searchEyeLine!!
    }

private var _searchEyeLine: ImageVector? = null
