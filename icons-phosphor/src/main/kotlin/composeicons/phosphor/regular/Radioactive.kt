package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Radioactive: ImageVector
    get() {
        if (_radioactive != null) return _radioactive!!
        _radioactive = phosphorRegularIcon(
            name = "Radioactive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M92 136h-52c-4.476-.015-8.741-1.905-11.76-5.21-3.062-3.357-4.575-7.844-4.17-12.37C26.819 88.082 42.753 60.482 67.65 42.93c3.674-2.599 8.273-3.53 12.669-2.565 4.396 .965 8.182 3.736 10.431 7.635l26 45c2.209 3.827 .897 8.721-2.93 10.93-3.827 2.209-8.721 .897-10.93-2.93l-26-45C55.819 70.843 42.331 94.192 40 119.86c-.004 .062 .022 .121 .07 .16L92 120c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM231.93 118.42C229.18 88.082 213.247 60.482 188.35 42.93c-3.674-2.599-8.273-3.53-12.669-2.565-4.396 .965-8.182 3.736-10.431 7.635L139.3 93c-2.209 3.827-.897 8.721 2.93 10.93 3.827 2.209 8.721 .897 10.93-2.93l26-45c21.048 14.857 34.516 38.202 36.84 63.86 0 .07 0 .12 0 .14h-52c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h52c4.476-.015 8.741-1.905 11.76-5.21 3.062-3.357 4.575-7.844 4.17-12.37ZM152.93 155.18c-2.209-3.827-7.103-5.139-10.93-2.93-3.827 2.209-5.139 7.103-2.93 10.93l25.84 44.73c-23.421 10.787-50.389 10.787-73.81 0l25.83-44.73c2.209-3.827 .897-8.721-2.93-10.93-3.827-2.209-8.721-.897-10.93 2.93L77.25 199.91c-2.248 3.89-2.757 8.545-1.403 12.829 1.354 4.284 4.447 7.8 8.523 9.691 27.687 12.76 59.573 12.76 87.26 0 4.075-1.891 7.168-5.407 8.523-9.691 1.354-4.284 .845-8.939-1.403-12.829ZM128 140c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12Z"),
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
        return _radioactive!!
    }

private var _radioactive: ImageVector? = null
