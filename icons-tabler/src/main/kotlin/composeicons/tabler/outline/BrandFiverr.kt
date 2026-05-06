package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandFiverr: ImageVector
    get() {
        if (_brandFiverr != null) return _brandFiverr!!
        _brandFiverr = tablerOutlineIcon(
            name = "BrandFiverr",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15 3h-2C9.686 3 7 5.686 7 9h-3v4h3v8h4v-7h4v7h4v-11h-8v-1.033c-0-.527 .212-1.033 .588-1.403C11.964 7.194 12.473 6.991 13 7h2v-4"),
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
        return _brandFiverr!!
    }

private var _brandFiverr: ImageVector? = null
