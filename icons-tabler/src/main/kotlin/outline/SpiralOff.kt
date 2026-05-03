package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SpiralOff: ImageVector
    get() {
        if (_spiralOff != null) return _spiralOff!!
        _spiralOff = tablerOutlineIcon(
            name = "SpiralOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.000 12.057 C 10.137 12.353 10.349 12.609 10.614 12.800 C 11.296 13.259 12.123 13.174 12.778 12.780M 13.881 9.860 C 13.619 8.955 12.982 8.206 12.132 7.801 C 11.968 7.723 11.799 7.658 11.625 7.606M 8.240 8.240 C 7.656 8.662 7.192 9.230 6.893 9.886 C 5.798 12.318 7.183 15.134 9.603 16.132 C 11.558 16.938 13.700 16.482 15.253 15.248M 16.998 12.980 L 17.041 12.877 C 18.401 9.534 16.484 5.743 13.145 4.467 C 11.552 3.857 9.875 3.868 8.355 4.354M 5.776 5.762 C 4.762 6.591 3.981 7.669 3.508 8.890 C 1.878 13.143 4.331 17.914 8.590 19.466 C 11.801 20.636 15.266 19.808 17.714 17.728M 19.583 15.579 C 20.435 14.220 20.923 12.665 21.000 11.063"),
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
        return _spiralOff!!
    }

private var _spiralOff: ImageVector? = null
