package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CameraSlash: ImageVector
    get() {
        if (_cameraSlash != null) return _cameraSlash!!
        _cameraSlash = phosphorBoldIcon(
            name = "CameraSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M56.88 31.93C54.012 28.697 49.628 27.256 45.401 28.157c-4.226 .901-7.642 4.005-8.942 8.126-1.3 4.121-.284 8.623 2.661 11.786l4 4.37C29.751 54.806 20.006 66.423 20 80v112c0 15.464 12.536 28 28 28h147.42l3.7 4.07c4.478 4.81 11.991 5.124 16.854 .704 4.863-4.42 5.267-11.928 .906-16.844ZM106.23 121.93 136 154.64c-9.111 3.226-19.269 .672-25.77-6.48-6.501-7.152-8.078-17.507-4-26.27ZM48 196c-2.209 0-4-1.791-4-4v-112c0-2.209 1.791-4 4-4h16.51l24.92 27.41c-13.618 18.414-12.33 43.884 3.076 60.831 15.407 16.946 40.639 20.647 60.264 8.839L173.6 196ZM236 80v94.14c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-94.14c0-2.209-1.791-4-4-4h-32c-4.017 .006-7.771-1.998-10-5.34L153.57 52h-51.51c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h57.94c4.017-.006 7.771 1.998 10 5.34L182.42 52h25.58c15.464 0 28 12.536 28 28Z"),
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
        return _cameraSlash!!
    }

private var _cameraSlash: ImageVector? = null
