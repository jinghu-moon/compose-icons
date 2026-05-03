package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MouseSimple: ImageVector
    get() {
        if (_mouseSimple != null) return _mouseSimple!!
        _mouseSimple = phosphorBoldIcon(
            name = "MouseSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 144.000 12.000 L 112.000 12.000 C 74.461 12.039 44.039 42.461 44.000 80.000 L 44.000 176.000 C 44.039 213.539 74.461 243.961 112.000 244.000 L 144.000 244.000 C 181.539 243.961 211.961 213.539 212.000 176.000 L 212.000 80.000 C 211.961 42.461 181.539 12.039 144.000 12.000 ZM 188.000 176.000 C 187.972 200.289 168.289 219.972 144.000 220.000 L 112.000 220.000 C 87.711 219.972 68.028 200.289 68.000 176.000 L 68.000 80.000 C 68.028 55.711 87.711 36.028 112.000 36.000 L 144.000 36.000 C 168.289 36.028 187.972 55.711 188.000 80.000 ZM 140.000 64.000 L 140.000 112.000 C 140.000 118.627 134.627 124.000 128.000 124.000 C 121.373 124.000 116.000 118.627 116.000 112.000 L 116.000 64.000 C 116.000 57.373 121.373 52.000 128.000 52.000 C 134.627 52.000 140.000 57.373 140.000 64.000 Z"),
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
        return _mouseSimple!!
    }

private var _mouseSimple: ImageVector? = null
