package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Servicemark: ImageVector
    get() {
        if (_servicemark != null) return _servicemark!!
        _servicemark = tablerOutlineIcon(
            name = "Servicemark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.000 9.000 L 6.500 9.000 C 5.672 9.000 5.000 9.672 5.000 10.500 C 5.000 11.328 5.672 12.000 6.500 12.000 L 7.500 12.000 C 8.328 12.000 9.000 12.672 9.000 13.500 C 9.000 14.328 8.328 15.000 7.500 15.000 L 5.000 15.000"),
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
                pathData = parseSvgPathData("M 13.000 15.000 L 13.000 9.000 L 16.000 13.000 L 19.000 9.000 L 19.000 15.000"),
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
        return _servicemark!!
    }

private var _servicemark: ImageVector? = null
