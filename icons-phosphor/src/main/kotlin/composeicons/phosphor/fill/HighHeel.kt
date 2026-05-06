package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HighHeel: ImageVector
    get() {
        if (_highHeel != null) return _highHeel!!
        _highHeel = phosphorFillIcon(
            name = "HighHeel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M32 144c12.9-.01 25.668 2.599 37.53 7.67 1.496 .62 2.472 2.08 2.47 3.7v36.63c0 8.837-7.163 16-16 16h-16c-8.837 0-16-7.163-16-16v-44c0-2.209 1.791-4 4-4ZM231 156.19 180 144.71 69.66 34.34C68.116 32.796 66.007 31.951 63.824 32c-2.183 .049-4.251 .988-5.724 2.6C36.11 58.64 24 89 24 120c0 4.418 3.582 8 8 8 22.626-.03 44.723 6.842 63.34 19.7 18.16 12.463 32.26 29.985 40.55 50.39 2.451 6.026 8.325 9.951 14.83 9.91h89.28c8.837 0 16-7.163 16-16v-4.73c.038-14.959-10.381-27.911-25-31.08Z"),
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
        return _highHeel!!
    }

private var _highHeel: ImageVector? = null
