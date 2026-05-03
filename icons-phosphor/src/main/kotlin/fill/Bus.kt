package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Bus: ImageVector
    get() {
        if (_bus != null) return _bus!!
        _bus = phosphorFillIcon(
            name = "Bus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 248.000 80.000 L 248.000 104.000 C 248.000 108.418 244.418 112.000 240.000 112.000 C 235.582 112.000 232.000 108.418 232.000 104.000 L 232.000 80.000 C 232.000 75.582 235.582 72.000 240.000 72.000 C 244.418 72.000 248.000 75.582 248.000 80.000 ZM 16.000 72.000 C 11.582 72.000 8.000 75.582 8.000 80.000 L 8.000 104.000 C 8.000 108.418 11.582 112.000 16.000 112.000 C 20.418 112.000 24.000 108.418 24.000 104.000 L 24.000 80.000 C 24.000 75.582 20.418 72.000 16.000 72.000 ZM 216.000 64.000 L 216.000 208.000 C 216.000 216.837 208.837 224.000 200.000 224.000 L 184.000 224.000 C 175.163 224.000 168.000 216.837 168.000 208.000 L 168.000 200.000 L 88.000 200.000 L 88.000 208.000 C 88.000 216.837 80.837 224.000 72.000 224.000 L 56.000 224.000 C 47.163 224.000 40.000 216.837 40.000 208.000 L 40.000 64.000 C 40.000 46.327 54.327 32.000 72.000 32.000 L 184.000 32.000 C 201.673 32.000 216.000 46.327 216.000 64.000 ZM 104.000 148.000 C 104.000 141.373 98.627 136.000 92.000 136.000 C 85.373 136.000 80.000 141.373 80.000 148.000 C 80.000 154.627 85.373 160.000 92.000 160.000 C 98.627 160.000 104.000 154.627 104.000 148.000 ZM 176.000 148.000 C 176.000 141.373 170.627 136.000 164.000 136.000 C 157.373 136.000 152.000 141.373 152.000 148.000 C 152.000 154.627 157.373 160.000 164.000 160.000 C 170.627 160.000 176.000 154.627 176.000 148.000 ZM 200.000 72.000 L 56.000 72.000 L 56.000 112.000 L 200.000 112.000 Z"),
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
        return _bus!!
    }

private var _bus: ImageVector? = null
