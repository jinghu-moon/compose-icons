package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CornersIn: ImageVector
    get() {
        if (_cornersIn != null) return _cornersIn!!
        _cornersIn = phosphorBoldIcon(
            name = "CornersIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 148.000 96.000 L 148.000 48.000 C 148.000 41.373 153.373 36.000 160.000 36.000 C 166.627 36.000 172.000 41.373 172.000 48.000 L 172.000 84.000 L 208.000 84.000 C 214.627 84.000 220.000 89.373 220.000 96.000 C 220.000 102.627 214.627 108.000 208.000 108.000 L 160.000 108.000 C 153.373 108.000 148.000 102.627 148.000 96.000 ZM 96.000 148.000 L 48.000 148.000 C 41.373 148.000 36.000 153.373 36.000 160.000 C 36.000 166.627 41.373 172.000 48.000 172.000 L 84.000 172.000 L 84.000 208.000 C 84.000 214.627 89.373 220.000 96.000 220.000 C 102.627 220.000 108.000 214.627 108.000 208.000 L 108.000 160.000 C 108.000 153.373 102.627 148.000 96.000 148.000 ZM 208.000 148.000 L 160.000 148.000 C 153.373 148.000 148.000 153.373 148.000 160.000 L 148.000 208.000 C 148.000 214.627 153.373 220.000 160.000 220.000 C 166.627 220.000 172.000 214.627 172.000 208.000 L 172.000 172.000 L 208.000 172.000 C 214.627 172.000 220.000 166.627 220.000 160.000 C 220.000 153.373 214.627 148.000 208.000 148.000 ZM 96.000 36.000 C 89.373 36.000 84.000 41.373 84.000 48.000 L 84.000 84.000 L 48.000 84.000 C 41.373 84.000 36.000 89.373 36.000 96.000 C 36.000 102.627 41.373 108.000 48.000 108.000 L 96.000 108.000 C 102.627 108.000 108.000 102.627 108.000 96.000 L 108.000 48.000 C 108.000 41.373 102.627 36.000 96.000 36.000 Z"),
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
        return _cornersIn!!
    }

private var _cornersIn: ImageVector? = null
