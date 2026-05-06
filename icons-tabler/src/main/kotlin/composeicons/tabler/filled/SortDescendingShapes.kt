package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SortDescendingShapes: ImageVector
    get() {
        if (_sortDescendingShapes != null) return _sortDescendingShapes!!
        _sortDescendingShapes = tablerFilledIcon(
            name = "SortDescendingShapes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 5c.552 0 1 .448 1 1v9.584L9.293 14.293c.356-.356 .922-.392 1.32-.083l.094 .083c.39 .391 .39 1.023 0 1.414l-3 3c-.035 .035-.072 .067-.112 .097l-.11 .071-.114 .054-.105 .035-.149 .03L7 19l-.075-.003-.126-.017-.111-.03-.111-.044-.098-.052-.096-.067-.09-.08L3.293 15.707c-.379-.392-.374-1.016 .012-1.402 .386-.386 1.009-.391 1.402-.012L6 15.586v-9.586C6 5.448 6.448 5 7 5M19 13c1.105 0 2 .895 2 2v4c0 1.105-.895 2-2 2h-4c-1.105 0-2-.895-2-2v-4c0-1.105 .895-2 2-2ZM17.864 3.496l3.5 6c.181 .309 .182 .692 .003 1.002-.178 .311-.509 .502-.867 .502h-7c-.358 0-.689-.191-.867-.502-.178-.311-.177-.693 .003-1.002L16.136 3.496c.179-.307 .508-.497 .864-.497 .356 0 .685 .189 .864 .497"),
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
        return _sortDescendingShapes!!
    }

private var _sortDescendingShapes: ImageVector? = null
