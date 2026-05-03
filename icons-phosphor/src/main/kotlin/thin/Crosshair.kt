package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Crosshair: ImageVector
    get() {
        if (_crosshair != null) return _crosshair!!
        _crosshair = phosphorThinIcon(
            name = "Crosshair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 124.000 L 219.910 124.000 C 217.774 76.362 179.638 38.226 132.000 36.090 L 132.000 24.000 C 132.000 21.791 130.209 20.000 128.000 20.000 C 125.791 20.000 124.000 21.791 124.000 24.000 L 124.000 36.090 C 76.362 38.226 38.226 76.362 36.090 124.000 L 24.000 124.000 C 21.791 124.000 20.000 125.791 20.000 128.000 C 20.000 130.209 21.791 132.000 24.000 132.000 L 36.090 132.000 C 38.226 179.638 76.362 217.774 124.000 219.910 L 124.000 232.000 C 124.000 234.209 125.791 236.000 128.000 236.000 C 130.209 236.000 132.000 234.209 132.000 232.000 L 132.000 219.910 C 179.638 217.774 217.774 179.638 219.910 132.000 L 232.000 132.000 C 234.209 132.000 236.000 130.209 236.000 128.000 C 236.000 125.791 234.209 124.000 232.000 124.000 ZM 132.000 211.900 L 132.000 200.000 C 132.000 197.791 130.209 196.000 128.000 196.000 C 125.791 196.000 124.000 197.791 124.000 200.000 L 124.000 211.900 C 80.778 209.786 46.214 175.222 44.100 132.000 L 56.000 132.000 C 58.209 132.000 60.000 130.209 60.000 128.000 C 60.000 125.791 58.209 124.000 56.000 124.000 L 44.100 124.000 C 46.214 80.778 80.778 46.214 124.000 44.100 L 124.000 56.000 C 124.000 58.209 125.791 60.000 128.000 60.000 C 130.209 60.000 132.000 58.209 132.000 56.000 L 132.000 44.100 C 175.222 46.214 209.786 80.778 211.900 124.000 L 200.000 124.000 C 197.791 124.000 196.000 125.791 196.000 128.000 C 196.000 130.209 197.791 132.000 200.000 132.000 L 211.900 132.000 C 209.786 175.222 175.222 209.786 132.000 211.900 ZM 128.000 92.000 C 108.118 92.000 92.000 108.118 92.000 128.000 C 92.000 147.882 108.118 164.000 128.000 164.000 C 147.882 164.000 164.000 147.882 164.000 128.000 C 164.000 108.118 147.882 92.000 128.000 92.000 ZM 128.000 156.000 C 112.536 156.000 100.000 143.464 100.000 128.000 C 100.000 112.536 112.536 100.000 128.000 100.000 C 143.464 100.000 156.000 112.536 156.000 128.000 C 156.000 143.464 143.464 156.000 128.000 156.000 Z"),
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
        return _crosshair!!
    }

private var _crosshair: ImageVector? = null
