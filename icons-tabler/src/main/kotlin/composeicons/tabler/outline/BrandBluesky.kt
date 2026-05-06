package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandBluesky: ImageVector
    get() {
        if (_brandBluesky != null) return _brandBluesky!!
        _brandBluesky = tablerOutlineIcon(
            name = "BrandBluesky",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.335 5.144C4.681 3.945 2 3.017 2 5.97c0 .59 .35 4.953 .556 5.661C3.269 14.094 5.686 14.381 8 14c-4.045 .665-4.889 3.208-2.667 5.41C6.363 20.428 7.246 21 8 21c2 0 3.134-2.769 3.5-3.5C11.833 16.833 12 16.333 12 16c0 .333 .167 .833 .5 1.5C12.866 18.231 14 21 16 21c.754 0 1.637-.571 2.667-1.59C20.889 17.207 20.045 14.664 16 14c2.314 .38 4.73 .094 5.444-2.369C21.65 10.923 22 6.559 22 5.97 22 3.017 19.32 3.945 17.665 5.144 15.372 6.806 12.905 10.192 12 12 11.095 10.192 8.628 6.806 6.335 5.144"),
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
        return _brandBluesky!!
    }

private var _brandBluesky: ImageVector? = null
