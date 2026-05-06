package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ShareNetwork: ImageVector
    get() {
        if (_shareNetwork != null) return _shareNetwork!!
        _shareNetwork = phosphorFillIcon(
            name = "ShareNetwork",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212 200c.002 14.363-8.534 27.353-21.719 33.051-13.185 5.698-28.495 3.013-38.954-6.832-10.459-9.844-14.066-24.964-9.176-38.469L89.15 153.7c-14.129 13.86-36.797 13.714-50.747-.326-13.95-14.04-13.95-36.708 0-50.748C52.353 88.586 75.021 88.44 89.15 102.3l53-34c-6.284-17.266 1.408-36.497 17.866-44.668 16.458-8.17 36.427-2.671 46.382 12.772 9.955 15.444 6.718 35.901-7.519 47.517C184.642 95.537 163.951 94.602 150.82 81.75L97.82 115.8c2.864 7.915 2.864 16.585 0 24.5l53 34.05c10.346-10.125 25.749-13.069 39.099-7.472 13.35 5.597 22.049 18.646 22.081 33.122Z"),
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
