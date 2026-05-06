package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ShieldCrossLine: ImageVector
    get() {
        if (_shieldCrossLine != null) return _shieldCrossLine!!
        _shieldCrossLine = remixIcon(
            name = "ShieldCrossLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.783 2.826 12 1l8.217 1.826c.458 .102 .783 .507 .783 .976v9.987c0 2.006-1.003 3.879-2.672 4.992L12 23 5.672 18.781C4.003 17.668 3 15.795 3 13.789v-9.987c0-.469 .326-.875 .783-.976ZM5 4.604v9.185c0 1.337 .668 2.586 1.781 3.328L12 20.596l5.219-3.479C18.332 16.375 19 15.126 19 13.789v-9.185L12 3.049 5 4.604ZM11 10v-3h2v3h3v2h-3v3h-2v-3h-3v-2h3Z"),
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
        return _shieldCrossLine!!
    }

private var _shieldCrossLine: ImageVector? = null
