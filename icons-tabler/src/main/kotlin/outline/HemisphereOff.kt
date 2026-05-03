package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HemisphereOff: ImageVector
    get() {
        if (_hemisphereOff != null) return _hemisphereOff!!
        _hemisphereOff = tablerOutlineIcon(
            name = "HemisphereOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.588 6.603 C 4.410 7.150 3.000 8.020 3.000 9.000 C 3.000 10.657 7.030 12.000 12.000 12.000M 15.720 11.733 C 18.834 11.260 21.000 10.215 21.000 9.000 C 21.000 7.343 16.970 6.000 12.000 6.000 C 11.338 6.000 10.692 6.024 10.070 6.070"),
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
                pathData = parseSvgPathData("M 3.000 9.000 C 3.000 12.252 4.754 15.252 7.589 16.846 C 10.424 18.440 13.898 18.380 16.677 16.690M 18.842 14.847 C 20.237 13.219 21.003 11.144 21.000 9.000"),
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
        return _hemisphereOff!!
    }

private var _hemisphereOff: ImageVector? = null
