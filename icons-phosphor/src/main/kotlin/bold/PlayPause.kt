package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PlayPause: ImageVector
    get() {
        if (_playPause != null) return _playPause!!
        _playPause = phosphorBoldIcon(
            name = "PlayPause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 188.000 64.000 L 188.000 192.000 C 188.000 198.627 182.627 204.000 176.000 204.000 C 169.373 204.000 164.000 198.627 164.000 192.000 L 164.000 64.000 C 164.000 57.373 169.373 52.000 176.000 52.000 C 182.627 52.000 188.000 57.373 188.000 64.000 ZM 224.000 52.000 C 217.373 52.000 212.000 57.373 212.000 64.000 L 212.000 192.000 C 212.000 198.627 217.373 204.000 224.000 204.000 C 230.627 204.000 236.000 198.627 236.000 192.000 L 236.000 64.000 C 236.000 57.373 230.627 52.000 224.000 52.000 ZM 148.000 128.000 C 148.015 134.780 144.543 141.091 138.810 144.710 L 50.630 200.870 C 44.510 204.781 36.745 205.048 30.370 201.568 C 23.995 198.088 20.021 191.413 20.000 184.150 L 20.000 71.850 C 20.021 64.587 23.995 57.912 30.370 54.432 C 36.745 50.952 44.510 51.219 50.630 55.130 L 138.810 111.290 C 144.543 114.909 148.015 121.220 148.000 128.000 ZM 120.380 128.000 L 44.000 79.370 L 44.000 176.630 Z"),
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
        return _playPause!!
    }

private var _playPause: ImageVector? = null
