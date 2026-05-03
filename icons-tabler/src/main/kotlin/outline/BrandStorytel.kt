package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandStorytel: ImageVector
    get() {
        if (_brandStorytel != null) return _brandStorytel!!
        _brandStorytel = tablerOutlineIcon(
            name = "BrandStorytel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.103 22.000 C 6.395 19.067 20.928 19.570 20.928 10.462 C 20.928 4.164 15.954 2.000 12.477 2.000 C 9.000 2.000 3.000 5.036 3.000 13.241 C 3.000 19.615 4.103 22.000 4.103 22.000"),
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
        return _brandStorytel!!
    }

private var _brandStorytel: ImageVector? = null
