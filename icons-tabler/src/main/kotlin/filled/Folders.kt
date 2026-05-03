package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Folders: ImageVector
    get() {
        if (_folders != null) return _folders!!
        _folders = tablerFilledIcon(
            name = "Folders",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 12.265 2.000 12.520 2.105 12.707 2.293 L 14.415 4.000 L 19.000 4.000 C 20.589 4.000 21.902 5.238 21.995 6.824 L 22.000 7.000 L 22.000 14.000 C 22.000 15.657 20.657 17.000 19.000 17.000 L 18.000 17.000 L 18.000 18.000 C 18.000 19.657 16.657 21.000 15.000 21.000 L 5.000 21.000 C 3.343 21.000 2.000 19.657 2.000 18.000 L 2.000 9.000 C 2.000 7.343 3.343 6.000 5.000 6.000 L 6.000 6.000 L 6.000 5.000 C 6.000 3.343 7.343 2.000 9.000 2.000 ZM 6.000 8.000 L 5.000 8.000 C 4.448 8.000 4.000 8.448 4.000 9.000 L 4.000 18.000 C 4.000 18.552 4.448 19.000 5.000 19.000 L 15.000 19.000 C 15.552 19.000 16.000 18.552 16.000 18.000 L 16.000 17.000 L 9.000 17.000 C 7.343 17.000 6.000 15.657 6.000 14.000 Z"),
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
        return _folders!!
    }

private var _folders: ImageVector? = null
