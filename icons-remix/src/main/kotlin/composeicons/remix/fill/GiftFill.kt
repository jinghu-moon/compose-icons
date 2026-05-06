package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GiftFill: ImageVector
    get() {
        if (_giftFill != null) return _giftFill!!
        _giftFill = remixIcon(
            name = "GiftFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15.005 2.003c2.209 0 4 1.791 4 4 0 .729-.195 1.413-.536 2.001l4.536-.001v2h-2v10c0 .552-.448 1-1 1h-16c-.552 0-1-.448-1-1v-10h-2v-2l4.536 .001C5.2 7.415 5.005 6.732 5.005 6.003c0-2.209 1.791-4 4-4 1.195 0 2.268 .524 3.001 1.355 .731-.831 1.804-1.355 2.999-1.355ZM13.005 10.003h-2v10h2v-10ZM9.005 4.003c-1.105 0-2 .895-2 2 0 1.054 .816 1.918 1.851 1.995l.149 .005h2v-2c0-1.002-.736-1.831-1.697-1.977L9.154 4.008 9.005 4.003ZM15.005 4.003c-1.054 0-1.918 .816-1.995 1.851l-.005 .149v2h2c1.054 0 1.918-.816 1.994-1.851l.006-.149c0-1.105-.895-2-2-2Z"),
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
        return _giftFill!!
    }

private var _giftFill: ImageVector? = null
