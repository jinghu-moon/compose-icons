package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ConnectorFill: ImageVector
    get() {
        if (_connectorFill != null) return _connectorFill!!
        _connectorFill = remixIcon(
            name = "ConnectorFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 17c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM11 7c0 2.209-1.791 4-4 4C4.791 11 3 9.209 3 7 3 4.791 4.791 3 7 3c2.209 0 4 1.791 4 4ZM21 7c0 2.209-1.791 4-4 4-.742 0-1.437-.203-2.032-.555l-4.523 4.523c.352 .596 .555 1.291 .555 2.032 0 2.209-1.791 4-4 4C4.791 21 3 19.209 3 17 3 14.791 4.791 13 7 13c.741 0 1.436 .202 2.031 .554L13.554 9.031C13.202 8.436 13 7.741 13 7 13 4.791 14.791 3 17 3c2.209 0 4 1.791 4 4Z"),
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
        return _connectorFill!!
    }

private var _connectorFill: ImageVector? = null
