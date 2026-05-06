package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AngularjsLine: ImageVector
    get() {
        if (_angularjsLine != null) return _angularjsLine!!
        _angularjsLine = remixIcon(
            name = "AngularjsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.524 16.651l.489-.271L19.132 6.669 12 4.124 4.869 6.669l1.119 9.71 .474 .263L12 4.21l5.523 12.441ZM16.425 17.26h-.798L14.458 14.34h-4.935L8.354 17.26h-.778l4.424 2.453 4.424-2.453ZM12 2l9.3 3.32L19.882 17.63 12 22 4.119 17.63 2.7 5.32 12 2ZM13.698 12.54 12 8.45l-1.698 4.09h3.396Z"),
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
        return _angularjsLine!!
    }

private var _angularjsLine: ImageVector? = null
