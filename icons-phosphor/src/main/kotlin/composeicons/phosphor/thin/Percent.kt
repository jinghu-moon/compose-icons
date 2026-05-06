package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Percent: ImageVector
    get() {
        if (_percent != null) return _percent!!
        _percent = phosphorThinIcon(
            name = "Percent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M202.83 58.81l-144 144c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66l144-144c1-1.055 2.494-1.484 3.901-1.121 1.407 .363 2.507 1.461 2.873 2.868 .365 1.407-.061 2.901-1.114 3.903ZM53.37 98.62C42.579 87.822 40.918 70.905 49.403 58.214 57.888 45.524 74.155 40.593 88.258 46.439c14.102 5.845 22.112 20.838 19.131 35.81C104.408 97.221 91.266 108.002 76 108c-8.493 .019-16.641-3.359-22.63-9.38ZM52 76c.028 11.448 8.138 21.283 19.371 23.491 11.233 2.208 22.462-3.826 26.821-14.411 4.359-10.586 .634-22.777-8.897-29.119C79.764 49.618 67.081 50.891 59 59c-4.511 4.504-7.032 10.626-7 17ZM212 180c-.002 15.266-10.788 28.405-25.762 31.381-14.973 2.976-29.964-5.039-35.804-19.144-5.84-14.105-.904-30.371 11.791-38.851 12.694-8.48 29.611-6.812 40.405 3.984 6.018 5.991 9.391 14.139 9.37 22.63ZM204 180c-.028-11.448-8.138-21.283-19.371-23.491-11.233-2.208-22.462 3.826-26.821 14.411-4.359 10.586-.634 22.777 8.897 29.119 9.531 6.342 22.214 5.069 30.295-3.04 4.508-4.506 7.028-10.626 7-17Z"),
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
        return _percent!!
    }

private var _percent: ImageVector? = null
