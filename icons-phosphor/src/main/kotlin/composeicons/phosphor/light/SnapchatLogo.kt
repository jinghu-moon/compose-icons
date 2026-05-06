package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SnapchatLogo: ImageVector
    get() {
        if (_snapchatLogo != null) return _snapchatLogo!!
        _snapchatLogo = phosphorLightIcon(
            name = "SnapchatLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M245.87 182.68c-.424-2.046-1.883-3.725-3.85-4.43-.4-.14-30.71-11.53-44.87-52.25l21.08-8.43c2.007-.785 3.438-2.586 3.75-4.718 .312-2.132-.543-4.268-2.24-5.595-1.697-1.328-3.976-1.643-5.97-.827l-20 8C191.176 103.139 189.911 91.584 190 80 190 45.758 162.242 18 128 18 93.758 18 66 45.758 66 80c.085 11.598-1.163 23.167-3.72 34.48l-20.05-8c-3.069-1.201-6.532 .298-7.757 3.357-1.225 3.059 .247 6.534 3.297 7.783L58.93 126C54.866 138.105 48.43 149.279 40 158.87 27.15 173.31 14.09 178.21 14 178.25c-1.957 .709-3.407 2.382-3.831 4.419-.424 2.038 .239 4.15 1.751 5.581 6.6 6.19 16.83 7.2 26.71 8.18 6.51 .64 13.23 1.31 17.16 3.47 3.76 2.07 7.36 7 10.85 11.79 5.21 7.13 11.11 15.22 20.12 17.53 8.5 2.16 17.09-.76 25.4-3.59 5.72-1.94 11.11-3.78 15.86-3.78 4.75 0 10.14 1.84 15.86 3.78 6.29 2.14 12.74 4.34 19.19 4.34 2.093 .007 4.179-.245 6.21-.75h0c9-2.3 14.91-10.39 20.12-17.52 3.49-4.78 7.09-9.72 10.85-11.79 3.93-2.16 10.65-2.83 17.16-3.47 9.88-1 20.11-2 26.71-8.18 1.512-1.431 2.174-3.542 1.75-5.58ZM216.21 184.52c-7.71 .76-15.68 1.55-21.76 4.9-6.08 3.35-10.5 9.39-14.77 15.22-4.27 5.83-8.56 11.74-13.39 13-5 1.28-11.61-1-18.57-3.32-6.38-2.17-13-4.42-19.72-4.42-6.72 0-13.34 2.25-19.72 4.42-7 2.37-13.53 4.6-18.57 3.32-4.83-1.24-9.18-7.2-13.39-13C72.11 198.84 67.65 192.76 61.55 189.41c-6.1-3.35-14-4.14-21.76-4.9-3.37-.33-6.79-.67-9.89-1.21 6.85-4.469 13.086-9.815 18.55-15.9 8.24-9.11 17.44-22.86 23.35-42.48 .031-.058 .058-.118 .08-.18 .167-.408 .285-.834 .35-1.27C76.188 109.323 78.13 94.689 78 80 78 52.386 100.386 30 128 30c27.614 0 50 22.386 50 50-.134 14.703 1.809 29.35 5.77 43.51 .064 .436 .181 .863 .35 1.27 .021 .059 .047 .116 .08 .17 5.91 19.63 15.11 33.38 23.35 42.49 5.464 6.085 11.7 11.431 18.55 15.9-3.1 .51-6.52 .85-9.89 1.18Z"),
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
