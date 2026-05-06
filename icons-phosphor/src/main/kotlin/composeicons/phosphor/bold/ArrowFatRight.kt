package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowFatRight: ImageVector
    get() {
        if (_arrowFatRight != null) return _arrowFatRight!!
        _arrowFatRight = phosphorBoldIcon(
            name = "ArrowFatRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240.49 119.51l-96-96c-3.432-3.436-8.597-4.464-13.083-2.605C126.92 22.764 123.996 27.144 124 32v36h-76C36.954 68 28 76.954 28 88v80c0 11.046 8.954 20 20 20h76v36c-.004 4.856 2.92 9.236 7.407 11.095 4.487 1.859 9.651 .83 13.083-2.605l96-96c2.253-2.251 3.519-5.305 3.519-8.49 0-3.185-1.266-6.239-3.519-8.49ZM148 195v-19c0-6.627-5.373-12-12-12h-84v-72h84c6.627 0 12-5.373 12-12v-19l67 67Z"),
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
        return _arrowFatRight!!
    }

private var _arrowFatRight: ImageVector? = null
