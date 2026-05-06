package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandPaypal: ImageVector
    get() {
        if (_brandPaypal != null) return _brandPaypal!!
        _brandPaypal = tablerOutlineIcon(
            name = "BrandPaypal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10 13h2.5c2.5 0 5-2.5 5-5 0-3-1.9-5-5-5h-5.5C6.5 3 6 3.5 6 4L4 18c0 .5 .5 1 1 1h2.8L9 14c.1-.6 .4-1 1-1M17.5 7.2C19.2 8.2 20 10 20 12c0 2.5-2.5 4.5-5 4.5h-2.6l-.6 3.6c-.096 .473-.517 .81-1 .8h-2.7c-.152 .003-.297-.063-.394-.18-.097-.117-.136-.271-.106-.42l.2-1.4"),
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
        return _brandPaypal!!
    }

private var _brandPaypal: ImageVector? = null
