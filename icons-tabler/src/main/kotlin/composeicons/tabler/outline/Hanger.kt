package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Hanger: ImageVector
    get() {
        if (_hanger != null) return _hanger!!
        _hanger = tablerOutlineIcon(
            name = "Hanger",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 6C14 4.895 13.105 4 12 4c-1.105 0-2 .895-2 2 0 1.667 .67 3 2 4h-.008l7.971 4.428c.635 .353 1.029 1.022 1.029 1.749v.823c0 1.105-.895 2-2 2h-14c-1.105 0-2-.895-2-2v-.823c-0-.727 .394-1.396 1.029-1.749L11.992 10"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _hanger!!
    }

private var _hanger: ImageVector? = null
