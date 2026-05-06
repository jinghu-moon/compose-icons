package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Confetti: ImageVector
    get() {
        if (_confetti != null) return _confetti!!
        _confetti = phosphorRegularIcon(
            name = "Confetti",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M111.49 52.63c-3.818-3.808-9.316-5.406-14.581-4.238-5.265 1.168-9.57 4.942-11.419 10.008L33 202.78c-1.75 4.831-1.046 10.211 1.889 14.43 2.934 4.218 7.733 6.75 12.871 6.79 1.864-.013 3.712-.351 5.46-1L197.59 170.5c5.068-1.847 8.843-6.151 10.014-11.416 1.171-5.265-.426-10.764-4.234-14.584ZM103.16 187.84l-35-35L81.32 116.63l58.05 58.05ZM48.16 207.84l14-38.41 24.45 24.45ZM156 168.64 87.36 100l13-35.87 91.43 91.43ZM160 72c.15-5.408 1.46-10.721 3.84-15.58C169.14 45.83 179.14 40 192 40c6.7 0 11-2.29 13.65-7.21 1.395-2.753 2.196-5.768 2.35-8.85 .017-4.418 3.612-7.987 8.03-7.97 4.418 .017 7.987 3.612 7.97 8.03 0 12.86-8.52 32-32 32-6.7 0-11 2.29-13.65 7.21-1.395 2.753-2.196 5.768-2.35 8.85-.017 4.418-3.612 7.987-8.03 7.97C163.552 80.013 159.983 76.418 160 72ZM136 40v-24c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v24c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM237.66 122.34c3.123 3.126 3.121 8.192-.005 11.315-3.126 3.123-8.192 3.121-11.315-.005l-16-16c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0ZM242.53 79.59l-24 8c-4.192 1.397-8.723-.868-10.12-5.06-1.397-4.192 .868-8.723 5.06-10.12l24-8c4.192-1.397 8.723 .868 10.12 5.06 1.397 4.192-.868 8.723-5.06 10.12Z"),
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
        return _confetti!!
    }

private var _confetti: ImageVector? = null
