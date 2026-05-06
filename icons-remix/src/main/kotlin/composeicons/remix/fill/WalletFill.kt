package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.WalletFill: ImageVector
    get() {
        if (_walletFill != null) return _walletFill!!
        _walletFill = remixIcon(
            name = "WalletFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2.005 9h19c.552 0 1 .448 1 1v10c0 .552-.448 1-1 1h-18c-.552 0-1-.448-1-1v-11ZM3.005 3h15v4h-16v-3c0-.552 .448-1 1-1ZM15.005 14v2h3v-2h-3Z"),
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
        return _walletFill!!
    }

private var _walletFill: ImageVector? = null
