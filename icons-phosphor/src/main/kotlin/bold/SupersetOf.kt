package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SupersetOf: ImageVector
    get() {
        if (_supersetOf != null) return _supersetOf!!
        _supersetOf = phosphorBoldIcon(
            name = "SupersetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 220.000 200.000 C 220.000 206.627 214.627 212.000 208.000 212.000 L 56.000 212.000 C 49.373 212.000 44.000 206.627 44.000 200.000 C 44.000 193.373 49.373 188.000 56.000 188.000 L 208.000 188.000 C 214.627 188.000 220.000 193.373 220.000 200.000 ZM 152.000 148.000 L 56.000 148.000 C 49.373 148.000 44.000 153.373 44.000 160.000 C 44.000 166.627 49.373 172.000 56.000 172.000 L 152.000 172.000 C 189.555 172.000 220.000 141.555 220.000 104.000 C 220.000 66.445 189.555 36.000 152.000 36.000 L 56.000 36.000 C 49.373 36.000 44.000 41.373 44.000 48.000 C 44.000 54.627 49.373 60.000 56.000 60.000 L 152.000 60.000 C 176.301 60.000 196.000 79.699 196.000 104.000 C 196.000 128.301 176.301 148.000 152.000 148.000 Z"),
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
        return _supersetOf!!
    }

private var _supersetOf: ImageVector? = null
