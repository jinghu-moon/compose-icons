package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CopySimple: ImageVector
    get() {
        if (_copySimple != null) return _copySimple!!
        _copySimple = phosphorRegularIcon(
            name = "CopySimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 184.000 64.000 L 40.000 64.000 C 35.582 64.000 32.000 67.582 32.000 72.000 L 32.000 216.000 C 32.000 220.418 35.582 224.000 40.000 224.000 L 184.000 224.000 C 188.418 224.000 192.000 220.418 192.000 216.000 L 192.000 72.000 C 192.000 67.582 188.418 64.000 184.000 64.000 ZM 176.000 208.000 L 48.000 208.000 L 48.000 80.000 L 176.000 80.000 ZM 224.000 40.000 L 224.000 184.000 C 224.000 188.418 220.418 192.000 216.000 192.000 C 211.582 192.000 208.000 188.418 208.000 184.000 L 208.000 48.000 L 72.000 48.000 C 67.582 48.000 64.000 44.418 64.000 40.000 C 64.000 35.582 67.582 32.000 72.000 32.000 L 216.000 32.000 C 220.418 32.000 224.000 35.582 224.000 40.000 Z"),
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
        return _copySimple!!
    }

private var _copySimple: ImageVector? = null
