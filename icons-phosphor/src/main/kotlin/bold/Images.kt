package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Images: ImageVector
    get() {
        if (_images != null) return _images!!
        _images = phosphorBoldIcon(
            name = "Images",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 160.000 88.000 C 160.000 79.163 167.163 72.000 176.000 72.000 C 184.837 72.000 192.000 79.163 192.000 88.000 C 192.000 96.837 184.837 104.000 176.000 104.000 C 167.163 104.000 160.000 96.837 160.000 88.000 ZM 236.000 56.000 L 236.000 160.000 C 236.000 171.046 227.046 180.000 216.000 180.000 L 204.000 180.000 L 204.000 200.000 C 204.000 211.046 195.046 220.000 184.000 220.000 L 40.000 220.000 C 28.954 220.000 20.000 211.046 20.000 200.000 L 20.000 88.000 C 20.000 76.954 28.954 68.000 40.000 68.000 L 60.000 68.000 L 60.000 56.000 C 60.000 44.954 68.954 36.000 80.000 36.000 L 216.000 36.000 C 227.046 36.000 236.000 44.954 236.000 56.000 ZM 180.000 180.000 L 80.000 180.000 C 68.954 180.000 60.000 171.046 60.000 160.000 L 60.000 92.000 L 44.000 92.000 L 44.000 196.000 L 180.000 196.000 ZM 158.340 156.000 L 124.000 121.660 L 89.660 156.000 ZM 212.000 60.000 L 84.000 60.000 L 84.000 127.720 L 109.860 101.860 C 117.670 94.052 130.330 94.052 138.140 101.860 L 192.280 156.000 L 212.000 156.000 Z"),
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
        return _images!!
    }

private var _images: ImageVector? = null
