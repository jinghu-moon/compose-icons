package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowDownRhombus: ImageVector
    get() {
        if (_arrowDownRhombus != null) return _arrowDownRhombus!!
        _arrowDownRhombus = tablerFilledIcon(
            name = "ArrowDownRhombus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.707 2.293l2.5 2.5c.39 .39 .39 1.023 0 1.414L13 8.414v10.17l1.293-1.291c.356-.356 .922-.392 1.32-.083l.094 .083c.39 .391 .39 1.024 0 1.414l-3 3c-.035 .035-.072 .067-.112 .097l-.11 .071-.114 .054-.105 .035-.149 .03L12 22l-.075-.003-.126-.017-.111-.03-.111-.044-.098-.052-.096-.067-.09-.08-3-3c-.379-.392-.374-1.016 .012-1.402 .386-.386 1.009-.391 1.402-.012L11 18.586v-10.171L8.793 6.207c-.39-.39-.39-1.023 0-1.414L11.293 2.293c.391-.39 1.023-.39 1.414 0"),
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
        return _arrowDownRhombus!!
    }

private var _arrowDownRhombus: ImageVector? = null
