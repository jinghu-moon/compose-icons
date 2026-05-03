package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HandFingerRight: ImageVector
    get() {
        if (_handFingerRight != null) return _handFingerRight!!
        _handFingerRight = tablerOutlineIcon(
            name = "HandFingerRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 8.000 L 20.500 8.000 C 21.328 8.000 22.000 8.672 22.000 9.500 C 22.000 10.328 21.328 11.000 20.500 11.000 L 13.000 11.000"),
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
                pathData = parseSvgPathData("M 13.500 11.000 L 15.500 11.000 C 16.328 11.000 17.000 11.672 17.000 12.500 C 17.000 13.328 16.328 14.000 15.500 14.000 L 13.000 14.000"),
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
                pathData = parseSvgPathData("M 14.500 14.000 C 15.328 14.000 16.000 14.672 16.000 15.500 C 16.000 16.328 15.328 17.000 14.500 17.000 L 13.000 17.000"),
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
                pathData = parseSvgPathData("M 13.500 17.000 C 14.328 17.000 15.000 17.672 15.000 18.500 C 15.000 19.328 14.328 20.000 13.500 20.000 L 9.000 20.000 C 5.686 20.000 3.000 17.314 3.000 14.000 L 3.000 12.000 L 3.000 12.208 C 3.000 10.190 4.014 8.306 5.700 7.196 L 6.000 7.000 Q 6.718 6.532 11.728 3.714 C 12.436 3.316 13.332 3.553 13.750 4.250 C 14.190 4.984 14.075 5.924 13.470 6.530 L 12.000 8.000"),
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
        return _handFingerRight!!
    }

private var _handFingerRight: ImageVector? = null
