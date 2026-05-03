package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CentosLine: ImageVector
    get() {
        if (_centosLine != null) return _centosLine!!
        _centosLine = remixIcon(
            name = "CentosLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 L 16.292 6.292 L 17.353 5.232 L 16.121 4.000 L 20.000 4.000 L 20.000 7.879 L 18.767 6.646 L 17.707 7.707 L 22.000 12.000 L 17.708 16.293 L 18.767 17.352 L 20.000 16.121 L 20.000 20.000 L 16.121 20.000 L 17.352 18.767 L 16.293 17.707 L 12.000 22.000 L 7.707 17.707 L 6.646 18.767 L 7.879 20.000 L 4.000 20.000 L 4.000 16.121 L 5.231 17.352 L 6.292 16.292 L 2.000 12.000 L 6.293 7.707 L 5.231 6.646 L 4.000 7.879 L 4.000 4.000 L 7.879 4.000 L 6.646 5.231 L 7.708 6.293 L 12.000 2.000 ZM 12.000 13.413 L 9.120 16.292 L 12.000 19.172 L 14.879 16.292 L 12.000 13.413 ZM 7.707 9.121 L 4.828 12.000 L 7.706 14.878 L 10.586 11.999 L 7.707 9.121 ZM 16.292 9.121 L 13.415 11.999 L 16.293 14.878 L 19.172 12.000 L 16.292 9.121 ZM 12.000 4.828 L 9.122 7.707 L 12.001 10.585 L 14.878 7.706 L 12.000 4.828 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _centosLine!!
    }

private var _centosLine: ImageVector? = null
