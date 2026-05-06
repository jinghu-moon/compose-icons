package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RotateClockwise: ImageVector
    get() {
        if (_rotateClockwise != null) return _rotateClockwise!!
        _rotateClockwise = tablerOutlineIcon(
            name = "RotateClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.05 11C4.573 7.009 7.981 4.028 12.006 4.04c4.025 .012 7.415 3.013 7.914 7.008 .499 3.994-2.047 7.738-5.946 8.74C10.076 20.79 6.04 18.74 4.55 15M4.05 20v-5h5"),
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
        return _rotateClockwise!!
    }

private var _rotateClockwise: ImageVector? = null
