package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.WaveSquare: ImageVector
    get() {
        if (_waveSquare != null) return _waveSquare!!
        _waveSquare = phosphorBoldIcon(
            name = "WaveSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244 128v56c0 6.627-5.373 12-12 12h-104c-6.627 0-12-5.373-12-12v-100h-80v44c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-56C12 65.373 17.373 60 24 60h104c6.627 0 12 5.373 12 12v100h80v-44c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
        return _waveSquare!!
    }

private var _waveSquare: ImageVector? = null
