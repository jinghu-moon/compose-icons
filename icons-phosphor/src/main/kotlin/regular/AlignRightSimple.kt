package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.AlignRightSimple: ImageVector
    get() {
        if (_alignRightSimple != null) return _alignRightSimple!!
        _alignRightSimple = phosphorRegularIcon(
            name = "AlignRightSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 56.000 L 232.000 200.000 C 232.000 204.418 228.418 208.000 224.000 208.000 C 219.582 208.000 216.000 204.418 216.000 200.000 L 216.000 56.000 C 216.000 51.582 219.582 48.000 224.000 48.000 C 228.418 48.000 232.000 51.582 232.000 56.000 ZM 200.000 96.000 L 200.000 160.000 C 200.000 168.837 192.837 176.000 184.000 176.000 L 32.000 176.000 C 23.163 176.000 16.000 168.837 16.000 160.000 L 16.000 96.000 C 16.000 87.163 23.163 80.000 32.000 80.000 L 184.000 80.000 C 192.837 80.000 200.000 87.163 200.000 96.000 ZM 184.000 96.000 L 32.000 96.000 L 32.000 160.000 L 184.000 160.000 Z"),
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
        return _alignRightSimple!!
    }

private var _alignRightSimple: ImageVector? = null
