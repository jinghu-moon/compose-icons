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
                pathData = parseSvgPathData("M 17.000 4.000 L 3.000 4.000 L 3.000 6.000 L 17.000 6.000 L 17.000 4.000 ZM 13.000 11.000 L 3.000 11.000 L 3.000 13.000 L 13.000 13.000 L 13.000 11.000 ZM 17.000 18.000 L 3.000 18.000 L 3.000 20.000 L 17.000 20.000 L 17.000 18.000 ZM 17.000 17.000 L 17.000 7.000 L 22.000 12.000 L 17.000 17.000 Z"),
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
