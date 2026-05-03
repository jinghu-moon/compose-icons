package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PingPong: ImageVector
    get() {
        if (_pingPong != null) return _pingPong!!
        _pingPong = tablerOutlineIcon(
            name = "PingPong",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.718 20.713 C 9.372 21.659 5.808 20.226 4.049 17.226 C 2.290 14.226 2.779 10.417 5.238 7.958 L 5.958 7.238 C 8.368 4.828 12.081 4.305 15.063 5.955 L 17.450 3.610 C 18.240 2.827 19.505 2.804 20.323 3.557 C 21.141 4.310 21.222 5.574 20.507 6.425 L 20.391 6.551 L 18.045 8.938 C 19.635 11.812 19.212 15.380 16.993 17.802"),
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
                pathData = parseSvgPathData("M 11.000 18.000 C 11.000 19.657 12.343 21.000 14.000 21.000 C 15.657 21.000 17.000 19.657 17.000 18.000 C 17.000 16.343 15.657 15.000 14.000 15.000 C 12.343 15.000 11.000 16.343 11.000 18.000"),
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
                pathData = parseSvgPathData("M 9.300 5.300 L 18.700 14.700"),
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
        return _pingPong!!
    }

private var _pingPong: ImageVector? = null
