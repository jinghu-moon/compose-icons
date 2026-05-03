package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Keyframes: ImageVector
    get() {
        if (_keyframes != null) return _keyframes!!
        _keyframes = tablerOutlineIcon(
            name = "Keyframes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.225 18.412 C 8.925 18.781 8.476 18.996 8.000 19.000 C 7.532 19.000 7.086 18.786 6.775 18.412 L 2.414 13.164 C 1.862 12.486 1.862 11.514 2.414 10.836 L 6.775 5.588 C 7.075 5.219 7.524 5.004 8.000 5.000 C 8.468 5.000 8.914 5.214 9.225 5.588 L 13.586 10.836 C 14.138 11.514 14.138 12.486 13.586 13.164 L 9.225 18.412"),
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
                pathData = parseSvgPathData("M 17.000 5.000 L 21.586 10.836 C 22.138 11.514 22.138 12.486 21.586 13.164 L 17.000 19.000"),
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
                pathData = parseSvgPathData("M 13.000 5.000 L 17.586 10.836 C 18.138 11.514 18.138 12.486 17.586 13.164 L 13.000 19.000"),
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
        return _keyframes!!
    }

private var _keyframes: ImageVector? = null
