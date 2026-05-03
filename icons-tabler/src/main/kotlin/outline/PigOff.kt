package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PigOff: ImageVector
    get() {
        if (_pigOff != null) return _pigOff!!
        _pigOff = tablerOutlineIcon(
            name = "PigOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.000 11.000 L 15.000 11.010"),
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
                pathData = parseSvgPathData("M 10.000 6.000 L 11.499 6.000 L 15.999 3.000 L 15.999 6.803 C 17.237 7.519 18.179 8.652 18.657 10.000 L 19.998 10.000 C 20.550 10.000 20.998 10.448 20.998 11.000 L 20.998 13.000 C 20.998 13.552 20.550 14.000 19.998 14.000 L 18.656 14.000 C 18.599 14.160 18.536 14.318 18.466 14.472M 16.999 17.000 L 16.999 18.500 C 16.999 19.328 16.327 20.000 15.499 20.000 C 14.671 20.000 13.999 19.328 13.999 18.500 L 13.999 17.917 C 13.669 17.972 13.334 18.000 12.999 18.000 L 8.999 18.000 C 8.664 18.000 8.329 17.972 7.999 17.917 L 7.999 18.500 C 7.999 19.328 7.327 20.000 6.499 20.000 C 5.671 20.000 4.999 19.328 4.999 18.500 L 4.999 16.500 L 4.999 16.473 C 3.490 15.124 2.763 13.105 3.065 11.104 C 3.368 9.102 4.659 7.388 6.499 6.545"),
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
        return _pigOff!!
    }

private var _pigOff: ImageVector? = null
