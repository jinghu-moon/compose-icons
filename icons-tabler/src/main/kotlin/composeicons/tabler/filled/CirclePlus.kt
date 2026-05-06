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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.929 4.929C7.444 2.349 11.152 1.322 14.636 2.24c3.484 .918 6.205 3.639 7.123 7.123 .918 3.484-.11 7.192-2.689 9.707C15.146 22.86 8.909 22.806 5.052 18.948 1.194 15.091 1.14 8.854 4.93 4.93M13.001 9.001c0-.552-.448-1-1-1-.552 0-1 .448-1 1v2h-2c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h2v2c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-2h2c.552 0 1-.448 1-1 0-.552-.448-1-1-1h-2v-2Z"),
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
        return _circlePlus!!
    }

private var _circlePlus: ImageVector? = null
