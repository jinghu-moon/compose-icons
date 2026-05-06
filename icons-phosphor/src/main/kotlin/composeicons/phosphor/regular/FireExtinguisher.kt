package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FireExtinguisher: ImageVector
    get() {
        if (_fireExtinguisher != null) return _fireExtinguisher!!
        _fireExtinguisher = phosphorRegularIcon(
            name = "FireExtinguisher",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M218.3 48.34 157.62 30.14l30-15c3.946-1.988 5.533-6.799 3.545-10.745C189.177 .449 184.366-1.138 180.42 .85L134 24.05C90.618 25.177 56.029 60.654 56 104.05v103.95c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-32h16v56c0 8.837 7.163 16 16 16h64c8.837 0 16-7.163 16-16v-128C183.967 80.591 167.077 60.61 144 56.68v-13.93l69.7 20.91c2.76 .899 5.79 .233 7.918-1.741 2.128-1.974 3.02-4.945 2.331-7.764-.689-2.819-2.851-5.045-5.649-5.815ZM72 160v-56C72.04 71.766 96.022 44.58 128 40.52v16.16C104.923 60.61 88.033 80.591 88 104v56ZM168 232h-64v-56h64v56ZM168 104v56h-64v-56c0-17.673 14.327-32 32-32 17.673 0 32 14.327 32 32Z"),
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
        return _fireExtinguisher!!
    }

private var _fireExtinguisher: ImageVector? = null
