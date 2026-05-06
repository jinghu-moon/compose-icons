package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Tabs: ImageVector
    get() {
        if (_tabs != null) return _tabs!!
        _tabs = phosphorRegularIcon(
            name = "Tabs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M255.66 165.7h0 0c.004-.026 .004-.054 0-.08L233.37 91.4C231.371 84.613 225.125 79.965 218.05 80h-10.05c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h10.05l19.2 64h-31.25L185.37 91.4C183.371 84.613 177.125 79.965 170.05 80h-10.05c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h10.05l19.2 64h-31.25L137.37 91.4C135.371 84.613 129.125 79.965 122.05 80h-84.05C30.906 79.943 24.634 84.595 22.63 91.4L.37 165.6v.05h0c0 0 0 .05 0 .08C.139 166.465 .015 167.23 0 168c0 4.418 3.582 8 8 8h240c2.529-.001 4.908-1.197 6.417-3.226 1.509-2.029 1.97-4.652 1.243-7.074ZM38 96h84.1l19.2 64h-122.55Z"),
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
        return _tabs!!
    }

private var _tabs: ImageVector? = null
