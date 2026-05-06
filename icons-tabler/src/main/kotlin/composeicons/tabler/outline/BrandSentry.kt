package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSentry: ImageVector
    get() {
        if (_brandSentry != null) return _brandSentry!!
        _brandSentry = tablerOutlineIcon(
            name = "BrandSentry",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 18c-.006 .381 .1 .755 .306 1.076 .347 .546 .938 .89 1.584 .924 .646 .033-.537 0 .11 0h3C8 17.756 6.502 15.789 4.34 15.19c.558-.973 1.24-2.149 2.04-3.531C9.777 13.036 12 16.335 12 20h4c.663 0 2.337 0 3 0 .663-.005 1.28-.337 1.648-.888 .368-.551 .44-1.248 .192-1.862L13.74 5C13.388 4.363 12.718 3.968 11.99 3.968c-.728 0-1.398 .395-1.75 1.032L8.4 8.176C12.882 10.226 16 14.747 16 20"),
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
        return _brandSentry!!
    }

private var _brandSentry: ImageVector? = null
