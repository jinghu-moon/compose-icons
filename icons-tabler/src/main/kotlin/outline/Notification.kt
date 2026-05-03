package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Notification: ImageVector
    get() {
        if (_notification != null) return _notification!!
        _notification = tablerOutlineIcon(
            name = "Notification",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.000 6.000 L 7.000 6.000 C 5.895 6.000 5.000 6.895 5.000 8.000 L 5.000 17.000 C 5.000 18.105 5.895 19.000 7.000 19.000 L 16.000 19.000 C 17.105 19.000 18.000 18.105 18.000 17.000 L 18.000 14.000"),
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
        pathData = parseSvgPathData("M 14.000 7.000 C 14.000 8.657 15.343 10.000 17.000 10.000 C 18.657 10.000 20.000 8.657 20.000 7.000 C 20.000 5.343 18.657 4.000 17.000 4.000 C 15.343 4.000 14.000 5.343 14.000 7.000"),
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
        return _notification!!
    }

private var _notification: ImageVector? = null
