package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AirBalloon: ImageVector
    get() {
        if (_airBalloon != null) return _airBalloon!!
        _airBalloon = tablerOutlineIcon(
            name = "AirBalloon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.000 20.000 C 10.000 19.448 10.448 19.000 11.000 19.000 L 13.000 19.000 C 13.552 19.000 14.000 19.448 14.000 20.000 L 14.000 21.000 C 14.000 21.552 13.552 22.000 13.000 22.000 L 11.000 22.000 C 10.448 22.000 10.000 21.552 10.000 21.000 L 10.000 20.000"),
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
                pathData = parseSvgPathData("M 12.000 16.000 C 15.314 16.000 18.000 11.314 18.000 8.000 C 18.000 4.686 15.314 2.000 12.000 2.000 C 8.686 2.000 6.000 4.686 6.000 8.000 C 6.000 11.314 8.686 16.000 12.000 16.000"),
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
                pathData = parseSvgPathData("M 10.000 9.000 C 10.000 12.866 10.895 16.000 12.000 16.000 C 13.105 16.000 14.000 12.866 14.000 9.000 C 14.000 5.134 13.105 2.000 12.000 2.000 C 10.895 2.000 10.000 5.134 10.000 9.000"),
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
        return _airBalloon!!
    }

private var _airBalloon: ImageVector? = null
