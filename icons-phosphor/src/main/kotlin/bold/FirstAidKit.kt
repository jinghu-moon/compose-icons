package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FirstAidKit: ImageVector
    get() {
        if (_firstAidKit != null) return _firstAidKit!!
        _firstAidKit = phosphorBoldIcon(
            name = "FirstAidKit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 52.000 L 180.000 52.000 L 180.000 44.000 C 180.000 28.536 167.464 16.000 152.000 16.000 L 104.000 16.000 C 88.536 16.000 76.000 28.536 76.000 44.000 L 76.000 52.000 L 40.000 52.000 C 28.954 52.000 20.000 60.954 20.000 72.000 L 20.000 200.000 C 20.000 211.046 28.954 220.000 40.000 220.000 L 216.000 220.000 C 227.046 220.000 236.000 211.046 236.000 200.000 L 236.000 72.000 C 236.000 60.954 227.046 52.000 216.000 52.000 ZM 100.000 44.000 C 100.000 41.791 101.791 40.000 104.000 40.000 L 152.000 40.000 C 154.209 40.000 156.000 41.791 156.000 44.000 L 156.000 52.000 L 100.000 52.000 ZM 212.000 196.000 L 44.000 196.000 L 44.000 76.000 L 212.000 76.000 ZM 164.000 136.000 C 164.000 142.627 158.627 148.000 152.000 148.000 L 140.000 148.000 L 140.000 160.000 C 140.000 166.627 134.627 172.000 128.000 172.000 C 121.373 172.000 116.000 166.627 116.000 160.000 L 116.000 148.000 L 104.000 148.000 C 97.373 148.000 92.000 142.627 92.000 136.000 C 92.000 129.373 97.373 124.000 104.000 124.000 L 116.000 124.000 L 116.000 112.000 C 116.000 105.373 121.373 100.000 128.000 100.000 C 134.627 100.000 140.000 105.373 140.000 112.000 L 140.000 124.000 L 152.000 124.000 C 158.627 124.000 164.000 129.373 164.000 136.000 Z"),
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
        return _firstAidKit!!
    }

private var _firstAidKit: ImageVector? = null
