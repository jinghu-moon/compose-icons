package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Rocket: ImageVector
    get() {
        if (_rocket != null) return _rocket!!
        _rocket = phosphorLightIcon(
            name = "Rocket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M150 224c0 3.314-2.686 6-6 6h-32c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h32c3.314 0 6 2.686 6 6ZM128 110c5.523 0 10-4.477 10-10 0-5.523-4.477-10-10-10-5.523 0-10 4.477-10 10 0 5.523 4.477 10 10 10ZM221.67 155.4 209.31 211c-1.037 4.7-4.415 8.537-8.946 10.162-4.53 1.624-9.577 .808-13.364-2.162L159.21 198h-62.39L69 219c-3.788 2.984-8.845 3.809-13.384 2.184C51.076 219.558 47.692 215.71 46.66 211L34.33 155.4c-.932-4.235 .141-8.663 2.91-12L66.24 108.64c.897-12.604 3.758-24.99 8.48-36.71 12.72-31.88 35.52-51.88 44.73-59 5.05-3.916 12.11-3.916 17.16 0 9.21 7.12 32 27.12 44.73 59 4.722 11.72 7.583 24.106 8.48 36.71l29 34.76c2.747 3.348 3.799 7.775 2.85 12ZM98.26 186h59.48c21.93-38.46 26.12-75.33 12.43-109.62C158.22 46.38 135.82 27.51 129.24 22.38c-.727-.574-1.753-.574-2.48 0-6.58 5.09-29 24-40.93 54C72.14 110.67 76.33 147.54 98.26 186ZM87 190.4C75 168.91 68.1 147.8 66.38 127.21L46.46 151.08c-.397 .474-.552 1.106-.42 1.71l12.37 55.64c.15 .674 .636 1.223 1.287 1.453 .651 .23 1.374 .108 1.913-.323l.13-.11ZM209.57 151.08 189.68 127.21c-1.72 20.59-8.6 41.7-20.62 63.19l25.23 19 .13 .11c.539 .43 1.263 .552 1.913 .323 .651-.23 1.137-.779 1.287-1.453L210 152.79c.121-.611-.049-1.243-.46-1.71Z"),
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
        return _rocket!!
    }

private var _rocket: ImageVector? = null
