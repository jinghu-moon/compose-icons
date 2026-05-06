package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CloudSnow: ImageVector
    get() {
        if (_cloudSnow != null) return _cloudSnow!!
        _cloudSnow = phosphorBoldIcon(
            name = "CloudSnow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 208c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM120 192c-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16ZM72 192c-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16ZM236 92c-.05 44.162-35.838 79.95-80 80h-80C45.072 172 20 146.928 20 116 20 85.072 45.072 60 76 60c2.135-0 4.268 .12 6.39 .36C97.43 25.496 134.886 5.986 172.075 13.646 209.265 21.306 235.962 54.03 236 92ZM212 92C211.817 61.816 187.768 37.196 157.597 36.305 127.426 35.413 101.965 58.57 100 88.69 99.619 95.317 93.937 100.381 87.31 100 80.683 99.619 75.619 93.937 76 87.31c.06-1.11 .15-2.21 .26-3.31h-.26C58.327 84 44 98.327 44 116c0 17.673 14.327 32 32 32h80c30.914-.033 55.967-25.086 56-56Z"),
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
        return _cloudSnow!!
    }

private var _cloudSnow: ImageVector? = null
