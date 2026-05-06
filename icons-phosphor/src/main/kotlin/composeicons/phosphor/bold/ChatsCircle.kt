package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChatsCircle: ImageVector
    get() {
        if (_chatsCircle != null) return _chatsCircle!!
        _chatsCircle = phosphorBoldIcon(
            name = "ChatsCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236.34 187.09c11.049-24.03 10.135-51.86-2.467-75.113C221.272 88.723 198.455 72.763 172.29 68.9 152.705 27.104 103.066 8.94 61.13 28.224 19.195 47.509 .676 97.018 19.66 139.09l-6.84 23.26c-2.065 7.021-.13 14.61 5.045 19.785 5.175 5.175 12.763 7.11 19.785 5.045l23.26-6.84c7.229 3.313 14.892 5.583 22.76 6.74 19.393 42.141 69.258 60.607 111.42 41.26l23.26 6.84c7.021 2.065 14.61 .13 19.785-5.045 5.175-5.175 7.11-12.763 5.045-19.785ZM62 155.5c-1.148-.001-2.29 .164-3.39 .49l-20.72 6.09L44 141.35c.876-3.006 .542-6.236-.93-9C29.008 106.143 36.266 73.59 60.13 55.839c23.863-17.751 57.129-15.341 78.185 5.664 21.056 21.005 23.547 54.264 5.854 78.171-17.692 23.907-50.228 31.244-76.469 17.246-1.753-.938-3.712-1.426-5.7-1.42ZM212.89 180.3c-1.472 2.764-1.806 5.994-.93 9l6.09 20.73L197.36 204c-3.025-.893-6.28-.559-9.06 .93C161.606 219.202 128.462 211.355 111 186.63c43.248-7.812 73.146-47.663 68.55-91.37 16.613 5.723 29.883 18.441 36.306 34.797 6.423 16.356 5.353 34.705-2.926 50.203Z"),
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
        return _chatsCircle!!
    }

private var _chatsCircle: ImageVector? = null
