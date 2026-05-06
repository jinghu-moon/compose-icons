package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Cloud: ImageVector
    get() {
        if (_cloud != null) return _cloud!!
        _cloud = tablerFilledIcon(
            name = "Cloud",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.04 4.305c2.195-.667 4.615-.224 6.36 1.176 1.386 1.108 2.188 2.686 2.252 4.34l.003 .212 .091 .003c2.3 .107 4.143 1.961 4.25 4.27l.004 .211c0 2.407-1.885 4.372-4.255 4.482l-.21 .005h-11.878l-.222-.008C3.495 18.886 1.118 16.597 1.005 13.733L1 13.517C1 10.77 3.08 8.507 5.784 8.1l.114-.016 .07-.181C6.631 6.283 8.024 4.997 9.797 4.385l.244-.08Z"),
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
        return _cloud!!
    }

private var _cloud: ImageVector? = null
