package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PokerChip: ImageVector
    get() {
        if (_pokerChip != null) return _pokerChip!!
        _pokerChip = phosphorDuotoneIcon(
            name = "PokerChip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 128.000 32.000 C 74.981 32.000 32.000 74.981 32.000 128.000 C 32.000 181.019 74.981 224.000 128.000 224.000 C 181.019 224.000 224.000 181.019 224.000 128.000 C 224.000 74.981 181.019 32.000 128.000 32.000 ZM 128.000 184.000 C 97.072 184.000 72.000 158.928 72.000 128.000 C 72.000 97.072 97.072 72.000 128.000 72.000 C 158.928 72.000 184.000 97.072 184.000 128.000 C 184.000 158.928 158.928 184.000 128.000 184.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 128.000 176.000 C 101.490 176.000 80.000 154.510 80.000 128.000 C 80.000 101.490 101.490 80.000 128.000 80.000 C 154.510 80.000 176.000 101.490 176.000 128.000 C 175.972 154.498 154.498 175.972 128.000 176.000 ZM 167.210 77.470 C 158.169 70.403 147.385 65.911 136.000 64.470 L 136.000 40.370 C 153.753 41.969 170.596 48.946 184.280 60.370 ZM 120.000 64.520 C 108.615 65.961 97.831 70.453 88.790 77.520 L 71.720 60.400 C 85.404 48.976 102.247 41.999 120.000 40.400 ZM 77.470 88.790 C 70.403 97.831 65.911 108.615 64.470 120.000 L 40.370 120.000 C 41.969 102.247 48.946 85.404 60.370 71.720 ZM 64.520 136.000 C 65.961 147.385 70.453 158.169 77.520 167.210 L 60.400 184.280 C 48.976 170.596 41.999 153.753 40.400 136.000 ZM 88.790 178.530 C 97.837 185.579 108.620 190.054 120.000 191.480 L 120.000 215.630 C 102.247 214.031 85.404 207.054 71.720 195.630 ZM 136.000 191.480 C 147.380 190.054 158.163 185.579 167.210 178.530 L 184.280 195.600 C 170.596 207.024 153.753 214.001 136.000 215.600 ZM 178.530 167.210 C 185.579 158.163 190.054 147.380 191.480 136.000 L 215.630 136.000 C 214.031 153.753 207.054 170.596 195.630 184.280 ZM 191.480 120.000 C 190.054 108.620 185.579 97.837 178.530 88.790 L 195.600 71.720 C 207.024 85.404 214.001 102.247 215.600 120.000 Z"),
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
