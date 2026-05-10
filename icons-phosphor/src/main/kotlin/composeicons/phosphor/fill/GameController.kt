package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GameController: ImageVector
    get() {
        if (_gameController != null) return _gameController!!
        _gameController = phosphorFillIcon(
            name = "GameController",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M247.44 173.75c.005-.047 .005-.093 0-.14L231.05 89.44c0-.06 0-.12 0-.18C225.829 60.744 200.99 40.023 172 40h-88.11c-29.083-.011-53.968 20.876-59 49.52L8.58 173.61c-.005 .047-.005 .093 0 .14-2.724 15.47 4.896 30.92 18.828 38.175 13.932 7.254 30.96 4.638 42.072-6.465l.35-.37L109.52 160h37l39.71 45.09c.11 .13 .23 .25 .35 .37 6.748 6.734 15.887 10.523 25.42 10.54 10.637-.007 20.726-4.718 27.561-12.868 6.835-8.151 9.715-18.906 7.869-29.382ZM104 112h-8v8c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-8h-8c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h8v-8c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v8h8c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM144 104c0-4.418 3.582-8 8-8h24c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-24c-4.418 0-8-3.582-8-8ZM228.37 191.47c-3.027 4.358-7.673 7.322-12.9 8.23-6.351 1.111-12.849-.894-17.47-5.39L167.8 160h4.2c20.766 .003 40.056-10.732 51-28.38l8.74 45c.899 5.201-.314 10.546-3.37 14.85Z"),
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
        return _gameController!!
    }

private var _gameController: ImageVector? = null
