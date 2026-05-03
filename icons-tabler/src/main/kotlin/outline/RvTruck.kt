package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RvTruck: ImageVector
    get() {
        if (_rvTruck != null) return _rvTruck!!
        _rvTruck = tablerOutlineIcon(
            name = "RvTruck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.000 17.000 C 5.000 18.105 5.895 19.000 7.000 19.000 C 8.105 19.000 9.000 18.105 9.000 17.000 C 9.000 15.895 8.105 15.000 7.000 15.000 C 5.895 15.000 5.000 15.895 5.000 17.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 15.000 17.000 C 15.000 18.105 15.895 19.000 17.000 19.000 C 18.105 19.000 19.000 18.105 19.000 17.000 C 19.000 15.895 18.105 15.000 17.000 15.000 C 15.895 15.000 15.000 15.895 15.000 17.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 9.000 17.000 L 15.000 17.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 19.000 17.000 L 20.000 17.000 C 20.552 17.000 21.000 16.552 21.000 16.000 L 21.000 11.472 C 21.000 11.162 20.928 10.856 20.789 10.578 L 19.829 8.658 C 19.321 7.642 18.282 7.000 17.146 7.000 L 6.000 7.000 C 4.343 7.000 3.000 8.343 3.000 10.000 L 3.000 16.000 C 3.000 16.552 3.448 17.000 4.000 17.000 L 5.000 17.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 3.000 12.000 L 21.000 12.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 15.000 12.000 L 15.000 7.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 6.000 5.500 C 6.000 4.672 6.672 4.000 7.500 4.000 L 14.500 4.000 C 15.328 4.000 16.000 4.672 16.000 5.500 C 16.000 6.328 15.328 7.000 14.500 7.000 L 7.500 7.000 C 6.672 7.000 6.000 6.328 6.000 5.500"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _rvTruck!!
    }

private var _rvTruck: ImageVector? = null
