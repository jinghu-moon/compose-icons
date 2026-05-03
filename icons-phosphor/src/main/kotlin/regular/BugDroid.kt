package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BugDroid: ImageVector
    get() {
        if (_bugDroid != null) return _bugDroid!!
        _bugDroid = phosphorRegularIcon(
            name = "BugDroid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 191.830 51.480 L 205.660 37.660 C 208.786 34.534 208.786 29.466 205.660 26.340 C 202.534 23.214 197.466 23.214 194.340 26.340 L 179.790 40.900 C 148.939 18.368 107.061 18.368 76.210 40.900 L 61.660 26.340 C 58.534 23.214 53.466 23.214 50.340 26.340 C 47.214 29.466 47.214 34.534 50.340 37.660 L 64.170 51.480 C 48.641 67.801 39.986 89.471 40.000 112.000 L 40.000 152.000 C 40.000 200.601 79.399 240.000 128.000 240.000 C 176.601 240.000 216.000 200.601 216.000 152.000 L 216.000 112.000 C 216.014 89.471 207.359 67.801 191.830 51.480 ZM 128.000 40.000 C 167.746 40.044 199.956 72.254 200.000 112.000 L 200.000 120.000 L 56.000 120.000 L 56.000 112.000 C 56.044 72.254 88.254 40.044 128.000 40.000 ZM 128.000 224.000 C 88.254 223.956 56.044 191.746 56.000 152.000 L 56.000 136.000 L 200.000 136.000 L 200.000 152.000 C 199.956 191.746 167.746 223.956 128.000 224.000 ZM 144.000 92.000 C 144.000 85.373 149.373 80.000 156.000 80.000 C 162.627 80.000 168.000 85.373 168.000 92.000 C 168.000 98.627 162.627 104.000 156.000 104.000 C 149.373 104.000 144.000 98.627 144.000 92.000 ZM 88.000 92.000 C 88.000 85.373 93.373 80.000 100.000 80.000 C 106.627 80.000 112.000 85.373 112.000 92.000 C 112.000 98.627 106.627 104.000 100.000 104.000 C 93.373 104.000 88.000 98.627 88.000 92.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _bugDroid!!
    }

private var _bugDroid: ImageVector? = null
