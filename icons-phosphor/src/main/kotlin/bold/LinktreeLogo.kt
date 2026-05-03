package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LinktreeLogo: ImageVector
    get() {
        if (_linktreeLogo != null) return _linktreeLogo!!
        _linktreeLogo = phosphorBoldIcon(
            name = "LinktreeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 140.000 164.000 L 140.000 232.000 C 140.000 238.627 134.627 244.000 128.000 244.000 C 121.373 244.000 116.000 238.627 116.000 232.000 L 116.000 164.000 C 116.000 157.373 121.373 152.000 128.000 152.000 C 134.627 152.000 140.000 157.373 140.000 164.000 ZM 208.000 92.000 L 157.000 92.000 L 192.520 56.490 C 197.214 51.796 197.214 44.184 192.520 39.490 C 187.826 34.796 180.214 34.796 175.520 39.490 L 140.000 75.000 L 140.000 24.000 C 140.000 17.373 134.627 12.000 128.000 12.000 C 121.373 12.000 116.000 17.373 116.000 24.000 L 116.000 75.000 L 80.490 39.510 C 75.796 34.816 68.184 34.816 63.490 39.510 C 58.796 44.204 58.796 51.816 63.490 56.510 L 99.000 92.000 L 48.000 92.000 C 41.373 92.000 36.000 97.373 36.000 104.000 C 36.000 110.627 41.373 116.000 48.000 116.000 L 99.000 116.000 L 63.510 151.510 C 58.816 156.204 58.816 163.816 63.510 168.510 C 68.204 173.204 75.816 173.204 80.510 168.510 L 128.000 121.000 L 175.510 168.520 C 180.204 173.214 187.816 173.214 192.510 168.520 C 197.204 163.826 197.204 156.214 192.510 151.520 L 157.000 116.000 L 208.000 116.000 C 214.627 116.000 220.000 110.627 220.000 104.000 C 220.000 97.373 214.627 92.000 208.000 92.000 Z"),
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
        return _linktreeLogo!!
    }

private var _linktreeLogo: ImageVector? = null
