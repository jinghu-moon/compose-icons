package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Wind: ImageVector
    get() {
        if (_wind != null) return _wind!!
        _wind = tablerOutlineIcon(
            name = "Wind",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.000 8.000 L 13.500 8.000 C 14.790 8.025 15.886 7.064 16.032 5.782 C 16.177 4.501 15.324 3.319 14.061 3.054 C 12.799 2.789 11.542 3.528 11.160 4.760"),
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
        pathData = parseSvgPathData("M 3.000 12.000 L 18.500 12.000 C 19.790 11.975 20.886 12.936 21.032 14.218 C 21.177 15.499 20.324 16.681 19.061 16.946 C 17.799 17.211 16.542 16.472 16.160 15.240"),
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
        pathData = parseSvgPathData("M 4.000 16.000 L 9.500 16.000 C 10.790 15.975 11.886 16.936 12.032 18.218 C 12.177 19.499 11.324 20.681 10.061 20.946 C 8.799 21.211 7.542 20.472 7.160 19.240"),
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
        return _wind!!
    }

private var _wind: ImageVector? = null
