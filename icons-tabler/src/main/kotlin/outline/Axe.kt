package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Axe: ImageVector
    get() {
        if (_axe != null) return _axe!!
        _axe = tablerOutlineIcon(
            name = "Axe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.000 9.000 L 20.383 16.418 C 21.206 17.238 21.206 18.566 20.383 19.385 C 19.560 20.204 18.230 20.204 17.407 19.385 L 10.000 12.000"),
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
                pathData = parseSvgPathData("M 6.660 15.660 L 3.340 12.340 C 3.043 12.043 2.915 11.616 3.000 11.205 C 3.084 10.794 3.370 10.452 3.760 10.296 L 7.000 9.000 L 13.000 3.000 L 16.000 6.000 L 10.000 12.000 L 8.704 15.240 C 8.548 15.630 8.206 15.916 7.795 16.000 C 7.384 16.085 6.957 15.957 6.660 15.660"),
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
        return _axe!!
    }

private var _axe: ImageVector? = null
