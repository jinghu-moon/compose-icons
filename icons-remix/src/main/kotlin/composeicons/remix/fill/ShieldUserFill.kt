package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ShieldUserFill: ImageVector
    get() {
        if (_shieldUserFill != null) return _shieldUserFill!!
        _shieldUserFill = remixIcon(
            name = "ShieldUserFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.783 2.826 12 1l8.217 1.826c.458 .102 .783 .507 .783 .976v9.987c0 2.006-1.003 3.879-2.672 4.992L12 23 5.672 18.781C4.003 17.668 3 15.795 3 13.789v-9.987c0-.469 .326-.875 .783-.976ZM12 11c1.381 0 2.5-1.119 2.5-2.5C14.5 7.119 13.381 6 12 6 10.619 6 9.5 7.119 9.5 8.5 9.5 9.881 10.619 11 12 11ZM7.527 16h8.945C16.224 13.75 14.316 12 12 12 9.684 12 7.776 13.75 7.527 16Z"),
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
        return _shieldUserFill!!
    }

private var _shieldUserFill: ImageVector? = null
