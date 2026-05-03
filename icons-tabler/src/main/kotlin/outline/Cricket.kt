package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Cricket: ImageVector
    get() {
        if (_cricket != null) return _cricket!!
        _cricket = tablerOutlineIcon(
            name = "Cricket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.105 18.790 L 10.105 19.782 C 8.510 21.363 5.949 21.392 4.318 19.849 C 2.688 18.305 2.576 15.746 4.067 14.067 L 4.224 13.901 L 12.506 5.500 L 14.006 7.000 L 17.456 3.609 C 18.246 2.826 19.511 2.803 20.329 3.556 C 21.147 4.309 21.228 5.573 20.513 6.424 L 20.397 6.550 L 17.006 10.000 L 18.506 11.500 L 14.838 15.117"),
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
                pathData = parseSvgPathData("M 10.500 7.500 L 16.500 13.500"),
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
                pathData = parseSvgPathData("M 11.000 18.000 C 11.000 19.657 12.343 21.000 14.000 21.000 C 15.657 21.000 17.000 19.657 17.000 18.000 C 17.000 16.343 15.657 15.000 14.000 15.000 C 12.343 15.000 11.000 16.343 11.000 18.000"),
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
        return _cricket!!
    }

private var _cricket: ImageVector? = null
