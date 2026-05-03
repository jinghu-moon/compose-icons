package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Wood: ImageVector
    get() {
        if (_wood != null) return _wood!!
        _wood = tablerOutlineIcon(
            name = "Wood",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.000 5.500 C 6.000 6.881 8.686 8.000 12.000 8.000 C 15.314 8.000 18.000 6.881 18.000 5.500 C 18.000 4.119 15.314 3.000 12.000 3.000 C 8.686 3.000 6.000 4.119 6.000 5.500"),
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
                pathData = parseSvgPathData("M 18.000 5.500 L 18.000 10.126 C 18.598 9.855 19.303 10.031 19.704 10.550 C 20.105 11.070 20.096 11.796 19.683 12.306 L 19.586 12.414 L 18.000 14.000 L 18.000 18.000 C 18.000 19.610 15.460 20.925 12.275 21.000 L 12.000 21.000 C 8.686 21.000 6.000 19.657 6.000 18.000 L 6.000 16.000 L 4.414 14.414 C 3.930 13.931 3.861 13.170 4.251 12.608 C 4.641 12.046 5.378 11.843 6.000 12.127 L 6.000 5.500"),
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
                pathData = parseSvgPathData("M 10.000 12.500 L 10.000 14.000"),
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
                pathData = parseSvgPathData("M 14.000 16.000 L 14.000 17.000"),
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
        return _wood!!
    }

private var _wood: ImageVector? = null
