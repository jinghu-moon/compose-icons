package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandWebflow: ImageVector
    get() {
        if (_brandWebflow != null) return _brandWebflow!!
        _brandWebflow = tablerOutlineIcon(
            name = "BrandWebflow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 10c0 0-1.376 3.606-1.5 4C15.454 13.6 14 6 14 6 11.373 6 10.234 7.562 9.5 9.5c0 0-1.843 4.593-2 5C7.487 14.132 7 10 7 10 6.85 7.629 4.789 6.02 3 6.02L5 19c2.745-.013 4.72-1.562 5.5-3.5 0 0 1.44-4.3 1.5-4.5 .013 .18 1 8 1 8 2.758 0 4.694-1.626 5.5-3.5L22 6c-2.732 0-4.253 2.055-5 4"),
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
        return _brandWebflow!!
    }

private var _brandWebflow: ImageVector? = null
