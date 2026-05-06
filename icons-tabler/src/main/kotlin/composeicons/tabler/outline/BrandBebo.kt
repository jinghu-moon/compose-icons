package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandBebo: ImageVector
    get() {
        if (_brandBebo != null) return _brandBebo!!
        _brandBebo = tablerOutlineIcon(
            name = "BrandBebo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 17.5c1.933 0 3.5-1.567 3.5-3.5 0-1.838-1.159-3.002-3.005-3.372-.746-.15-1.37-.745-1.37-1.506 0-1.142 .934-2.095 2.058-1.894C16.793 7.873 19 10.286 19 14c0 3.866-3.134 7-7 7C8.134 21 5 17.866 5 14v-9.25C5 3.784 5.784 3 6.75 3c.966 0 1.75 .784 1.75 1.75v9.25c0 1.933 1.567 3.5 3.5 3.5"),
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
        return _brandBebo!!
    }

private var _brandBebo: ImageVector? = null
