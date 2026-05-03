package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FilmScript: ImageVector
    get() {
        if (_filmScript != null) return _filmScript!!
        _filmScript = phosphorBoldIcon(
            name = "FilmScript",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 20.000 L 56.000 20.000 C 44.954 20.000 36.000 28.954 36.000 40.000 L 36.000 216.000 C 36.000 227.046 44.954 236.000 56.000 236.000 L 200.000 236.000 C 211.046 236.000 220.000 227.046 220.000 216.000 L 220.000 40.000 C 220.000 28.954 211.046 20.000 200.000 20.000 ZM 196.000 212.000 L 60.000 212.000 L 60.000 44.000 L 196.000 44.000 ZM 76.000 80.000 C 76.000 71.163 83.163 64.000 92.000 64.000 C 100.837 64.000 108.000 71.163 108.000 80.000 C 108.000 88.837 100.837 96.000 92.000 96.000 C 83.163 96.000 76.000 88.837 76.000 80.000 ZM 76.000 176.000 C 76.000 167.163 83.163 160.000 92.000 160.000 C 100.837 160.000 108.000 167.163 108.000 176.000 C 108.000 184.837 100.837 192.000 92.000 192.000 C 83.163 192.000 76.000 184.837 76.000 176.000 ZM 76.000 128.000 C 76.000 119.163 83.163 112.000 92.000 112.000 C 100.837 112.000 108.000 119.163 108.000 128.000 C 108.000 136.837 100.837 144.000 92.000 144.000 C 83.163 144.000 76.000 136.837 76.000 128.000 Z"),
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
