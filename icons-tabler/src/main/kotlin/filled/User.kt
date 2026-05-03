package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.User: ImageVector
    get() {
        if (_user != null) return _user!!
        _user = tablerFilledIcon(
            name = "User",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 14.761 2.000 17.000 4.239 17.000 7.000 C 17.000 9.761 14.761 12.000 12.000 12.000 C 9.239 12.000 7.000 9.761 7.000 7.000 L 7.005 6.783 C 7.121 4.109 9.323 2.000 12.000 2.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 14.000 14.000 C 16.761 14.000 19.000 16.239 19.000 19.000 L 19.000 20.000 C 19.000 21.105 18.105 22.000 17.000 22.000 L 7.000 22.000 C 5.895 22.000 5.000 21.105 5.000 20.000 L 5.000 19.000 C 5.000 16.239 7.239 14.000 10.000 14.000 L 14.000 14.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _user!!
    }

private var _user: ImageVector? = null
