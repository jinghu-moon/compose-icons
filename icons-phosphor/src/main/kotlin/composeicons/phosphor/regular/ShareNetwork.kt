package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ShareNetwork: ImageVector
    get() {
        if (_shareNetwork != null) return _shareNetwork!!
        _shareNetwork = phosphorRegularIcon(
            name = "ShareNetwork",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 160c-10.782-.003-21.106 4.358-28.62 12.09L101.28 142.46c3.626-9.299 3.626-19.621 0-28.92L147.38 83.91c14.345 14.694 37.486 16.139 53.547 3.343 16.061-12.795 19.824-35.674 8.707-52.94C198.517 17.048 176.133 11.005 157.837 20.331c-18.295 9.325-26.557 30.99-19.117 50.129L92.62 100.09C81.265 88.432 63.978 84.816 48.902 90.945 33.826 97.074 23.966 111.726 23.966 128c0 16.274 9.86 30.926 24.936 37.055 15.076 6.129 32.362 2.513 43.718-9.145l46.1 29.63c-6.339 16.35-1.29 34.923 12.455 45.813 13.745 10.89 32.98 11.557 47.447 1.646 14.467-9.911 20.791-28.089 15.6-44.839C209.032 171.41 193.536 159.993 176 160ZM176 32c13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24C162.745 80 152 69.255 152 56c0-13.255 10.745-24 24-24ZM64 152C50.745 152 40 141.255 40 128c0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24ZM176 224c-13.255 0-24-10.745-24-24 0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24Z"),
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
        return _shareNetwork!!
    }

private var _shareNetwork: ImageVector? = null
