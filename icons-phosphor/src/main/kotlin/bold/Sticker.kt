package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Sticker: ImageVector
    get() {
        if (_sticker != null) return _sticker!!
        _sticker = phosphorBoldIcon(
            name = "Sticker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 168.000 28.000 L 88.000 28.000 C 54.879 28.039 28.039 54.879 28.000 88.000 L 28.000 168.000 C 28.039 201.121 54.879 227.961 88.000 228.000 L 136.000 228.000 C 137.289 228.000 138.569 227.790 139.790 227.380 C 167.420 218.170 218.170 167.380 227.380 139.790 C 227.790 138.569 228.000 137.289 228.000 136.000 L 228.000 88.000 C 227.961 54.879 201.121 28.039 168.000 28.000 ZM 52.000 168.000 L 52.000 88.000 C 52.000 68.118 68.118 52.000 88.000 52.000 L 168.000 52.000 C 187.882 52.000 204.000 68.118 204.000 88.000 L 204.000 124.000 L 184.000 124.000 C 150.879 124.039 124.039 150.879 124.000 184.000 L 124.000 204.000 L 88.000 204.000 C 68.118 204.000 52.000 187.882 52.000 168.000 ZM 148.000 195.630 L 148.000 184.000 C 148.000 164.118 164.118 148.000 184.000 148.000 L 195.630 148.000 C 184.000 164.110 164.110 184.000 148.000 195.630 Z"),
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
        return _sticker!!
    }

private var _sticker: ImageVector? = null
