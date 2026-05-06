package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.AppleLogo: ImageVector
    get() {
        if (_appleLogo != null) return _appleLogo!!
        _appleLogo = phosphorRegularIcon(
            name = "AppleLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M223.3 169.59c-.6-1.371-1.569-2.548-2.8-3.4C203.53 154.53 200 134.64 200 120c0-17.67 13.47-33.06 21.5-40.67 1.596-1.511 2.501-3.612 2.501-5.81 0-2.198-.904-4.299-2.501-5.81C208.82 55.74 187.82 48 168 48c-14.238 .011-28.154 4.231-40 12.13C99.496 41.016 61.435 44.83 37.29 69.22 23.152 83.654 15.47 103.203 16 123.4c.8 34.084 15.263 66.417 40.14 89.73 7.418 7.009 17.245 10.9 27.45 10.87h87.68c11.028 .021 21.571-4.53 29.12-12.57 6.918-7.445 12.902-15.706 17.82-24.6C225.23 174 224.33 172 223.3 169.59ZM188.67 200.53c-4.514 4.793-10.815 7.499-17.4 7.47h-87.68c-6.112 .02-11.998-2.311-16.44-6.51C45.375 181.104 32.709 152.82 32 123 31.558 107.153 37.567 91.805 48.65 80.47 59.004 69.892 73.197 63.951 88 64h.78c12.463 .131 24.518 4.457 34.22 12.28 2.923 2.34 7.077 2.34 10 0C142.911 68.29 155.269 63.953 168 64c12.713 .148 25.15 3.723 36 10.35C191 88.87 184 104.82 184 120c0 23.77 7.64 42.73 22.18 55.3-4.579 9.217-10.478 17.716-17.51 25.23ZM128.23 30C132.794 12.325 148.745-.018 167 0h1c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-1c-10.945-.001-20.504 7.403-23.24 18-1.105 4.28-5.47 6.855-9.75 5.75C129.73 38.645 127.155 34.28 128.26 30Z"),
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
        return _appleLogo!!
    }

private var _appleLogo: ImageVector? = null
