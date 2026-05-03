package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretRight: ImageVector
    get() {
        if (_caretRight != null) return _caretRight!!
        _caretRight = phosphorBoldIcon(
            name = "CaretRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 184.490 136.490 L 104.490 216.490 C 99.796 221.184 92.184 221.184 87.490 216.490 C 82.796 211.796 82.796 204.184 87.490 199.490 L 159.000 128.000 L 87.510 56.490 C 82.816 51.796 82.816 44.184 87.510 39.490 C 92.204 34.796 99.816 34.796 104.510 39.490 L 184.510 119.490 C 186.767 121.744 188.033 124.804 188.029 127.994 C 188.026 131.184 186.752 134.241 184.490 136.490 Z"),
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
        return _caretRight!!
    }

private var _caretRight: ImageVector? = null
