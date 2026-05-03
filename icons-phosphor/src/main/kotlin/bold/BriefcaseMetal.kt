package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BriefcaseMetal: ImageVector
    get() {
        if (_briefcaseMetal != null) return _briefcaseMetal!!
        _briefcaseMetal = phosphorBoldIcon(
            name = "BriefcaseMetal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 52.000 L 180.000 52.000 L 180.000 40.000 C 180.000 24.536 167.464 12.000 152.000 12.000 L 104.000 12.000 C 88.536 12.000 76.000 24.536 76.000 40.000 L 76.000 52.000 L 40.000 52.000 C 28.954 52.000 20.000 60.954 20.000 72.000 L 20.000 200.000 C 20.000 211.046 28.954 220.000 40.000 220.000 L 216.000 220.000 C 227.046 220.000 236.000 211.046 236.000 200.000 L 236.000 72.000 C 236.000 60.954 227.046 52.000 216.000 52.000 ZM 44.000 120.000 L 212.000 120.000 L 212.000 152.000 L 44.000 152.000 ZM 100.000 40.000 C 100.000 37.791 101.791 36.000 104.000 36.000 L 152.000 36.000 C 154.209 36.000 156.000 37.791 156.000 40.000 L 156.000 52.000 L 100.000 52.000 ZM 212.000 76.000 L 212.000 96.000 L 44.000 96.000 L 44.000 76.000 ZM 44.000 196.000 L 44.000 176.000 L 212.000 176.000 L 212.000 196.000 Z"),
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
        return _briefcaseMetal!!
    }

private var _briefcaseMetal: ImageVector? = null
