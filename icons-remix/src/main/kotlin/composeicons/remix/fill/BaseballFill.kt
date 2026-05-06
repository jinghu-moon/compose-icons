package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BaseballFill: ImageVector
    get() {
        if (_baseballFill != null) return _baseballFill!!
        _baseballFill = remixIcon(
            name = "BaseballFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 3.34c2.15 1.241 3.662 3.161 4.427 5.331-2.772 .518-5.309 2.196-6.829 4.829-1.52 2.633-1.704 5.669-.767 8.328-2.263 .423-4.681 .073-6.831-1.168C4.851 19.419 3.339 17.499 2.573 15.328c2.771-.518 5.309-2.195 6.829-4.828 1.52-2.633 1.705-5.67 .767-8.329 2.263-.423 4.681-.072 6.831 1.169ZM8.248 2.733c.792 2.152 .659 4.626-.577 6.767C6.434 11.641 4.358 12.993 2.099 13.383 1.799 11.251 2.181 9.008 3.34 7 4.5 4.991 6.252 3.539 8.248 2.733ZM21.902 10.616c.299 2.132-.081 4.375-1.241 6.384-1.16 2.009-2.912 3.459-4.908 4.266-.792-2.152-.658-4.625 .578-6.766 1.236-2.141 3.312-3.494 5.571-3.884Z"),
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
        return _baseballFill!!
    }

private var _baseballFill: ImageVector? = null
