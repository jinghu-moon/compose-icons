package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Pencil: ImageVector
    get() {
        if (_pencil != null) return _pencil!!
        _pencil = tablerFilledIcon(
            name = "Pencil",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.085 6.500 L 17.500 11.915 L 8.707 20.707 C 8.520 20.895 8.265 21.000 8.000 21.000 L 4.000 21.000 C 3.448 21.000 3.000 20.552 3.000 20.000 L 3.000 16.000 C 3.000 15.735 3.105 15.480 3.293 15.293 ZM 17.491 3.802 C 18.812 4.156 19.844 5.188 20.198 6.509 C 20.552 7.830 20.174 9.240 19.207 10.207 L 18.915 10.500 L 13.500 5.085 L 13.793 4.793 C 14.760 3.826 16.170 3.448 17.491 3.802"),
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
        return _pencil!!
    }

private var _pencil: ImageVector? = null
