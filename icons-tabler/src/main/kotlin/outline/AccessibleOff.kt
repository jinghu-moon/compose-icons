package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AccessibleOff: ImageVector
    get() {
        if (_accessibleOff != null) return _accessibleOff!!
        _accessibleOff = tablerOutlineIcon(
            name = "AccessibleOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.000 16.500 L 12.000 13.500 L 14.000 16.500M 12.000 13.500 L 12.000 12.000M 14.627 10.624 L 15.000 10.500M 9.000 10.500 L 11.231 11.244"),
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
                pathData = parseSvgPathData("M 20.042 16.045 C 21.790 12.576 21.115 8.378 18.368 5.632 C 15.622 2.885 11.424 2.210 7.955 3.958M 5.637 5.635 C 3.332 7.902 2.420 11.231 3.248 14.356 C 4.075 17.481 6.515 19.922 9.640 20.751 C 12.765 21.580 16.094 20.669 18.362 18.365"),
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
                pathData = parseSvgPathData("M 12.000 8.000 C 12.276 8.000 12.500 7.776 12.500 7.500 C 12.500 7.224 12.276 7.000 12.000 7.000 C 11.724 7.000 11.500 7.224 11.500 7.500"),
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
        }
        return _accessibleOff!!
    }

private var _accessibleOff: ImageVector? = null
