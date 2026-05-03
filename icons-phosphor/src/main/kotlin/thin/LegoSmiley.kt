package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LegoSmiley: ImageVector
    get() {
        if (_legoSmiley != null) return _legoSmiley!!
        _legoSmiley = phosphorThinIcon(
            name = "LegoSmiley",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 100.000 120.000 C 95.582 120.000 92.000 116.418 92.000 112.000 C 92.000 107.582 95.582 104.000 100.000 104.000 C 104.418 104.000 108.000 107.582 108.000 112.000 C 108.000 116.418 104.418 120.000 100.000 120.000 ZM 156.000 104.000 C 151.582 104.000 148.000 107.582 148.000 112.000 C 148.000 116.418 151.582 120.000 156.000 120.000 C 160.418 120.000 164.000 116.418 164.000 112.000 C 164.000 107.582 160.418 104.000 156.000 104.000 ZM 153.870 148.620 C 138.029 158.468 117.971 158.468 102.130 148.620 C 100.263 147.490 97.836 148.065 96.674 149.912 C 95.512 151.759 96.044 154.196 97.870 155.390 C 116.315 166.876 139.685 166.876 158.130 155.390 C 159.876 154.166 160.355 151.787 159.218 149.982 C 158.081 148.178 155.728 147.583 153.870 148.630 ZM 212.000 80.000 L 212.000 176.000 C 211.999 189.918 201.775 201.722 188.000 203.710 L 188.000 224.000 C 188.000 230.627 182.627 236.000 176.000 236.000 L 80.000 236.000 C 73.373 236.000 68.000 230.627 68.000 224.000 L 68.000 203.710 C 54.225 201.722 44.001 189.918 44.000 176.000 L 44.000 80.000 C 44.000 64.536 56.536 52.000 72.000 52.000 L 92.000 52.000 L 92.000 32.000 C 92.000 25.373 97.373 20.000 104.000 20.000 L 152.000 20.000 C 158.627 20.000 164.000 25.373 164.000 32.000 L 164.000 52.000 L 184.000 52.000 C 199.464 52.000 212.000 64.536 212.000 80.000 ZM 100.000 52.000 L 156.000 52.000 L 156.000 32.000 C 156.000 29.791 154.209 28.000 152.000 28.000 L 104.000 28.000 C 101.791 28.000 100.000 29.791 100.000 32.000 ZM 180.000 224.000 L 180.000 204.000 L 76.000 204.000 L 76.000 224.000 C 76.000 226.209 77.791 228.000 80.000 228.000 L 176.000 228.000 C 178.209 228.000 180.000 226.209 180.000 224.000 ZM 204.000 80.000 C 204.000 68.954 195.046 60.000 184.000 60.000 L 72.000 60.000 C 60.954 60.000 52.000 68.954 52.000 80.000 L 52.000 176.000 C 52.000 187.046 60.954 196.000 72.000 196.000 L 184.000 196.000 C 195.046 196.000 204.000 187.046 204.000 176.000 Z"),
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
        return _legoSmiley!!
    }

private var _legoSmiley: ImageVector? = null
