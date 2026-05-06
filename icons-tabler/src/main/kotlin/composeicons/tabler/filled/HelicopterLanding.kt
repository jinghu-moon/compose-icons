package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HelicopterLanding: ImageVector
    get() {
        if (_helicopterLanding != null) return _helicopterLanding!!
        _helicopterLanding = tablerFilledIcon(
            name = "HelicopterLanding",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 2c1.657 0 3 1.343 3 3v14c0 1.657-1.343 3-3 3h-14C3.343 22 2 20.657 2 19v-14C2 3.343 3.343 2 5 2ZM15 7c-.552 0-1 .448-1 1v3h-4v-3C10 7.493 9.62 7.066 9.117 7.007L9 7C8.448 7 8 7.448 8 8v8c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-3h4v3c0 .507 .38 .934 .883 .993L15 17c.552 0 1-.448 1-1v-8C16 7.448 15.552 7 15 7"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _helicopterLanding!!
    }

private var _helicopterLanding: ImageVector? = null
