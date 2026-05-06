package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Pill: ImageVector
    get() {
        if (_pill != null) return _pill!!
        _pill = tablerFilledIcon(
            name = "Pill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.207 3.793c2.323 2.324 2.323 6.09 0 8.414l-8 8C9.876 22.485 6.146 22.463 3.842 20.158 1.537 17.854 1.515 14.124 3.793 11.793L11.793 3.793c2.324-2.323 6.09-2.323 8.414 0M13.207 5.207 8.913 9.5l5.586 5.586 4.294-4.292c1.01-.995 1.409-2.456 1.045-3.826C19.474 5.597 18.404 4.527 17.033 4.163c-1.371-.364-2.831 .035-3.826 1.045"),
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
        return _pill!!
    }

private var _pill: ImageVector? = null
