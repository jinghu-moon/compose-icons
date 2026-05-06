package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Handbag: ImageVector
    get() {
        if (_handbag != null) return _handbag!!
        _handbag = phosphorRegularIcon(
            name = "Handbag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M239.89 198.12 225.63 78.12c-.958-8.095-7.848-14.176-16-14.12h-33.63C176 37.49 154.51 16 128 16 101.49 16 80 37.49 80 64h-33.67C38.178 63.944 31.288 70.025 30.33 78.12L16.07 198.12c-.529 4.53 .901 9.07 3.93 12.48 3.051 3.424 7.414 5.388 12 5.4h191.92c4.614 .01 9.011-1.955 12.08-5.4 3.014-3.416 4.429-7.956 3.89-12.48ZM128 32c17.673 0 32 14.327 32 32h-64C96 46.327 110.327 32 128 32ZM32 200 46.33 80h33.67v24c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-24h64v24c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-24h33.75l14.17 120Z"),
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
        return _handbag!!
    }

private var _handbag: ImageVector? = null
