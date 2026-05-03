package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurlyLoop: ImageVector
    get() {
        if (_curlyLoop != null) return _curlyLoop!!
        _curlyLoop = tablerOutlineIcon(
            name = "CurlyLoop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.000 8.000 C 17.000 8.000 14.000 10.000 14.000 13.000 C 14.000 14.657 15.343 16.000 17.000 16.000 C 18.657 16.000 20.000 14.657 20.000 13.000 C 20.000 10.000 17.500 8.000 12.000 8.000 C 6.500 8.000 4.000 10.000 4.000 13.000 C 4.000 14.657 5.343 16.000 7.000 16.000 C 8.657 16.000 10.000 14.657 10.000 13.000 C 10.000 10.000 7.000 8.000 3.000 8.000"),
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
        return _curlyLoop!!
    }

private var _curlyLoop: ImageVector? = null
