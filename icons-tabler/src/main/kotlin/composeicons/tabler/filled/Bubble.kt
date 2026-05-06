package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bubble: ImageVector
    get() {
        if (_bubble != null) return _bubble!!
        _bubble = tablerFilledIcon(
            name = "Bubble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.4 2c2.267-.001 4.361 1.21 5.491 3.176l.09 .162 .126 .027c2.781 .65 4.783 3.08 4.889 5.934l.004 .234c0 1.68-.667 3.291-1.855 4.479-1.188 1.188-2.799 1.855-4.478 1.855l-.035-.002-.035 .05c-.944 1.247-2.395 2.01-3.958 2.08L12.4 20q-.722 0-1.404-.19l-.047-.014L7.515 21.857c-.291 .175-.652 .191-.957 .04-.305-.15-.513-.445-.552-.783L6 21v-2.434l-.121-.06C4.744 17.902 4.008 16.748 3.939 15.464l-.006-.197q0-.365 .07-.717l.013-.058-.113-.09C2.638 13.356 1.876 11.823 1.805 10.184L1.8 9.934C1.8 6.731 4.397 4.134 7.6 4.134l.058 .001 .15-.163C8.94 2.778 10.492 2.072 12.136 2.005Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _bubble!!
    }

private var _bubble: ImageVector? = null
