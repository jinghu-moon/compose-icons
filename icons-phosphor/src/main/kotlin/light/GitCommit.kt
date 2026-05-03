package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GitCommit: ImageVector
    get() {
        if (_gitCommit != null) return _gitCommit!!
        _gitCommit = phosphorLightIcon(
            name = "GitCommit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 248.000 122.000 L 181.660 122.000 C 178.581 94.691 155.482 74.050 128.000 74.050 C 100.518 74.050 77.419 94.691 74.340 122.000 L 8.000 122.000 C 4.686 122.000 2.000 124.686 2.000 128.000 C 2.000 131.314 4.686 134.000 8.000 134.000 L 74.340 134.000 C 77.419 161.309 100.518 181.950 128.000 181.950 C 155.482 181.950 178.581 161.309 181.660 134.000 L 248.000 134.000 C 251.314 134.000 254.000 131.314 254.000 128.000 C 254.000 124.686 251.314 122.000 248.000 122.000 ZM 128.000 170.000 C 104.804 170.000 86.000 151.196 86.000 128.000 C 86.000 104.804 104.804 86.000 128.000 86.000 C 151.196 86.000 170.000 104.804 170.000 128.000 C 170.000 151.196 151.196 170.000 128.000 170.000 Z"),
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
        return _gitCommit!!
    }

private var _gitCommit: ImageVector? = null
