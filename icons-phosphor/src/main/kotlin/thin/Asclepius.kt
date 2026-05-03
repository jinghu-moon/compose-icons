package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Asclepius: ImageVector
    get() {
        if (_asclepius != null) return _asclepius!!
        _asclepius = phosphorThinIcon(
            name = "Asclepius",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 212.000 79.000 L 212.000 80.000 C 212.000 99.882 195.882 116.000 176.000 116.000 L 132.000 116.000 L 132.000 204.000 L 144.000 204.000 C 152.293 204.000 159.726 198.882 162.684 191.134 C 165.642 183.387 163.512 174.617 157.330 169.090 C 155.673 167.615 155.525 165.077 157.000 163.420 C 158.475 161.763 161.013 161.615 162.670 163.090 C 171.354 170.824 174.354 183.121 170.207 193.985 C 166.060 204.850 155.629 212.020 144.000 212.000 L 132.000 212.000 L 132.000 232.000 C 132.000 234.209 130.209 236.000 128.000 236.000 C 125.791 236.000 124.000 234.209 124.000 232.000 L 124.000 212.000 L 96.000 212.000 C 93.791 212.000 92.000 210.209 92.000 208.000 C 92.000 205.791 93.791 204.000 96.000 204.000 L 124.000 204.000 L 124.000 116.000 L 96.000 116.000 C 84.954 116.000 76.000 124.954 76.000 136.000 C 76.000 147.046 84.954 156.000 96.000 156.000 C 98.209 156.000 100.000 157.791 100.000 160.000 C 100.000 162.209 98.209 164.000 96.000 164.000 C 80.536 164.000 68.000 151.464 68.000 136.000 C 68.000 120.536 80.536 108.000 96.000 108.000 L 124.000 108.000 L 124.000 24.000 C 124.000 21.791 125.791 20.000 128.000 20.000 C 130.209 20.000 132.000 21.791 132.000 24.000 L 132.000 108.000 L 176.000 108.000 C 191.464 108.000 204.000 95.464 204.000 80.000 L 204.000 79.000 C 204.000 64.088 191.912 52.000 177.000 52.000 L 160.000 52.000 C 157.791 52.000 156.000 50.209 156.000 48.000 C 156.000 45.791 157.791 44.000 160.000 44.000 L 177.000 44.000 C 196.330 44.000 212.000 59.670 212.000 79.000 ZM 56.000 92.000 L 32.000 92.000 C 29.791 92.000 28.000 90.209 28.000 88.000 L 28.000 80.000 C 28.000 60.118 44.118 44.000 64.000 44.000 L 96.000 44.000 C 98.209 44.000 100.000 45.791 100.000 48.000 C 100.000 50.209 98.209 52.000 96.000 52.000 L 92.000 52.000 L 92.000 56.000 C 92.000 75.882 75.882 92.000 56.000 92.000 ZM 84.000 56.000 L 84.000 52.000 L 64.000 52.000 C 48.536 52.000 36.000 64.536 36.000 80.000 L 36.000 84.000 L 56.000 84.000 C 71.464 84.000 84.000 71.464 84.000 56.000 Z"),
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
        return _asclepius!!
    }

private var _asclepius: ImageVector? = null
