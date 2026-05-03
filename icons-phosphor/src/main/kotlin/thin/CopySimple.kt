package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CopySimple: ImageVector
    get() {
        if (_copySimple != null) return _copySimple!!
        _copySimple = phosphorThinIcon(
            name = "CopySimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 184.000 68.000 L 40.000 68.000 C 37.791 68.000 36.000 69.791 36.000 72.000 L 36.000 216.000 C 36.000 218.209 37.791 220.000 40.000 220.000 L 184.000 220.000 C 186.209 220.000 188.000 218.209 188.000 216.000 L 188.000 72.000 C 188.000 69.791 186.209 68.000 184.000 68.000 ZM 180.000 212.000 L 44.000 212.000 L 44.000 76.000 L 180.000 76.000 ZM 220.000 40.000 L 220.000 184.000 C 220.000 186.209 218.209 188.000 216.000 188.000 C 213.791 188.000 212.000 186.209 212.000 184.000 L 212.000 44.000 L 72.000 44.000 C 69.791 44.000 68.000 42.209 68.000 40.000 C 68.000 37.791 69.791 36.000 72.000 36.000 L 216.000 36.000 C 218.209 36.000 220.000 37.791 220.000 40.000 Z"),
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
        return _copySimple!!
    }

private var _copySimple: ImageVector? = null
