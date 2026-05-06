package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SwipeDown: ImageVector
    get() {
        if (_swipeDown != null) return _swipeDown!!
        _swipeDown = tablerFilledIcon(
            name = "SwipeDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 3c2.569-.003 4.722 1.941 4.981 4.497 .258 2.556-1.462 4.892-3.98 5.403L13 17.584l1.293-1.291c.356-.356 .922-.392 1.32-.083l.094 .083c.39 .391 .39 1.024 0 1.414l-3 3c-.035 .035-.072 .067-.112 .097l-.11 .071-.114 .054-.105 .035-.149 .03L12 21l-.075-.003-.126-.017-.111-.03-.111-.044-.098-.052-.096-.067-.09-.08-3-3c-.379-.392-.374-1.016 .012-1.402 .386-.386 1.009-.391 1.402-.012L11 17.585v-4.685C8.491 12.38 6.78 10.049 7.038 7.499 7.295 4.95 9.438 3.007 12 3"),
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
        return _swipeDown!!
    }

private var _swipeDown: ImageVector? = null
