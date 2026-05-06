package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.RedditLogo: ImageVector
    get() {
        if (_redditLogo != null) return _redditLogo!!
        _redditLogo = phosphorDuotoneIcon(
            name = "RedditLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228.21 124.67h0c2.493 6.14 3.78 12.703 3.79 19.33 0 39.76-46.56 72-104 72C70.56 216 24 183.76 24 144c.01-6.627 1.297-13.19 3.79-19.33h0C19.402 119.705 14.851 110.16 16.272 100.517 17.694 90.874 24.806 83.049 34.27 80.715c9.464-2.334 19.399 1.288 25.14 9.165h0C77.72 78.75 101.72 72 128 72c26.28 0 50.28 6.75 68.59 17.88h0c5.742-7.876 15.677-11.498 25.14-9.165 9.464 2.334 16.576 10.159 17.997 19.802 1.422 9.643-3.13 19.188-11.518 24.153Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M248 104C247.997 91.477 240.689 80.107 229.299 74.902c-11.39-5.205-24.77-3.287-34.239 4.908C178.31 70.91 158.3 65.53 137.4 64.28l5.19-31.17 17.72 2.72c1.856 11.541 11.757 20.066 23.445 20.188 11.688 .122 21.765-8.194 23.861-19.694C209.713 24.825 203.22 13.487 192.241 9.476 181.262 5.465 168.99 9.947 163.18 20.09l-26-4c-4.329-.667-8.389 2.27-9.11 6.59l-6.87 41.48C99.36 65.1 78.38 70.54 60.94 79.81 47.696 68.622 27.952 70.015 16.411 82.952 4.87 95.889 5.729 115.664 18.35 127.55 16.795 132.895 16.003 138.433 16 144c0 21.93 12 42.35 33.91 57.49C70.88 216 98.61 224 128 224c29.39 0 57.12-8 78.09-22.51C228 186.35 240 165.93 240 144c-.003-5.567-.795-11.105-2.35-16.45C244.226 121.482 247.976 112.948 248 104ZM184 24c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8ZM224.13 117.78c-3.444 2.041-4.85 6.313-3.29 10 2.077 5.156 3.15 10.661 3.16 16.22 0 16.53-9.59 32.27-27 44.33C178.67 201 154.17 208 128 208c-26.17 0-50.67-7-69-19.67C41.59 176.27 32 160.53 32 144c.013-5.54 1.079-11.027 3.14-16.17 1.563-3.682 .167-7.953-3.27-10-5.567-3.319-8.582-9.668-7.635-16.08 .947-6.412 5.668-11.619 11.956-13.187 6.288-1.569 12.902 .811 16.749 6.027 2.452 3.365 7.075 4.287 10.63 2.12l.18-.11C81.45 85.9 104.25 80 128 80h0c23.73 0 46.53 5.9 64.23 16.6l.18 .11c3.555 2.167 8.178 1.245 10.63-2.12 3.824-5.26 10.452-7.682 16.767-6.127 6.315 1.555 11.06 6.778 12.005 13.212 .944 6.435-2.1 12.801-7.702 16.105ZM88 144c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM184 128c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM167.07 172.25c.995 1.875 1.205 4.069 .582 6.098-.623 2.029-2.026 3.728-3.902 4.722-22.353 11.879-49.147 11.879-71.5 0-3.905-2.071-5.391-6.915-3.32-10.82 2.071-3.905 6.915-5.391 10.82-3.32 17.663 9.39 38.837 9.39 56.5 0 1.875-.995 4.069-1.205 6.098-.582 2.029 .623 3.728 2.026 4.722 3.902Z"),
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
        return _redditLogo!!
    }

private var _redditLogo: ImageVector? = null
