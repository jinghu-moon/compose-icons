package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Cake: ImageVector
    get() {
        if (_cake != null) return _cake!!
        _cake = tablerOutlineIcon(
            name = "Cake",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 20.000 L 21.000 20.000 L 21.000 12.000 C 21.000 10.343 19.657 9.000 18.000 9.000 L 6.000 9.000 C 4.343 9.000 3.000 10.343 3.000 12.000 L 3.000 20.000"),
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
                pathData = parseSvgPathData("M 3.000 14.803 C 3.312 14.938 3.654 15.007 4.000 15.000 C 4.791 15.017 5.539 14.643 6.000 14.000 C 6.461 13.357 7.209 12.983 8.000 13.000 C 8.791 12.983 9.539 13.357 10.000 14.000 C 10.461 14.643 11.209 15.017 12.000 15.000 C 12.791 15.017 13.539 14.643 14.000 14.000 C 14.461 13.357 15.209 12.983 16.000 13.000 C 16.791 12.983 17.539 13.357 18.000 14.000 C 18.461 14.643 19.209 15.017 20.000 15.000 C 20.350 15.007 20.692 14.938 21.000 14.803"),
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
                pathData = parseSvgPathData("M 12.000 4.000 L 13.465 5.638 C 14.193 6.421 14.177 7.637 13.429 8.400 C 12.680 9.164 11.464 9.204 10.667 8.491 C 9.871 7.779 9.775 6.566 10.450 5.737 L 12.000 4.000"),
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
        return _cake!!
    }

private var _cake: ImageVector? = null
