package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Quotes: ImageVector
    get() {
        if (_quotes != null) return _quotes!!
        _quotes = phosphorThinIcon(
            name = "Quotes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 100.000 60.000 L 40.000 60.000 C 33.373 60.000 28.000 65.373 28.000 72.000 L 28.000 136.000 C 28.000 142.627 33.373 148.000 40.000 148.000 L 104.000 148.000 L 104.000 160.000 C 104.000 179.882 87.882 196.000 68.000 196.000 C 65.791 196.000 64.000 197.791 64.000 200.000 C 64.000 202.209 65.791 204.000 68.000 204.000 C 92.289 203.972 111.972 184.289 112.000 160.000 L 112.000 72.000 C 112.000 65.373 106.627 60.000 100.000 60.000 ZM 104.000 140.000 L 40.000 140.000 C 37.791 140.000 36.000 138.209 36.000 136.000 L 36.000 72.000 C 36.000 69.791 37.791 68.000 40.000 68.000 L 100.000 68.000 C 102.209 68.000 104.000 69.791 104.000 72.000 ZM 216.000 60.000 L 156.000 60.000 C 149.373 60.000 144.000 65.373 144.000 72.000 L 144.000 136.000 C 144.000 142.627 149.373 148.000 156.000 148.000 L 220.000 148.000 L 220.000 160.000 C 220.000 179.882 203.882 196.000 184.000 196.000 C 181.791 196.000 180.000 197.791 180.000 200.000 C 180.000 202.209 181.791 204.000 184.000 204.000 C 208.289 203.972 227.972 184.289 228.000 160.000 L 228.000 72.000 C 228.000 65.373 222.627 60.000 216.000 60.000 ZM 220.000 140.000 L 156.000 140.000 C 153.791 140.000 152.000 138.209 152.000 136.000 L 152.000 72.000 C 152.000 69.791 153.791 68.000 156.000 68.000 L 216.000 68.000 C 218.209 68.000 220.000 69.791 220.000 72.000 Z"),
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
        return _quotes!!
    }

private var _quotes: ImageVector? = null
