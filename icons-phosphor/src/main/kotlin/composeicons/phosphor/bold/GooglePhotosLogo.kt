package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GooglePhotosLogo: ImageVector
    get() {
        if (_googlePhotosLogo != null) return _googlePhotosLogo!!
        _googlePhotosLogo = phosphorBoldIcon(
            name = "GooglePhotosLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 116h-33.36c9.274-23.402 6.359-49.879-7.785-70.702C176.711 24.474 153.173 12.005 128 12c-6.627 0-12 5.373-12 12v33.36C92.598 48.086 66.121 51.001 45.298 65.145 24.474 79.289 12.005 102.827 12 128c0 6.627 5.373 12 12 12h33.36c-9.274 23.402-6.359 49.879 7.785 70.702C79.289 231.526 102.827 243.995 128 244c6.627 0 12-5.373 12-12v-33.36c23.402 9.274 49.879 6.359 70.702-7.785C231.526 176.711 243.995 153.173 244 128c0-6.627-5.373-12-12-12ZM180 88c.036 9.928-2.806 19.653-8.18 28h-31.82v-78.6c23.428 5.59 39.969 26.514 40 50.6ZM88 76c9.928-.036 19.653 2.806 28 8.18v31.82h-78.6C42.99 92.572 63.914 76.031 88 76ZM76 168c-.036-9.928 2.806-19.653 8.18-28h31.82v78.6C92.572 213.01 76.031 192.086 76 168ZM168 180c-9.928 .036-19.653-2.806-28-8.18v-31.82h78.6c-5.59 23.428-26.514 39.969-50.6 40Z"),
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
        return _googlePhotosLogo!!
    }

private var _googlePhotosLogo: ImageVector? = null
