package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Columns: ImageVector
    get() {
        if (_columns != null) return _columns!!
        _columns = phosphorBoldIcon(
            name = "Columns",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M100 28h-36C52.954 28 44 36.954 44 48v160c0 11.046 8.954 20 20 20h36c11.046 0 20-8.954 20-20v-160C120 36.954 111.046 28 100 28ZM96 204h-28v-152h28ZM192 28h-36c-11.046 0-20 8.954-20 20v160c0 11.046 8.954 20 20 20h36c11.046 0 20-8.954 20-20v-160C212 36.954 203.046 28 192 28ZM188 204h-28v-152h28Z"),
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
        return _columns!!
    }

private var _columns: ImageVector? = null
