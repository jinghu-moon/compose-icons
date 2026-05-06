package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SteamLogo: ImageVector
    get() {
        if (_steamLogo != null) return _steamLogo!!
        _steamLogo = phosphorLightIcon(
            name = "SteamLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM116.38 184.17l61.21-49.93c10.073-8.191 14.602-21.402 11.673-34.05C186.334 87.542 176.458 77.666 163.81 74.737c-12.648-2.929-25.859 1.6-34.05 11.673L85.33 140.85 43 98.49C58.811 53.01 107.729 28.148 153.788 42.184c46.058 14.036 72.798 61.954 60.558 108.522-12.24 46.568-59.086 75.145-106.093 64.719C61.245 204.999 30.874 159.296 39.47 111.92l38.44 38.44c-6.603 10.788-4.485 24.763 5.019 33.11 9.504 8.346 23.636 8.642 33.481 .7ZM122.57 114.17c2.588 13.837 13.413 24.662 27.25 27.25L125.82 161C124.426 149.022 114.978 139.574 103 138.18ZM156 130c-12.15 0-22-9.85-22-22 0-12.15 9.85-22 22-22 12.15 0 22 9.85 22 22 0 12.15-9.85 22-22 22ZM100 150c7.732 0 14 6.268 14 14 0 7.732-6.268 14-14 14-7.732 0-14-6.268-14-14 0-7.732 6.268-14 14-14Z"),
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
