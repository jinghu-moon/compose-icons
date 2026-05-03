package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Bowl: ImageVector
    get() {
        if (_bowl != null) return _bowl!!
        _bowl = tablerOutlineIcon(
            name = "Bowl",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 8.000 L 20.000 8.000 C 20.552 8.000 21.000 8.448 21.000 9.000 L 21.000 9.500 C 21.000 11.000 18.483 15.073 17.000 16.000 L 17.000 17.000 C 17.000 17.552 16.552 18.000 16.000 18.000 L 8.000 18.000 C 7.448 18.000 7.000 17.552 7.000 17.000 L 7.000 16.000 C 5.313 14.946 3.000 11.000 3.000 9.500 L 3.000 9.000 C 3.000 8.448 3.448 8.000 4.000 8.000"),
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
        return _bowl!!
    }

private var _bowl: ImageVector? = null
