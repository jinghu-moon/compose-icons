package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChatCircleSlash: ImageVector
    get() {
        if (_chatCircleSlash != null) return _chatCircleSlash!!
        _chatCircleSlash = phosphorThinIcon(
            name = "ChatCircleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M51 37.31C49.514 35.653 46.967 35.514 45.31 37c-1.657 1.486-1.796 4.033-.31 5.69L57.83 56.76C25.835 88.263 18.76 137.229 40.53 176.5L28.63 212.19c-1.438 4.312-.316 9.067 2.898 12.282 3.214 3.214 7.969 4.337 12.282 2.898L79.5 215.47c36.206 20.069 81.035 15.755 112.75-10.85L205 218.69c.956 1.078 2.417 1.558 3.826 1.258 1.409-.3 2.547-1.335 2.981-2.709 .433-1.374 .095-2.874-.887-3.929ZM128 220c-16.175 .005-32.066-4.255-46.07-12.35-.992-.573-2.183-.694-3.27-.33L41.28 219.78c-1.437 .479-3.022 .105-4.094-.966-1.071-1.071-1.446-2.656-.966-4.094L48.68 177.34c.364-1.087 .243-2.278-.33-3.27C27.424 137.877 33.532 92.126 63.22 62.69L186.86 198.69C170.345 212.474 149.511 220.016 128 220ZM228 128c-.004 16.526-4.091 32.795-11.9 47.36-.7 1.297-2.056 2.104-3.53 2.1-.66 .002-1.311-.163-1.89-.48-.935-.502-1.633-1.356-1.938-2.372-.306-1.017-.195-2.113 .308-3.048C227.538 137.21 222.354 94.935 196.113 66.071 169.872 37.207 128.281 28.029 92.33 43.17c-2.027 .824-4.341-.134-5.192-2.15-.851-2.016 .077-4.342 2.082-5.22 30.88-12.965 66.199-9.619 94.095 8.914C211.211 63.247 227.983 94.509 228 128Z"),
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
        return _chatCircleSlash!!
    }

private var _chatCircleSlash: ImageVector? = null
