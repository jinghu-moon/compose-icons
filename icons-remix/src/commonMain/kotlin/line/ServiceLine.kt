package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ServiceLine: ImageVector
    get() {
        if (_serviceLine != null) return _serviceLine!!
        _serviceLine = remixIcon(
            name = "ServiceLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.161 4.469 C 5.585 2.045 9.447 1.936 12.001 4.141 C 14.553 1.936 18.415 2.045 20.839 4.469 C 23.258 6.888 23.372 10.741 21.178 13.295 L 13.414 21.086 C 12.669 21.831 11.481 21.865 10.695 21.187 L 10.586 21.086 L 2.821 13.295 C 0.628 10.741 0.742 6.888 3.161 4.469 ZM 4.575 5.883 C 2.868 7.590 2.819 10.328 4.429 12.094 L 4.575 12.247 L 12.000 19.671 L 17.303 14.368 L 13.768 10.833 L 12.707 11.893 C 11.535 13.065 9.636 13.065 8.464 11.893 C 7.293 10.722 7.293 8.822 8.464 7.651 L 10.566 5.548 C 8.853 4.177 6.371 4.240 4.729 5.737 L 4.575 5.883 ZM 13.061 8.711 C 13.451 8.321 14.084 8.321 14.475 8.711 L 18.717 12.953 L 19.425 12.247 C 21.182 10.490 21.182 7.640 19.425 5.883 C 17.717 4.176 14.980 4.127 13.214 5.737 L 13.061 5.883 L 9.879 9.065 C 9.516 9.428 9.490 9.999 9.801 10.392 L 9.879 10.479 C 10.241 10.842 10.813 10.868 11.206 10.557 L 11.293 10.479 L 13.061 8.711 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _serviceLine!!
    }

private var _serviceLine: ImageVector? = null
