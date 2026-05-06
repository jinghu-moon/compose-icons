package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.NavigationLine: ImageVector
    get() {
        if (_navigationLine != null) return _navigationLine!!
        _navigationLine = remixIcon(
            name = "NavigationLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.965 5.096 8.511 17.507l3.041-6.081L17.188 9.171 4.965 5.096ZM2.899 2.3 21.705 8.568c.262 .087 .404 .37 .316 .632-.046 .14-.152 .252-.289 .306l-8.733 3.493L8.575 21.85c-.123 .247-.424 .347-.671 .224-.125-.063-.219-.175-.257-.31L2.261 2.911c-.076-.266 .078-.542 .343-.618 .097-.028 .2-.025 .295 .006Z"),
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
        return _navigationLine!!
    }

private var _navigationLine: ImageVector? = null
