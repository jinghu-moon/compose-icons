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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.005 9.000 L 21.005 9.000 C 21.557 9.000 22.005 9.448 22.005 10.000 L 22.005 20.000 C 22.005 20.552 21.557 21.000 21.005 21.000 L 3.005 21.000 C 2.453 21.000 2.005 20.552 2.005 20.000 L 2.005 9.000 ZM 3.005 3.000 L 18.005 3.000 L 18.005 7.000 L 2.005 7.000 L 2.005 4.000 C 2.005 3.447 2.453 3.000 3.005 3.000 ZM 15.005 14.000 L 15.005 16.000 L 18.005 16.000 L 18.005 14.000 L 15.005 14.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _walletFill!!
    }

private var _walletFill: ImageVector? = null
