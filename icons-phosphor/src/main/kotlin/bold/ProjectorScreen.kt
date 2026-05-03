package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ProjectorScreen: ImageVector
    get() {
        if (_projectorScreen != null) return _projectorScreen!!
        _projectorScreen = phosphorBoldIcon(
            name = "ProjectorScreen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 236.000 72.000 L 236.000 48.000 C 236.000 36.954 227.046 28.000 216.000 28.000 L 40.000 28.000 C 28.954 28.000 20.000 36.954 20.000 48.000 L 20.000 72.000 C 19.998 81.505 26.687 89.699 36.000 91.600 L 36.000 164.000 L 32.000 164.000 C 25.373 164.000 20.000 169.373 20.000 176.000 C 20.000 182.627 25.373 188.000 32.000 188.000 L 116.000 188.000 L 116.000 211.220 C 106.593 216.651 102.006 227.724 104.818 238.216 C 107.629 248.709 117.137 256.005 128.000 256.005 C 138.863 256.005 148.371 248.709 151.182 238.216 C 153.994 227.724 149.407 216.651 140.000 211.220 L 140.000 188.000 L 224.000 188.000 C 230.627 188.000 236.000 182.627 236.000 176.000 C 236.000 169.373 230.627 164.000 224.000 164.000 L 220.000 164.000 L 220.000 91.600 C 229.313 89.699 236.002 81.505 236.000 72.000 ZM 44.000 52.000 L 212.000 52.000 L 212.000 68.000 L 44.000 68.000 ZM 60.000 164.000 L 60.000 92.000 L 196.000 92.000 L 196.000 164.000 Z"),
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
        return _projectorScreen!!
    }

private var _projectorScreen: ImageVector? = null
