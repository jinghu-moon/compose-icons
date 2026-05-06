package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Camera: ImageVector
    get() {
        if (_camera != null) return _camera!!
        _camera = phosphorBoldIcon(
            name = "Camera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 52h-25.58L170 33.34C167.771 29.998 164.017 27.994 160 28h-64c-4.017-.006-7.771 1.998-10 5.34L73.57 52h-25.57C32.536 52 20 64.536 20 80v112c0 15.464 12.536 28 28 28h160c15.464 0 28-12.536 28-28v-112C236 64.536 223.464 52 208 52ZM212 192c0 2.209-1.791 4-4 4h-160c-2.209 0-4-1.791-4-4v-112c0-2.209 1.791-4 4-4h32c4.017 .006 7.771-1.998 10-5.34L102.42 52h51.15L166 70.66c2.229 3.342 5.983 5.346 10 5.34h32c2.209 0 4 1.791 4 4ZM128 84c-26.51 0-48 21.49-48 48 0 26.51 21.49 48 48 48 26.51 0 48-21.49 48-48C175.972 105.502 154.498 84.028 128 84ZM128 156c-13.255 0-24-10.745-24-24 0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24Z"),
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
        return _camera!!
    }

private var _camera: ImageVector? = null
