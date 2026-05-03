package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NewspaperClipping: ImageVector
    get() {
        if (_newspaperClipping != null) return _newspaperClipping!!
        _newspaperClipping = phosphorBoldIcon(
            name = "NewspaperClipping",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 36.000 L 40.000 36.000 C 28.954 36.000 20.000 44.954 20.000 56.000 L 20.000 216.000 C 20.000 220.159 22.155 224.022 25.693 226.208 C 29.232 228.394 33.650 228.591 37.370 226.730 L 64.000 213.420 L 90.630 226.730 C 94.010 228.421 97.990 228.421 101.370 226.730 L 128.000 213.420 L 154.630 226.730 C 158.010 228.421 161.990 228.421 165.370 226.730 L 192.000 213.420 L 218.630 226.730 C 222.350 228.591 226.768 228.394 230.307 226.208 C 233.845 224.022 236.000 220.159 236.000 216.000 L 236.000 56.000 C 236.000 44.954 227.046 36.000 216.000 36.000 ZM 212.000 196.580 L 197.370 189.270 C 193.990 187.579 190.010 187.579 186.630 189.270 L 160.000 202.580 L 133.370 189.270 C 129.990 187.579 126.010 187.579 122.630 189.270 L 96.000 202.580 L 69.370 189.270 C 65.990 187.579 62.010 187.579 58.630 189.270 L 44.000 196.580 L 44.000 60.000 L 212.000 60.000 ZM 136.000 108.000 C 136.000 101.373 141.373 96.000 148.000 96.000 L 184.000 96.000 C 190.627 96.000 196.000 101.373 196.000 108.000 C 196.000 114.627 190.627 120.000 184.000 120.000 L 148.000 120.000 C 141.373 120.000 136.000 114.627 136.000 108.000 ZM 136.000 148.000 C 136.000 141.373 141.373 136.000 148.000 136.000 L 184.000 136.000 C 190.627 136.000 196.000 141.373 196.000 148.000 C 196.000 154.627 190.627 160.000 184.000 160.000 L 148.000 160.000 C 141.373 160.000 136.000 154.627 136.000 148.000 ZM 72.000 172.000 L 112.000 172.000 C 118.627 172.000 124.000 166.627 124.000 160.000 L 124.000 96.000 C 124.000 89.373 118.627 84.000 112.000 84.000 L 72.000 84.000 C 65.373 84.000 60.000 89.373 60.000 96.000 L 60.000 160.000 C 60.000 166.627 65.373 172.000 72.000 172.000 ZM 84.000 108.000 L 100.000 108.000 L 100.000 148.000 L 84.000 148.000 Z"),
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
        return _newspaperClipping!!
    }

private var _newspaperClipping: ImageVector? = null
