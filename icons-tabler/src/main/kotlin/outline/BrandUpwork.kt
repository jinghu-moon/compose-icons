package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandUpwork: ImageVector
    get() {
        if (_brandUpwork != null) return _brandUpwork!!
        _brandUpwork = tablerOutlineIcon(
            name = "BrandUpwork",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 7.000 L 3.000 12.000 C 3.000 13.657 4.343 15.000 6.000 15.000 C 7.657 15.000 9.000 13.657 9.000 12.000 L 9.000 7.000 L 10.000 7.000 L 14.000 13.000 C 14.824 14.319 15.945 15.000 17.500 15.000 C 19.433 15.000 21.000 13.433 21.000 11.500 C 21.000 9.567 19.433 8.000 17.500 8.000 C 15.473 8.000 14.363 9.000 14.000 11.000 C 13.758 12.330 13.092 15.000 12.000 19.000"),
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
        return _brandUpwork!!
    }

private var _brandUpwork: ImageVector? = null
