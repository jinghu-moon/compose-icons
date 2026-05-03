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
                pathData = parseSvgPathData("M 18.031 16.617 L 22.314 20.899 L 20.899 22.314 L 16.617 18.031 C 15.077 19.263 13.124 20.000 11.000 20.000 C 6.032 20.000 2.000 15.968 2.000 11.000 C 2.000 6.032 6.032 2.000 11.000 2.000 C 15.968 2.000 20.000 6.032 20.000 11.000 C 20.000 13.124 19.263 15.077 18.031 16.617 ZM 16.025 15.875 C 17.247 14.615 18.000 12.896 18.000 11.000 C 18.000 7.133 14.868 4.000 11.000 4.000 C 7.133 4.000 4.000 7.133 4.000 11.000 C 4.000 14.868 7.133 18.000 11.000 18.000 C 12.896 18.000 14.615 17.247 15.875 16.025 L 16.025 15.875 ZM 12.178 7.176 C 11.483 7.490 11.000 8.188 11.000 9.000 C 11.000 10.105 11.895 11.000 13.000 11.000 C 13.811 11.000 14.510 10.517 14.824 9.822 C 14.938 10.194 15.000 10.590 15.000 11.000 C 15.000 13.209 13.209 15.000 11.000 15.000 C 8.791 15.000 7.000 13.209 7.000 11.000 C 7.000 8.791 8.791 7.000 11.000 7.000 C 11.410 7.000 11.806 7.062 12.178 7.176 Z"),
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
