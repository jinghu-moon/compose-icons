package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ExchangeFundsFill: ImageVector
    get() {
        if (_exchangeFundsFill != null) return _exchangeFundsFill!!
        _exchangeFundsFill = remixIcon(
            name = "ExchangeFundsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.378 4.513 C 7.143 2.951 9.463 2.003 12.005 2.003 C 17.528 2.003 22.005 6.480 22.005 12.003 C 22.005 14.128 21.342 16.098 20.212 17.718 L 17.505 12.003 L 20.005 12.003 C 20.005 7.584 16.423 4.003 12.005 4.003 C 9.761 4.003 7.732 4.927 6.279 6.415 L 5.378 4.513 ZM 18.631 19.492 C 16.867 21.054 14.547 22.003 12.005 22.003 C 6.482 22.003 2.005 17.526 2.005 12.003 C 2.005 9.878 2.668 7.908 3.798 6.288 L 6.505 12.003 L 4.005 12.003 C 4.005 16.421 7.587 20.003 12.005 20.003 C 14.249 20.003 16.278 19.079 17.730 17.590 L 18.631 19.492 ZM 13.419 14.831 L 10.591 12.003 L 7.762 14.831 L 6.348 13.417 L 10.591 9.174 L 13.419 12.003 L 16.247 9.174 L 17.662 10.589 L 13.419 14.831 Z"),
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
        return _exchangeFundsFill!!
    }

private var _exchangeFundsFill: ImageVector? = null
