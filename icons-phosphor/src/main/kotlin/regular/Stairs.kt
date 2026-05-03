package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Stairs: ImageVector
    get() {
        if (_stairs != null) return _stairs!!
        _stairs = phosphorRegularIcon(
            name = "Stairs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 24.000 L 56.000 24.000 C 47.163 24.000 40.000 31.163 40.000 40.000 L 40.000 216.000 C 40.000 224.837 47.163 232.000 56.000 232.000 L 200.000 232.000 C 208.837 232.000 216.000 224.837 216.000 216.000 L 216.000 40.000 C 216.000 31.163 208.837 24.000 200.000 24.000 ZM 152.000 144.000 L 200.000 144.000 L 200.000 168.000 L 112.000 168.000 L 112.000 144.000 ZM 160.000 128.000 L 160.000 104.000 L 200.000 104.000 L 200.000 128.000 ZM 200.000 40.000 L 200.000 88.000 L 152.000 88.000 C 147.582 88.000 144.000 91.582 144.000 96.000 L 144.000 128.000 L 104.000 128.000 C 99.582 128.000 96.000 131.582 96.000 136.000 L 96.000 168.000 L 56.000 168.000 L 56.000 40.000 ZM 200.000 216.000 L 56.000 216.000 L 56.000 184.000 L 200.000 184.000 L 200.000 216.000 Z"),
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
        return _stairs!!
    }

private var _stairs: ImageVector? = null
