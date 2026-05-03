package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ReplitLogo: ImageVector
    get() {
        if (_replitLogo != null) return _replitLogo!!
        _replitLogo = phosphorFillIcon(
            name = "ReplitLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 72.000 160.000 L 144.000 160.000 L 144.000 216.000 C 144.000 224.837 136.837 232.000 128.000 232.000 L 72.000 232.000 C 63.163 232.000 56.000 224.837 56.000 216.000 L 56.000 176.000 C 56.000 167.163 63.163 160.000 72.000 160.000 ZM 128.000 24.000 L 72.000 24.000 C 63.163 24.000 56.000 31.163 56.000 40.000 L 56.000 80.000 C 56.000 88.837 63.163 96.000 72.000 96.000 L 144.000 96.000 L 144.000 40.000 C 144.000 31.163 136.837 24.000 128.000 24.000 ZM 216.000 96.000 L 144.000 96.000 L 144.000 160.000 L 216.000 160.000 C 224.837 160.000 232.000 152.837 232.000 144.000 L 232.000 112.000 C 232.000 103.163 224.837 96.000 216.000 96.000 Z"),
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
        return _replitLogo!!
    }

private var _replitLogo: ImageVector? = null
