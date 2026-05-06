package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SignIn: ImageVector
    get() {
        if (_signIn != null) return _signIn!!
        _signIn = phosphorBoldIcon(
            name = "SignIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144.49 136.49l-40 40c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L107 140h-83c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h83L87.51 96.49c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0l40 40c2.257 2.254 3.523 5.314 3.519 8.504-.004 3.19-1.277 6.247-3.539 8.496ZM200 28h-64c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h52v152h-52c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h64c6.627 0 12-5.373 12-12v-176c0-6.627-5.373-12-12-12Z"),
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
        return _signIn!!
    }

private var _signIn: ImageVector? = null
