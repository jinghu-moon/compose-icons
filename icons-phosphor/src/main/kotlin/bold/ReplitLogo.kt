package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ReplitLogo: ImageVector
    get() {
        if (_replitLogo != null) return _replitLogo!!
        _replitLogo = phosphorBoldIcon(
            name = "ReplitLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 84.000 L 156.000 84.000 L 156.000 40.000 C 156.000 28.954 147.046 20.000 136.000 20.000 L 72.000 20.000 C 60.954 20.000 52.000 28.954 52.000 40.000 L 52.000 88.000 C 52.000 99.046 60.954 108.000 72.000 108.000 L 132.000 108.000 L 132.000 148.000 L 72.000 148.000 C 60.954 148.000 52.000 156.954 52.000 168.000 L 52.000 216.000 C 52.000 227.046 60.954 236.000 72.000 236.000 L 136.000 236.000 C 147.046 236.000 156.000 227.046 156.000 216.000 L 156.000 172.000 L 216.000 172.000 C 227.046 172.000 236.000 163.046 236.000 152.000 L 236.000 104.000 C 236.000 92.954 227.046 84.000 216.000 84.000 ZM 132.000 212.000 L 76.000 212.000 L 76.000 172.000 L 132.000 172.000 ZM 132.000 84.000 L 76.000 84.000 L 76.000 44.000 L 132.000 44.000 ZM 212.000 148.000 L 156.000 148.000 L 156.000 108.000 L 212.000 108.000 Z"),
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
        return _replitLogo!!
    }

private var _replitLogo: ImageVector? = null
