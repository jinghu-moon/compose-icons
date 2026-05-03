package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Copy: ImageVector
    get() {
        if (_copy != null) return _copy!!
        _copy = phosphorFillIcon(
            name = "Copy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 32.000 L 88.000 32.000 C 83.582 32.000 80.000 35.582 80.000 40.000 L 80.000 80.000 L 40.000 80.000 C 35.582 80.000 32.000 83.582 32.000 88.000 L 32.000 216.000 C 32.000 220.418 35.582 224.000 40.000 224.000 L 168.000 224.000 C 172.418 224.000 176.000 220.418 176.000 216.000 L 176.000 176.000 L 216.000 176.000 C 220.418 176.000 224.000 172.418 224.000 168.000 L 224.000 40.000 C 224.000 35.582 220.418 32.000 216.000 32.000 ZM 208.000 160.000 L 176.000 160.000 L 176.000 88.000 C 176.000 83.582 172.418 80.000 168.000 80.000 L 96.000 80.000 L 96.000 48.000 L 208.000 48.000 Z"),
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
        return _copy!!
    }

private var _copy: ImageVector? = null
