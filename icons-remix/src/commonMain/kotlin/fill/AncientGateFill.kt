package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AncientGateFill: ImageVector
    get() {
        if (_ancientGateFill != null) return _ancientGateFill!!
        _ancientGateFill = remixIcon(
            name = "AncientGateFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.964 3.000 L 17.036 3.000 C 17.284 4.722 18.760 6.000 20.500 6.000 C 20.832 6.000 21.163 5.953 21.482 5.860 C 21.297 7.644 19.794 9.000 18.000 9.000 L 6.000 9.000 C 4.206 9.000 2.703 7.644 2.519 5.860 C 2.837 5.953 3.168 6.000 3.500 6.000 C 5.240 6.000 6.716 4.722 6.964 3.000 ZM 22.979 11.111 C 22.542 11.359 22.038 11.500 21.500 11.500 C 20.390 11.500 19.420 10.897 18.901 10.000 L 5.099 10.000 C 4.580 10.897 3.610 11.500 2.500 11.500 C 1.962 11.500 1.458 11.359 1.021 11.111 C 1.007 11.239 1.000 11.369 1.000 11.500 C 1.000 12.897 1.818 14.102 3.000 14.664 L 3.000 21.000 L 9.000 21.000 L 9.000 19.000 C 9.000 17.343 10.343 16.000 12.000 16.000 C 13.657 16.000 15.000 17.343 15.000 19.000 L 15.000 21.000 L 21.000 21.000 L 21.000 14.664 C 22.183 14.102 23.000 12.897 23.000 11.500 C 23.000 11.369 22.993 11.239 22.979 11.111 Z"),
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
        return _ancientGateFill!!
    }

private var _ancientGateFill: ImageVector? = null
