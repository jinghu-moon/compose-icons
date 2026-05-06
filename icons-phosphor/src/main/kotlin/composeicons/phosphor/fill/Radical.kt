package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Radical: ImageVector
    get() {
        if (_radical != null) return _radical!!
        _radical = phosphorFillIcon(
            name = "Radical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 32h-160C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM208 112c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-8h-66.58l-30 75c-1.213 3.04-4.157 5.034-7.43 5.034-3.273 0-6.217-1.994-7.43-5.034L48.56 99c-1.657-4.106 .329-8.778 4.435-10.435 4.106-1.657 8.778 .329 10.435 4.435L88 154.46 112.57 93c1.224-3.027 4.165-5.006 7.43-5h80c4.418 0 8 3.582 8 8Z"),
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
        return _radical!!
    }

private var _radical: ImageVector? = null
