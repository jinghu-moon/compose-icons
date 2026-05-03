package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.HighDefinition: ImageVector
    get() {
        if (_highDefinition != null) return _highDefinition!!
        _highDefinition = phosphorRegularIcon(
            name = "HighDefinition",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 176.000 72.000 L 152.000 72.000 C 147.582 72.000 144.000 75.582 144.000 80.000 L 144.000 176.000 C 144.000 180.418 147.582 184.000 152.000 184.000 L 176.000 184.000 C 206.928 184.000 232.000 158.928 232.000 128.000 C 232.000 97.072 206.928 72.000 176.000 72.000 ZM 176.000 168.000 L 160.000 168.000 L 160.000 88.000 L 176.000 88.000 C 198.091 88.000 216.000 105.909 216.000 128.000 C 216.000 150.091 198.091 168.000 176.000 168.000 ZM 112.000 176.000 L 112.000 136.000 L 56.000 136.000 L 56.000 176.000 C 56.000 180.418 52.418 184.000 48.000 184.000 C 43.582 184.000 40.000 180.418 40.000 176.000 L 40.000 80.000 C 40.000 75.582 43.582 72.000 48.000 72.000 C 52.418 72.000 56.000 75.582 56.000 80.000 L 56.000 120.000 L 112.000 120.000 L 112.000 80.000 C 112.000 75.582 115.582 72.000 120.000 72.000 C 124.418 72.000 128.000 75.582 128.000 80.000 L 128.000 176.000 C 128.000 180.418 124.418 184.000 120.000 184.000 C 115.582 184.000 112.000 180.418 112.000 176.000 ZM 24.000 48.000 C 24.000 43.582 27.582 40.000 32.000 40.000 L 224.000 40.000 C 228.418 40.000 232.000 43.582 232.000 48.000 C 232.000 52.418 228.418 56.000 224.000 56.000 L 32.000 56.000 C 27.582 56.000 24.000 52.418 24.000 48.000 ZM 232.000 208.000 C 232.000 212.418 228.418 216.000 224.000 216.000 L 32.000 216.000 C 27.582 216.000 24.000 212.418 24.000 208.000 C 24.000 203.582 27.582 200.000 32.000 200.000 L 224.000 200.000 C 228.418 200.000 232.000 203.582 232.000 208.000 Z"),
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
        return _highDefinition!!
    }

private var _highDefinition: ImageVector? = null
