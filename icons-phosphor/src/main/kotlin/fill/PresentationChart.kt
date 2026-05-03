package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PresentationChart: ImageVector
    get() {
        if (_presentationChart != null) return _presentationChart!!
        _presentationChart = phosphorFillIcon(
            name = "PresentationChart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 40.000 L 136.000 40.000 L 136.000 24.000 C 136.000 19.582 132.418 16.000 128.000 16.000 C 123.582 16.000 120.000 19.582 120.000 24.000 L 120.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 176.000 C 24.000 184.837 31.163 192.000 40.000 192.000 L 79.360 192.000 L 57.750 219.000 C 54.989 222.452 55.548 227.489 59.000 230.250 C 62.452 233.011 67.489 232.452 70.250 229.000 L 99.840 192.000 L 156.160 192.000 L 185.750 229.000 C 188.511 232.452 193.548 233.011 197.000 230.250 C 200.452 227.489 201.011 222.452 198.250 219.000 L 176.640 192.000 L 216.000 192.000 C 224.837 192.000 232.000 184.837 232.000 176.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 104.000 144.000 C 104.000 148.418 100.418 152.000 96.000 152.000 C 91.582 152.000 88.000 148.418 88.000 144.000 L 88.000 120.000 C 88.000 115.582 91.582 112.000 96.000 112.000 C 100.418 112.000 104.000 115.582 104.000 120.000 ZM 136.000 144.000 C 136.000 148.418 132.418 152.000 128.000 152.000 C 123.582 152.000 120.000 148.418 120.000 144.000 L 120.000 104.000 C 120.000 99.582 123.582 96.000 128.000 96.000 C 132.418 96.000 136.000 99.582 136.000 104.000 ZM 168.000 144.000 C 168.000 148.418 164.418 152.000 160.000 152.000 C 155.582 152.000 152.000 148.418 152.000 144.000 L 152.000 88.000 C 152.000 83.582 155.582 80.000 160.000 80.000 C 164.418 80.000 168.000 83.582 168.000 88.000 Z"),
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
        return _presentationChart!!
    }

private var _presentationChart: ImageVector? = null
