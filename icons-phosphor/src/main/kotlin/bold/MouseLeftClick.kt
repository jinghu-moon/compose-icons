package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MouseLeftClick: ImageVector
    get() {
        if (_mouseLeftClick != null) return _mouseLeftClick!!
        _mouseLeftClick = phosphorBoldIcon(
            name = "MouseLeftClick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 144.000 12.000 L 112.000 12.000 C 74.461 12.039 44.039 42.461 44.000 80.000 L 44.000 176.000 C 44.039 213.539 74.461 243.961 112.000 244.000 L 144.000 244.000 C 181.539 243.961 211.961 213.539 212.000 176.000 L 212.000 80.000 C 211.961 42.461 181.539 12.039 144.000 12.000 ZM 188.000 80.000 L 188.000 100.000 L 140.000 100.000 L 140.000 36.000 L 144.000 36.000 C 168.289 36.028 187.972 55.711 188.000 80.000 ZM 68.000 80.000 C 68.006 75.590 68.680 71.207 70.000 67.000 L 103.000 100.000 L 68.000 100.000 ZM 116.000 36.000 L 116.000 79.000 L 83.490 46.520 C 91.435 39.726 101.546 35.995 112.000 36.000 ZM 144.000 220.000 L 112.000 220.000 C 87.711 219.972 68.028 200.289 68.000 176.000 L 68.000 124.000 L 188.000 124.000 L 188.000 176.000 C 187.972 200.289 168.289 219.972 144.000 220.000 Z"),
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
        return _mouseLeftClick!!
    }

private var _mouseLeftClick: ImageVector? = null
