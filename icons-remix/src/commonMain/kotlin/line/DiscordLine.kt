package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DiscordLine: ImageVector
    get() {
        if (_discordLine != null) return _discordLine!!
        _discordLine = remixIcon(
            name = "DiscordLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.521 13.846 C 7.481 13.846 6.632 12.901 6.632 11.745 C 6.632 10.588 7.459 9.643 8.521 9.643 C 9.571 9.643 10.431 10.588 10.410 11.745 C 10.410 12.901 9.571 13.846 8.521 13.846 ZM 15.494 13.846 C 14.454 13.846 13.604 12.901 13.604 11.745 C 13.604 10.588 14.433 9.643 15.494 9.643 C 16.545 9.643 17.404 10.588 17.383 11.745 C 17.383 12.901 16.555 13.846 15.494 13.846 ZM 10.125 4.323 L 9.817 3.760 L 9.183 3.866 C 7.719 4.110 6.327 4.547 5.025 5.146 L 4.797 5.251 L 4.655 5.460 C 2.042 9.314 1.326 13.109 1.680 16.836 L 1.719 17.243 L 2.049 17.482 C 3.789 18.747 5.474 19.519 7.127 20.026 L 7.917 20.268 L 9.030 17.551 C 10.940 18.023 13.059 18.023 14.969 17.551 L 16.076 20.268 L 16.867 20.026 C 18.517 19.519 20.214 18.747 21.947 17.481 L 22.273 17.243 L 22.313 16.841 C 22.749 12.521 21.616 8.758 19.355 5.457 L 19.213 5.249 L 18.985 5.145 C 17.677 4.547 16.285 4.110 14.831 3.866 L 14.213 3.762 L 13.899 4.304 C 13.811 4.454 13.722 4.625 13.636 4.797 C 12.544 4.685 11.456 4.684 10.373 4.797 C 10.288 4.627 10.203 4.464 10.125 4.323 ZM 6.714 16.610 C 6.912 16.724 7.120 16.836 7.326 16.938 L 6.876 18.034 C 5.756 17.626 4.618 17.064 3.448 16.256 C 3.223 13.118 3.861 9.951 6.012 6.686 C 6.910 6.291 7.853 5.983 8.836 5.773 C 8.896 5.898 8.952 6.021 8.998 6.129 L 9.271 6.772 L 9.963 6.671 C 11.315 6.473 12.677 6.472 14.052 6.671 L 14.742 6.771 L 15.015 6.129 C 15.062 6.017 15.117 5.895 15.174 5.773 C 16.153 5.983 17.098 6.292 18.003 6.688 C 19.878 9.509 20.824 12.654 20.549 16.255 C 19.384 17.062 18.242 17.625 17.119 18.034 L 16.674 16.939 C 16.880 16.837 17.088 16.725 17.287 16.610 C 17.776 16.328 18.304 15.976 18.640 15.640 L 17.361 14.360 C 17.197 14.524 16.837 14.781 16.383 15.042 C 15.939 15.298 15.498 15.505 15.216 15.598 C 13.213 16.261 10.788 16.261 8.784 15.598 C 8.503 15.505 8.062 15.298 7.618 15.042 C 7.164 14.781 6.804 14.524 6.640 14.360 L 5.361 15.640 C 5.697 15.976 6.225 16.328 6.714 16.610 Z"),
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
        return _discordLine!!
    }

private var _discordLine: ImageVector? = null
