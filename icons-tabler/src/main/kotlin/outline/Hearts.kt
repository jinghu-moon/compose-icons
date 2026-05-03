package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Hearts: ImageVector
    get() {
        if (_hearts != null) return _hearts!!
        _hearts = tablerOutlineIcon(
            name = "Hearts",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.017 18.000 L 12.000 20.000 L 4.500 12.572 C 3.151 11.260 2.654 9.301 3.212 7.504 C 3.771 5.707 5.292 4.376 7.147 4.060 C 9.002 3.743 10.877 4.496 12.000 6.006 C 13.627 3.840 16.682 3.364 18.891 4.931 C 21.100 6.498 21.660 9.539 20.153 11.790"),
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
                pathData = parseSvgPathData("M 15.990 20.000 L 20.187 15.777 C 21.267 14.683 21.267 12.923 20.187 11.829 C 19.672 11.305 18.968 11.010 18.233 11.008 C 17.499 11.007 16.794 11.300 16.277 11.822 L 15.997 12.104 L 15.718 11.821 C 15.203 11.297 14.499 11.002 13.764 11.000 C 13.030 10.999 12.325 11.292 11.808 11.814 C 10.726 12.906 10.723 14.666 11.801 15.762 L 15.983 20.000 L 15.990 20.000"),
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
        return _hearts!!
    }

private var _hearts: ImageVector? = null
