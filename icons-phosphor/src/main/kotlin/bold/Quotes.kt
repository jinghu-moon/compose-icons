package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Quotes: ImageVector
    get() {
        if (_quotes != null) return _quotes!!
        _quotes = phosphorBoldIcon(
            name = "Quotes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 100.000 52.000 L 40.000 52.000 C 28.954 52.000 20.000 60.954 20.000 72.000 L 20.000 136.000 C 20.000 147.046 28.954 156.000 40.000 156.000 L 96.000 156.000 L 96.000 160.000 C 96.000 175.464 83.464 188.000 68.000 188.000 C 61.373 188.000 56.000 193.373 56.000 200.000 C 56.000 206.627 61.373 212.000 68.000 212.000 C 96.705 211.967 119.967 188.705 120.000 160.000 L 120.000 72.000 C 120.000 60.954 111.046 52.000 100.000 52.000 ZM 96.000 132.000 L 44.000 132.000 L 44.000 76.000 L 96.000 76.000 ZM 216.000 52.000 L 156.000 52.000 C 144.954 52.000 136.000 60.954 136.000 72.000 L 136.000 136.000 C 136.000 147.046 144.954 156.000 156.000 156.000 L 212.000 156.000 L 212.000 160.000 C 212.000 175.464 199.464 188.000 184.000 188.000 C 177.373 188.000 172.000 193.373 172.000 200.000 C 172.000 206.627 177.373 212.000 184.000 212.000 C 212.705 211.967 235.967 188.705 236.000 160.000 L 236.000 72.000 C 236.000 60.954 227.046 52.000 216.000 52.000 ZM 212.000 132.000 L 160.000 132.000 L 160.000 76.000 L 212.000 76.000 Z"),
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
