package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextUnderline: ImageVector
    get() {
        if (_textUnderline != null) return _textUnderline!!
        _textUnderline = phosphorBoldIcon(
            name = "TextUnderline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 204.000 224.000 C 204.000 230.627 198.627 236.000 192.000 236.000 L 64.000 236.000 C 57.373 236.000 52.000 230.627 52.000 224.000 C 52.000 217.373 57.373 212.000 64.000 212.000 L 192.000 212.000 C 198.627 212.000 204.000 217.373 204.000 224.000 ZM 128.000 196.000 C 165.539 195.961 195.961 165.539 196.000 128.000 L 196.000 56.000 C 196.000 49.373 190.627 44.000 184.000 44.000 C 177.373 44.000 172.000 49.373 172.000 56.000 L 172.000 128.000 C 172.000 152.301 152.301 172.000 128.000 172.000 C 103.699 172.000 84.000 152.301 84.000 128.000 L 84.000 56.000 C 84.000 49.373 78.627 44.000 72.000 44.000 C 65.373 44.000 60.000 49.373 60.000 56.000 L 60.000 128.000 C 60.039 165.539 90.461 195.961 128.000 196.000 Z"),
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
        return _textUnderline!!
    }

private var _textUnderline: ImageVector? = null
