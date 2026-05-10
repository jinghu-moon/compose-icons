package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Tabs: ImageVector
    get() {
        if (_tabs != null) return _tabs!!
        _tabs = phosphorFillIcon(
            name = "Tabs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M256 168c0 4.418-3.582 8-8 8h-240c-2.547-0-4.942-1.214-6.449-3.268C.044 170.678-.394 168.03 .37 165.6L22.63 91.4C24.634 84.595 30.906 79.943 38 80h84.1c7.075-.035 13.321 4.613 15.32 11.4L158 160h15.3L150.79 85.15c-.363-1.211-.133-2.522 .621-3.537 .755-1.015 1.944-1.613 3.209-1.613h15.43c7.063 .002 13.289 4.635 15.32 11.4L206 160h15.3L198.79 85.15c-.363-1.211-.133-2.522 .621-3.537 .755-1.015 1.944-1.613 3.209-1.613h15.43c7.063 .002 13.289 4.635 15.32 11.4l22.26 74.18c.245 .783 .37 1.599 .37 2.42Z"),
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
