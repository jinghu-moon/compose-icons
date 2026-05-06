package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Badge: ImageVector
    get() {
        if (_badge != null) return _badge!!
        _badge = tablerFilledIcon(
            name = "Badge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16.486 3.143 12 5.833 7.514 3.143C7.205 2.958 6.821 2.953 6.507 3.131 6.194 3.308 6 3.64 6 4v13c0 .351 .185 .676 .486 .857l5 3c.316 .19 .712 .19 1.028 0l5-3c.301-.181 .486-.506 .486-.857v-13c-0-.36-.194-.692-.507-.869-.313-.177-.698-.173-1.007 .012Z"),
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
        return _badge!!
    }

private var _badge: ImageVector? = null
