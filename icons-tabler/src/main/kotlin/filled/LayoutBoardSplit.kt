package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LayoutBoardSplit: ImageVector
    get() {
        if (_layoutBoardSplit != null) return _layoutBoardSplit!!
        _layoutBoardSplit = tablerFilledIcon(
            name = "LayoutBoardSplit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.000 3.000 L 10.000 3.000 C 10.552 3.000 11.000 3.448 11.000 4.000 L 11.000 10.000 C 11.000 10.552 10.552 11.000 10.000 11.000 L 4.000 11.000 C 3.448 11.000 3.000 10.552 3.000 10.000 L 3.000 5.000 C 3.000 3.895 3.895 3.000 5.000 3.000"),
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
                pathData = parseSvgPathData("M 14.000 3.000 L 19.000 3.000 C 20.105 3.000 21.000 3.895 21.000 5.000 L 21.000 7.000 C 21.000 7.552 20.552 8.000 20.000 8.000 L 14.000 8.000 C 13.448 8.000 13.000 7.552 13.000 7.000 L 13.000 4.000 C 13.000 3.448 13.448 3.000 14.000 3.000"),
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
                pathData = parseSvgPathData("M 13.000 11.000 C 13.000 10.448 13.448 10.000 14.000 10.000 L 20.000 10.000 C 20.552 10.000 21.000 10.448 21.000 11.000 L 21.000 13.000 C 21.000 13.552 20.552 14.000 20.000 14.000 L 14.000 14.000 C 13.448 14.000 13.000 13.552 13.000 13.000 Z"),
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
                pathData = parseSvgPathData("M 14.000 16.000 L 20.000 16.000 C 20.552 16.000 21.000 16.448 21.000 17.000 L 21.000 19.000 C 21.000 20.105 20.105 21.000 19.000 21.000 L 14.000 21.000 C 13.448 21.000 13.000 20.552 13.000 20.000 L 13.000 17.000 C 13.000 16.448 13.448 16.000 14.000 16.000"),
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
                pathData = parseSvgPathData("M 4.000 13.000 L 10.000 13.000 C 10.552 13.000 11.000 13.448 11.000 14.000 L 11.000 20.000 C 11.000 20.552 10.552 21.000 10.000 21.000 L 5.000 21.000 C 3.895 21.000 3.000 20.105 3.000 19.000 L 3.000 14.000 C 3.000 13.448 3.448 13.000 4.000 13.000"),
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
        return _layoutBoardSplit!!
    }

private var _layoutBoardSplit: ImageVector? = null
