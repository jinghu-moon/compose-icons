package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Compasses2Line: ImageVector
    get() {
        if (_compasses2Line != null) return _compasses2Line!!
        _compasses2Line = remixIcon(
            name = "Compasses2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16.33 13.497C17.956 12.215 19 10.228 19 7.997h2c0 2.972-1.441 5.608-3.662 7.247l2.528 4.378c.552 .957 .224 2.18-.732 2.732L15.607 16.245c-1.104 .484-2.325 .752-3.607 .752-1.283 0-2.503-.268-3.607-.752L4.866 22.353C3.909 21.801 3.582 20.578 4.134 19.621L9.198 10.851C8.458 10.125 8 9.114 8 7.997 8 6.133 9.275 4.567 11 4.123v-2.126h2v2.126c1.725 .444 3 2.01 3 3.874 0 1.118-.458 2.128-1.198 2.854l1.528 2.646ZM14.599 14.498 13.071 11.852c-.341 .095-.7 .145-1.071 .145-.371 0-.73-.05-1.071-.145L9.401 14.498c.804 .322 1.681 .498 2.599 .498 .918 0 1.795-.177 2.599-.498ZM12 9.997c1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.104 0-2 .895-2 2 0 1.105 .896 2 2 2Z"),
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
        return _compasses2Line!!
    }

private var _compasses2Line: ImageVector? = null
