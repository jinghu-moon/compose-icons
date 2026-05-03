package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Pill: ImageVector
    get() {
        if (_pill != null) return _pill!!
        _pill = tablerFilledIcon(
            name = "Pill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.207 3.793 C 22.530 6.117 22.530 9.883 20.207 12.207 L 12.207 20.207 C 9.876 22.485 6.146 22.463 3.842 20.158 C 1.537 17.854 1.515 14.124 3.793 11.793 L 11.793 3.793 C 14.117 1.470 17.883 1.470 20.207 3.793M 13.207 5.207 L 8.913 9.500 L 14.499 15.086 L 18.793 10.794 C 19.803 9.799 20.202 8.338 19.838 6.968 C 19.474 5.597 18.404 4.527 17.033 4.163 C 15.663 3.799 14.202 4.198 13.207 5.208"),
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
        return _pill!!
    }

private var _pill: ImageVector? = null
