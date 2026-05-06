package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MetaLogo: ImageVector
    get() {
        if (_metaLogo != null) return _metaLogo!!
        _metaLogo = phosphorThinIcon(
            name = "MetaLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236 149.31c0 15.38-3 28.45-8.6 37.78-6.67 11.06-17 16.91-30 16.91-25.55 0-44.83-36-65.25-74.11C113.78 95.53 94.74 60 74 60 62.9 60 51.3 70.53 42.16 88.89 33.05 107.742 28.215 128.373 28 149.31c0 13.93 2.58 25.56 7.45 33.65 5.22 8.65 13 13 23.11 13 17.15 0 33.07-24.32 47.73-50.6 1.077-1.933 3.517-2.627 5.45-1.55 1.933 1.077 2.627 3.517 1.55 5.45C98.52 175.76 80.9 204 58.56 204 45.63 204 35.27 198.15 28.56 187.09 23 177.76 20 164.69 20 149.31c.231-22.177 5.352-44.03 15-64C45.69 63.83 59.54 52 74 52c25.54 0 44.83 36 65.25 74.11C157.66 160.47 176.69 196 197.45 196c10.12 0 17.89-4.39 23.11-13 4.87-8.09 7.45-19.72 7.45-33.65-.215-20.937-5.05-41.568-14.16-60.42C204.7 70.53 193.1 60 182 60c-9.75 0-20.15 8-31.78 24.57-1.299 1.724-3.731 2.106-5.496 .865-1.765-1.242-2.227-3.66-1.044-5.465 13.42-19.08 25.6-28 38.32-28 14.45 0 28.3 11.83 39 33.32 9.65 19.976 14.772 41.836 15 64.02Z"),
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
        return _metaLogo!!
    }

private var _metaLogo: ImageVector? = null
