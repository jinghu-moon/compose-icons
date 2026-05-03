package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandPython: ImageVector
    get() {
        if (_brandPython != null) return _brandPython!!
        _brandPython = tablerOutlineIcon(
            name = "BrandPython",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 9.000 L 5.000 9.000 C 3.895 9.000 3.000 9.895 3.000 11.000 L 3.000 15.000 C 3.000 16.105 3.895 17.000 5.000 17.000 L 8.000 17.000"),
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
                pathData = parseSvgPathData("M 12.000 15.000 L 19.000 15.000 C 20.105 15.000 21.000 14.105 21.000 13.000 L 21.000 9.000 C 21.000 7.895 20.105 7.000 19.000 7.000 L 16.000 7.000"),
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
                pathData = parseSvgPathData("M 8.000 9.000 L 8.000 5.000 C 8.000 3.895 8.895 3.000 10.000 3.000 L 14.000 3.000 C 15.105 3.000 16.000 3.895 16.000 5.000 L 16.000 10.000 C 16.000 11.105 15.105 12.000 14.000 12.000 L 10.000 12.000 C 8.895 12.000 8.000 12.895 8.000 14.000 L 8.000 19.000 C 8.000 20.105 8.895 21.000 10.000 21.000 L 14.000 21.000 C 15.105 21.000 16.000 20.105 16.000 19.000 L 16.000 15.000"),
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
                pathData = parseSvgPathData("M 11.000 6.000 L 11.000 6.010"),
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
                pathData = parseSvgPathData("M 13.000 18.000 L 13.000 18.010"),
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
        return _brandPython!!
    }

private var _brandPython: ImageVector? = null
