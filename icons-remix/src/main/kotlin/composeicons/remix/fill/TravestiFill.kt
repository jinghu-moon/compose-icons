package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TravestiFill: ImageVector
    get() {
        if (_travestiFill != null) return _travestiFill!!
        _travestiFill = remixIcon(
            name = "TravestiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.537 9.951 4.662 7.075 2.187 9.55 .772 8.136 7.136 1.772 8.551 3.186 6.076 5.661 8.951 8.537c1.262-.964 2.839-1.537 4.549-1.537 4.142 0 7.5 3.358 7.5 7.5 0 4.142-3.358 7.5-7.5 7.5C9.358 22 6 18.642 6 14.5c0-1.71 .573-3.287 1.537-4.549Z"),
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
        return _travestiFill!!
    }

private var _travestiFill: ImageVector? = null
