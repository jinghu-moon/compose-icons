package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandTinder: ImageVector
    get() {
        if (_brandTinder != null) return _brandTinder!!
        _brandTinder = tablerOutlineIcon(
            name = "BrandTinder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.918 8.174 C 21.478 13.156 19.419 19.830 13.538 20.800 C 5.836 22.487 0.698 13.084 6.484 7.571 C 6.793 7.266 7.645 6.476 8.000 6.222 C 8.000 6.750 8.270 9.697 9.000 9.389 C 12.000 9.389 13.000 5.167 12.587 2.000 C 15.287 3.411 17.574 5.376 18.918 8.174"),
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
        return _brandTinder!!
    }

private var _brandTinder: ImageVector? = null
