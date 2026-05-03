package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.VinylRecord: ImageVector
    get() {
        if (_vinylRecord != null) return _vinylRecord!!
        _vinylRecord = phosphorThinIcon(
            name = "VinylRecord",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 128.000 220.000 C 77.190 220.000 36.000 178.810 36.000 128.000 C 36.000 77.190 77.190 36.000 128.000 36.000 C 178.810 36.000 220.000 77.190 220.000 128.000 C 219.945 178.787 178.787 219.945 128.000 220.000 ZM 128.000 68.000 C 94.879 68.039 68.039 94.879 68.000 128.000 C 68.000 130.209 66.209 132.000 64.000 132.000 C 61.791 132.000 60.000 130.209 60.000 128.000 C 60.039 90.461 90.461 60.039 128.000 60.000 C 130.209 60.000 132.000 61.791 132.000 64.000 C 132.000 66.209 130.209 68.000 128.000 68.000 ZM 196.000 128.000 C 195.961 165.539 165.539 195.961 128.000 196.000 C 125.791 196.000 124.000 194.209 124.000 192.000 C 124.000 189.791 125.791 188.000 128.000 188.000 C 161.121 187.961 187.961 161.121 188.000 128.000 C 188.000 125.791 189.791 124.000 192.000 124.000 C 194.209 124.000 196.000 125.791 196.000 128.000 ZM 156.000 128.000 C 156.000 112.536 143.464 100.000 128.000 100.000 C 112.536 100.000 100.000 112.536 100.000 128.000 C 100.000 143.464 112.536 156.000 128.000 156.000 C 143.464 156.000 156.000 143.464 156.000 128.000 ZM 108.000 128.000 C 108.000 116.954 116.954 108.000 128.000 108.000 C 139.046 108.000 148.000 116.954 148.000 128.000 C 148.000 139.046 139.046 148.000 128.000 148.000 C 116.954 148.000 108.000 139.046 108.000 128.000 Z"),
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
        return _vinylRecord!!
    }

private var _vinylRecord: ImageVector? = null
