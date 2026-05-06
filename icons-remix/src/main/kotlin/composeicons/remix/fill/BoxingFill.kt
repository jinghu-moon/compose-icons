package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BoxingFill: ImageVector
    get() {
        if (_boxingFill != null) return _boxingFill!!
        _boxingFill = remixIcon(
            name = "BoxingFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.501 11l.144 .007c.713 .068 1.281 .635 1.349 1.349l.007 .144-.007 .144c-.068 .713-.635 1.281-1.349 1.349L9.501 14h-3.5v2h3.5c1.7 0 3.117-1.212 3.434-2.819l.031-.18L19.001 13c.711 0 1.388-.149 2-.416L21.001 17c0 1.306-.834 2.417-1.999 2.829L19.001 21c0 .552-.448 1-1 1h-12c-.552 0-1-.448-1-1l0-1.171C3.836 19.417 3.001 18.306 3.001 17v-4c0-1.105 .895-2 2-2h4.5ZM22.001 7.5v.5l-.005 .176c-.088 1.516-1.302 2.731-2.819 2.819L19.001 11h-6.337C12.13 9.877 11.016 9.083 9.709 9.006L9.501 9h-4.5C4.272 9 3.589 9.195 3 9.536L3.001 6c0-2.209 1.791-4 4-4h9.5c3.038 0 5.5 2.462 5.5 5.5Z"),
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
        return _boxingFill!!
    }

private var _boxingFill: ImageVector? = null
