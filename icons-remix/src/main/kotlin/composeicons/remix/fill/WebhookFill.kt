package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.WebhookFill: ImageVector
    get() {
        if (_webhookFill != null) return _webhookFill!!
        _webhookFill = remixIcon(
            name = "WebhookFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.501 4.399c1.221 .705 1.76 2.14 1.382 3.436l1.92 .561C17.433 6.235 16.538 3.843 14.501 2.667 12.11 1.286 9.052 2.105 7.671 4.497 6.462 6.592 6.94 9.198 8.685 10.74L6.803 14h-.003c-1.105 0-2 .896-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-.159-.019-.314-.054-.463-.082-.347-.102-.725 .076-1.034l2.545-4.408-.866-.5C9.066 8.767 8.575 6.932 9.403 5.497c.828-1.435 2.663-1.927 4.098-1.098ZM15.031 18.08c.934 .976 2.446 1.226 3.667 .522 1.435-.828 1.927-2.663 1.098-4.098-.828-1.435-2.663-1.927-4.098-1.098l-.866 .5L12.286 9.497c-.179-.309-.515-.481-.857-.583-.146-.044-.29-.105-.428-.185C10.045 8.177 9.717 6.953 10.269 5.997c.552-.957 1.776-1.284 2.732-.732 .957 .552 1.284 1.775 .732 2.732l-.002 .003 1.883 3.26c2.208-.74 4.705 .149 5.914 2.244 1.381 2.391 .561 5.449-1.83 6.83-2.037 1.176-4.556 .755-6.112-.871l1.445-1.382ZM3.8 16c0-1.409 .973-2.594 2.285-2.914L5.61 11.143c-2.187 .534-3.811 2.505-3.811 4.857 0 2.761 2.239 5 5 5 2.419 0 4.437-1.718 4.9-4h3.764l.002 .003c.552 .957 1.776 1.284 2.732 .732 .957-.552 1.284-1.775 .732-2.732-.552-.957-1.775-1.284-2.732-.732-.138 .08-.263 .173-.374 .278-.26 .245-.576 .451-.933 .451h-5.091v1c0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3Z"),
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
        return _webhookFill!!
    }

private var _webhookFill: ImageVector? = null
