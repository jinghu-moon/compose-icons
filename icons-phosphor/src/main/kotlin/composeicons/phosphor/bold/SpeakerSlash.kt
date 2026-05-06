package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SpeakerSlash: ImageVector
    get() {
        if (_speakerSlash != null) return _speakerSlash!!
        _speakerSlash = phosphorBoldIcon(
            name = "SpeakerSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M56.88 31.93C54.012 28.697 49.628 27.256 45.401 28.157c-4.226 .901-7.642 4.005-8.942 8.126-1.3 4.121-.284 8.623 2.661 11.786L64.51 76h-32.51C20.954 76 12 84.954 12 96v64c0 11.046 8.954 20 20 20h43.88l68.75 53.47c3.617 2.815 8.523 3.324 12.641 1.31 4.118-2.013 6.729-6.197 6.729-10.78v-38.56l35.12 38.63c4.478 4.81 11.991 5.124 16.854 .704 4.863-4.42 5.267-11.928 .906-16.844ZM36 100h32v56h-32ZM140 199.46 92 162.13v-55.89L140 159ZM109 65.46c-1.954-2.513-2.829-5.699-2.433-8.857 .396-3.158 2.03-6.03 4.543-7.983L144.62 22.55c3.615-2.819 8.519-3.333 12.639-1.324 4.12 2.009 6.736 6.19 6.741 10.774v62.94c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-38.4l-14.15 11c-2.512 1.958-5.7 2.836-8.86 2.443-3.161-.394-6.035-2.028-7.99-4.543ZM183 114.81c-4.086-4.999-3.484-12.334 1.361-16.6 4.845-4.266 12.197-3.935 16.639 .75 12.23 13.902 14.449 33.973 5.55 50.21-3.366 5.422-10.387 7.261-15.978 4.186-5.592-3.076-7.798-9.99-5.022-15.736 1.626-2.944 2.469-6.257 2.45-9.62-.005-4.865-1.782-9.561-5-13.21ZM252 128c-.013 19.457-6.766 38.31-19.11 53.35-2.707 3.367-7.014 5.02-11.278 4.326-4.264-.693-7.827-3.625-9.327-7.676-1.501-4.051-.708-8.596 2.076-11.9C233.159 143.23 232.467 110.066 212.73 88c-2.977-3.176-4-7.715-2.674-11.862 1.326-4.146 4.794-7.249 9.061-8.108 4.267-.859 8.666 .66 11.493 3.97 13.785 15.394 21.402 35.336 21.39 56Z"),
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
        return _speakerSlash!!
    }

private var _speakerSlash: ImageVector? = null
