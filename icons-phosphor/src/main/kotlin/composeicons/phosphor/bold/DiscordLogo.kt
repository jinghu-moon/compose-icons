package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DiscordLogo: ImageVector
    get() {
        if (_discordLogo != null) return _discordLogo!!
        _discordLogo = phosphorBoldIcon(
            name = "DiscordLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M108 136c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM164 120c-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16ZM240.07 196.56l-67 29.71c-5.08 2.26-10.867 2.32-15.993 .167-5.126-2.153-9.134-6.328-11.077-11.537l-8.54-23.13c-3.13 .14-6.27 .24-9.45 .24-3.18 0-6.32-.1-9.45-.24L110 214.9c-1.952 5.204-5.963 9.373-11.088 11.525-5.125 2.152-10.91 2.096-15.992-.155L15.92 196.56C7.002 192.642 2.223 182.851 4.62 173.41L34.15 57C36.12 49.271 42.494 43.451 50.37 42.19L86.43 36.26c10.281-1.644 20.135 4.772 22.79 14.84l4.41 17.41C118.37 68.18 123.15 68 128 68c4.85 0 9.63 .18 14.37 .51l4.41-17.41c2.651-10.071 12.508-16.489 22.79-14.84l36.06 5.93c7.876 1.261 14.25 7.081 16.22 14.81l29.53 116.38c2.412 9.453-2.375 19.263-11.31 23.18ZM227.28 176 199.23 65.46 169.16 60.52l-2.84 11.17c2.9 .58 5.78 1.2 8.61 1.92 4.222 .987 7.583 4.175 8.792 8.339 1.209 4.164 .078 8.656-2.959 11.751-3.037 3.095-7.507 4.31-11.693 3.18C155.632 93.572 141.838 91.933 128 92c-13.838-.067-27.632 1.572-41.07 4.88C80.554 98.37 74.161 94.475 72.562 88.125 70.963 81.776 74.749 75.317 81.07 73.61c2.83-.72 5.71-1.34 8.61-1.92L86.85 60.52 56.77 65.46 28.72 176l60.22 26.7 5-13.57c-4.37-.76-8.67-1.65-12.88-2.71-6.429-1.618-10.328-8.141-8.71-14.57 1.618-6.429 8.141-10.328 14.57-8.71 13.442 3.302 27.239 4.934 41.08 4.86 13.838 .067 27.632-1.572 41.07-4.88 6.429-1.618 12.952 2.281 14.57 8.71 1.618 6.429-2.281 12.952-8.71 14.57-4.21 1.06-8.51 1.95-12.88 2.71l5 13.57Z"),
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
