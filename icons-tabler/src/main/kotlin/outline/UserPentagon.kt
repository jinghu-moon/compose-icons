package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.UserPentagon: ImageVector
    get() {
        if (_userPentagon != null) return _userPentagon!!
        _userPentagon = tablerOutlineIcon(
            name = "UserPentagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.163 2.168 L 21.184 7.996 C 21.878 8.500 22.168 9.393 21.903 10.208 L 18.839 19.638 C 18.574 20.453 17.815 21.005 16.958 21.005 L 7.042 21.005 C 6.185 21.005 5.426 20.453 5.161 19.638 L 2.097 10.208 C 1.832 9.393 2.122 8.500 2.816 7.996 L 10.837 2.168 C 11.530 1.664 12.470 1.664 13.163 2.168"),
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
        pathData = parseSvgPathData("M 12.000 13.000 C 13.657 13.000 15.000 11.657 15.000 10.000 C 15.000 8.343 13.657 7.000 12.000 7.000 C 10.343 7.000 9.000 8.343 9.000 10.000 C 9.000 11.657 10.343 13.000 12.000 13.000"),
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
        pathData = parseSvgPathData("M 6.000 20.703 L 6.000 20.000 C 6.000 17.791 7.791 16.000 10.000 16.000 L 14.000 16.000 C 16.209 16.000 18.000 17.791 18.000 20.000 L 18.000 20.707"),
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
        return _userPentagon!!
    }

private var _userPentagon: ImageVector? = null
