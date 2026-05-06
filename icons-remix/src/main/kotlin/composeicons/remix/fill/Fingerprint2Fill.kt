package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Fingerprint2Fill: ImageVector
    get() {
        if (_fingerprint2Fill != null) return _fingerprint2Fill!!
        _fingerprint2Fill = remixIcon(
            name = "Fingerprint2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 1c4.971 0 9 4.029 9 9v4c0 3.038-1.506 5.725-3.811 7.355C17.716 19.663 18 17.865 18 16l-0-2.001h-2L16 16l-.003 .315c-.043 2.249-.551 4.385-1.431 6.316C13.752 22.871 12.891 23 12 23c-.341 0-.678-.019-1.01-.056C12.264 20.935 13 18.554 13 16v-7h-2v7l-.004 .288c-.059 2.301-.825 4.426-2.088 6.166C7.946 22.103 7.06 21.591 6.283 20.951 7.359 19.589 8 17.869 8 16v-6l.005-.2c.033-.667 .229-1.291 .549-1.833L7.109 6.523C6.411 7.504 6 8.704 6 10v6l-.004 .225c-.045 1.219-.453 2.345-1.121 3.272C3.699 17.976 3 16.07 3 14v-4C3 5.029 7.029 1 12 1ZM12 4C10.704 4 9.504 4.411 8.524 5.109L9.968 6.554C10.564 6.202 11.258 6 12 6c2.209 0 4 1.791 4 4v2h2v-2C18 6.686 15.314 4 12 4Z"),
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
        return _fingerprint2Fill!!
    }

private var _fingerprint2Fill: ImageVector? = null
