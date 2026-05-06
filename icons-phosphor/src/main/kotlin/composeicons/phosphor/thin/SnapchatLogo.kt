package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SnapchatLogo: ImageVector
    get() {
        if (_snapchatLogo != null) return _snapchatLogo!!
        _snapchatLogo = phosphorThinIcon(
            name = "SnapchatLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M243.92 183.1c-.267-1.38-1.239-2.519-2.56-3-.13 0-13.52-5-26.69-19.76-9.057-10.333-15.867-22.436-20-35.54l22.83-9.13c2.049-.828 3.038-3.161 2.21-5.21-.828-2.049-3.161-3.038-5.21-2.21l-22.08 8.83C189.406 104.953 187.921 92.496 188 80 188 46.863 161.137 20 128 20 94.863 20 68 46.863 68 80c.077 12.52-1.411 25-4.43 37.15L41.49 108.32c-2.049-.828-4.382 .161-5.21 2.21-.828 2.049 .161 4.382 2.21 5.21l22.82 9.13c-4.132 13.104-10.943 25.207-20 35.54C28.13 175.14 14.75 180.12 14.62 180.17c-1.311 .47-2.283 1.587-2.567 2.951-.284 1.363 .162 2.776 1.177 3.729 6.12 5.73 16 6.71 25.55 7.65 6.7 .67 13.64 1.35 17.92 3.71 4.28 2.36 7.73 7.18 11.51 12.36 5.25 7.2 10.69 14.65 19 16.77 7.92 2 16.23-.8 24.26-3.54 5.88-2 11.43-3.89 16.5-3.89 5.07 0 10.63 1.89 16.5 3.89 6.13 2.09 12.42 4.23 18.57 4.23 1.921 .01 3.836-.222 5.7-.69h0c8.31-2.12 13.74-9.57 19-16.77 3.79-5.18 7.36-10.08 11.51-12.36 4.15-2.28 11.22-3 17.93-3.71 9.55-.94 19.43-1.92 25.54-7.65 1.03-.953 1.485-2.376 1.2-3.75ZM216.41 186.51c-7.51 .75-15.27 1.51-21 4.66-5.73 3.15-10 9-14.12 14.66-4.62 6.33-9 12.32-14.51 13.73-5.51 1.41-12.46-.89-19.71-3.36-6.23-2.12-12.68-4.32-19.08-4.32-6.4 0-12.84 2.2-19.08 4.32-7.24 2.47-14.09 4.8-19.7 3.36-5.61-1.44-9.89-7.4-14.52-13.73C70.56 200.17 66.28 194.31 60.58 191.17c-5.7-3.14-13.49-3.91-21-4.66-5.26-.52-10.63-1-14.91-2.37C33.03 179.352 40.569 173.254 47 166.08c8.1-9 17.14-22.5 23-41.85 .006-.077 .006-.153 0-.23 .114-.293 .191-.598 .23-.91C74.18 109.071 76.122 94.564 76 80 76 51.281 99.281 28 128 28c28.719 0 52 23.281 52 52-.136 14.576 1.797 29.097 5.74 43.13 .038 .313 .118 .619 .24 .91 0 .08 .07 .14 .1 .22 5.81 19.35 14.86 32.88 23 41.85 6.412 7.169 13.931 13.266 22.27 18.06-4.35 1.29-9.68 1.83-14.94 2.34Z"),
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
        return _snapchatLogo!!
    }

private var _snapchatLogo: ImageVector? = null
