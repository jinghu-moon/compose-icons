package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ShieldUserLine: ImageVector
    get() {
        if (_shieldUserLine != null) return _shieldUserLine!!
        _shieldUserLine = remixIcon(
            name = "ShieldUserLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.783 2.826 12 1l8.217 1.826c.458 .102 .783 .507 .783 .976v9.987c0 2.006-1.003 3.879-2.672 4.992L12 23 5.672 18.781C4.003 17.668 3 15.795 3 13.789v-9.987c0-.469 .326-.875 .783-.976ZM5 4.604v9.185c0 1.337 .668 2.586 1.781 3.328L12 20.596l5.219-3.479C18.332 16.375 19 15.126 19 13.789v-9.185L12 3.049 5 4.604ZM12 11C10.619 11 9.5 9.881 9.5 8.5 9.5 7.119 10.619 6 12 6c1.381 0 2.5 1.119 2.5 2.5C14.5 9.881 13.381 11 12 11ZM7.527 16C7.776 13.75 9.684 12 12 12c2.316 0 4.224 1.75 4.472 4h-8.945Z"),
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
        return _shieldUserLine!!
    }

private var _shieldUserLine: ImageVector? = null
