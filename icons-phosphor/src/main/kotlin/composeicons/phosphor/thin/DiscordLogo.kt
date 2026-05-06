package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DiscordLogo: ImageVector
    get() {
        if (_discordLogo != null) return _discordLogo!!
        _discordLogo = phosphorThinIcon(
            name = "DiscordLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M100 140c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM164 132c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM236.83 189.25l-67 29.71c-1.579 .677-3.282 1.018-5 1-5.067 .008-9.605-3.134-11.38-7.88l-9.15-24.81c-5.36 .45-10.81 .69-16.34 .69-5.53 0-11-.24-16.34-.69l-9.15 24.81c-1.757 4.748-6.278 7.905-11.34 7.92-1.718 .018-3.421-.323-5-1L19.13 189.29c-5.341-2.357-8.211-8.215-6.8-13.88L41.9 59c1.193-4.65 5.03-8.149 9.77-8.91L87.73 44.17c6.188-1.006 12.128 2.849 13.73 8.91l4.12 16.22c14.897-1.72 29.943-1.72 44.84 0l4.12-16.22c1.602-6.061 7.542-9.916 13.73-8.91l36.06 5.92c4.74 .761 8.577 4.26 9.77 8.91l29.53 116.38c1.406 5.662-1.463 11.514-6.8 13.87ZM235.83 177.34 206.35 61c-.413-1.582-1.732-2.764-3.35-3L167 52.05c-2.102-.353-4.129 .944-4.69 3l-3.91 15.33c6.3 1.002 12.536 2.364 18.68 4.08 1.41 .356 2.516 1.449 2.888 2.854 .372 1.406-.048 2.903-1.097 3.91-1.049 1.007-2.562 1.365-3.951 .936C159.628 78.006 143.846 75.934 128 76c-15.846-.066-31.628 2.006-46.92 6.16-1.389 .43-2.902 .071-3.951-.936C76.08 80.217 75.66 78.72 76.032 77.314c.372-1.406 1.478-2.499 2.888-2.854 6.144-1.716 12.38-3.078 18.68-4.08L93.71 55c-.561-2.056-2.588-3.353-4.69-3L53 58c-1.603 .251-2.903 1.43-3.31 3L20.12 177.34c-.447 1.882 .517 3.815 2.29 4.59l67 29.71c1.067 .469 2.283 .469 3.35 0 1.033-.418 1.845-1.248 2.24-2.29l8.45-22.88c-8.286-1.041-16.484-2.685-24.53-4.92-2.129-.596-3.371-2.806-2.775-4.935 .596-2.129 2.806-3.371 4.935-2.775 15.292 4.154 31.074 6.226 46.92 6.16 15.846 .066 31.628-2.006 46.92-6.16 2.129-.596 4.339 .646 4.935 2.775 .596 2.129-.646 4.339-2.775 4.935-8.046 2.235-16.244 3.879-24.53 4.92L161 209.35c.386 1.051 1.195 1.893 2.23 2.32 1.067 .469 2.283 .469 3.35 0l67-29.71c1.79-.773 2.762-2.725 2.3-4.62Z"),
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
        return _discordLogo!!
    }

private var _discordLogo: ImageVector? = null
