package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HeadphonesOff: ImageVector
    get() {
        if (_headphonesOff != null) return _headphonesOff!!
        _headphonesOff = tablerOutlineIcon(
            name = "HeadphonesOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 3.000 L 21.000 21.000"),
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
                pathData = parseSvgPathData("M 4.000 15.000 C 4.000 13.895 4.895 13.000 6.000 13.000 L 7.000 13.000 C 8.105 13.000 9.000 13.895 9.000 15.000 L 9.000 18.000 C 9.000 19.105 8.105 20.000 7.000 20.000 L 6.000 20.000 C 4.895 20.000 4.000 19.105 4.000 18.000 L 4.000 15.000"),
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
                pathData = parseSvgPathData("M 17.000 13.000 L 18.000 13.000 C 19.105 13.000 20.000 13.895 20.000 15.000 L 20.000 16.000M 19.411 19.417 C 19.050 19.777 18.551 20.000 18.000 20.000 L 17.000 20.000 C 15.895 20.000 15.000 19.105 15.000 18.000 L 15.000 15.000"),
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
                pathData = parseSvgPathData("M 4.000 15.000 L 4.000 12.000 C 4.000 9.790 4.896 7.790 6.344 6.342M 8.713 4.704 C 11.189 3.588 14.062 3.805 16.343 5.279 C 18.624 6.753 20.001 9.284 20.000 12.000 L 20.000 15.000"),
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
        return _headphonesOff!!
    }

private var _headphonesOff: ImageVector? = null
