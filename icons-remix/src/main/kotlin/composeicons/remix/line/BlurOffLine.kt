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
                pathData = parseSvgPathData("M18.154 19.565C14.625 22.874 9.082 22.806 5.636 19.361 2.191 15.915 2.123 10.372 5.432 6.843L1.394 2.804 2.808 1.39 22.607 21.189l-1.414 1.414L18.154 19.565ZM6.848 8.258c-2.529 2.746-2.461 7.024 .203 9.688 2.664 2.664 6.942 2.732 9.688 .203L6.848 8.258ZM20.414 16.197 18.816 14.598c.533-2.279-.089-4.774-1.866-6.551L12 3.097 9.658 5.44 8.243 4.026 12 .269l6.364 6.364c2.586 2.586 3.269 6.353 2.05 9.564Z"),
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
