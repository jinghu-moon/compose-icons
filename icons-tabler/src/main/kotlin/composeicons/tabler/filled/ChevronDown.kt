package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChevronDown: ImageVector
    get() {
        if (_chevronDown != null) return _chevronDown!!
        _chevronDown = tablerFilledIcon(
            name = "ChevronDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.707 8.293c.39 .391 .39 1.023 0 1.414l-6 6c-.391 .39-1.023 .39-1.414 0l-6-6C4.914 9.315 4.919 8.691 5.305 8.305c.386-.386 1.009-.391 1.402-.012L12 13.586 17.293 8.293c.391-.39 1.024-.39 1.414 0"),
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
        return _chevronDown!!
    }

private var _chevronDown: ImageVector? = null
