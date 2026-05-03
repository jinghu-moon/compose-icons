package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BlurOffLine: ImageVector
    get() {
        if (_blurOffLine != null) return _blurOffLine!!
        _blurOffLine = remixIcon(
            name = "BlurOffLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.154 19.565 C 14.625 22.874 9.082 22.806 5.636 19.361 C 2.191 15.915 2.123 10.372 5.432 6.843 L 1.394 2.804 L 2.808 1.390 L 22.607 21.189 L 21.192 22.603 L 18.154 19.565 ZM 6.848 8.258 C 4.319 11.005 4.386 15.282 7.050 17.947 C 9.715 20.611 13.992 20.678 16.739 18.149 L 6.848 8.258 ZM 20.414 16.197 L 18.816 14.598 C 19.349 12.319 18.727 9.824 16.950 8.047 L 12.000 3.097 L 9.658 5.440 L 8.243 4.026 L 12.000 0.269 L 18.364 6.633 C 20.950 9.219 21.633 12.986 20.414 16.197 Z"),
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
        return _blurOffLine!!
    }

private var _blurOffLine: ImageVector? = null
