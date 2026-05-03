package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Eye: ImageVector
    get() {
        if (_eye != null) return _eye!!
        _eye = tablerFilledIcon(
            name = "Eye",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 4.000 C 16.290 4.000 19.863 6.429 22.665 11.154 L 22.885 11.533 L 22.930 11.633 L 22.960 11.716 L 22.974 11.771 L 22.988 11.853 L 22.999 11.953 L 22.999 12.063 L 22.985 12.174 C 22.978 12.211 22.970 12.248 22.959 12.284 L 22.920 12.392 L 22.884 12.467 L 22.868 12.497 C 20.104 17.333 16.568 19.877 12.313 19.996 L 12.000 20.000 C 7.604 20.000 3.963 17.451 1.132 12.496 C 0.956 12.189 0.956 11.811 1.132 11.504 C 3.963 6.549 7.604 4.000 12.000 4.000 ZM 12.000 9.000 C 10.343 9.000 9.000 10.343 9.000 12.000 C 9.000 13.657 10.343 15.000 12.000 15.000 C 13.657 15.000 15.000 13.657 15.000 12.000 C 15.000 10.343 13.657 9.000 12.000 9.000"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _eye!!
    }

private var _eye: ImageVector? = null
