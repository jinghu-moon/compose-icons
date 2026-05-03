package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretLineRight: ImageVector
    get() {
        if (_caretLineRight != null) return _caretLineRight!!
        _caretLineRight = phosphorBoldIcon(
            name = "CaretLineRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 152.490 119.510 C 154.749 121.762 156.019 124.820 156.019 128.010 C 156.019 131.200 154.749 134.258 152.490 136.510 L 72.490 216.510 C 67.796 221.204 60.184 221.204 55.490 216.510 C 50.796 211.816 50.796 204.204 55.490 199.510 L 127.000 128.000 L 55.510 56.490 C 50.816 51.796 50.816 44.184 55.510 39.490 C 60.204 34.796 67.816 34.796 72.510 39.490 ZM 184.000 36.000 C 177.373 36.000 172.000 41.373 172.000 48.000 L 172.000 208.000 C 172.000 214.627 177.373 220.000 184.000 220.000 C 190.627 220.000 196.000 214.627 196.000 208.000 L 196.000 48.000 C 196.000 41.373 190.627 36.000 184.000 36.000 Z"),
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
        return _caretLineRight!!
    }

private var _caretLineRight: ImageVector? = null
