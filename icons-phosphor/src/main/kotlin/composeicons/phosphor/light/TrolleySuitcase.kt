package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TrolleySuitcase: ImageVector
    get() {
        if (_trolleySuitcase != null) return _trolleySuitcase!!
        _trolleySuitcase = phosphorLightIcon(
            name = "TrolleySuitcase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M88 158h128c7.732 0 14-6.268 14-14v-72c0-7.732-6.268-14-14-14h-34v-18c0-7.732-6.268-14-14-14h-32c-7.732 0-14 6.268-14 14v18h-34C80.268 58 74 64.268 74 72v72c0 7.732 6.268 14 14 14ZM134 40c0-1.105 .895-2 2-2h32c1.105 0 2 .895 2 2v18h-36ZM86 72c0-1.105 .895-2 2-2h128c1.105 0 2 .895 2 2v72c0 1.105-.895 2-2 2h-128c-1.105 0-2-.895-2-2ZM86 224c0 7.732-6.268 14-14 14-7.732 0-14-6.268-14-14 0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14ZM230 224c0 7.732-6.268 14-14 14-7.732 0-14-6.268-14-14 0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14ZM246 184c0 3.314-2.686 6-6 6h-208c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h10v-102.69c-.002-.53-.214-1.037-.59-1.41L19.76 52.24C18.155 50.744 17.494 48.492 18.037 46.366c.543-2.126 2.203-3.786 4.329-4.329 2.126-.543 4.379 .118 5.874 1.723L49.9 65.41c2.631 2.622 4.107 6.186 4.1 9.9v102.69h186c3.314 0 6 2.686 6 6Z"),
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
        return _trolleySuitcase!!
    }

private var _trolleySuitcase: ImageVector? = null
