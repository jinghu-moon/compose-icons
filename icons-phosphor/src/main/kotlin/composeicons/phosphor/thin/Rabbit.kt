package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Rabbit: ImageVector
    get() {
        if (_rabbit != null) return _rabbit!!
        _rabbit = phosphorThinIcon(
            name = "Rabbit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M108 164c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM156 156c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM212 188c0 19.963-12.355 37.842-31.029 44.901-18.674 7.058-39.767 1.822-52.971-13.151-11.875 13.326-30.164 18.962-47.481 14.632C63.203 230.052 49.72 216.471 45.515 199.124c-4.205-17.347 1.563-35.595 14.975-47.374 .967-7.948 3.337-15.661 7-22.78C48.85 92.61 36.63 41.7 49.06 21.15 52.296 15.381 58.447 11.863 65.06 12c12.17 0 23.19 11.41 32.76 33.92 6.71 15.78 11.55 34.08 14.63 47.87 10.229-2.387 20.871-2.387 31.1 0 3.08-13.8 7.92-32.09 14.63-47.87C167.75 23.41 178.77 12 190.94 12c6.613-.137 12.764 3.381 16 9.15 12.43 20.55 .21 71.46-18.4 107.86 3.663 7.119 6.033 14.832 7 22.78 10.485 9.106 16.493 22.322 16.46 36.21ZM151.23 96.1c8.368 3.036 16.057 7.687 22.63 13.69 3.649 3.342 6.928 7.067 9.78 11.11C201.52 83.83 209.23 40.4 200.09 25.29 198.313 21.912 194.754 19.854 190.94 20c-14.4 0-29.16 28.37-39.71 76.1ZM72.36 120.9c2.852-4.043 6.131-7.768 9.78-11.11 6.573-6.003 14.262-10.654 22.63-13.69C94.22 48.37 79.46 20 65.06 20c-3.814-.146-7.373 1.912-9.15 5.29-9.14 15.11-1.43 58.54 16.45 95.61ZM204 188c.02-12.069-5.429-23.498-14.82-31.08-.831-.675-1.357-1.654-1.46-2.72C184.739 123.45 158.895 99.99 128 99.99c-30.895 0-56.739 23.46-59.72 54.21-.103 1.066-.629 2.045-1.46 2.72-11.801 9.549-17.179 24.955-13.885 39.774 3.294 14.819 14.692 26.496 29.427 30.147 14.735 3.651 30.266-1.354 40.098-12.921l-13-10.82c-1.701-1.414-1.934-3.939-.52-5.64 1.414-1.701 3.939-1.934 5.64-.52L128 208.1l13.44-11.18c1.701-1.414 4.226-1.181 5.64 .52 1.414 1.701 1.181 4.226-.52 5.64l-13 10.82c10.866 12.746 28.523 17.373 44.244 11.593C193.525 219.712 203.979 204.75 204 188Z"),
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
        return _rabbit!!
    }

private var _rabbit: ImageVector? = null
