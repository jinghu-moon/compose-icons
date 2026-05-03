package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CashLine: ImageVector
    get() {
        if (_cashLine != null) return _cashLine!!
        _cashLine = remixIcon(
            name = "CashLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 16.000 C 14.210 16.000 16.000 14.209 16.000 12.000 C 16.000 9.791 14.210 8.000 12.000 8.000 C 9.791 8.000 8.000 9.791 8.000 12.000 C 8.000 14.209 9.791 16.000 12.000 16.000 ZM 21.005 4.003 L 3.005 4.003 C 2.453 4.003 2.005 4.451 2.005 5.003 L 2.005 19.003 C 2.005 19.555 2.453 20.003 3.005 20.003 L 21.005 20.003 C 21.557 20.003 22.005 19.555 22.005 19.003 L 22.005 5.003 C 22.005 4.451 21.557 4.003 21.005 4.003 ZM 4.005 15.646 L 4.005 8.354 C 5.131 8.017 6.018 7.129 6.355 6.003 L 17.646 6.003 C 17.983 7.132 18.875 8.022 20.005 8.356 L 20.005 15.644 C 18.873 15.979 17.980 16.871 17.644 18.003 L 6.356 18.003 C 6.021 16.874 5.133 15.984 4.005 15.646 Z"),
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
        return _cashLine!!
    }

private var _cashLine: ImageVector? = null
