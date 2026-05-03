package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Sitemap: ImageVector
    get() {
        if (_sitemap != null) return _sitemap!!
        _sitemap = tablerFilledIcon(
            name = "Sitemap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.000 16.667 C 2.000 15.194 3.194 14.000 4.667 14.000 L 7.333 14.000 C 8.806 14.000 10.000 15.194 10.000 16.667 L 10.000 19.333 C 10.000 20.806 8.806 22.000 7.333 22.000 L 4.667 22.000 C 3.194 22.000 2.000 20.806 2.000 19.333 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 14.000 16.667 C 14.000 15.194 15.194 14.000 16.667 14.000 L 19.333 14.000 C 20.806 14.000 22.000 15.194 22.000 16.667 L 22.000 19.333 C 22.000 20.806 20.806 22.000 19.333 22.000 L 16.667 22.000 C 15.194 22.000 14.000 20.806 14.000 19.333 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 8.000 4.667 C 8.000 3.194 9.194 2.000 10.667 2.000 L 13.333 2.000 C 14.806 2.000 16.000 3.194 16.000 4.667 L 16.000 7.333 C 16.000 8.806 14.806 10.000 13.333 10.000 L 10.667 10.000 C 9.194 10.000 8.000 8.806 8.000 7.333 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 12.000 8.000 C 11.448 8.000 11.000 8.448 11.000 9.000 L 11.000 11.000 L 8.000 11.000 C 6.355 11.000 5.000 12.355 5.000 14.000 L 5.000 15.000 C 5.000 15.552 5.448 16.000 6.000 16.000 C 6.552 16.000 7.000 15.552 7.000 15.000 L 7.000 14.000 C 7.000 13.436 7.436 13.000 8.000 13.000 L 16.000 13.000 C 16.564 13.000 17.000 13.436 17.000 14.000 L 17.000 15.000 C 17.000 15.552 17.448 16.000 18.000 16.000 C 18.552 16.000 19.000 15.552 19.000 15.000 L 19.000 14.000 C 19.000 12.355 17.645 11.000 16.000 11.000 L 13.000 11.000 L 13.000 9.000 C 13.000 8.448 12.552 8.000 12.000 8.000 Z"),
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
        return _sitemap!!
    }

private var _sitemap: ImageVector? = null
