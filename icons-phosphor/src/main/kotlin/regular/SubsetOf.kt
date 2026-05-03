package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SubsetOf: ImageVector
    get() {
        if (_subsetOf != null) return _subsetOf!!
        _subsetOf = phosphorRegularIcon(
            name = "SubsetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 208.000 C 208.000 212.418 204.418 216.000 200.000 216.000 L 48.000 216.000 C 43.582 216.000 40.000 212.418 40.000 208.000 C 40.000 203.582 43.582 200.000 48.000 200.000 L 200.000 200.000 C 204.418 200.000 208.000 203.582 208.000 208.000 ZM 200.000 160.000 L 104.000 160.000 C 77.490 160.000 56.000 138.510 56.000 112.000 C 56.000 85.490 77.490 64.000 104.000 64.000 L 200.000 64.000 C 204.418 64.000 208.000 60.418 208.000 56.000 C 208.000 51.582 204.418 48.000 200.000 48.000 L 104.000 48.000 C 68.654 48.000 40.000 76.654 40.000 112.000 C 40.000 147.346 68.654 176.000 104.000 176.000 L 200.000 176.000 C 204.418 176.000 208.000 172.418 208.000 168.000 C 208.000 163.582 204.418 160.000 200.000 160.000 Z"),
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
        return _subsetOf!!
    }

private var _subsetOf: ImageVector? = null
