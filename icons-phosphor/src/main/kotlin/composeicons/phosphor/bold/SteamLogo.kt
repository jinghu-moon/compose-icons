package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SteamLogo: ImageVector
    get() {
        if (_steamLogo != null) return _steamLogo!!
        _steamLogo = phosphorBoldIcon(
            name = "SteamLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM178.16 142.22c11.586-9.867 16.569-25.453 12.856-40.212C187.304 87.25 175.538 75.877 160.662 72.667c-14.876-3.21-30.284 2.299-39.752 14.213L92.57 123.6 55.18 86.21C76.961 48.455 124.106 33.788 163.462 52.523c39.355 18.735 57.696 64.576 42.125 105.286-15.571 40.711-59.822 62.611-101.635 50.3C62.14 195.799 36.816 153.413 45.79 110.76l32.76 32.76c-5.706 13.501-1.51 29.153 10.184 37.989 11.694 8.836 27.897 8.598 39.326-.579ZM117 131.27c3.662 6.617 9.113 12.068 15.73 15.73l-19.43 15-.25 .2c-1.411 1.154-3.177 1.786-5 1.79-4.418 0-8-3.582-8-8-.007-1.84 .626-3.625 1.79-5.05l.2-.25ZM152 128c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16Z"),
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
