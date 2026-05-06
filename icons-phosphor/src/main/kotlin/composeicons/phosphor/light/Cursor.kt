package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Cursor: ImageVector
    get() {
        if (_cursor != null) return _cursor!!
        _cursor = phosphorLightIcon(
            name = "Cursor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M166.59 134.1c-.483-.46-.692-1.138-.55-1.79 .117-.617 .517-1.142 1.08-1.42l46.25-17.76 .24-.1c5.251-2.356 8.525-7.685 8.253-13.434C221.592 93.847 217.83 88.85 212.38 87L52.29 34.7C47.297 33.07 41.811 34.383 38.097 38.097c-3.714 3.714-5.027 9.199-3.397 14.193L87 212.38c1.767 5.528 6.801 9.363 12.6 9.6 .23 0 .46 0 .69 0 5.528-.001 10.525-3.292 12.71-8.37 .038-.078 .071-.158 .1-.24l17.76-46.25c.285-.579 .832-.985 1.469-1.09 .637-.105 1.285 .104 1.741 .56l51.31 51.31c2.626 2.626 6.187 4.101 9.9 4.101 3.713 0 7.274-1.475 9.9-4.101l12.69-12.69c2.626-2.626 4.101-6.187 4.101-9.9 0-3.713-1.475-7.274-4.101-9.9ZM209.41 196.73l-12.68 12.68c-.375 .376-.884 .587-1.415 .587-.531 0-1.04-.211-1.415-.587L142.59 158.1c-3.276-3.276-7.961-4.719-12.513-3.855-4.552 .865-8.381 3.925-10.227 8.175-.038 .078-.071 .158-.1 .24L102 208.91c-.379 .676-1.115 1.071-1.888 1.016-.773-.056-1.444-.553-1.722-1.276L46.11 48.57c-.256-.701-.072-1.487 .47-2 .357-.361 .842-.566 1.35-.57 .217 .002 .433 .036 .64 .1L208.65 98.38c.723 .279 1.22 .95 1.276 1.723 .056 .773-.34 1.508-1.016 1.887l-46.25 17.76-.24 .1c-4.249 1.846-7.31 5.676-8.175 10.227-.865 4.552 .579 9.237 3.855 12.513h0l51.31 51.31c.376 .375 .587 .884 .587 1.415 0 .531-.211 1.04-.587 1.415Z"),
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
        return _cursor!!
    }

private var _cursor: ImageVector? = null
