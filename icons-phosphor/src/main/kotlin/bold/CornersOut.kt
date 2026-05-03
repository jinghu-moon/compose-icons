package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CornersOut: ImageVector
    get() {
        if (_cornersOut != null) return _cornersOut!!
        _cornersOut = phosphorBoldIcon(
            name = "CornersOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 220.000 48.000 L 220.000 88.000 C 220.000 94.627 214.627 100.000 208.000 100.000 C 201.373 100.000 196.000 94.627 196.000 88.000 L 196.000 60.000 L 168.000 60.000 C 161.373 60.000 156.000 54.627 156.000 48.000 C 156.000 41.373 161.373 36.000 168.000 36.000 L 208.000 36.000 C 214.627 36.000 220.000 41.373 220.000 48.000 ZM 88.000 196.000 L 60.000 196.000 L 60.000 168.000 C 60.000 161.373 54.627 156.000 48.000 156.000 C 41.373 156.000 36.000 161.373 36.000 168.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 88.000 220.000 C 94.627 220.000 100.000 214.627 100.000 208.000 C 100.000 201.373 94.627 196.000 88.000 196.000 ZM 208.000 156.000 C 201.373 156.000 196.000 161.373 196.000 168.000 L 196.000 196.000 L 168.000 196.000 C 161.373 196.000 156.000 201.373 156.000 208.000 C 156.000 214.627 161.373 220.000 168.000 220.000 L 208.000 220.000 C 214.627 220.000 220.000 214.627 220.000 208.000 L 220.000 168.000 C 220.000 161.373 214.627 156.000 208.000 156.000 ZM 88.000 36.000 L 48.000 36.000 C 41.373 36.000 36.000 41.373 36.000 48.000 L 36.000 88.000 C 36.000 94.627 41.373 100.000 48.000 100.000 C 54.627 100.000 60.000 94.627 60.000 88.000 L 60.000 60.000 L 88.000 60.000 C 94.627 60.000 100.000 54.627 100.000 48.000 C 100.000 41.373 94.627 36.000 88.000 36.000 Z"),
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
        return _cornersOut!!
    }

private var _cornersOut: ImageVector? = null
