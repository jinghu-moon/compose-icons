package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Butterfly: ImageVector
    get() {
        if (_butterfly != null) return _butterfly!!
        _butterfly = phosphorBoldIcon(
            name = "Butterfly",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.79 48C231.52 42.52 223.39 36 208.91 36c-17.86 0-40.5 11.7-60.57 31.3-3 2.89-5.74 5.85-8.34 8.84v-20.14c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v20.14c-2.6-3-5.38-6-8.34-8.84C87.59 47.7 65 36 47.09 36 32.61 36 24.48 42.54 20.21 48 7 65 12 93.91 19.28 122.66c5.75 22.64 17.8 33 28.88 37.69-6.6 14.862-5.247 32.053 3.596 45.699C60.6 219.696 75.738 227.953 92 228c13.784 .01 26.904-5.923 36-16.28 13.201 14.968 34.286 20.206 52.957 13.156C199.628 217.826 211.988 199.958 212 180c.006-6.767-1.405-13.46-4.14-19.65 11.08-4.67 23.13-15 28.88-37.69C244 93.91 249 65 235.79 48ZM92 204C78.745 204 68 193.255 68 180c.049-12.237 9.169-22.538 21.31-24.07 6.589-.729 11.339-6.661 10.61-13.25-.729-6.589-6.661-11.339-13.25-10.61-7.705 .854-15.085 3.576-21.5 7.93-8.19-.29-18-4.92-22.63-23.24C35.13 87.58 33.99 69.41 39.15 62.76 39.74 62 41.3 60 47.09 60c11.21 0 28.82 9.83 43.81 24.47C106.15 99.37 116 116.33 116 127.67v52.33c0 13.255-10.745 24-24 24ZM213.45 116.75C208.81 135.07 199 139.7 190.82 140c-6.417-4.355-13.801-7.074-21.51-7.92-6.589-.729-12.521 4.021-13.25 10.61-.729 6.589 4.021 12.521 10.61 13.25 12.145 1.522 21.274 11.82 21.33 24.06 0 13.255-10.745 24-24 24-13.255 0-24-10.745-24-24v-52.33c0-11.34 9.85-28.3 25.1-43.2C180.09 69.83 197.7 60 208.91 60c5.79 0 7.35 2 7.94 2.76 5.15 6.64 4.02 24.81-3.39 53.99Z"),
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
        return _butterfly!!
    }

private var _butterfly: ImageVector? = null
