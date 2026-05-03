package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Briefcase: ImageVector
    get() {
        if (_briefcase != null) return _briefcase!!
        _briefcase = phosphorFillIcon(
            name = "Briefcase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 152.000 112.000 C 152.000 116.418 148.418 120.000 144.000 120.000 L 112.000 120.000 C 107.582 120.000 104.000 116.418 104.000 112.000 C 104.000 107.582 107.582 104.000 112.000 104.000 L 144.000 104.000 C 148.418 104.000 152.000 107.582 152.000 112.000 ZM 232.000 72.000 L 232.000 200.000 C 232.000 208.837 224.837 216.000 216.000 216.000 L 40.000 216.000 C 31.163 216.000 24.000 208.837 24.000 200.000 L 24.000 72.000 C 24.000 63.163 31.163 56.000 40.000 56.000 L 80.000 56.000 L 80.000 48.000 C 80.000 34.745 90.745 24.000 104.000 24.000 L 152.000 24.000 C 165.255 24.000 176.000 34.745 176.000 48.000 L 176.000 56.000 L 216.000 56.000 C 224.837 56.000 232.000 63.163 232.000 72.000 ZM 96.000 56.000 L 160.000 56.000 L 160.000 48.000 C 160.000 43.582 156.418 40.000 152.000 40.000 L 104.000 40.000 C 99.582 40.000 96.000 43.582 96.000 48.000 ZM 216.000 113.610 L 216.000 72.000 L 40.000 72.000 L 40.000 113.610 C 67.002 128.308 97.257 136.005 128.000 136.000 C 158.743 136.005 188.998 128.308 216.000 113.610 Z"),
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
