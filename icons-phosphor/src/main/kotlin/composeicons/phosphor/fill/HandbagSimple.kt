package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HandbagSimple: ImageVector
    get() {
        if (_handbagSimple != null) return _handbagSimple!!
        _handbagSimple = phosphorFillIcon(
            name = "HandbagSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M239.89 198.12 225.63 78.12c-.958-8.095-7.848-14.176-16-14.12h-33.63C176 37.49 154.51 16 128 16 101.49 16 80 37.49 80 64h-33.67C38.178 63.944 31.288 70.025 30.33 78.12L16.07 198.12c-.529 4.53 .901 9.07 3.93 12.48 3.051 3.424 7.414 5.388 12 5.4h191.92c4.614 .01 9.011-1.955 12.08-5.4 3.014-3.416 4.429-7.956 3.89-12.48ZM128 32c17.673 0 32 14.327 32 32h-64C96 46.327 110.327 32 128 32Z"),
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
        return _handbagSimple!!
    }

private var _handbagSimple: ImageVector? = null
