package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SteamLogo: ImageVector
    get() {
        if (_steamLogo != null) return _steamLogo!!
        _steamLogo = phosphorThinIcon(
            name = "SteamLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM115.12 182.62l61.21-49.93c9.528-7.693 13.83-20.148 11.081-32.081-2.749-11.933-12.067-21.251-24-24-11.933-2.749-24.389 1.553-32.081 11.081L85.48 143.83 40.68 99C56.361 51.846 106.78 25.795 154.314 40.287c47.533 14.492 74.842 64.242 61.547 112.124-13.295 47.882-62.343 76.431-110.544 64.343C57.117 204.665 27.345 156.349 38.22 107.86l42.23 42.23c-6.879 9.781-5.508 23.134 3.215 31.313 8.723 8.179 22.136 8.69 31.455 1.197ZM124.03 109.22c.626 16.722 14.029 30.138 30.75 30.78L124 165.09c0-.36 0-.72 0-1.09 0-13.255-10.745-24-24-24-.37 0-.73 0-1.09 0ZM156 132c-13.255 0-24-10.745-24-24 0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24ZM100 148c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16Z"),
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
        return _steamLogo!!
    }

private var _steamLogo: ImageVector? = null
