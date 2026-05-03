package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ProjectorScreenChart: ImageVector
    get() {
        if (_projectorScreenChart != null) return _projectorScreenChart!!
        _projectorScreenChart = phosphorBoldIcon(
            name = "ProjectorScreenChart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 104.000 128.000 L 104.000 136.000 C 104.000 142.627 98.627 148.000 92.000 148.000 C 85.373 148.000 80.000 142.627 80.000 136.000 L 80.000 128.000 C 80.000 121.373 85.373 116.000 92.000 116.000 C 98.627 116.000 104.000 121.373 104.000 128.000 ZM 128.000 112.000 C 121.373 112.000 116.000 117.373 116.000 124.000 L 116.000 136.000 C 116.000 142.627 121.373 148.000 128.000 148.000 C 134.627 148.000 140.000 142.627 140.000 136.000 L 140.000 124.000 C 140.000 117.373 134.627 112.000 128.000 112.000 ZM 164.000 108.000 C 157.373 108.000 152.000 113.373 152.000 120.000 L 152.000 136.000 C 152.000 142.627 157.373 148.000 164.000 148.000 C 170.627 148.000 176.000 142.627 176.000 136.000 L 176.000 120.000 C 176.000 113.373 170.627 108.000 164.000 108.000 ZM 220.000 91.600 L 220.000 164.000 L 224.000 164.000 C 230.627 164.000 236.000 169.373 236.000 176.000 C 236.000 182.627 230.627 188.000 224.000 188.000 L 140.000 188.000 L 140.000 211.220 C 149.407 216.651 153.994 227.724 151.182 238.216 C 148.371 248.709 138.863 256.005 128.000 256.005 C 117.137 256.005 107.629 248.709 104.818 238.216 C 102.006 227.724 106.593 216.651 116.000 211.220 L 116.000 188.000 L 32.000 188.000 C 25.373 188.000 20.000 182.627 20.000 176.000 C 20.000 169.373 25.373 164.000 32.000 164.000 L 36.000 164.000 L 36.000 91.600 C 26.687 89.699 19.998 81.505 20.000 72.000 L 20.000 48.000 C 20.000 36.954 28.954 28.000 40.000 28.000 L 216.000 28.000 C 227.046 28.000 236.000 36.954 236.000 48.000 L 236.000 72.000 C 236.002 81.505 229.313 89.699 220.000 91.600 ZM 44.000 68.000 L 212.000 68.000 L 212.000 52.000 L 44.000 52.000 ZM 196.000 164.000 L 196.000 92.000 L 60.000 92.000 L 60.000 164.000 Z"),
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
        return _projectorScreenChart!!
    }

private var _projectorScreenChart: ImageVector? = null
