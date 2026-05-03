package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FigmaLogo: ImageVector
    get() {
        if (_figmaLogo != null) return _figmaLogo!!
        _figmaLogo = phosphorThinIcon(
            name = "FigmaLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 184.460 96.000 C 199.222 88.392 206.864 71.672 202.957 55.530 C 199.050 39.389 184.608 28.015 168.000 28.000 L 96.000 28.000 C 79.392 28.015 64.950 39.389 61.043 55.530 C 57.136 71.672 64.778 88.392 79.540 96.000 C 67.281 102.317 59.708 115.082 60.040 128.869 C 60.372 142.655 68.551 155.041 81.100 160.760 C 63.851 170.008 55.826 190.379 62.135 208.907 C 68.444 227.434 87.232 238.675 106.541 235.475 C 125.850 232.274 140.006 215.572 140.000 196.000 L 140.000 150.590 C 149.194 162.044 164.426 166.764 178.486 162.516 C 192.546 158.268 202.616 145.904 203.930 131.275 C 205.244 116.646 197.538 102.685 184.460 96.000 ZM 196.000 64.000 C 196.000 79.464 183.464 92.000 168.000 92.000 L 140.000 92.000 L 140.000 36.000 L 168.000 36.000 C 183.464 36.000 196.000 48.536 196.000 64.000 ZM 140.000 100.000 L 145.410 100.000 C 143.422 101.608 141.608 103.422 140.000 105.410 ZM 68.000 64.000 C 68.000 48.536 80.536 36.000 96.000 36.000 L 132.000 36.000 L 132.000 92.000 L 96.000 92.000 C 80.536 92.000 68.000 79.464 68.000 64.000 ZM 132.000 196.000 C 132.000 213.673 117.673 228.000 100.000 228.000 C 82.327 228.000 68.000 213.673 68.000 196.000 C 68.000 178.327 82.327 164.000 100.000 164.000 L 132.000 164.000 ZM 132.000 156.000 L 96.000 156.000 C 80.536 156.000 68.000 143.464 68.000 128.000 C 68.000 112.536 80.536 100.000 96.000 100.000 L 132.000 100.000 ZM 168.000 156.000 C 152.536 156.000 140.000 143.464 140.000 128.000 C 140.000 112.536 152.536 100.000 168.000 100.000 C 183.464 100.000 196.000 112.536 196.000 128.000 C 196.000 143.464 183.464 156.000 168.000 156.000 Z"),
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
        return _figmaLogo!!
    }

private var _figmaLogo: ImageVector? = null
