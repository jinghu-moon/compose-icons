package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AirBalloon: ImageVector
    get() {
        if (_airBalloon != null) return _airBalloon!!
        _airBalloon = tablerFilledIcon(
            name = "AirBalloon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.000 18.000 C 14.105 18.000 15.000 18.895 15.000 20.000 L 15.000 21.000 C 15.000 22.105 14.105 23.000 13.000 23.000 L 11.000 23.000 C 9.895 23.000 9.000 22.105 9.000 21.000 L 9.000 20.000 C 9.000 18.895 9.895 18.000 11.000 18.000 Z"),
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
                pathData = parseSvgPathData("M 12.000 1.000 C 15.866 1.000 19.000 4.134 19.000 8.000 C 19.000 12.185 15.703 17.000 12.000 17.000 C 8.297 17.000 5.000 12.185 5.000 8.000 C 5.000 4.134 8.134 1.000 12.000 1.000"),
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
        return _airBalloon!!
    }

private var _airBalloon: ImageVector? = null
