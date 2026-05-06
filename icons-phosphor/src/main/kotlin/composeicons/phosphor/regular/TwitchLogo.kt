package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TwitchLogo: ImageVector
    get() {
        if (_twitchLogo != null) return _twitchLogo!!
        _twitchLogo = phosphorRegularIcon(
            name = "TwitchLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 32h-160C39.163 32 32 39.163 32 48v144c0 8.837 7.163 16 16 16h16v32c-.001 3.104 1.794 5.929 4.605 7.247 2.811 1.318 6.13 .89 8.515-1.097L122.9 208h42.2c3.746 .001 7.373-1.312 10.25-3.71l42.89-35.75c3.656-3.033 5.769-7.539 5.76-12.29v-108.25c0-8.837-7.163-16-16-16ZM208 156.25 165.1 192h-45.1c-1.87-.001-3.682 .654-5.12 1.85L80 222.92v-22.92c0-4.418-3.582-8-8-8h-24v-144h160ZM160 136v-48c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v48c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM112 136v-48c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v48c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8Z"),
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
        return _twitchLogo!!
    }

private var _twitchLogo: ImageVector? = null
