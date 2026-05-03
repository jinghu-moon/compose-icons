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
                pathData = parseSvgPathData("M 3.000 8.500 L 4.000 9.500 C 4.000 9.500 5.500 8.398 6.000 9.000 C 6.509 9.609 7.863 16.650 8.500 18.000 C 9.056 19.184 10.478 20.890 12.500 19.500 C 14.500 18.000 20.000 14.000 21.000 8.000 C 21.444 5.339 20.000 4.000 18.500 4.000 C 16.500 4.000 14.453 5.202 14.000 8.000 C 16.050 6.746 16.551 9.000 15.500 11.000 C 14.448 13.000 13.500 14.000 13.000 14.000 C 12.510 14.000 12.076 12.835 11.500 10.500 C 10.910 8.080 11.000 4.000 8.500 4.000 C 6.000 4.000 3.000 8.500 3.000 8.500"),
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
