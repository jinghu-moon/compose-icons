package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ScissorsFill: ImageVector
    get() {
        if (_scissorsFill != null) return _scissorsFill!!
        _scissorsFill = remixIcon(
            name = "ScissorsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.683 7.559 L 12.000 9.875 L 18.374 3.501 C 19.155 2.720 20.422 2.720 21.203 3.501 L 21.910 4.208 L 9.683 16.435 C 9.887 16.914 10.000 17.442 10.000 17.997 C 10.000 20.206 8.209 21.997 6.000 21.997 C 3.791 21.997 2.000 20.206 2.000 17.997 C 2.000 15.788 3.791 13.997 6.000 13.997 C 6.554 13.997 7.082 14.109 7.562 14.313 L 9.879 11.997 L 7.562 9.680 C 7.082 9.884 6.554 9.997 6.000 9.997 C 3.791 9.997 2.000 8.206 2.000 5.997 C 2.000 3.788 3.791 1.997 6.000 1.997 C 8.209 1.997 10.000 3.788 10.000 5.997 C 10.000 6.551 9.887 7.079 9.683 7.559 ZM 6.000 7.997 C 7.105 7.997 8.000 7.101 8.000 5.997 C 8.000 4.892 7.105 3.997 6.000 3.997 C 4.895 3.997 4.000 4.892 4.000 5.997 C 4.000 7.101 4.895 7.997 6.000 7.997 ZM 6.000 19.997 C 7.105 19.997 8.000 19.101 8.000 17.997 C 8.000 16.892 7.105 15.997 6.000 15.997 C 4.895 15.997 4.000 16.892 4.000 17.997 C 4.000 19.101 4.895 19.997 6.000 19.997 ZM 15.535 13.410 L 21.910 19.785 L 21.203 20.492 C 20.422 21.273 19.155 21.273 18.374 20.492 L 13.413 15.531 L 15.535 13.410 Z"),
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
        return _scissorsFill!!
    }

private var _scissorsFill: ImageVector? = null
