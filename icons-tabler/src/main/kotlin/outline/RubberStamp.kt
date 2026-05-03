package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RubberStamp: ImageVector
    get() {
        if (_rubberStamp != null) return _rubberStamp!!
        _rubberStamp = tablerOutlineIcon(
            name = "RubberStamp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.000 17.850 L 3.000 17.850 C 3.000 13.800 4.421 13.800 6.790 13.800 C 12.000 13.800 8.000 9.210 8.000 7.000 C 8.000 4.791 9.791 3.000 12.000 3.000 C 14.209 3.000 16.000 4.791 16.000 7.000 C 16.000 9.210 12.000 13.800 17.210 13.800 C 19.579 13.800 21.000 13.800 21.000 17.850"),
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
                pathData = parseSvgPathData("M 5.000 21.000 L 19.000 21.000"),
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
        return _rubberStamp!!
    }

private var _rubberStamp: ImageVector? = null
