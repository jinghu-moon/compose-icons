package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Binoculars: ImageVector
    get() {
        if (_binoculars != null) return _binoculars!!
        _binoculars = phosphorLightIcon(
            name = "Binoculars",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M233 147.24 191.43 52.6c-.299-.682-.723-1.303-1.25-1.83-11.715-11.711-30.705-11.711-42.42 0C146.637 51.892 146.004 53.413 146 55v27h-36v-27c.001-1.594-.632-3.123-1.76-4.25C96.525 39.039 77.535 39.039 65.82 50.75c-.527 .527-.951 1.148-1.25 1.83L23 147.24c-8.638 16.982-5.914 37.531 6.851 51.675 12.765 14.144 32.928 18.956 50.704 12.099C98.331 204.158 110.04 187.053 110 168v-74h36v74c-.04 19.053 11.669 36.158 29.445 43.014 17.776 6.857 37.939 2.045 50.704-12.099 12.765-14.144 15.489-34.694 6.851-51.675ZM64 202C45.222 202 30 186.778 30 168c0-18.778 15.222-34 34-34 18.778 0 34 15.222 34 34 0 18.778-15.222 34-34 34ZM64 122c-6.389-.002-12.708 1.333-18.55 3.92L75.06 58.54C81.515 52.791 91.146 52.442 98 57.71v79.29C89.289 127.43 76.941 121.982 64 122ZM158 57.72c6.854-5.268 16.485-4.919 22.94 .83l29.61 67.37C192.475 117.911 171.303 122.375 158 137ZM192 202c-18.778 0-34-15.222-34-34 0-18.778 15.222-34 34-34 18.778 0 34 15.222 34 34 0 18.778-15.222 34-34 34Z"),
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
        return _binoculars!!
    }

private var _binoculars: ImageVector? = null
