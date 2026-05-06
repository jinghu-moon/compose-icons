package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Butterfly: ImageVector
    get() {
        if (_butterfly != null) return _butterfly!!
        _butterfly = phosphorThinIcon(
            name = "Butterfly",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M229.5 52.94C224.89 47 218 44 208.93 44 183.07 44 147.65 72.73 132 101.28v-45.28c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v45.28C108.35 72.73 72.93 44 47.07 44c-9 0-16 3-20.57 8.94-11.1 14.26-6 42.25 .5 67.75 3.67 14.42 10.55 24.64 20.48 30.38 3.939 2.257 8.262 3.766 12.75 4.45-9.081 12.119-10.539 28.327-3.767 41.873 6.772 13.545 20.613 22.105 35.757 22.113 15.144 .008 28.994-8.537 35.78-22.075 6.778 13.55 20.63 22.108 35.781 22.105 15.151-.003 29-8.565 35.773-22.118 6.773-13.553 5.308-29.769-3.784-41.888 4.489-.688 8.811-2.2 12.75-4.46 9.93-5.74 16.81-16 20.48-30.38 6.47-25.5 11.6-53.49 .5-67.75ZM92 212C75.087 211.819 61.213 198.553 60.274 181.666 59.334 164.778 71.652 150.056 88.44 148c2.209-.243 3.803-2.231 3.56-4.44-.243-2.209-2.231-3.803-4.44-3.56-7.201 .809-14.042 3.576-19.78 8-22.8 1.24-30.68-20-33-29.24C29.13 96.52 23.78 69.5 32.83 57.89 35.87 53.91 40.54 52 47.07 52 76.55 52 124 98.68 124 127.67v52.33c0 17.673-14.327 32-32 32ZM221.24 118.72c-2.34 9.22-10.22 30.47-33 29.24-5.749-4.412-12.597-7.165-19.8-7.96-2.209-.243-4.197 1.351-4.44 3.56-.243 2.209 1.351 4.197 3.56 4.44 17.167 1.861 29.785 16.969 28.559 34.193-1.227 17.224-15.859 30.391-33.116 29.801C145.745 211.404 132.047 197.267 132 180v-52.33C132 98.67 179.45 52 208.93 52c6.53 0 11.2 1.91 14.26 5.85 9.03 11.61 3.7 38.63-1.95 60.87Z"),
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
