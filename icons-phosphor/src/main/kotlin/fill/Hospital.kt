package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Hospital: ImageVector
    get() {
        if (_hospital != null) return _hospital!!
        _hospital = phosphorFillIcon(
            name = "Hospital",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 248.000 208.000 L 240.000 208.000 L 240.000 128.000 C 240.000 119.163 232.837 112.000 224.000 112.000 L 168.000 112.000 L 168.000 48.000 C 168.000 39.163 160.837 32.000 152.000 32.000 L 56.000 32.000 C 47.163 32.000 40.000 39.163 40.000 48.000 L 40.000 208.000 L 32.000 208.000 C 27.582 208.000 24.000 211.582 24.000 216.000 C 24.000 220.418 27.582 224.000 32.000 224.000 L 248.000 224.000 C 252.418 224.000 256.000 220.418 256.000 216.000 C 256.000 211.582 252.418 208.000 248.000 208.000 ZM 128.000 208.000 L 80.000 208.000 L 80.000 160.000 L 128.000 160.000 ZM 128.000 104.000 L 112.000 104.000 L 112.000 120.000 C 112.000 124.418 108.418 128.000 104.000 128.000 C 99.582 128.000 96.000 124.418 96.000 120.000 L 96.000 104.000 L 80.000 104.000 C 75.582 104.000 72.000 100.418 72.000 96.000 C 72.000 91.582 75.582 88.000 80.000 88.000 L 96.000 88.000 L 96.000 72.000 C 96.000 67.582 99.582 64.000 104.000 64.000 C 108.418 64.000 112.000 67.582 112.000 72.000 L 112.000 88.000 L 128.000 88.000 C 132.418 88.000 136.000 91.582 136.000 96.000 C 136.000 100.418 132.418 104.000 128.000 104.000 ZM 224.000 208.000 L 168.000 208.000 L 168.000 128.000 L 224.000 128.000 Z"),
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
        return _hospital!!
    }

private var _hospital: ImageVector? = null
