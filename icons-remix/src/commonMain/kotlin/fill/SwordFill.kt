package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SwordFill: ImageVector
    get() {
        if (_swordFill != null) return _swordFill!!
        _swordFill = remixIcon(
            name = "SwordFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.048 13.406 L 10.583 16.942 L 9.170 18.356 L 10.585 19.771 L 9.171 21.185 L 6.696 18.710 L 3.867 21.539 L 2.453 20.125 L 5.282 17.296 L 2.807 14.821 L 4.221 13.407 L 5.635 14.820 L 7.048 13.406 ZM 2.999 3.000 L 6.545 3.003 L 18.362 14.821 L 19.777 13.407 L 21.191 14.821 L 18.717 17.296 L 21.545 20.125 L 20.131 21.539 L 17.302 18.710 L 14.828 21.185 L 13.413 19.771 L 14.827 18.356 L 3.002 6.531 L 2.999 3.000 ZM 17.456 3.000 L 20.999 3.003 L 21.001 6.526 L 16.948 10.578 L 13.412 7.043 L 17.456 3.000 Z"),
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
        return _swordFill!!
    }

private var _swordFill: ImageVector? = null
