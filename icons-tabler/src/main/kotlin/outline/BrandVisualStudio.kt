package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandVisualStudio: ImageVector
    get() {
        if (_brandVisualStudio != null) return _brandVisualStudio!!
        _brandVisualStudio = tablerOutlineIcon(
            name = "BrandVisualStudio",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 8.000 L 6.000 7.000 L 16.000 20.000 L 20.000 18.000 L 20.000 6.000 L 16.000 4.000 L 6.000 17.000 L 4.000 16.000 L 4.000 8.000"),
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
        return _brandVisualStudio!!
    }

private var _brandVisualStudio: ImageVector? = null
