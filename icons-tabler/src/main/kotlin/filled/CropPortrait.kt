package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CropPortrait: ImageVector
    get() {
        if (_cropPortrait != null) return _cropPortrait!!
        _cropPortrait = tablerFilledIcon(
            name = "CropPortrait",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.000 3.000 C 17.657 3.000 19.000 4.343 19.000 6.000 L 19.000 18.000 C 19.000 19.657 17.657 21.000 16.000 21.000 L 8.000 21.000 C 6.343 21.000 5.000 19.657 5.000 18.000 L 5.000 6.000 C 5.000 4.343 6.343 3.000 8.000 3.000 Z"),
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
        return _cropPortrait!!
    }

private var _cropPortrait: ImageVector? = null
