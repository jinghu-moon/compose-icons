package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SubsetOf: ImageVector
    get() {
        if (_subsetOf != null) return _subsetOf!!
        _subsetOf = phosphorFillIcon(
            name = "SubsetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 176.000 184.000 L 80.000 184.000 C 75.582 184.000 72.000 180.418 72.000 176.000 C 72.000 171.582 75.582 168.000 80.000 168.000 L 176.000 168.000 C 180.418 168.000 184.000 171.582 184.000 176.000 C 184.000 180.418 180.418 184.000 176.000 184.000 ZM 112.000 136.000 L 176.000 136.000 C 180.418 136.000 184.000 139.582 184.000 144.000 C 184.000 148.418 180.418 152.000 176.000 152.000 L 112.000 152.000 C 89.909 152.000 72.000 134.091 72.000 112.000 C 72.000 89.909 89.909 72.000 112.000 72.000 L 176.000 72.000 C 180.418 72.000 184.000 75.582 184.000 80.000 C 184.000 84.418 180.418 88.000 176.000 88.000 L 112.000 88.000 C 98.745 88.000 88.000 98.745 88.000 112.000 C 88.000 125.255 98.745 136.000 112.000 136.000 Z"),
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
        return _subsetOf!!
    }

private var _subsetOf: ImageVector? = null
