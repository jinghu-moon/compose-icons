package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GpsFix: ImageVector
    get() {
        if (_gpsFix != null) return _gpsFix!!
        _gpsFix = phosphorThinIcon(
            name = "GpsFix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.000 124.000 L 211.900 124.000 C 209.786 80.778 175.222 46.214 132.000 44.100 L 132.000 16.000 C 132.000 13.791 130.209 12.000 128.000 12.000 C 125.791 12.000 124.000 13.791 124.000 16.000 L 124.000 44.100 C 80.778 46.214 46.214 80.778 44.100 124.000 L 16.000 124.000 C 13.791 124.000 12.000 125.791 12.000 128.000 C 12.000 130.209 13.791 132.000 16.000 132.000 L 44.100 132.000 C 46.214 175.222 80.778 209.786 124.000 211.900 L 124.000 240.000 C 124.000 242.209 125.791 244.000 128.000 244.000 C 130.209 244.000 132.000 242.209 132.000 240.000 L 132.000 211.900 C 175.222 209.786 209.786 175.222 211.900 132.000 L 240.000 132.000 C 242.209 132.000 244.000 130.209 244.000 128.000 C 244.000 125.791 242.209 124.000 240.000 124.000 ZM 128.000 204.000 C 86.026 204.000 52.000 169.974 52.000 128.000 C 52.000 86.026 86.026 52.000 128.000 52.000 C 169.974 52.000 204.000 86.026 204.000 128.000 C 203.956 169.955 169.955 203.956 128.000 204.000 ZM 128.000 92.000 C 108.118 92.000 92.000 108.118 92.000 128.000 C 92.000 147.882 108.118 164.000 128.000 164.000 C 147.882 164.000 164.000 147.882 164.000 128.000 C 164.000 108.118 147.882 92.000 128.000 92.000 ZM 128.000 156.000 C 112.536 156.000 100.000 143.464 100.000 128.000 C 100.000 112.536 112.536 100.000 128.000 100.000 C 143.464 100.000 156.000 112.536 156.000 128.000 C 156.000 143.464 143.464 156.000 128.000 156.000 Z"),
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
        return _gpsFix!!
    }

private var _gpsFix: ImageVector? = null
