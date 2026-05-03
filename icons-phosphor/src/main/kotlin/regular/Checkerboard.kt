package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Checkerboard: ImageVector
    get() {
        if (_checkerboard != null) return _checkerboard!!
        _checkerboard = phosphorRegularIcon(
            name = "Checkerboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 195.310 120.000 L 136.000 60.690 L 136.000 48.000 L 148.690 48.000 L 208.000 107.320 L 208.000 120.000 ZM 136.000 83.310 L 172.690 120.000 L 136.000 120.000 ZM 208.000 84.690 L 171.310 48.000 L 208.000 48.000 ZM 120.000 48.000 L 120.000 120.000 L 48.000 120.000 L 48.000 48.000 ZM 107.310 208.000 L 48.000 148.690 L 48.000 136.000 L 60.690 136.000 L 120.000 195.310 L 120.000 208.000 ZM 120.000 172.690 L 83.310 136.000 L 120.000 136.000 ZM 48.000 171.310 L 84.690 208.000 L 48.000 208.000 ZM 208.000 208.000 L 136.000 208.000 L 136.000 136.000 L 208.000 136.000 L 208.000 208.000 Z"),
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
        return _checkerboard!!
    }

private var _checkerboard: ImageVector? = null
