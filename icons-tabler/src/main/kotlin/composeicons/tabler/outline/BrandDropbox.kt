package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandDropbox: ImageVector
    get() {
        if (_brandDropbox != null) return _brandDropbox!!
        _brandDropbox = tablerOutlineIcon(
            name = "BrandDropbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.5 10.625 3 7.812 7.5 5 12 7.813 7.5 10.625 12 7.812 7.5 10.625 3 13.448l4.5 2.802M7.5 10.625 12 13.448 12 7.812l4.5 2.791L21 7.791 16.5 5 12 7.813M7.5 16.251 12 13.449 7.5 16.251v1.123L12 20.001l4.5-2.627v-1.123M12 13.449l4.5-2.823L21 13.449l-4.5 2.802M12 13.449l4.5 2.802"),
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
        return _brandDropbox!!
    }

private var _brandDropbox: ImageVector? = null
