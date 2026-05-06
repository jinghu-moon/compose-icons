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
                pathData = parseSvgPathData("M4 8h16c.552 0 1 .448 1 1v.5C21 11 18.483 15.073 17 16v1c0 .552-.448 1-1 1h-8C7.448 18 7 17.552 7 17v-1C5.313 14.946 3 11 3 9.5v-.5C3 8.448 3.448 8 4 8"),
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
