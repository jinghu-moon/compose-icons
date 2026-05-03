package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Paragraph: ImageVector
    get() {
        if (_paragraph != null) return _paragraph!!
        _paragraph = phosphorBoldIcon(
            name = "Paragraph",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 36.000 L 96.000 36.000 C 58.445 36.000 28.000 66.445 28.000 104.000 C 28.000 141.555 58.445 172.000 96.000 172.000 L 132.000 172.000 L 132.000 208.000 C 132.000 214.627 137.373 220.000 144.000 220.000 C 150.627 220.000 156.000 214.627 156.000 208.000 L 156.000 60.000 L 172.000 60.000 L 172.000 208.000 C 172.000 214.627 177.373 220.000 184.000 220.000 C 190.627 220.000 196.000 214.627 196.000 208.000 L 196.000 60.000 L 208.000 60.000 C 214.627 60.000 220.000 54.627 220.000 48.000 C 220.000 41.373 214.627 36.000 208.000 36.000 ZM 132.000 148.000 L 96.000 148.000 C 71.699 148.000 52.000 128.301 52.000 104.000 C 52.000 79.699 71.699 60.000 96.000 60.000 L 132.000 60.000 Z"),
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
        return _paragraph!!
    }

private var _paragraph: ImageVector? = null
