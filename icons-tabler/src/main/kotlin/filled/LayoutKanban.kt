package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LayoutKanban: ImageVector
    get() {
        if (_layoutKanban != null) return _layoutKanban!!
        _layoutKanban = tablerFilledIcon(
            name = "LayoutKanban",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.000 3.000 C 10.552 3.000 11.000 3.448 11.000 4.000 C 11.000 4.552 10.552 5.000 10.000 5.000 L 4.000 5.000 C 3.448 5.000 3.000 4.552 3.000 4.000 C 3.000 3.448 3.448 3.000 4.000 3.000 Z"),
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
                pathData = parseSvgPathData("M 20.000 3.000 C 20.552 3.000 21.000 3.448 21.000 4.000 C 21.000 4.552 20.552 5.000 20.000 5.000 L 14.000 5.000 C 13.448 5.000 13.000 4.552 13.000 4.000 C 13.000 3.448 13.448 3.000 14.000 3.000 Z"),
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
                pathData = parseSvgPathData("M 8.000 7.000 C 9.657 7.000 11.000 8.343 11.000 10.000 L 11.000 18.000 C 11.000 19.657 9.657 21.000 8.000 21.000 L 6.000 21.000 C 4.343 21.000 3.000 19.657 3.000 18.000 L 3.000 10.000 C 3.000 8.343 4.343 7.000 6.000 7.000 Z"),
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
                pathData = parseSvgPathData("M 18.000 7.000 C 19.657 7.000 21.000 8.343 21.000 10.000 L 21.000 12.000 C 21.000 13.657 19.657 15.000 18.000 15.000 L 16.000 15.000 C 14.343 15.000 13.000 13.657 13.000 12.000 L 13.000 10.000 C 13.000 8.343 14.343 7.000 16.000 7.000 Z"),
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
        return _layoutKanban!!
    }

private var _layoutKanban: ImageVector? = null
