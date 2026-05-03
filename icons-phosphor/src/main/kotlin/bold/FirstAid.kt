package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FirstAid: ImageVector
    get() {
        if (_firstAid != null) return _firstAid!!
        _firstAid = phosphorBoldIcon(
            name = "FirstAid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 84.000 L 172.000 84.000 L 172.000 40.000 C 172.000 28.954 163.046 20.000 152.000 20.000 L 104.000 20.000 C 92.954 20.000 84.000 28.954 84.000 40.000 L 84.000 84.000 L 40.000 84.000 C 28.954 84.000 20.000 92.954 20.000 104.000 L 20.000 152.000 C 20.000 163.046 28.954 172.000 40.000 172.000 L 84.000 172.000 L 84.000 216.000 C 84.000 227.046 92.954 236.000 104.000 236.000 L 152.000 236.000 C 163.046 236.000 172.000 227.046 172.000 216.000 L 172.000 172.000 L 216.000 172.000 C 227.046 172.000 236.000 163.046 236.000 152.000 L 236.000 104.000 C 236.000 92.954 227.046 84.000 216.000 84.000 ZM 212.000 148.000 L 160.000 148.000 C 153.373 148.000 148.000 153.373 148.000 160.000 L 148.000 212.000 L 108.000 212.000 L 108.000 160.000 C 108.000 153.373 102.627 148.000 96.000 148.000 L 44.000 148.000 L 44.000 108.000 L 96.000 108.000 C 102.627 108.000 108.000 102.627 108.000 96.000 L 108.000 44.000 L 148.000 44.000 L 148.000 96.000 C 148.000 102.627 153.373 108.000 160.000 108.000 L 212.000 108.000 Z"),
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
        return _firstAid!!
    }

private var _firstAid: ImageVector? = null
