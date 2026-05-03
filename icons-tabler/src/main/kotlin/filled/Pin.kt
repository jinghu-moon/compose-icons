package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Pin: ImageVector
    get() {
        if (_pin != null) return _pin!!
        _pin = tablerFilledIcon(
            name = "Pin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.113 3.210 L 15.207 3.293 L 20.707 8.793 C 21.055 9.143 21.096 9.695 20.802 10.093 C 20.509 10.490 19.969 10.613 19.532 10.383 L 16.360 13.554 L 14.936 17.351 C 14.898 17.451 14.845 17.545 14.778 17.628 L 14.708 17.708 L 13.208 19.208 C 12.851 19.564 12.286 19.599 11.888 19.290 L 11.793 19.207 L 9.000 16.415 L 5.207 20.207 C 4.834 20.579 4.235 20.597 3.840 20.249 C 3.444 19.900 3.387 19.304 3.710 18.887 L 3.793 18.793 L 7.585 15.000 L 4.793 12.207 C 4.437 11.851 4.401 11.285 4.710 10.887 L 4.793 10.793 L 6.293 9.293 C 6.368 9.217 6.456 9.154 6.551 9.106 L 6.649 9.064 L 10.445 7.639 L 13.616 4.469 C 13.393 4.052 13.492 3.537 13.854 3.232 C 14.215 2.928 14.740 2.918 15.113 3.209 Z"),
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
        return _pin!!
    }

private var _pin: ImageVector? = null
