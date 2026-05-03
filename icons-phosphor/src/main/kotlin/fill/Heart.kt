package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Heart: ImageVector
    get() {
        if (_heart != null) return _heart!!
        _heart = phosphorFillIcon(
            name = "Heart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 102.000 C 240.000 172.000 136.210 228.660 131.790 231.000 C 129.424 232.273 126.576 232.273 124.210 231.000 C 119.790 228.660 16.000 172.000 16.000 102.000 C 16.039 67.774 43.774 40.039 78.000 40.000 C 98.650 40.000 116.730 48.880 128.000 63.890 C 139.270 48.880 157.350 40.000 178.000 40.000 C 212.226 40.039 239.961 67.774 240.000 102.000 Z"),
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
        return _heart!!
    }

private var _heart: ImageVector? = null
