package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TwitchLogo: ImageVector
    get() {
        if (_twitchLogo != null) return _twitchLogo!!
        _twitchLogo = phosphorBoldIcon(
            name = "TwitchLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 28h-160C36.954 28 28 36.954 28 48v144c0 11.046 8.954 20 20 20h12v28c0 4.656 2.693 8.891 6.909 10.866 4.216 1.975 9.194 1.334 12.771-1.646L124.34 212h40.76c4.681-.005 9.212-1.646 12.81-4.64l42.89-35.74c4.571-3.794 7.211-9.43 7.2-15.37v-108.25C228 36.954 219.046 28 208 28ZM204 154.38 163.66 188h-43.66c-2.806 0-5.524 .984-7.68 2.78L84 214.38v-14.38c0-6.627-5.373-12-12-12h-20v-136h152ZM156 136v-48c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v48c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM108 136v-48c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v48c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12Z"),
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
