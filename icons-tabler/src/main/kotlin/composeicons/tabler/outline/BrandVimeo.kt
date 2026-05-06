package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandVimeo: ImageVector
    get() {
        if (_brandVimeo != null) return _brandVimeo!!
        _brandVimeo = tablerOutlineIcon(
            name = "BrandVimeo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 8.5l1 1C4 9.5 5.5 8.398 6 9c.509 .609 1.863 7.65 2.5 9 .556 1.184 1.978 2.89 4 1.5C14.5 18 20 14 21 8 21.444 5.339 20 4 18.5 4 16.5 4 14.453 5.202 14 8c2.05-1.254 2.551 1 1.5 3-1.052 2-2 3-2.5 3-.49 0-.924-1.165-1.5-3.5C10.91 8.08 11 4 8.5 4 6 4 3 8.5 3 8.5"),
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
        return _brandVimeo!!
    }

private var _brandVimeo: ImageVector? = null
