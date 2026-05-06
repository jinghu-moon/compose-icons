package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Detective: ImageVector
    get() {
        if (_detective != null) return _detective!!
        _detective = phosphorThinIcon(
            name = "Detective",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 116h-30L169.35 49c-2.192-3.007-5.655-4.826-9.375-4.926-3.72-.1-7.275 1.531-9.625 4.416L137.45 63.38l-.1 .12c-2.278 2.831-5.716 4.478-9.35 4.478-3.634 0-7.072-1.647-9.35-4.478l-.1-.12L105.66 48.44c-2.35-2.885-5.906-4.516-9.625-4.416-3.72 .1-7.183 1.92-9.375 4.926L38 116h-30c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h240c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM93.13 53.65c.73-1.007 1.887-1.616 3.13-1.65 1.242-.024 2.424 .53 3.2 1.5l.1 .12 12.89 14.94c3.781 4.718 9.504 7.456 15.55 7.44h0c6.046 .016 11.769-2.722 15.55-7.44L156.44 53.62l.1-.12c.782-.962 1.96-1.515 3.2-1.5 1.243 .034 2.4 .643 3.13 1.65L208.15 116h-160.3ZM180 148c-17.673 0-32 14.327-32 32h-40C107.967 163.111 94.815 149.155 77.957 148.122 61.1 147.089 46.342 159.335 44.247 176.093c-2.095 16.759 9.195 32.26 25.788 35.408C86.628 214.65 102.811 204.361 107 188h42c4.157 16.099 19.951 26.333 36.344 23.548 16.393-2.785 27.921-17.66 26.528-34.229C210.478 160.75 196.627 148.008 180 148ZM76 204C62.745 204 52 193.255 52 180c0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24ZM180 204c-13.255 0-24-10.745-24-24 0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24Z"),
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
        return _detective!!
    }

private var _detective: ImageVector? = null
