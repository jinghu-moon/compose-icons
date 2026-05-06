package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MenuUnfold3Fill: ImageVector
    get() {
        if (_menuUnfold3Fill != null) return _menuUnfold3Fill!!
        _menuUnfold3Fill = remixIcon(
            name = "MenuUnfold3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 4h-14v2h14v-2ZM13 11h-10v2h10v-2ZM17 18h-14v2h14v-2ZM17 17v-10l5 5L17 17Z"),
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
        return _menuUnfold3Fill!!
    }

private var _menuUnfold3Fill: ImageVector? = null
