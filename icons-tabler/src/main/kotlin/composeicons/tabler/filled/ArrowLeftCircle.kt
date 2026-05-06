package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowLeftCircle: ImageVector
    get() {
        if (_arrowLeftCircle != null) return _arrowLeftCircle!!
        _arrowLeftCircle = tablerFilledIcon(
            name = "ArrowLeftCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.707 8.293c.39 .391 .39 1.023 0 1.414L5.415 11h10.756c.487-1.378 1.896-2.205 3.337-1.958 1.441 .247 2.494 1.496 2.494 2.958 0 1.462-1.053 2.711-2.494 2.958C18.067 15.205 16.658 14.378 16.171 13h-10.756l1.292 1.293c.356 .356 .392 .922 .083 1.32l-.083 .094c-.39 .39-1.023 .39-1.414 0l-3-3c-.035-.035-.067-.072-.097-.112l-.071-.11-.054-.114-.035-.105-.025-.118-.007-.058L2 12l.003-.075 .017-.126 .03-.111 .044-.111 .052-.098 .067-.096 .08-.09 3-3c.39-.39 1.023-.39 1.414 0"),
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
        return _arrowLeftCircle!!
    }

private var _arrowLeftCircle: ImageVector? = null
