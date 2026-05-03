package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Ear: ImageVector
    get() {
        if (_ear != null) return _ear!!
        _ear = tablerOutlineIcon(
            name = "Ear",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.000 10.000 C 5.998 7.042 7.855 4.401 10.641 3.404 C 13.426 2.407 16.538 3.269 18.413 5.556 C 20.289 7.844 20.524 11.064 19.000 13.600 C 18.431 14.358 17.758 15.031 17.000 15.600 C 16.114 16.435 15.430 17.461 15.000 18.600 C 14.372 19.787 13.246 20.632 11.930 20.903 C 10.614 21.174 9.246 20.843 8.200 20.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 10.000 10.000 C 9.983 8.617 10.914 7.402 12.254 7.058 C 13.593 6.714 14.995 7.331 15.646 8.551 C 16.298 9.771 16.031 11.278 15.000 12.200"),
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
        return _ear!!
    }

private var _ear: ImageVector? = null
