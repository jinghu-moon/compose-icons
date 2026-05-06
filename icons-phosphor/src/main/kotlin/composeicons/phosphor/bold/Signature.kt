package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Signature: ImageVector
    get() {
        if (_signature != null) return _signature!!
        _signature = phosphorBoldIcon(
            name = "Signature",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 164h-161.62c2.2-4.42 4.41-8.94 6.59-13.52l.79-1.66c13.52-1.65 28.69-11.3 45.38-28.87 5.31 12 14 24.73 27.59 27.29 5.26 1 13.51 .79 22.93-5.82 3.266-2.318 6.282-4.969 9-7.91C190.9 141.2 205.68 148 232 148c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12-31 0-35.42-10.49-36-12.38 .49-5.37-2.75-9.76-7.88-11.63-5.13-1.87-11.17 .78-14.22 5.46-10 15.32-16.62 18.62-18.75 18.21-4.88-.91-12.39-15.54-15.44-30.09-.958-4.548-4.456-8.133-8.979-9.203-4.523-1.07-9.256 .567-12.151 4.203-10.3 12.92-19.16 21.79-26.47 27.56 21.19-52.94 17-72.22 11.37-82.25C98.48 24.91 89.41 20 78 20 59.92 20 45.36 36.55 39 64.26c-3.45 15.1-4 31.81-1.46 45.85 2.65 14.71 8.36 25.7 16.68 32.23C50.69 149.78 47 157.06 43.47 164h-19.47c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h6.7C21 205.67 13.85 217.6 13.7 217.81c-2.243 3.674-2.347 8.268-.271 12.04 2.076 3.771 6.013 6.142 10.317 6.212 4.304 .07 8.316-2.17 10.514-5.872C34.91 229.15 45.23 212 58 188h174c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM62.43 69.6C65.77 55 72.45 44 78 44c3.71 0 4.29 1 4.64 1.64 1.43 2.53 6.55 17.07-17.44 72.78-1.948-3.966-3.296-8.198-4-12.56C59.23 94.89 59.68 81.67 62.43 69.6Z"),
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
        return _signature!!
    }

private var _signature: ImageVector? = null
