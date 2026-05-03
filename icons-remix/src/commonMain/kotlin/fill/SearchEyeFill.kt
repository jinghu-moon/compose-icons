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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.031 16.617 L 22.314 20.899 L 20.899 22.314 L 16.617 18.031 C 15.077 19.263 13.124 20.000 11.000 20.000 C 6.032 20.000 2.000 15.968 2.000 11.000 C 2.000 6.032 6.032 2.000 11.000 2.000 C 15.968 2.000 20.000 6.032 20.000 11.000 C 20.000 13.124 19.263 15.077 18.031 16.617 ZM 12.178 7.176 C 11.806 7.062 11.410 7.000 11.000 7.000 C 8.791 7.000 7.000 8.791 7.000 11.000 C 7.000 13.209 8.791 15.000 11.000 15.000 C 13.209 15.000 15.000 13.209 15.000 11.000 C 15.000 10.590 14.938 10.194 14.824 9.822 C 14.510 10.517 13.811 11.000 13.000 11.000 C 11.895 11.000 11.000 10.105 11.000 9.000 C 11.000 8.188 11.483 7.490 12.178 7.176 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _searchEyeFill!!
    }

private var _searchEyeFill: ImageVector? = null
