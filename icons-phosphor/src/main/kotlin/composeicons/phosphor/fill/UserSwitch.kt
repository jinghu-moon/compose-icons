package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UserSwitch: ImageVector
    get() {
        if (_userSwitch != null) return _userSwitch!!
        _userSwitch = phosphorFillIcon(
            name = "UserSwitch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M84 120C84 95.699 103.699 76 128 76c24.301 0 44 19.699 44 44 0 24.301-19.699 44-44 44C103.699 164 84 144.301 84 120ZM210.16 177.18c-3.696-2.145-8.419-1.097-10.86 2.41-1.724 2.375-3.566 4.661-5.52 6.85C187.96 177.992 180.565 170.746 172 165.1c-1.501-.995-3.483-.864-4.84 .32-22.465 19.439-55.795 19.439-78.26 0-1.368-1.215-3.386-1.346-4.9-.32-8.566 5.636-15.965 12.871-21.79 21.31C49.717 172.381 42.06 154.709 40.37 136h15.4c2.627 .041 5.114-1.178 6.69-3.28 2.329-3.184 1.989-7.59-.8-10.38l-24-24C36.159 96.838 34.123 95.994 32 95.994c-2.123 0-4.159 .844-5.66 2.346l-24 24c-2.789 2.79-3.129 7.196-.8 10.38 1.576 2.102 4.063 3.321 6.69 3.28h16.07c3.352 43.569 33.582 80.396 75.662 92.174 42.081 11.778 87.036-4.005 112.518-39.504 1.297-1.806 1.784-4.071 1.344-6.251-.44-2.18-1.768-4.078-3.664-5.239ZM255.39 124.94C254.152 121.95 251.236 120.001 248 120h-16.3C228.348 76.431 198.118 39.604 156.038 27.826 113.957 16.048 69.002 31.831 43.52 67.33c-2.579 3.59-1.76 8.591 1.83 11.17 3.59 2.579 8.591 1.76 11.17-1.83C77.953 46.829 115.669 33.444 151.118 43.098c35.449 9.654 61.17 40.315 64.512 76.902h-15.63c-3.238-.003-6.158 1.947-7.397 4.938-1.239 2.991-.554 6.434 1.737 8.722l24 24c1.501 1.502 3.537 2.346 5.66 2.346 2.123 0 4.159-.844 5.66-2.346l24-24c2.287-2.289 2.97-5.731 1.73-8.72Z"),
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
        return _userSwitch!!
    }

private var _userSwitch: ImageVector? = null
