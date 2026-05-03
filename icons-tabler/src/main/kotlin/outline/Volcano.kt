package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Volcano: ImageVector
    get() {
        if (_volcano != null) return _volcano!!
        _volcano = tablerOutlineIcon(
            name = "Volcano",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.000 8.000 L 9.000 7.000 C 9.000 5.895 8.105 5.000 7.000 5.000 C 5.895 5.000 5.000 5.895 5.000 7.000"),
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
                pathData = parseSvgPathData("M 15.000 8.000 L 15.000 7.000 C 15.000 5.895 15.895 5.000 17.000 5.000 C 18.105 5.000 19.000 5.895 19.000 7.000"),
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
                pathData = parseSvgPathData("M 4.000 20.000 L 7.472 12.188 C 7.793 11.466 8.509 11.000 9.300 11.000 L 14.700 11.000 C 15.491 11.000 16.207 11.466 16.528 12.188 L 20.000 20.000"),
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
                pathData = parseSvgPathData("M 6.192 15.064 C 6.347 15.025 6.507 15.003 6.667 15.000 C 7.194 14.991 7.693 15.178 8.000 15.500 C 8.307 15.820 8.806 16.007 9.333 16.000 C 9.860 16.007 10.359 15.820 10.667 15.500 C 10.974 15.178 11.473 14.991 12.000 15.000 C 12.527 14.991 13.026 15.178 13.333 15.500 C 13.641 15.820 14.140 16.007 14.667 16.000 C 15.194 16.007 15.693 15.820 16.000 15.500 C 16.307 15.178 16.806 14.991 17.333 15.000 C 17.494 15.003 17.653 15.025 17.805 15.064"),
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
                pathData = parseSvgPathData("M 12.000 8.000 L 12.000 4.000"),
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
        return _volcano!!
    }

private var _volcano: ImageVector? = null
