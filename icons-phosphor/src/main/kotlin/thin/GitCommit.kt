package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GitCommit: ImageVector
    get() {
        if (_gitCommit != null) return _gitCommit!!
        _gitCommit = phosphorThinIcon(
            name = "GitCommit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 248.000 124.000 L 179.830 124.000 C 177.641 96.999 155.090 76.201 128.000 76.201 C 100.910 76.201 78.359 96.999 76.170 124.000 L 8.000 124.000 C 5.791 124.000 4.000 125.791 4.000 128.000 C 4.000 130.209 5.791 132.000 8.000 132.000 L 76.170 132.000 C 78.359 159.001 100.910 179.799 128.000 179.799 C 155.090 179.799 177.641 159.001 179.830 132.000 L 248.000 132.000 C 250.209 132.000 252.000 130.209 252.000 128.000 C 252.000 125.791 250.209 124.000 248.000 124.000 ZM 128.000 172.000 C 103.699 172.000 84.000 152.301 84.000 128.000 C 84.000 103.699 103.699 84.000 128.000 84.000 C 152.301 84.000 172.000 103.699 172.000 128.000 C 171.972 152.289 152.289 171.972 128.000 172.000 Z"),
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
