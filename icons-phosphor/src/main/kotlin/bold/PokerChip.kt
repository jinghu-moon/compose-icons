package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PokerChip: ImageVector
    get() {
        if (_pokerChip != null) return _pokerChip!!
        _pokerChip = phosphorBoldIcon(
            name = "PokerChip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 128.000 164.000 C 108.118 164.000 92.000 147.882 92.000 128.000 C 92.000 108.118 108.118 92.000 128.000 92.000 C 147.882 92.000 164.000 108.118 164.000 128.000 C 164.000 147.882 147.882 164.000 128.000 164.000 ZM 161.060 78.000 C 154.673 73.739 147.521 70.754 140.000 69.210 L 140.000 44.870 C 153.891 46.864 167.056 52.326 178.280 60.750 ZM 116.000 69.210 C 108.479 70.754 101.327 73.739 94.940 78.000 L 77.720 60.750 C 88.944 52.326 102.109 46.864 116.000 44.870 ZM 78.000 94.940 C 73.739 101.327 70.754 108.479 69.210 116.000 L 44.870 116.000 C 46.866 102.109 52.327 88.945 60.750 77.720 ZM 69.210 140.000 C 70.754 147.521 73.739 154.673 78.000 161.060 L 60.750 178.280 C 52.327 167.055 46.866 153.891 44.870 140.000 ZM 94.940 178.000 C 101.327 182.261 108.479 185.246 116.000 186.790 L 116.000 211.130 C 102.109 209.136 88.944 203.674 77.720 195.250 ZM 140.000 186.790 C 147.521 185.246 154.673 182.261 161.060 178.000 L 178.280 195.220 C 167.059 203.655 153.894 209.127 140.000 211.130 ZM 178.000 161.060 C 182.261 154.673 185.246 147.521 186.790 140.000 L 211.130 140.000 C 209.134 153.891 203.673 167.055 195.250 178.280 ZM 186.790 116.000 C 185.246 108.479 182.261 101.327 178.000 94.940 L 195.220 77.720 C 203.653 88.942 209.125 102.107 211.130 116.000 Z"),
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
