package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ConnectorLine: ImageVector
    get() {
        if (_connectorLine != null) return _connectorLine!!
        _connectorLine = remixIcon(
            name = "ConnectorLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 17c0-.553-.223-1.051-.586-1.414C8.051 15.223 7.553 15 7 15c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2ZM19 17c0-1.105-.895-2-2-2-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2ZM9 7C9 5.895 8.105 5 7 5 5.895 5 5 5.895 5 7c0 1.105 .895 2 2 2C8.105 9 9 8.105 9 7ZM19 7C19 5.895 18.105 5 17 5c-1.105 0-2 .895-2 2 0 .553 .223 1.051 .586 1.414C15.949 8.777 16.447 9 17 9c1.105 0 2-.895 2-2ZM21 17c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM11 7c0 2.209-1.791 4-4 4C4.791 11 3 9.209 3 7 3 4.791 4.791 3 7 3c2.209 0 4 1.791 4 4ZM21 7c0 2.209-1.791 4-4 4-.742 0-1.437-.203-2.032-.555l-4.523 4.523c.352 .596 .555 1.291 .555 2.032 0 2.209-1.791 4-4 4C4.791 21 3 19.209 3 17 3 14.791 4.791 13 7 13c.741 0 1.436 .202 2.031 .554L13.554 9.031C13.202 8.436 13 7.741 13 7 13 4.791 14.791 3 17 3c2.209 0 4 1.791 4 4Z"),
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
        return _connectorLine!!
    }

private var _connectorLine: ImageVector? = null
