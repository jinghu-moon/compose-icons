package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CirclePlus: ImageVector
    get() {
        if (_circlePlus != null) return _circlePlus!!
        _circlePlus = tablerFilledIcon(
            name = "CirclePlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.929 4.929 C 7.444 2.349 11.152 1.322 14.636 2.240 C 18.120 3.158 20.841 5.879 21.759 9.363 C 22.677 12.847 21.650 16.555 19.070 19.070 C 15.146 22.860 8.909 22.806 5.052 18.948 C 1.194 15.091 1.140 8.854 4.930 4.930M 13.001 9.001 C 13.001 8.449 12.553 8.001 12.001 8.001 C 11.449 8.001 11.001 8.449 11.001 9.001 L 11.001 11.001 L 9.001 11.001 C 8.449 11.001 8.001 11.449 8.001 12.001 C 8.001 12.553 8.449 13.001 9.001 13.001 L 11.001 13.001 L 11.001 15.001 C 11.001 15.553 11.449 16.001 12.001 16.001 C 12.553 16.001 13.001 15.553 13.001 15.001 L 13.001 13.001 L 15.001 13.001 C 15.553 13.001 16.001 12.553 16.001 12.001 C 16.001 11.449 15.553 11.001 15.001 11.001 L 13.001 11.001 L 13.001 9.001 Z"),
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
        return _circlePlus!!
    }

private var _circlePlus: ImageVector? = null
