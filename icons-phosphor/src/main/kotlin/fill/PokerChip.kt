package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PokerChip: ImageVector
    get() {
        if (_pokerChip != null) return _pokerChip!!
        _pokerChip = phosphorFillIcon(
            name = "PokerChip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 60.400 71.720 L 77.470 88.790 C 70.403 97.831 65.911 108.615 64.470 120.000 L 40.370 120.000 C 41.978 102.243 48.966 85.400 60.400 71.720 ZM 40.370 136.000 L 64.520 136.000 C 65.961 147.385 70.453 158.169 77.520 167.210 L 60.400 184.280 C 48.966 170.600 41.978 153.757 40.370 136.000 ZM 120.000 215.630 C 102.247 214.031 85.404 207.054 71.720 195.630 L 88.790 178.560 C 97.840 185.598 108.623 190.062 120.000 191.480 ZM 120.000 64.520 C 108.615 65.961 97.831 70.453 88.790 77.520 L 71.720 60.400 C 85.404 48.976 102.247 41.999 120.000 40.400 ZM 215.630 120.000 L 191.480 120.000 C 190.054 108.620 185.579 97.837 178.530 88.790 L 195.600 71.720 C 207.034 85.400 214.022 102.243 215.630 120.000 ZM 136.000 40.370 C 153.753 41.969 170.596 48.946 184.280 60.370 L 167.210 77.470 C 158.169 70.403 147.385 65.911 136.000 64.470 ZM 136.000 215.630 L 136.000 191.480 C 147.380 190.054 158.163 185.579 167.210 178.530 L 184.280 195.600 C 170.600 207.034 153.757 214.022 136.000 215.630 ZM 195.600 184.280 L 178.530 167.210 C 185.579 158.163 190.054 147.380 191.480 136.000 L 215.630 136.000 C 214.022 153.757 207.034 170.600 195.600 184.280 Z"),
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
        return _pokerChip!!
    }

private var _pokerChip: ImageVector? = null
