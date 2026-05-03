package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FilmScript: ImageVector
    get() {
        if (_filmScript != null) return _filmScript!!
        _filmScript = phosphorRegularIcon(
            name = "FilmScript",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 24.000 L 56.000 24.000 C 47.163 24.000 40.000 31.163 40.000 40.000 L 40.000 216.000 C 40.000 224.837 47.163 232.000 56.000 232.000 L 200.000 232.000 C 208.837 232.000 216.000 224.837 216.000 216.000 L 216.000 40.000 C 216.000 31.163 208.837 24.000 200.000 24.000 ZM 200.000 216.000 L 56.000 216.000 L 56.000 40.000 L 200.000 40.000 L 200.000 216.000 ZM 96.000 76.000 C 96.000 82.627 90.627 88.000 84.000 88.000 C 77.373 88.000 72.000 82.627 72.000 76.000 C 72.000 69.373 77.373 64.000 84.000 64.000 C 90.627 64.000 96.000 69.373 96.000 76.000 ZM 96.000 180.000 C 96.000 186.627 90.627 192.000 84.000 192.000 C 77.373 192.000 72.000 186.627 72.000 180.000 C 72.000 173.373 77.373 168.000 84.000 168.000 C 90.627 168.000 96.000 173.373 96.000 180.000 ZM 96.000 128.000 C 96.000 134.627 90.627 140.000 84.000 140.000 C 77.373 140.000 72.000 134.627 72.000 128.000 C 72.000 121.373 77.373 116.000 84.000 116.000 C 90.627 116.000 96.000 121.373 96.000 128.000 Z"),
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
        return _filmScript!!
    }

private var _filmScript: ImageVector? = null
