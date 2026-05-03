package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MarkdownLogo: ImageVector
    get() {
        if (_markdownLogo != null) return _markdownLogo!!
        _markdownLogo = phosphorLightIcon(
            name = "MarkdownLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 50.000 L 24.000 50.000 C 16.268 50.000 10.000 56.268 10.000 64.000 L 10.000 192.000 C 10.000 199.732 16.268 206.000 24.000 206.000 L 232.000 206.000 C 239.732 206.000 246.000 199.732 246.000 192.000 L 246.000 64.000 C 246.000 56.268 239.732 50.000 232.000 50.000 ZM 234.000 192.000 C 234.000 193.105 233.105 194.000 232.000 194.000 L 24.000 194.000 C 22.895 194.000 22.000 193.105 22.000 192.000 L 22.000 64.000 C 22.000 62.895 22.895 62.000 24.000 62.000 L 232.000 62.000 C 233.105 62.000 234.000 62.895 234.000 64.000 ZM 126.000 104.000 L 126.000 152.000 C 126.000 155.314 123.314 158.000 120.000 158.000 C 116.686 158.000 114.000 155.314 114.000 152.000 L 114.000 118.490 L 92.240 140.240 C 89.897 142.580 86.103 142.580 83.760 140.240 L 62.000 118.490 L 62.000 152.000 C 62.000 155.314 59.314 158.000 56.000 158.000 C 52.686 158.000 50.000 155.314 50.000 152.000 L 50.000 104.000 C 50.002 101.575 51.464 99.389 53.705 98.462 C 55.945 97.534 58.524 98.046 60.240 99.760 L 88.000 127.510 L 115.760 99.760 C 117.476 98.046 120.055 97.534 122.295 98.462 C 124.536 99.389 125.998 101.575 126.000 104.000 ZM 204.240 123.760 C 206.580 126.103 206.580 129.897 204.240 132.240 L 180.240 156.240 C 177.897 158.580 174.103 158.580 171.760 156.240 L 147.760 132.240 C 146.155 130.744 145.494 128.492 146.037 126.366 C 146.580 124.240 148.240 122.580 150.366 122.037 C 152.492 121.494 154.744 122.155 156.240 123.760 L 170.000 137.510 L 170.000 104.000 C 170.000 100.686 172.686 98.000 176.000 98.000 C 179.314 98.000 182.000 100.686 182.000 104.000 L 182.000 137.510 L 195.760 123.760 C 198.103 121.420 201.897 121.420 204.240 123.760 Z"),
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
        return _markdownLogo!!
    }

private var _markdownLogo: ImageVector? = null
