package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandVivaldi: ImageVector
    get() {
        if (_brandVivaldi != null) return _brandVivaldi!!
        _brandVivaldi = tablerOutlineIcon(
            name = "BrandVivaldi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21.648 6.808c-2.468 4.28-4.937 8.56-7.408 12.836C13.843 20.421 12.874 20.945 12 21c-.962 .102-1.7-.402-2.154-1.254C8.283 17.062 6.74 14.372 5.186 11.682 4.243 10.049 3.295 8.416 2.356 6.777 1.904 6.029 1.881 5.097 2.296 4.327 2.713 3.555 3.504 3.058 4.381 3.02c.951-.065 1.85 .438 2.287 1.281 .697 1.19 2.043 3.83 2.55 4.682 .665 1.201 1.91 1.966 3.282 2.017 2.126 .133 3.974-.95 4.21-3.058 0-.164 .228-3.178 .846-3.962 .619-.784 1.64-1.155 2.606-.893 .964 .26 1.679 1.073 1.814 2.062 .08 .581-.041 1.171-.343 1.674"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _brandVivaldi!!
    }

private var _brandVivaldi: ImageVector? = null
