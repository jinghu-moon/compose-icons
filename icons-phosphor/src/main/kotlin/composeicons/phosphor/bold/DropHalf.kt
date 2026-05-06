package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DropHalf: ImageVector
    get() {
        if (_dropHalf != null) return _dropHalf!!
        _dropHalf = phosphorBoldIcon(
            name = "DropHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M134.88 6.17c-4.131-2.891-9.629-2.891-13.76 0C105.657 17.566 91.51 30.646 78.94 45.17 50.85 77.43 36 111.63 36 144c0 50.81 41.19 92 92 92 50.81 0 92-41.19 92-92C220 66.64 138.36 8.6 134.88 6.17ZM194.08 160h-54.08v-16h56c-.004 5.391-.648 10.762-1.92 16ZM140 120v-16h47c2.285 5.186 4.183 10.534 5.68 16ZM159.3 61.29c5.162 5.944 9.964 12.192 14.38 18.71h-33.68v-38.54c6.804 6.239 13.248 12.86 19.3 19.83ZM60 144C60 110.69 80 80.63 96.7 61.29 102.752 54.32 109.196 47.699 116 41.46v169.46C83.617 205.073 60.047 176.907 60 144ZM140 210.92v-26.92h42.94C172.63 198.171 157.247 207.815 140 210.92Z"),
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
        return _dropHalf!!
    }

private var _dropHalf: ImageVector? = null
