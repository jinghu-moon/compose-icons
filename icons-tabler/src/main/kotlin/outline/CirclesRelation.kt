package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CirclesRelation: ImageVector
    get() {
        if (_circlesRelation != null) return _circlesRelation!!
        _circlesRelation = tablerOutlineIcon(
            name = "CirclesRelation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.183 6.117 C 6.523 5.583 3.835 6.900 2.628 9.331 C 1.421 11.761 1.995 14.699 4.029 16.496 C 6.062 18.293 9.048 18.501 11.312 17.004 C 13.575 15.507 14.552 12.677 13.694 10.103"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 14.813 17.883 C 17.476 18.420 20.168 17.100 21.375 14.666 C 22.581 12.232 22.002 9.290 19.961 7.496 C 17.921 5.702 14.930 5.502 12.669 7.010 C 10.409 8.518 9.444 11.356 10.317 13.929"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _circlesRelation!!
    }

private var _circlesRelation: ImageVector? = null
