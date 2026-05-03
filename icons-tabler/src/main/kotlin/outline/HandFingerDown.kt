package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HandFingerDown: ImageVector
    get() {
        if (_handFingerDown != null) return _handFingerDown!!
        _handFingerDown = tablerOutlineIcon(
            name = "HandFingerDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.000 12.000 L 8.000 20.500 C 8.000 21.328 8.672 22.000 9.500 22.000 C 10.328 22.000 11.000 21.328 11.000 20.500 L 11.000 13.000"),
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
                pathData = parseSvgPathData("M 11.000 13.500 L 11.000 15.500 C 11.000 16.328 11.672 17.000 12.500 17.000 C 13.328 17.000 14.000 16.328 14.000 15.500 L 14.000 13.000"),
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
                pathData = parseSvgPathData("M 14.000 14.500 C 14.000 15.328 14.672 16.000 15.500 16.000 C 16.328 16.000 17.000 15.328 17.000 14.500 L 17.000 13.000"),
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
                pathData = parseSvgPathData("M 17.000 13.500 C 17.000 14.328 17.672 15.000 18.500 15.000 C 19.328 15.000 20.000 14.328 20.000 13.500 L 20.000 9.000 C 20.000 5.686 17.314 3.000 14.000 3.000 L 12.000 3.000 L 12.208 3.000 C 10.190 3.000 8.306 4.014 7.196 5.700 L 7.000 6.000 Q 6.532 6.718 3.714 11.728 C 3.316 12.436 3.553 13.332 4.250 13.750 C 4.984 14.190 5.924 14.075 6.530 13.470 L 8.000 12.000"),
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
        return _handFingerDown!!
    }

private var _handFingerDown: ImageVector? = null
