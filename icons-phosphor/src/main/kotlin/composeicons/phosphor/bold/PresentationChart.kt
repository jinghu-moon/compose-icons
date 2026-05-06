package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PresentationChart: ImageVector
    get() {
        if (_presentationChart != null) return _presentationChart!!
        _presentationChart = phosphorBoldIcon(
            name = "PresentationChart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 36h-76v-12c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v12h-76C28.954 36 20 44.954 20 56v120c0 11.046 8.954 20 20 20h31L54.6 216.5c-4.142 5.175-3.305 12.728 1.87 16.87 5.175 4.142 12.728 3.305 16.87-1.87L101.74 196h52.46l28.4 35.5c4.142 5.175 11.695 6.012 16.87 1.87 5.175-4.142 6.012-11.695 1.87-16.87L185 196h31c11.046 0 20-8.954 20-20v-120C236 44.954 227.046 36 216 36ZM212 172h-168v-112h168ZM104 120v24c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-24c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM128 92c6.627 0 12 5.373 12 12v40c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-40c0-6.627 5.373-12 12-12ZM152 144v-56c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v56c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12Z"),
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
        return _presentationChart!!
    }

private var _presentationChart: ImageVector? = null
