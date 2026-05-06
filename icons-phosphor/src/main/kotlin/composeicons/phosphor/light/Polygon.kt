package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Polygon: ImageVector
    get() {
        if (_polygon != null) return _polygon!!
        _polygon = phosphorLightIcon(
            name = "Polygon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M229.23 50.78c-5.627-5.63-13.26-8.794-21.22-8.794-7.96 0-15.593 3.163-21.22 8.794h0c-2.252 2.25-4.129 4.846-5.56 7.69L149.92 49.93c.806-12.459-6.189-24.114-17.561-29.264C120.986 15.515 107.612 17.946 98.78 26.77h0C89.14 36.45 87.23 51.409 94.13 63.2L57.83 95.87C45.877 87.065 29.286 88.301 18.77 98.78h0C7.043 110.258 6.714 129.029 18.033 140.911c11.318 11.882 30.083 12.465 42.117 1.309l72.6 53.25c-6.35 13.811-1.368 30.189 11.598 38.122 12.966 7.934 29.817 4.916 39.224-7.024 9.407-11.94 8.396-29.03-2.352-39.778-1.73-1.732-3.668-3.244-5.77-4.5l28.44-80.59c1.362 .189 2.735 .29 4.11 .3 12.129-.003 23.064-7.309 27.708-18.514 4.644-11.205 2.084-24.104-6.488-32.686ZM107.23 35.26c7.03-7.028 18.426-7.027 25.454 .003 7.029 7.029 7.029 18.425 0 25.454-7.029 7.029-18.424 7.031-25.454 .003-3.372-3.381-5.262-7.963-5.254-12.738 .007-4.775 1.912-9.351 5.294-12.722ZM27.23 132.73c-7.028-7.03-7.027-18.426 .003-25.454 7.029-7.029 18.425-7.029 25.454 0 7.029 7.029 7.031 18.424 .003 25.454-7.026 7.012-18.404 7.012-25.43 0ZM172.7 220.73c-7.03 7.028-18.426 7.027-25.454-.003-7.029-7.029-7.029-18.425 0-25.454 7.029-7.029 18.424-7.031 25.454-.003 3.384 3.372 5.289 7.951 5.294 12.729 .006 4.777-1.888 9.361-5.264 12.741ZM164.09 178.3c-8.798-1.223-17.686 1.516-24.27 7.48L67.24 132.54c4.085-8.923 3.57-19.276-1.38-27.75L102.16 72.12c7.109 5.256 16.174 7.109 24.776 5.064 8.601-2.045 15.862-7.78 19.844-15.674l31.31 8.54c-.566 8.612 2.604 17.051 8.7 23.16 1.738 1.73 3.679 3.245 5.78 4.51ZM220.71 84.71c-7.03 7.028-18.426 7.027-25.454-.003-7.029-7.029-7.029-18.425 0-25.454 7.029-7.029 18.424-7.031 25.454-.003 3.384 3.372 5.289 7.951 5.294 12.729 .006 4.777-1.888 9.361-5.264 12.741Z"),
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
        return _polygon!!
    }

private var _polygon: ImageVector? = null
