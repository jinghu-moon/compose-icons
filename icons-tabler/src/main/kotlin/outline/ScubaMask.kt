package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ScubaMask: ImageVector
    get() {
        if (_scubaMask != null) return _scubaMask!!
        _scubaMask = tablerOutlineIcon(
            name = "ScubaMask",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 7.000 L 16.000 7.000 C 16.552 7.000 17.000 7.448 17.000 8.000 L 17.000 12.500 C 17.000 13.881 15.881 15.000 14.500 15.000 L 14.000 15.000 C 12.895 15.000 12.000 14.105 12.000 13.000 C 12.000 11.895 11.105 11.000 10.000 11.000 C 8.895 11.000 8.000 11.895 8.000 13.000 C 8.000 14.105 7.105 15.000 6.000 15.000 L 5.500 15.000 C 4.119 15.000 3.000 13.881 3.000 12.500 L 3.000 8.000 C 3.000 7.448 3.448 7.000 4.000 7.000"),
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
                pathData = parseSvgPathData("M 10.000 17.000 C 10.000 18.105 10.895 19.000 12.000 19.000 L 15.500 19.000 C 18.538 19.000 21.000 16.538 21.000 13.500 L 21.000 4.000"),
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
        return _scubaMask!!
    }

private var _scubaMask: ImageVector? = null
