package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CloudLock: ImageVector
    get() {
        if (_cloudLock != null) return _cloudLock!!
        _cloudLock = tablerOutlineIcon(
            name = "CloudLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 18.000 C 20.933 18.000 22.500 16.433 22.500 14.500 C 22.500 12.567 20.933 11.000 19.000 11.000 L 18.000 11.000 C 18.397 9.232 17.715 7.407 16.212 6.213 C 14.709 5.020 12.612 4.638 10.712 5.213 C 8.812 5.788 7.397 7.232 7.000 9.000 C 4.801 8.912 2.845 10.326 2.334 12.373 C 1.822 14.420 2.898 16.527 4.900 17.400"),
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
                pathData = parseSvgPathData("M 8.000 16.000 C 8.000 15.448 8.448 15.000 9.000 15.000 L 15.000 15.000 C 15.552 15.000 16.000 15.448 16.000 16.000 L 16.000 19.000 C 16.000 19.552 15.552 20.000 15.000 20.000 L 9.000 20.000 C 8.448 20.000 8.000 19.552 8.000 19.000 L 8.000 16.000"),
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
                pathData = parseSvgPathData("M 10.000 15.000 L 10.000 13.000 C 10.000 11.895 10.895 11.000 12.000 11.000 C 13.105 11.000 14.000 11.895 14.000 13.000 L 14.000 15.000"),
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
        return _cloudLock!!
    }

private var _cloudLock: ImageVector? = null
