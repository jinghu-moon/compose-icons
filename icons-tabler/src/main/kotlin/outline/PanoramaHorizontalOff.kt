package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PanoramaHorizontalOff: ImageVector
    get() {
        if (_panoramaHorizontalOff != null) return _panoramaHorizontalOff!!
        _panoramaHorizontalOff = tablerOutlineIcon(
            name = "PanoramaHorizontalOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.950 6.952 C 13.851 7.102 16.753 6.629 19.655 5.532 C 19.961 5.420 20.303 5.463 20.570 5.649 C 20.838 5.835 20.999 6.140 21.000 6.466 L 21.000 17.000M 17.788 17.806 C 13.305 16.525 8.822 16.732 4.339 18.428 C 4.033 18.542 3.692 18.498 3.424 18.311 C 3.157 18.125 2.999 17.819 3.000 17.493 L 3.000 6.466 C 3.002 6.142 3.161 5.838 3.427 5.652 C 3.693 5.467 4.033 5.421 4.338 5.531 C 4.926 5.752 5.514 5.949 6.102 6.121"),
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
        return _panoramaHorizontalOff!!
    }

private var _panoramaHorizontalOff: ImageVector? = null
