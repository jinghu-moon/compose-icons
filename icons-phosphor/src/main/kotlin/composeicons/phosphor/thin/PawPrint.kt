package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PawPrint: ImageVector
    get() {
        if (_pawPrint != null) return _pawPrint!!
        _pawPrint = phosphorThinIcon(
            name = "PawPrint",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212 84c-13.255 0-24 10.745-24 24 0 13.255 10.745 24 24 24 13.255 0 24-10.745 24-24C236 94.745 225.255 84 212 84ZM212 124c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM68 108C68 94.745 57.255 84 44 84 30.745 84 20 94.745 20 108c0 13.255 10.745 24 24 24 13.255 0 24-10.745 24-24ZM44 124c-8.837 0-16-7.163-16-16C28 99.163 35.163 92 44 92c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM92 84c13.255 0 24-10.745 24-24C116 46.745 105.255 36 92 36 78.745 36 68 46.745 68 60c0 13.255 10.745 24 24 24ZM92 44c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16C83.163 76 76 68.837 76 60 76 51.163 83.163 44 92 44ZM164 84c13.255 0 24-10.745 24-24C188 46.745 177.255 36 164 36c-13.255 0-24 10.745-24 24 0 13.255 10.745 24 24 24ZM164 44c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16ZM185.18 152.36c-9.128-5.041-15.879-13.501-18.77-23.52C161.444 111.756 145.791 100.006 128 100.006c-17.791 0-33.444 11.751-38.41 28.834-2.881 10.009-9.618 18.465-18.73 23.51-16.866 9.155-23.586 29.931-15.276 47.228 8.31 17.298 28.728 25.036 46.416 17.592 16.637-6.86 35.313-6.86 51.95 0 17.696 7.549 38.201-.151 46.554-17.482 8.354-17.331 1.604-38.167-15.324-47.308ZM168 212c-3.78 .012-7.523-.747-11-2.23-18.609-7.68-39.501-7.68-58.11 0C95.448 211.241 91.743 212 88 212c-12.828 .004-24.018-8.709-27.158-21.147-3.14-12.438 2.575-25.418 13.868-31.503 10.977-6.061 19.094-16.239 22.56-28.29 3.971-13.671 16.495-23.074 30.73-23.074 14.235 0 26.759 9.404 30.73 23.074 3.477 12.06 11.608 22.242 22.6 28.3 11.289 6.093 16.993 19.078 13.844 31.513C192.025 203.309 180.828 212.014 168 212Z"),
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
        return _pawPrint!!
    }

private var _pawPrint: ImageVector? = null
