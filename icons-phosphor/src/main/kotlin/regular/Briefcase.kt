package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Briefcase: ImageVector
    get() {
        if (_briefcase != null) return _briefcase!!
        _briefcase = phosphorRegularIcon(
            name = "Briefcase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 56.000 L 176.000 56.000 L 176.000 48.000 C 176.000 34.745 165.255 24.000 152.000 24.000 L 104.000 24.000 C 90.745 24.000 80.000 34.745 80.000 48.000 L 80.000 56.000 L 40.000 56.000 C 31.163 56.000 24.000 63.163 24.000 72.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 72.000 C 232.000 63.163 224.837 56.000 216.000 56.000 ZM 96.000 48.000 C 96.000 43.582 99.582 40.000 104.000 40.000 L 152.000 40.000 C 156.418 40.000 160.000 43.582 160.000 48.000 L 160.000 56.000 L 96.000 56.000 ZM 216.000 72.000 L 216.000 113.610 C 188.998 128.308 158.743 136.005 128.000 136.000 C 97.258 136.006 67.004 128.311 40.000 113.620 L 40.000 72.000 ZM 216.000 200.000 L 40.000 200.000 L 40.000 131.640 C 67.399 145.042 97.499 152.006 128.000 152.000 C 158.502 152.001 188.601 145.033 216.000 131.630 L 216.000 200.000 ZM 104.000 112.000 C 104.000 107.582 107.582 104.000 112.000 104.000 L 144.000 104.000 C 148.418 104.000 152.000 107.582 152.000 112.000 C 152.000 116.418 148.418 120.000 144.000 120.000 L 112.000 120.000 C 107.582 120.000 104.000 116.418 104.000 112.000 Z"),
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
        return _briefcase!!
    }

private var _briefcase: ImageVector? = null
