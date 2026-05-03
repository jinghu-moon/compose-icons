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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.262 10.878 L 11.262 19.667 C 11.662 20.107 12.353 20.107 12.753 19.667 L 20.753 10.877 C 21.066 10.533 21.102 10.018 20.840 9.634 L 17.303 4.440 C 17.117 4.168 16.809 4.005 16.480 4.004 L 7.554 4.004 C 7.225 4.005 6.917 4.168 6.731 4.440 L 3.191 9.632 C 2.928 10.017 2.964 10.533 3.278 10.878 L 3.262 10.878"),
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
        return _brandSketch!!
    }

private var _brandSketch: ImageVector? = null
