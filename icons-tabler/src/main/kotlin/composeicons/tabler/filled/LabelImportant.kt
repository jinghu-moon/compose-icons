package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LabelImportant: ImageVector
    get() {
        if (_labelImportant != null) return _labelImportant!!
        _labelImportant = tablerFilledIcon(
            name = "LabelImportant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16.52 6c.607 0 1.181 .276 1.561 .75l3.7 4.625c.292 .365 .292 .885 0 1.25l-3.7 4.624c-.379 .474-.954 .751-1.561 .751h-12.52c-.384-0-.735-.221-.901-.567-.166-.347-.119-.758 .121-1.058L6.72 12 3.22 7.625C2.992 7.341 2.936 6.955 3.075 6.618c.139-.337 .45-.572 .813-.613L4 6Z"),
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
        return _labelImportant!!
    }

private var _labelImportant: ImageVector? = null
