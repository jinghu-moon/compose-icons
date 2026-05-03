package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Pick: ImageVector
    get() {
        if (_pick != null) return _pick!!
        _pick = tablerOutlineIcon(
            name = "Pick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.000 8.000 L 3.617 17.418 C 3.222 17.811 3.000 18.345 3.000 18.902 C 3.000 19.458 3.222 19.992 3.617 20.385 C 4.440 21.204 5.770 21.204 6.593 20.385 L 16.000 11.000"),
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
                pathData = parseSvgPathData("M 9.000 3.000 L 13.586 3.000 C 13.851 3.000 14.106 3.105 14.293 3.293 L 20.707 9.707 C 20.895 9.894 21.000 10.149 21.000 10.414 L 21.000 15.000 C 21.000 16.105 20.105 17.000 19.000 17.000 C 17.895 17.000 17.000 16.105 17.000 15.000 L 17.000 12.000 L 12.000 7.000 L 9.000 7.000 C 7.895 7.000 7.000 6.105 7.000 5.000 C 7.000 3.895 7.895 3.000 9.000 3.000"),
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
        return _pick!!
    }

private var _pick: ImageVector? = null
