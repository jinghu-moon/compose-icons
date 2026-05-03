package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CropLandscape: ImageVector
    get() {
        if (_cropLandscape != null) return _cropLandscape!!
        _cropLandscape = tablerFilledIcon(
            name = "CropLandscape",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.000 5.000 C 19.657 5.000 21.000 6.343 21.000 8.000 L 21.000 16.000 C 21.000 17.657 19.657 19.000 18.000 19.000 L 6.000 19.000 C 4.343 19.000 3.000 17.657 3.000 16.000 L 3.000 8.000 C 3.000 6.343 4.343 5.000 6.000 5.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _cropLandscape!!
    }

private var _cropLandscape: ImageVector? = null
