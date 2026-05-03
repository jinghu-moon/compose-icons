package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Fence: ImageVector
    get() {
        if (_fence != null) return _fence!!
        _fence = tablerFilledIcon(
            name = "Fence",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 17.000 L 19.000 20.000 C 19.000 20.552 18.552 21.000 18.000 21.000 L 14.000 21.000 C 13.448 21.000 13.000 20.552 13.000 20.000 L 13.000 17.000 Z"),
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
                pathData = parseSvgPathData("M 11.000 17.000 L 11.000 20.000 C 11.000 20.552 10.552 21.000 10.000 21.000 L 6.000 21.000 C 5.448 21.000 5.000 20.552 5.000 20.000 L 5.000 17.000 Z"),
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
                pathData = parseSvgPathData("M 20.000 12.000 C 20.552 12.000 21.000 12.448 21.000 13.000 L 21.000 15.000 C 21.000 15.552 20.552 16.000 20.000 16.000 L 4.000 16.000 C 3.448 16.000 3.000 15.552 3.000 15.000 L 3.000 13.000 C 3.000 12.448 3.448 12.000 4.000 12.000 Z"),
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
                pathData = parseSvgPathData("M 8.707 3.293 L 10.707 5.293 C 10.895 5.480 11.000 5.735 11.000 6.000 L 11.000 11.000 L 5.000 11.000 L 5.000 6.000 C 5.000 5.735 5.105 5.480 5.293 5.293 L 7.293 3.293 C 7.683 2.903 8.316 2.903 8.707 3.293"),
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
                pathData = parseSvgPathData("M 16.707 3.293 L 18.707 5.293 C 18.895 5.480 19.000 5.735 19.000 6.000 L 19.000 11.000 L 13.000 11.000 L 13.000 6.000 C 13.000 5.735 13.105 5.480 13.293 5.293 L 15.293 3.293 C 15.684 2.903 16.316 2.903 16.707 3.293"),
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
        return _fence!!
    }

private var _fence: ImageVector? = null
