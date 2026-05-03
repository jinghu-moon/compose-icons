package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GooglePlayLine: ImageVector
    get() {
        if (_googlePlayLine != null) return _googlePlayLine!!
        _googlePlayLine = remixIcon(
            name = "GooglePlayLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.001 1.734 C 4.177 1.734 4.350 1.781 4.502 1.869 L 20.506 11.134 C 20.984 11.411 21.147 12.023 20.871 12.501 C 20.783 12.652 20.657 12.778 20.506 12.865 L 4.502 22.131 C 4.024 22.408 3.412 22.244 3.136 21.767 C 3.047 21.614 3.001 21.441 3.001 21.265 L 3.001 2.734 C 3.001 2.182 3.449 1.734 4.001 1.734 ZM 12.293 13.413 L 7.795 17.912 L 13.494 14.613 L 12.293 13.413 ZM 5.000 6.119 L 5.000 17.878 L 10.879 11.999 L 5.000 6.119 ZM 15.284 10.421 L 13.707 11.999 L 15.285 13.576 L 18.009 12.000 L 15.284 10.421 ZM 7.794 6.085 L 12.293 10.585 L 13.493 9.384 L 7.794 6.085 Z"),
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
        return _googlePlayLine!!
    }

private var _googlePlayLine: ImageVector? = null
