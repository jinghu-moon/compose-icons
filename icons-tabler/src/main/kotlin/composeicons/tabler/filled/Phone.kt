package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Phone: ImageVector
    get() {
        if (_phone != null) return _phone!!
        _phone = tablerFilledIcon(
            name = "Phone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 3c.365-0 .701 .199 .877 .519l.051 .11 2 5c.165 .413 .038 .886-.313 1.16l-.1 .068L9.841 10.861l.063 .103c.797 1.265 1.867 2.335 3.132 3.132l.102 .062 1.005-1.672c.229-.382 .683-.567 1.113-.453l.115 .039 5 2c.339 .135 .578 .445 .622 .807L21 15v4c0 1.657-1.343 3-3.06 2.998C9.361 21.477 2.522 14.638 2 6 2 4.411 3.238 3.098 4.824 3.005L5 3h4Z"),
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
        return _phone!!
    }

private var _phone: ImageVector? = null
