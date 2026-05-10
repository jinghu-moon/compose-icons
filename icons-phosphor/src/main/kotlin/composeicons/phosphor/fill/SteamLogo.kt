package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SteamLogo: ImageVector
    get() {
        if (_steamLogo != null) return _steamLogo!!
        _steamLogo = phosphorFillIcon(
            name = "SteamLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M231.92 132.11c-2.09 54-45.83 97.72-99.81 99.81C100.646 233.146 70.319 220.058 49.626 196.325 28.933 172.591 20.099 140.764 25.6 109.76c.274-1.461 1.336-2.649 2.757-3.085 1.421-.437 2.966-.049 4.013 1.005l43 43c-6.346 11.777-3.475 26.397 6.854 34.9 10.328 8.502 25.228 8.511 35.566 .02l61.1-49.84c10.548-8.716 15.244-22.658 12.117-35.98C187.879 86.459 177.47 76.062 164.145 72.951c-13.325-3.111-27.262 1.6-35.965 12.159L85.18 137.85 35 87.67c-1.213-1.212-1.519-3.062-.76-4.6C55.559 38.605 105.174 15.224 153.038 27.087c47.864 11.863 80.817 55.708 78.902 104.983ZM121.58 118.55 90.77 156.33c-1.633 1.932-2.604 4.336-2.77 6.86-.168 3.281 .995 6.491 3.226 8.902 2.231 2.412 5.34 3.821 8.624 3.908 2.838 .049 5.599-.924 7.78-2.74h0l37.78-30.81c-11.4-3.547-20.317-12.489-23.83-23.9ZM175.9 110c.845-8.413-3.691-16.448-11.331-20.071-7.64-3.623-16.732-2.05-22.711 3.929-5.979 5.979-7.552 15.071-3.929 22.711 3.623 7.64 11.658 12.176 20.071 11.331 9.464-.951 16.949-8.436 17.9-17.9Z"),
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
