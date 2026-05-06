package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Bridge: ImageVector
    get() {
        if (_bridge != null) return _bridge!!
        _bridge = phosphorThinIcon(
            name = "Bridge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 164h-36v-75.91c7.499 14.067 19.714 25.043 34.5 31 2.049 .828 4.382-.161 5.21-2.21 .828-2.049-.161-4.382-2.21-5.21C210.777 102.547 195.917 80.486 196 56c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4 0 33.137-26.863 60-60 60C94.863 116 68 89.137 68 56c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4 .071 24.475-14.787 46.521-37.5 55.64-2.049 .828-3.038 3.161-2.21 5.21 .828 2.049 3.161 3.038 5.21 2.21C40.286 113.103 52.501 102.127 60 88.06v75.94h-36c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h36v28c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-28h120v28c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-28h36c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM148 121v43h-40v-43c13.032 4.01 26.968 4.01 40 0ZM68 88c7.086 13.24 18.33 23.782 32 30v46h-32ZM156 164v-46c13.67-6.218 24.914-16.76 32-30v76Z"),
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
        return _bridge!!
    }

private var _bridge: ImageVector? = null
