package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HandHeartLine: ImageVector
    get() {
        if (_handHeartLine != null) return _handHeartLine!!
        _handHeartLine = remixIcon(
            name = "HandHeartLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.005 9.003c.552 0 1 .448 1 1 1.635 0 3.139 .56 4.33 1.5l2.17 0c1.332 0 2.529 .579 3.353 1.499l3.147 .001c1.992 0 3.712 1.165 4.516 2.851-2.365 3.121-6.194 5.149-10.516 5.149-2.791 0-5.15-.603-7.061-1.658-.138 .384-.507 .658-.939 .658h-3c-.552 0-1-.448-1-1v-9c0-.552 .448-1 1-1h3ZM6.006 12.003l-.001 5.021 .045 .033c1.794 1.26 4.133 1.946 6.955 1.946 3.004 0 5.799-1.156 7.835-3.13l.133-.134-.119-.1c-.464-.363-1.033-.588-1.644-.63l-.205-.007-2.112-.001c.073 .322 .112 .657 .112 1.001v1h-9v-2l6.79-.001-.034-.079c-.38-.794-1.167-1.355-2.091-1.415l-.164-.005L9.575 13.502C8.668 12.577 7.404 12.003 6.006 12.003ZM4.005 11.003h-1v7h1v-7ZM13.651 3.578l.353 .354 .354-.354c.976-.976 2.559-.976 3.536 0 .976 .976 .976 2.559 0 3.536l-3.889 3.889L10.116 7.114c-.976-.976-.976-2.559 0-3.536 .976-.976 2.559-.976 3.536 0ZM11.53 4.992c-.174 .174-.193 .443-.059 .637l.057 .069 2.475 2.475L16.48 5.699c.174-.174 .193-.443 .058-.638l-.058-.069c-.174-.174-.443-.193-.638-.058l-.069 .058L14.003 6.761 12.236 4.991l-.068-.057c-.195-.135-.464-.116-.638 .058Z"),
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
        return _handHeartLine!!
    }

private var _handHeartLine: ImageVector? = null
