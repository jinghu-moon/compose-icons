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
                pathData = parseSvgPathData("M3 7v5c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3v-5h1l4 6c.824 1.319 1.945 2 3.5 2C19.433 15 21 13.433 21 11.5 21 9.567 19.433 8 17.5 8 15.473 8 14.363 9 14 11c-.242 1.33-.908 4-2 8"),
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
