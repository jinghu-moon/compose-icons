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
                pathData = parseSvgPathData("M 13.501 4.399 C 14.722 5.104 15.261 6.538 14.883 7.835 L 16.802 8.396 C 17.433 6.235 16.538 3.843 14.501 2.667 C 12.110 1.286 9.052 2.105 7.671 4.497 C 6.462 6.592 6.940 9.198 8.685 10.740 L 6.803 14.000 L 6.800 14.000 C 5.695 14.000 4.800 14.896 4.800 16.000 C 4.800 17.105 5.695 18.000 6.800 18.000 C 7.904 18.000 8.800 17.105 8.800 16.000 C 8.800 15.841 8.781 15.686 8.746 15.537 C 8.664 15.190 8.644 14.812 8.822 14.503 L 11.367 10.095 L 10.501 9.595 C 9.066 8.767 8.575 6.932 9.403 5.497 C 10.231 4.062 12.066 3.570 13.501 4.399 ZM 15.031 18.080 C 15.965 19.056 17.477 19.307 18.698 18.602 C 20.133 17.773 20.624 15.939 19.796 14.504 C 18.968 13.069 17.133 12.577 15.698 13.406 L 14.832 13.906 L 12.286 9.497 C 12.108 9.188 11.771 9.016 11.429 8.914 C 11.283 8.870 11.139 8.809 11.001 8.729 C 10.045 8.177 9.717 6.953 10.269 5.997 C 10.821 5.040 12.045 4.713 13.001 5.265 C 13.958 5.817 14.285 7.040 13.733 7.997 L 13.731 8.000 L 15.614 11.260 C 17.822 10.520 20.319 11.409 21.528 13.504 C 22.909 15.895 22.089 18.953 19.698 20.334 C 17.660 21.510 15.142 21.089 13.586 19.462 L 15.031 18.080 ZM 3.800 16.000 C 3.800 14.591 4.773 13.406 6.085 13.086 L 5.610 11.143 C 3.424 11.677 1.800 13.648 1.800 16.000 C 1.800 18.762 4.038 21.000 6.800 21.000 C 9.219 21.000 11.236 19.283 11.700 17.000 L 15.464 17.000 L 15.466 17.004 C 16.018 17.960 17.241 18.288 18.198 17.736 C 19.154 17.183 19.482 15.960 18.930 15.004 C 18.378 14.047 17.154 13.719 16.198 14.271 C 16.060 14.351 15.935 14.445 15.824 14.550 C 15.564 14.795 15.247 15.000 14.890 15.000 L 9.800 15.000 L 9.800 16.000 C 9.800 17.657 8.457 19.000 6.800 19.000 C 5.143 19.000 3.800 17.657 3.800 16.000 Z"),
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
