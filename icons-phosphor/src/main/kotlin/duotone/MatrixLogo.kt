package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MatrixLogo: ImageVector
    get() {
        if (_matrixLogo != null) return _matrixLogo!!
        _matrixLogo = phosphorDuotoneIcon(
            name = "MatrixLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 216.000 40.000 L 216.000 216.000 L 40.000 216.000 L 40.000 40.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 72.000 216.000 C 72.000 220.418 68.418 224.000 64.000 224.000 L 40.000 224.000 C 35.582 224.000 32.000 220.418 32.000 216.000 L 32.000 40.000 C 32.000 35.582 35.582 32.000 40.000 32.000 L 64.000 32.000 C 68.418 32.000 72.000 35.582 72.000 40.000 C 72.000 44.418 68.418 48.000 64.000 48.000 L 48.000 48.000 L 48.000 208.000 L 64.000 208.000 C 68.418 208.000 72.000 211.582 72.000 216.000 ZM 216.000 32.000 L 192.000 32.000 C 187.582 32.000 184.000 35.582 184.000 40.000 C 184.000 44.418 187.582 48.000 192.000 48.000 L 208.000 48.000 L 208.000 208.000 L 192.000 208.000 C 187.582 208.000 184.000 211.582 184.000 216.000 C 184.000 220.418 187.582 224.000 192.000 224.000 L 216.000 224.000 C 220.418 224.000 224.000 220.418 224.000 216.000 L 224.000 40.000 C 224.000 35.582 220.418 32.000 216.000 32.000 ZM 184.000 120.000 C 183.985 106.698 175.742 94.792 163.297 90.096 C 150.851 85.400 136.798 88.893 128.000 98.870 C 117.740 87.177 100.546 84.579 87.290 92.720 C 85.739 89.288 82.004 87.403 78.322 88.193 C 74.640 88.983 72.007 92.234 72.000 96.000 L 72.000 160.000 C 72.000 164.418 75.582 168.000 80.000 168.000 C 84.418 168.000 88.000 164.418 88.000 160.000 L 88.000 120.000 C 88.000 111.163 95.163 104.000 104.000 104.000 C 112.837 104.000 120.000 111.163 120.000 120.000 L 120.000 160.000 C 120.000 164.418 123.582 168.000 128.000 168.000 C 132.418 168.000 136.000 164.418 136.000 160.000 L 136.000 120.000 C 136.000 111.163 143.163 104.000 152.000 104.000 C 160.837 104.000 168.000 111.163 168.000 120.000 L 168.000 160.000 C 168.000 164.418 171.582 168.000 176.000 168.000 C 180.418 168.000 184.000 164.418 184.000 160.000 Z"),
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
        return _matrixLogo!!
    }

private var _matrixLogo: ImageVector? = null
