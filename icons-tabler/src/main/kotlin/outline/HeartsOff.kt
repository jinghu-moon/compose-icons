package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HeartsOff: ImageVector
    get() {
        if (_heartsOff != null) return _heartsOff!!
        _heartsOff = tablerOutlineIcon(
            name = "HeartsOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.017 18.000 L 12.000 20.000 L 4.500 12.572 C 3.452 11.552 2.903 10.125 2.997 8.666 C 3.091 7.207 3.820 5.862 4.990 4.986M 8.000 3.986 C 9.577 3.990 11.060 4.738 12.000 6.004 C 13.627 3.838 16.682 3.362 18.891 4.929 C 21.100 6.496 21.660 9.537 20.153 11.788"),
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
                pathData = parseSvgPathData("M 11.814 11.814 C 10.732 12.906 10.729 14.666 11.807 15.762 L 15.989 20.000 L 17.999 17.979M 19.976 15.989 L 20.187 15.777 C 21.267 14.683 21.267 12.923 20.187 11.829 C 19.672 11.305 18.968 11.010 18.233 11.008 C 17.499 11.007 16.794 11.300 16.277 11.822 L 15.994 12.000"),
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
        return _heartsOff!!
    }

private var _heartsOff: ImageVector? = null
