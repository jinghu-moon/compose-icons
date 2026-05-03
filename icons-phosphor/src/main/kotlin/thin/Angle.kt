package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Angle: ImageVector
    get() {
        if (_angle != null) return _angle!!
        _angle = phosphorThinIcon(
            name = "Angle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 100.000 72.000 C 100.000 69.791 101.791 68.000 104.000 68.000 C 159.203 68.061 203.939 112.797 204.000 168.000 C 204.000 170.209 202.209 172.000 200.000 172.000 C 197.791 172.000 196.000 170.209 196.000 168.000 C 195.945 117.213 154.787 76.055 104.000 76.000 C 101.791 76.000 100.000 74.209 100.000 72.000 ZM 240.000 196.000 L 76.000 196.000 L 76.000 32.000 C 76.000 29.791 74.209 28.000 72.000 28.000 C 69.791 28.000 68.000 29.791 68.000 32.000 L 68.000 68.000 L 32.000 68.000 C 29.791 68.000 28.000 69.791 28.000 72.000 C 28.000 74.209 29.791 76.000 32.000 76.000 L 68.000 76.000 L 68.000 200.000 C 68.000 202.209 69.791 204.000 72.000 204.000 L 240.000 204.000 C 242.209 204.000 244.000 202.209 244.000 200.000 C 244.000 197.791 242.209 196.000 240.000 196.000 Z"),
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
        return _angle!!
    }

private var _angle: ImageVector? = null
