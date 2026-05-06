package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChevronRight: ImageVector
    get() {
        if (_chevronRight != null) return _chevronRight!!
        _chevronRight = tablerFilledIcon(
            name = "ChevronRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.707 5.293l6 6c.39 .391 .39 1.023 0 1.414l-6 6c-.251 .26-.623 .364-.973 .273-.35-.092-.623-.365-.714-.714-.092-.35 .013-.721 .273-.973L13.586 12 8.293 6.707C7.914 6.315 7.919 5.691 8.305 5.305c.386-.386 1.009-.391 1.402-.012"),
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
        return _chevronRight!!
    }

private var _chevronRight: ImageVector? = null
