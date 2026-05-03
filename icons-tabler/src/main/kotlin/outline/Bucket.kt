package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Bucket: ImageVector
    get() {
        if (_bucket != null) return _bucket!!
        _bucket = tablerOutlineIcon(
            name = "Bucket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 7.000 C 4.000 9.209 7.582 11.000 12.000 11.000 C 16.418 11.000 20.000 9.209 20.000 7.000 C 20.000 4.791 16.418 3.000 12.000 3.000 C 7.582 3.000 4.000 4.791 4.000 7.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 4.000 7.000 C 4.000 7.664 4.088 8.324 4.263 8.965 L 7.000 19.000 C 7.500 20.500 9.239 21.000 12.000 21.000 C 14.761 21.000 16.500 20.500 17.000 19.000 C 17.333 18.000 18.246 14.655 19.737 8.965 C 19.912 8.325 20.000 7.664 20.000 7.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _bucket!!
    }

private var _bucket: ImageVector? = null
