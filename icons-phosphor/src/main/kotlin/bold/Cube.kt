package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Cube: ImageVector
    get() {
        if (_cube != null) return _cube!!
        _cube = phosphorBoldIcon(
            name = "Cube",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 225.600 62.640 L 137.600 14.470 C 131.623 11.180 124.377 11.180 118.400 14.470 L 30.400 62.640 C 23.986 66.149 19.998 72.879 20.000 80.190 L 20.000 175.810 C 19.998 183.121 23.986 189.851 30.400 193.360 L 118.400 241.530 C 124.376 244.824 131.624 244.824 137.600 241.530 L 225.600 193.360 C 232.014 189.851 236.002 183.121 236.000 175.810 L 236.000 80.190 C 236.002 72.879 232.014 66.149 225.600 62.640 ZM 128.000 36.570 L 200.000 76.000 L 128.000 115.400 L 56.000 76.000 ZM 44.000 96.790 L 116.000 136.190 L 116.000 212.860 L 44.000 173.440 ZM 140.000 212.860 L 140.000 136.190 L 212.000 96.790 L 212.000 173.440 Z"),
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
        return _cube!!
    }

private var _cube: ImageVector? = null
