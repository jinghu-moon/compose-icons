package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Password: ImageVector
    get() {
        if (_password != null) return _password!!
        _password = phosphorDuotoneIcon(
            name = "Password",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M256 72v112c0 8.837-7.163 16-16 16h-224C7.163 200 0 192.837 0 184v-112C0 63.163 7.163 56 16 56h224c8.837 0 16 7.163 16 16Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M48 56v144c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-144c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM140 110.5 120 117v-21c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v21L84 110.5c-4.203-1.381-8.729 .907-10.11 5.11-1.381 4.203 .907 8.729 5.11 10.11l20 6.49-12.34 17c-1.775 2.307-2.158 5.396-.998 8.066 1.16 2.67 3.678 4.499 6.576 4.777 2.898 .277 5.717-1.041 7.362-3.443l12.34-17 12.34 17c1.645 2.402 4.465 3.72 7.362 3.443 2.898-.277 5.416-2.107 6.576-4.777 1.16-2.67 .777-5.759-.998-8.066l-12.34-17 20-6.49c4.008-1.491 6.135-5.869 4.829-9.941-1.305-4.072-5.582-6.397-9.709-5.279ZM246 115.64c-1.364-4.162-5.822-6.453-10-5.14L216 117v-21c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v21l-20-6.49c-4.203-1.367-8.718 .932-10.085 5.135-1.367 4.203 .932 8.718 5.135 10.085l20 6.49-12.34 17c-1.775 2.307-2.158 5.396-.998 8.066 1.16 2.67 3.678 4.499 6.576 4.777 2.898 .277 5.717-1.041 7.362-3.443l12.34-17 12.34 17c1.645 2.402 4.465 3.72 7.362 3.443 2.898-.277 5.416-2.107 6.576-4.777 1.16-2.67 .777-5.759-.998-8.066l-12.34-17 20-6.49c4.18-1.393 6.447-5.904 5.07-10.09Z"),
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
        return _password!!
    }

private var _password: ImageVector? = null
