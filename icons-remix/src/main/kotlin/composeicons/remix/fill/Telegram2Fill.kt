package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Telegram2Fill: ImageVector
    get() {
        if (_telegram2Fill != null) return _telegram2Fill!!
        _telegram2Fill = remixIcon(
            name = "Telegram2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2.148 11.81C7.395 9.524 10.894 8.017 12.645 7.288 17.643 5.209 18.682 4.848 19.359 4.836c.149-.003 .482 .034 .698 .209 .182 .148 .232 .347 .256 .487 .024 .14 .054 .459 .03 .709-.271 2.846-1.443 9.753-2.039 12.941-.252 1.349-.749 1.801-1.23 1.845-1.045 .096-1.839-.691-2.852-1.354C12.638 18.635 11.743 17.989 10.205 16.975c-1.777-1.171-.625-1.815 .388-2.867 .265-.275 4.871-4.464 4.96-4.844 .011-.048 .021-.225-.084-.318-.105-.094-.26-.062-.373-.036-.159 .036-2.69 1.709-7.593 5.018-.718 .493-1.369 .734-1.952 .721-.643-.014-1.879-.363-2.798-.662C1.626 13.62 .73 13.427 .808 12.804c.041-.324 .487-.656 1.339-.995Z"),
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
        return _telegram2Fill!!
    }

private var _telegram2Fill: ImageVector? = null
