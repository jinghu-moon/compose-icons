package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Ghost3: ImageVector
    get() {
        if (_ghost3 != null) return _ghost3!!
        _ghost3 = tablerOutlineIcon(
            name = "Ghost3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.000 11.000 C 5.000 7.134 8.134 4.000 12.000 4.000 C 15.866 4.000 19.000 7.134 19.000 11.000 L 19.000 18.000 C 19.097 18.775 18.678 19.522 17.966 19.844 C 17.255 20.165 16.417 19.985 15.900 19.400 C 15.587 19.000 15.108 18.766 14.600 18.766 C 14.092 18.766 13.613 19.000 13.300 19.400 C 12.987 19.800 12.508 20.034 12.000 20.034 C 11.492 20.034 11.013 19.800 10.700 19.400 C 10.387 19.000 9.908 18.766 9.400 18.766 C 8.892 18.766 8.413 19.000 8.100 19.400 C 7.583 19.985 6.745 20.165 6.034 19.844 C 5.322 19.522 4.903 18.775 5.000 18.000 L 5.000 11.000"),
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
                pathData = parseSvgPathData("M 10.000 10.000 L 10.010 10.000"),
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
                pathData = parseSvgPathData("M 14.000 10.000 L 14.010 10.000"),
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
        return _ghost3!!
    }

private var _ghost3: ImageVector? = null
