package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandTailwind: ImageVector
    get() {
        if (_brandTailwind != null) return _brandTailwind!!
        _brandTailwind = tablerOutlineIcon(
            name = "BrandTailwind",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.667 6.000 C 9.177 6.000 7.623 7.222 7.000 9.667 C 7.933 8.444 9.023 7.987 10.267 8.292 C 10.977 8.466 11.484 8.972 12.045 9.532 C 12.961 10.444 14.045 11.500 16.333 11.500 C 18.823 11.500 20.377 10.278 21.000 7.833 C 20.067 9.056 18.977 9.513 17.733 9.208 C 17.023 9.034 16.516 8.528 15.955 7.968 C 15.039 7.056 13.980 6.000 11.667 6.000M 7.667 12.500 C 5.177 12.500 3.623 13.722 3.000 16.167 C 3.933 14.944 5.023 14.487 6.267 14.792 C 6.977 14.966 7.484 15.472 8.045 16.032 C 8.961 16.944 10.020 18.000 12.333 18.000 C 14.823 18.000 16.377 16.778 17.000 14.333 C 16.067 15.556 14.977 16.013 13.733 15.708 C 13.023 15.534 12.516 15.028 11.955 14.468 C 11.039 13.556 9.980 12.500 7.667 12.500"),
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
        return _brandTailwind!!
    }

private var _brandTailwind: ImageVector? = null
