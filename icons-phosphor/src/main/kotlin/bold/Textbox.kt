package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Textbox: ImageVector
    get() {
        if (_textbox != null) return _textbox!!
        _textbox = phosphorBoldIcon(
            name = "Textbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 112.000 36.000 C 105.373 36.000 100.000 41.373 100.000 48.000 L 100.000 60.000 L 24.000 60.000 C 12.954 60.000 4.000 68.954 4.000 80.000 L 4.000 176.000 C 4.000 187.046 12.954 196.000 24.000 196.000 L 100.000 196.000 L 100.000 208.000 C 100.000 214.627 105.373 220.000 112.000 220.000 C 118.627 220.000 124.000 214.627 124.000 208.000 L 124.000 48.000 C 124.000 41.373 118.627 36.000 112.000 36.000 ZM 28.000 172.000 L 28.000 84.000 L 100.000 84.000 L 100.000 172.000 ZM 252.000 80.000 L 252.000 176.000 C 252.000 187.046 243.046 196.000 232.000 196.000 L 152.000 196.000 C 145.373 196.000 140.000 190.627 140.000 184.000 C 140.000 177.373 145.373 172.000 152.000 172.000 L 228.000 172.000 L 228.000 84.000 L 152.000 84.000 C 145.373 84.000 140.000 78.627 140.000 72.000 C 140.000 65.373 145.373 60.000 152.000 60.000 L 232.000 60.000 C 243.046 60.000 252.000 68.954 252.000 80.000 ZM 88.000 112.000 C 88.000 118.627 82.627 124.000 76.000 124.000 L 76.000 144.000 C 76.000 150.627 70.627 156.000 64.000 156.000 C 57.373 156.000 52.000 150.627 52.000 144.000 L 52.000 124.000 C 45.373 124.000 40.000 118.627 40.000 112.000 C 40.000 105.373 45.373 100.000 52.000 100.000 L 76.000 100.000 C 82.627 100.000 88.000 105.373 88.000 112.000 Z"),
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
        return _textbox!!
    }

private var _textbox: ImageVector? = null
