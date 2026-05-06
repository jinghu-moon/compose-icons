package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.UmbrellaLine: ImageVector
    get() {
        if (_umbrellaLine != null) return _umbrellaLine!!
        _umbrellaLine = remixIcon(
            name = "UmbrellaLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.998 2.049c5.053 .502 9 4.765 9 9.951v1h-9v6c0 1.105 .896 2 2 2 1.105 0 2-.895 2-2v-1h2v1c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-6h-9v-1c0-5.185 3.947-9.449 9-9.951v-.049c0-.552 .448-1 1-1 .552 0 1 .448 1 1v.049ZM19.936 11C19.444 7.054 16.078 4 11.998 4 7.918 4 4.552 7.054 4.06 11h15.876Z"),
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
        return _umbrellaLine!!
    }

private var _umbrellaLine: ImageVector? = null
