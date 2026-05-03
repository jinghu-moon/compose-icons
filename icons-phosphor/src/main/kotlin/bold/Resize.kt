package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Resize: ImageVector
    get() {
        if (_resize != null) return _resize!!
        _resize = phosphorBoldIcon(
            name = "Resize",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 136.000 108.000 L 48.000 108.000 C 41.373 108.000 36.000 113.373 36.000 120.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 136.000 220.000 C 142.627 220.000 148.000 214.627 148.000 208.000 L 148.000 120.000 C 148.000 113.373 142.627 108.000 136.000 108.000 ZM 124.000 196.000 L 60.000 196.000 L 60.000 132.000 L 124.000 132.000 ZM 220.000 188.000 L 220.000 200.000 C 220.000 211.046 211.046 220.000 200.000 220.000 L 180.000 220.000 C 173.373 220.000 168.000 214.627 168.000 208.000 C 168.000 201.373 173.373 196.000 180.000 196.000 L 196.000 196.000 L 196.000 188.000 C 196.000 181.373 201.373 176.000 208.000 176.000 C 214.627 176.000 220.000 181.373 220.000 188.000 ZM 220.000 116.000 L 220.000 140.000 C 220.000 146.627 214.627 152.000 208.000 152.000 C 201.373 152.000 196.000 146.627 196.000 140.000 L 196.000 116.000 C 196.000 109.373 201.373 104.000 208.000 104.000 C 214.627 104.000 220.000 109.373 220.000 116.000 ZM 220.000 56.000 L 220.000 72.000 C 220.000 78.627 214.627 84.000 208.000 84.000 C 201.373 84.000 196.000 78.627 196.000 72.000 L 196.000 60.000 L 184.000 60.000 C 177.373 60.000 172.000 54.627 172.000 48.000 C 172.000 41.373 177.373 36.000 184.000 36.000 L 200.000 36.000 C 211.046 36.000 220.000 44.954 220.000 56.000 ZM 152.000 48.000 C 152.000 54.627 146.627 60.000 140.000 60.000 L 116.000 60.000 C 109.373 60.000 104.000 54.627 104.000 48.000 C 104.000 41.373 109.373 36.000 116.000 36.000 L 140.000 36.000 C 146.627 36.000 152.000 41.373 152.000 48.000 ZM 36.000 76.000 L 36.000 56.000 C 36.000 44.954 44.954 36.000 56.000 36.000 L 68.000 36.000 C 74.627 36.000 80.000 41.373 80.000 48.000 C 80.000 54.627 74.627 60.000 68.000 60.000 L 60.000 60.000 L 60.000 76.000 C 60.000 82.627 54.627 88.000 48.000 88.000 C 41.373 88.000 36.000 82.627 36.000 76.000 Z"),
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
        return _resize!!
    }

private var _resize: ImageVector? = null
