package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSketch: ImageVector
    get() {
        if (_brandSketch != null) return _brandSketch!!
        _brandSketch = tablerOutlineIcon(
            name = "BrandSketch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.262 10.878l8 8.789c.4 .44 1.091 .44 1.491 0l8-8.79c.313-.344 .349-.859 .087-1.243L17.303 4.44c-.186-.272-.494-.435-.823-.436h-8.926c-.329 .001-.637 .164-.823 .436L3.191 9.632c-.263 .385-.227 .901 .087 1.246h-.016"),
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
        return _brandSketch!!
    }

private var _brandSketch: ImageVector? = null
