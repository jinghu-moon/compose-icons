package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FilmScript: ImageVector
    get() {
        if (_filmScript != null) return _filmScript!!
        _filmScript = phosphorFillIcon(
            name = "FilmScript",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 24.000 L 56.000 24.000 C 47.163 24.000 40.000 31.163 40.000 40.000 L 40.000 216.000 C 40.000 224.837 47.163 232.000 56.000 232.000 L 200.000 232.000 C 208.837 232.000 216.000 224.837 216.000 216.000 L 216.000 40.000 C 216.000 31.163 208.837 24.000 200.000 24.000 ZM 76.000 188.000 C 69.373 188.000 64.000 182.627 64.000 176.000 C 64.000 169.373 69.373 164.000 76.000 164.000 C 82.627 164.000 88.000 169.373 88.000 176.000 C 88.000 182.627 82.627 188.000 76.000 188.000 ZM 76.000 140.000 C 69.373 140.000 64.000 134.627 64.000 128.000 C 64.000 121.373 69.373 116.000 76.000 116.000 C 82.627 116.000 88.000 121.373 88.000 128.000 C 88.000 134.627 82.627 140.000 76.000 140.000 ZM 76.000 92.000 C 69.373 92.000 64.000 86.627 64.000 80.000 C 64.000 73.373 69.373 68.000 76.000 68.000 C 82.627 68.000 88.000 73.373 88.000 80.000 C 88.000 86.627 82.627 92.000 76.000 92.000 Z"),
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
        return _filmScript!!
    }

private var _filmScript: ImageVector? = null
