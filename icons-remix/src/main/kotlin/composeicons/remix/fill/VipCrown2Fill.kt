package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.VipCrown2Fill: ImageVector
    get() {
        if (_vipCrown2Fill != null) return _vipCrown2Fill!!
        _vipCrown2Fill = remixIcon(
            name = "VipCrown2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2.806 5.2 7.005 8 11.191 2.139c.321-.449 .946-.553 1.395-.232 .09 .064 .168 .143 .233 .232l4.186 5.861L21.204 5.2c.46-.306 1.08-.182 1.387 .277 .132 .198 .189 .436 .161 .672L21.109 20.116c-.059 .504-.486 .883-.993 .883h-16.222c-.507 0-.934-.38-.993-.883L1.258 6.149C1.193 5.6 1.586 5.103 2.134 5.039c.236-.028 .474 .029 .672 .161ZM12.005 15c1.104 0 2-.895 2-2 0-1.105-.896-2-2-2-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2Z"),
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
        return _vipCrown2Fill!!
    }

private var _vipCrown2Fill: ImageVector? = null
